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
import lk.HelaTae2.bean.biddingBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "biddingServlet", urlPatterns = {"/biddingServlet"})
public class biddingServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String bidID = String.valueOf(randomID());
        String id = req.getParameter("id");
        String useremail = req.getParameter("userEmail");
        String itemname = req.getParameter("itemname");
        int userbid = Integer.parseInt(req.getParameter("bidValue"));
        
        int currentbid = Integer.parseInt(req.getParameter("currentValue"));
        JFrame frame=null;
        
//        DbConnector dao = new DbConnector();
//        dao.connectDb();
        
        RequestDispatcher rd;
        biddingBean bidBean = new biddingBean();
        //int currentbid= bidBean.maxbid();
        //req.setAttribute("currentValue", currentbid);
        
        if(userbid>currentbid){
        //bidBean.addBid(bidID, itemname, userbid, currentbid, useremail, id);
        bidBean.updatebid(id, userbid, useremail);
        rd = req.getRequestDispatcher("bidding.jsp?loginstate=1");
        JOptionPane.showMessageDialog(frame, "Bid placed successfully");
        rd.forward(req, resp);
        }
        else{
        JOptionPane.showMessageDialog(frame, "Enter a higher bid than the current bid");
        rd = req.getRequestDispatcher("bidding.jsp?loginstate=1");
        rd.forward(req, resp);
        }
        
    }
//    public int randomID(){
//        Random r = new Random();
//        int Low = 100;
//        int High = 1000; 
//        int Result = r.nextInt(High-Low) + Low;
//        return Result;
//    }
    
}
