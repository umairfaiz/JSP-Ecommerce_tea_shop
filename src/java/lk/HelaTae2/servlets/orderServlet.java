/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import lk.HelaTae2.bean.orderBean;
import lk.HelaTae2.bean.userBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "orderServlet", urlPatterns = {"/orderServlet"})
public class orderServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Id = String.valueOf(randomID());
        String user = req.getParameter("userEmail");
        String orderDate = settingDate();
        String itemID = req.getParameter("itemID");
        JFrame frame=null;

        int orderTotal = Integer.parseInt(req.getParameter("finalTotal"));
        int orderTotalQty = Integer.parseInt(req.getParameter("totQty"));
        
        RequestDispatcher rd;

//        DbConnector connect = new DbConnector();
//        connect.connectDb();
        
        orderBean ordBean = new orderBean();
        userBean usrBean= new userBean();
        
        if(usrBean.checkUserType(user).equals("premium")){
            //send delivery note
            String name = "admin";
            String email = "haletae@gmail.com";
            String subject = "Delivery Note";
            String message = deliveryMessage(user, orderTotal);
            ordBean.deliveryNote(Id, name, email, subject, message, user);
        }
        JOptionPane.showMessageDialog(frame,"Successfully purchased");
        ordBean.orderDetails(Id, user, orderDate, orderTotal, orderTotalQty);
        rd = req.getRequestDispatcher("index.jsp?loginstate=1");
        rd.forward(req, resp);
        
    }
    public int randomID(){
        Random r = new Random();
        int Low = 100;
        int High = 1000; 
        int Result = r.nextInt(High-Low) + Low;
        return Result;
    }
    public String settingDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        return (dtf.format(localDate));
    }
     public String deliveryMessage(String useremail, int total){
        String message = "Hello "+useremail+"!!. Thank you for placing an order of value Rs."+total+". The products will be deliered to you within the next two working days.";
        return message;
    }
            
    
}
