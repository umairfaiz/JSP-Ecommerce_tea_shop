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
import lk.HelaTae2.bean.adminBean;
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "memberServlet", urlPatterns = {"/memberServlet"})
public class memberServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action1 = req.getParameter("newmember");
        String action2 = req.getParameter("updatememeber");
        JFrame frame=null;
        String memberID = String.valueOf(randomID());
        String joinedDate = req.getParameter("jDate");
        String useremail = req.getParameter("email");
        int points = Integer.parseInt(req.getParameter("point"));
        String coupon = req.getParameter("cID");

//        DbConnector adminOption = new DbConnector();
//        adminOption.connectDb();

        RequestDispatcher rd;

        userBean u = new userBean();
        adminBean admin = new adminBean();
        
        if ("new".equals(action1)) {
            if (u.checkUser(useremail)) {
                admin.addPointstoMember(memberID, joinedDate, useremail, points, coupon);
                rd = req.getRequestDispatcher("manageMembers.jsp?loginstate=1");
                JOptionPane.showMessageDialog(frame,"User added successfully");
                rd.forward(req, resp);
            } else {
                resp.sendRedirect("manageMembers.jsp?loginstate=1");
                JOptionPane.showMessageDialog(frame,"An error occured. Retry!");
            }
        }
        else if("update".equals(action2)){
            if (u.checkUser(useremail)) {
                admin.updateMemberPoints(points, useremail);
                rd = req.getRequestDispatcher("updateMember.jsp?loginstate=1");
                JOptionPane.showMessageDialog(frame,"User updated successfully");
                rd.forward(req, resp);
            } else {
                resp.sendRedirect("updateMember.jsp?loginstate=1");
                JOptionPane.showMessageDialog(frame,"An error occured. Retry!");
            }
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
