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
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.adminSalesBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "adminSalesServlet", urlPatterns = {"/adminSalesServlet"})
public class adminSalesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String useremail = (String) req.getSession().getAttribute("user");

//        DbConnector dao = new DbConnector();
//        dao.connectDb();

        RequestDispatcher rd;
        adminSalesBean adminBean=new adminSalesBean();
        
        int totSales=adminBean.totalSales();
        int totQty = adminBean.totalUnits();
        
        req.setAttribute("totalSales", totSales);
        req.setAttribute("totalUnits",totQty);
        rd=req.getRequestDispatcher("adminSales.jsp?loginstate=1");
        rd.forward(req, resp);
    }

}
