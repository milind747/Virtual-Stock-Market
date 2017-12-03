/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Boughtstock;
import model.Login;
import model.Profit;
import model.Registration;
import model.SharedetailNew;
import model.Soldstock;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Owner
 */
public class finalsellServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {
            /* TODO output your page here. You may use following sample code. */
            Session se = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = se.beginTransaction();

            String totalamount = (request.getParameter("totamt"));
            String sellqty = request.getParameter("sqty");
            int sid = Integer.parseInt(request.getParameter("id"));

            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("lid");

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));

            Criteria cr2 = se.createCriteria(SharedetailNew.class);
            cr2.add(Restrictions.eq("sid", sid));
            ArrayList<SharedetailNew> al3 = (ArrayList<SharedetailNew>) cr2.list();
            request.setAttribute("al3", al3);
            SharedetailNew sd = al3.get(0);

            Soldstock s = new Soldstock();
            s.setLoginid(l);
            s.setSid(sd);
            s.setQty(sellqty);
            s.setTotalamt(totalamount);
            s.setSelldate(dateFormat.format(date));
            s.setOneprice(request.getParameter("curprice"));
            se.save(s);

            Criteria cr = se.createCriteria(Registration.class);
            cr.add(Restrictions.eq("loginid", l));
            ArrayList<Registration> al = (ArrayList<Registration>) cr.list();
            request.setAttribute("al1", al);
            Registration r = al.get(0);
            String availablemoney = r.getMoney();
            float remainingmoney;
            remainingmoney = Float.parseFloat(availablemoney) + Float.parseFloat(totalamount);
            String rm = Float.toString(remainingmoney);
            r.setMoney(rm);
            se.update(r);

            Criteria cr1 = se.createCriteria(Boughtstock.class);
            cr1.add(Restrictions.eq("buyid", sid));
            ArrayList<Boughtstock> al2 = (ArrayList<Boughtstock>) cr1.list();
            request.setAttribute("al2", al2);
            Boughtstock b = al2.get(0);
            String availableqty = b.getQty();
            int remainingqty = Integer.parseInt(availableqty) - Integer.parseInt(sellqty);
            String rq = Integer.toString(remainingqty);
            b.setQty(rq);
            se.update(b);
            tr.commit();

            Criteria cr4 = se.createCriteria(Soldstock.class);
            cr4.add(Restrictions.eq("loginid", l));
            ArrayList<Soldstock> al4 = (ArrayList<Soldstock>) cr4.list();
            request.setAttribute("al4", al4);

            float bp = Float.parseFloat(b.getOneprice());
            float sq = Float.parseFloat(s.getQty());
            float sp = Float.parseFloat(s.getOneprice());

            float profit = (sq * sp) - (sq * bp);
            out.println("Profit = " + profit);
            double prof = (double) profit;

            Session sess = NewHibernateUtil.getSessionFactory().openSession();
            Transaction trs = sess.beginTransaction();

            Profit pr = new Profit();
            pr.setDate(dateFormat.format(date));
            pr.setLoginid(l);
            pr.setTotamt(prof);
            pr.setDate(dateFormat.format(date));
            sess.save(pr);
            trs.commit();

            RequestDispatcher rd = request.getRequestDispatcher("portfolioServ");
            rd.forward(request, response);

        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
