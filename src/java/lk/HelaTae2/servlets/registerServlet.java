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
import lk.HelaTae2.bean.userBean;
//import lk.HelaTae2.bean.registerBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "registerServlet", urlPatterns = {"/registerServlet"})
public class registerServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String customerID= String.valueOf(randomID());
        String Username= request.getParameter("username");
        String Address= request.getParameter("customeraddress");
        String CardDetails= request.getParameter("customercardDetails");
        String CustomerEmail= request.getParameter("customerEmail");
        String CustomerPassword= request.getParameter("customerPassword");
        String CustomerType = request.getParameter("radiobtn");
        JFrame frame=null;
//        DbConnector mytregisterdao = new DbConnector();
//        mytregisterdao.connectDb();
        
        userBean user = new userBean();
        //registerBean reg = new registerBean();
        
        RequestDispatcher rd;
        
        if(user.checkUser(CustomerEmail)){
          response.sendRedirect("account.jsp?retry=1");
           
        }else{
           user.addUser(customerID, Username, Address, CardDetails, CustomerEmail, CustomerPassword,CustomerType);
           JOptionPane.showMessageDialog(frame,"Registered successfully...Login Now!");
           rd = request.getRequestDispatcher("account.jsp");
           rd.forward(request,response);
          
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
