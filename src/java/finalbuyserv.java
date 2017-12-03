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
import model.Registration;
import model.SharedetailNew;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Owner
 */
public class finalbuyserv extends HttpServlet {

    //private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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

            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("lid");

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));

            Criteria cr1 = se.createCriteria(SharedetailNew.class);
            cr1.add(Restrictions.eq("sid", Integer.parseInt(request.getParameter("sid"))));
            ArrayList<SharedetailNew> al1 = (ArrayList<SharedetailNew>) cr1.list();
            request.setAttribute("al1", al1);
            SharedetailNew sd = al1.get(0);

            Boughtstock b = new Boughtstock();
            b.setLoginid(l);
            b.setSid(sd);
            b.setQty(request.getParameter("qty"));
            b.setTotalamt(totalamount);
            b.setBuydate(dateFormat.format(date));
            b.setOneprice(request.getParameter("openprice"));
            b.setCurrentprice(request.getParameter("curprice"));
            se.save(b);

            Criteria cr = se.createCriteria(Registration.class);
            cr.add(Restrictions.eq("loginid", l));
            ArrayList<Registration> al = (ArrayList<Registration>) cr.list();
            request.setAttribute("al1", al);

            Registration r = al.get(0);
            String availablemoney = r.getMoney();
            //out.println("available money is" +availablemoney);
            float remainingmoney;
            remainingmoney = Float.parseFloat(availablemoney) - Float.parseFloat(totalamount);
            String rm = Float.toString(remainingmoney);

            r.setMoney(rm);
            se.update(r);
            tr.commit();

            // out.println("success");
            RequestDispatcher rd = request.getRequestDispatcher("stockServ");
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
