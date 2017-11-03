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
import lk.HelaTae2.bean.cartBean;
import lk.HelaTae2.bean.wishlistBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "wishlistServlet", urlPatterns = {"/wishlistServlet"})
public class wishlistServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
            String addtocartaction=req.getParameter("addtolist");
            String removelistaction=req.getParameter("wishlist");
            
            String cartid=String.valueOf(randomID());
            String itemid = req.getParameter("itemID");
            String itemname = req.getParameter("itemname");
            String user = req.getParameter("useremail");
            int cost = Integer.parseInt(req.getParameter("itemcost"));
            int qty=1, disount=0;
            int total= qty*cost;
            
            RequestDispatcher rd;

//            DbConnector connect = new DbConnector();
//            connect.connectDb();

            wishlistBean wlBean = new wishlistBean();
            cartBean cBean = new cartBean();
            
            if("removelist".equals(removelistaction)){
                 //removal successful
                wlBean.removefromWishlist(itemid, user);
                rd = req.getRequestDispatcher("whishlist.jsp?loginstate=1");
                rd.forward(req, resp);
            }
            else if("addlist".equals(addtocartaction)){
                cBean.addWishlistitemToCart(cartid, itemid, qty, cost, total, user, itemname, disount);
                rd = req.getRequestDispatcher("whishlist.jsp?loginstate=1");
                rd.forward(req, resp);
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
