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
import model.Login;
import model.Money;
import model.Payment;
import model.Registration;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Owner
 */
public class SaveTransactionServ extends HttpServlet {

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

            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("lid");

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            //System.out.println(dateFormat.format(date));

            Criteria cr = se.createCriteria(Money.class);
            cr.add(Restrictions.eq("mid", Integer.parseInt(request.getParameter("custom"))));
            ArrayList<Money> al = (ArrayList<Money>) cr.list();
            request.setAttribute("al", al);
            Money m = al.get(0);

            HttpSession hs1 = request.getSession();
            Money m1 = (Money) hs1.getAttribute("al");
            String money = m1.getRealmoney();
            String nm = m1.getVirtualmoney();
            out.println("nm" +nm);
            Float fnm = Float.parseFloat(nm);

            Payment p = new Payment();
            p.setLoginid(l);
            p.setTxnId(request.getParameter("txn_id"));
            p.setDate(dateFormat.format(date));
            p.setMid(m);
            p.setTotamount(money);
            se.save(p);
           

            Criteria cr1 = se.createCriteria(Registration.class);
            cr1.add(Restrictions.eq("loginid", l));
            ArrayList<Registration> al1 = (ArrayList<Registration>) cr1.list();
            request.setAttribute("al1", al1);
            Registration r = al1.get(0);
            String am = r.getMoney();
            Float fam = Float.parseFloat(am);
            out.println("am" +am);
            Float ftm = fam + fnm;
            out.println("tm" +ftm);
            r.setMoney(ftm.toString());
            se.update(r);
            tr.commit();

            //out.println("Your payment is successfull");
            RequestDispatcher rd = request.getRequestDispatcher("viewpriceServ");
            rd.forward(request, response);
            
        }
        
        catch (HibernateException | NumberFormatException e) 
        {
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
