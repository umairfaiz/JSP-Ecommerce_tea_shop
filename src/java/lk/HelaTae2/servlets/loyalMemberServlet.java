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
import lk.HelaTae2.bean.memberBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "loyalMemberServlet", urlPatterns = {"/loyalMemberServlet"})
public class loyalMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("userEmail");
        String cid = req.getParameter("couponID");
        
        RequestDispatcher rd;

//        DbConnector dao = new DbConnector();
//        dao.connectDb();
        
        memberBean bean = new memberBean();
        
        int points = bean.memberPoints(user, cid);

        req.setAttribute("mPoints", points);
        req.getRequestDispatcher("checkout.jsp?loginstate=1").forward(req, resp);
        
        
        
        
    }
    
}
