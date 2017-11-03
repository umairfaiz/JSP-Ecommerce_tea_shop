/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.checkoutBean;
import lk.HelaTae2.bean.memberBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "checkoutServlet", urlPatterns = {"/checkoutServlet"})
public class checkoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String useremail = (String) req.getSession().getAttribute("user");
        String cid = req.getParameter("couponID");
        String calculateaction = req.getParameter("calcharges");
        String orderemail = req.getParameter("purchcustEmail");
        String orderAddress = req.getParameter("purchCustAddress");
        String orderDelivery = req.getParameter("country");
        String orderNotes = req.getParameter("purchNote");
        

//        DbConnector dao = new DbConnector();
//        dao.connectDb();
        
        RequestDispatcher rd;
        
        checkoutBean chckBean = new checkoutBean();
        memberBean bean = new memberBean();
        
        int fTotal = chckBean.amountPay(useremail);
        int fQty = chckBean.totalQty(useremail);
        int points = bean.memberPoints(useremail, cid);
        int charges = chckBean.deliveryCharges(orderDelivery);

        req.setAttribute("fTotal", fTotal);
        req.setAttribute("fQty", fQty);
        req.setAttribute("mPoints", points);
        req.setAttribute("deliShip", charges);
        
        int mainTotal = fTotal+charges-points;
        req.setAttribute("PTotal", mainTotal);
        
        
        if("CalculateCharges".equals(calculateaction)){
        
             chckBean.shippingInfo(useremail, orderemail, orderAddress, orderDelivery, orderNotes);
             
        }
        
        req.getRequestDispatcher("checkout.jsp?loginstate=1").forward(req, resp);
    }

}

        
        

//        DbConnector dao = new DbConnector();
//        dao.connectDb();
//        
//        memberBean bean = new memberBean();
//        
//        int points = bean.memberPoints(user, cid);
//
//        req.setAttribute("mPoints", points);
//        req.getRequestDispatcher("checkout.jsp").forward(req, resp);