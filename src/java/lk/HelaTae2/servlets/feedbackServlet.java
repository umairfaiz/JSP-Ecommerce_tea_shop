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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.feedbackBean;
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "feedbackServlet", urlPatterns = {"/feedbackServlet"})
public class feedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String messageID= String.valueOf(randomID());
        String user = req.getParameter("custname");
        String cEmail = req.getParameter("custemail");
        String subject = req.getParameter("feedsubject");
        String msg = req.getParameter("feedMsg");
        String receiver = "haletae@gmail.com";
        JFrame frame=null;
        
        
        RequestDispatcher rd;
       
         DbConnector mylogindao = new DbConnector();
         mylogindao.connectDb();
         feedbackBean inq = new feedbackBean();
         userBean checkemail= new userBean();
         
         if(checkemail.checkUser(cEmail)){
             //sent successfully
           JOptionPane.showMessageDialog(frame,"Message was sent successfully");
           inq.sendFeedback(messageID, user,cEmail, subject, msg,receiver);
           rd = req.getRequestDispatcher("contact.jsp?loginstate=1");
           rd.forward(req,resp);
         }
         else{
          resp.sendRedirect("contact.jsp?feedbackstate=1");
          JOptionPane.showMessageDialog(frame,"Sending failed");
         }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String useremail = req.getParameter("user");
        String message = req.getParameter("message");
        RequestDispatcher rd;
       
//         DbConnector mylogindao = new DbConnector();
//         mylogindao.connectDb();
         feedbackBean deleteMsg = new feedbackBean();
         userBean checkemail= new userBean();
         
         if(checkemail.checkUser(useremail)){
             //sent successfully
             
           deleteMsg.removeCustEmail(useremail, message);
           rd = req.getRequestDispatcher("customer_inbox.jsp?loginstate=1");
           rd.forward(req,resp);
         }
         else{
          resp.sendRedirect("customer_inbox.jsp?loginstate=1");
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
