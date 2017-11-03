/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import com.oracle.jrockit.jfr.DataType;
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
@WebServlet (name = "resetUserPwdServlet", urlPatterns = {"/resetUserPwdServlet"})
public class resetUserPwdServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String custemail= req.getParameter("email");
        String custPass1 = req.getParameter("pwd1");
        String custPass = req.getParameter("pwd");
        JFrame frame=null;
        
//        DbConnector updateDAO = new DbConnector();
//        updateDAO.connectDb();
        
        userBean updateUser = new userBean();
        
        RequestDispatcher rd;
        if (custPass1.equals(custPass)) {
            if (updateUser.checkUser(custemail)) {
                updateUser.resetPassword(custemail, custPass);
                JOptionPane.showMessageDialog(frame,"Password updated");
                rd = req.getRequestDispatcher("resetPassword.jsp?resetSucc=1");
                rd.forward(req, resp);
            }
            else{
                JOptionPane.showMessageDialog(frame,"Password NOT updated");
                resp.sendRedirect("resetPassword.jsp?resetFail=1");
            }
        }
        else{
            JOptionPane.showMessageDialog(frame,"Entered passwords doesnt match!");
            resp.sendRedirect("resetPassword.jsp?pwdMatch=1");
        }
        
    }
        
     
    
    
}
