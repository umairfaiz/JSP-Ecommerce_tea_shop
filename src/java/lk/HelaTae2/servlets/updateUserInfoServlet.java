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
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet (name = "updateUserInfoServlet", urlPatterns = {"/updateUserInfoServlet"})
public class updateUserInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String custemail= req.getParameter("email");
        String custAdd = req.getParameter("address");
        String custPass = req.getParameter("pwd");
        String custCardDetail = req.getParameter("cardDetails");
        JFrame frame=null;
        
//        DbConnector updateDAO = new DbConnector();
//        updateDAO.connectDb();
        
        userBean updateUser = new userBean();
        
        RequestDispatcher rd;
        
        if(updateUser.checkUser(custemail)){
          updateUser.updateUserinfo(custemail, custAdd, custPass, custCardDetail);
          JOptionPane.showMessageDialog(frame,"Detail updated successfully!");
          rd=req.getRequestDispatcher("updateUser.jsp?loginstate=1");
          rd.forward(req,resp);
        }
        else{
            JOptionPane.showMessageDialog(frame,"Incorrect email!");
             resp.sendRedirect("updateUser.jsp?loginstate=1");
        }
        
        
       
    }
    
}
