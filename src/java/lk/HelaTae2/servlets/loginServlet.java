/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.memberBean;
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("useremail");
        String pwd = request.getParameter("password");
        JFrame frame=null;

        PrintWriter pw;
        RequestDispatcher rd;

//        DbConnector mylogindao = new DbConnector();
//        mylogindao.connectDb();

        userBean myCust = new userBean();
        myCust.setCustomerEmail(user);
        myCust.setPassword(pwd);
        
        //creating session
        HttpSession loginsession = request.getSession();
        loginsession.setAttribute("user", user);

        memberBean member = new memberBean();
        //if(request.getSession().getAttribute("user")!=null){
        if (myCust.isUserExist(user, pwd)) {
            //creating session
            loginsession.setAttribute("myCust", myCust);
            //loginsession.setAttribute("user", user);
            //if(user.equals("haletae@gmail.com")){
            if(myCust.checkUserType(user).equals("admin")){
            //login successful
            rd = request.getRequestDispatcher("adminIndex.jsp?loginstate=1");
            rd.forward(request, response);
            }
            else if(myCust.checkUserType(user).equals("reseller")){
            //login successful
            rd = request.getRequestDispatcher("resellerProduct.jsp?loginstate=1");
            rd.forward(request, response);
            }
            else{
            //login successful
            rd = request.getRequestDispatcher("product.jsp?loginstate=1");
            rd.forward(request, response);
            }
        }
//        if (member.isMemberExist(user, pwd)) {
//            //creating session
//            HttpSession loginMembersession = request.getSession();
//            loginMembersession.setAttribute("member", member);
//            //login successful
//            rd = request.getRequestDispatcher("product.jsp?loginstate=1");
//            rd.forward(request, response);
//        } 
        
            else {
                //login failed
                response.sendRedirect("account.jsp?retrylogin=1");
                JOptionPane.showMessageDialog(frame,"Login unsuccessful");
            }
//        }
//        else{
//            //login failed
//                response.sendRedirect("account.jsp?sessionstate=1");
//        }
    }
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user= req.getParameter("useremail");
        
        req.getSession().invalidate(); 
        //session.removeAttribute(user);
        //session.invalidate();
        resp.sendRedirect("index.jsp");
    }
}
