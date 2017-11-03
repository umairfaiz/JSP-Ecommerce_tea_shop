/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import java.io.IOException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.adminBean;
import lk.HelaTae2.bean.feedbackBean;
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "adminInquiryServlet", urlPatterns = {"/adminInquiryServlet"})
public class adminInquiryServlet extends HttpServlet {
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String messageID= String.valueOf(randomID());
        String adminname = req.getParameter("adminname");
        String AEmail = req.getParameter("adminemail");
        String subject = req.getParameter("subject");
        String msg = req.getParameter("replyMsg");
        String receiver = req.getParameter("receivEmail");
        
        RequestDispatcher rd;

//        DbConnector mylogindao = new DbConnector();
//        mylogindao.connectDb();
        
        adminBean reply = new adminBean();
        userBean checkemail = new userBean();

        if (checkemail.checkUser(AEmail)) {
            //sent successfully
            reply.replyforInquiry(messageID, adminname, AEmail, subject, msg, receiver);
            rd = req.getRequestDispatcher("adminIndex.jsp?loginstate=1");//insert admin compose jsp
            rd.forward(req, resp);
        } else {
            resp.sendRedirect("adminIndex.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adminemail = req.getParameter("user");
        String message = req.getParameter("message");
        RequestDispatcher rd;
       
//         DbConnector mylogindao = new DbConnector();
//         mylogindao.connectDb();
         adminBean deleteMsg = new adminBean();
         userBean checkemail= new userBean();
         
         if(checkemail.checkUser(adminemail)){
             //sent successfully
             
           deleteMsg.removeAdminEmail(adminemail, message);
           rd = req.getRequestDispatcher("admin_inbox.jsp?deletestate=1");
           rd.forward(req,resp);
         }
         else{
          resp.sendRedirect("admin_inbox.jsp?deleteerror=1");
         }
    }
    
    
    public int randomID(){
        Random r = new Random();
        int Low = 100;
        int High = 1000; 
        int Result = r.nextInt(High-Low) + Low;
        return Result;
    }
}

