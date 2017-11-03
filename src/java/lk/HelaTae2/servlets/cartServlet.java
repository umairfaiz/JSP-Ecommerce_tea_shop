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
import lk.HelaTae2.bean.cartBean;
import lk.HelaTae2.bean.checkoutBean;
import lk.HelaTae2.bean.wishlistBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "cartServlet", urlPatterns = {"/cartServlet"})
public class cartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String addaction = req.getParameter("addtocart");
        String wishlistaction = req.getParameter("wishlist");
        String resellerWishlistaction = req.getParameter("wishlistReseller");
        String resellerAddCartaction = req.getParameter("addReseller");
        String removefromCart = req.getParameter("removecart");
        String checkout = req.getParameter("payment");
        String cartid = String.valueOf(randomID());
        String itemid = req.getParameter("id");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        int discount = Integer.parseInt(req.getParameter("discount"));
        String itemName = req.getParameter("itemname");
        String listId = String.valueOf(randomID());

        int cost = Integer.parseInt(req.getParameter("price"));
        String user = req.getParameter("userEmail");

        int Total = cost * quantity;

        RequestDispatcher rd;

//        DbConnector dao = new DbConnector();
//        dao.connectDb();
        wishlistBean wbean = new wishlistBean();
        cartBean cart = new cartBean();
        
        if (req.getSession().getAttribute("user") != null) {
            if ("list".equals(wishlistaction)) {
                //regular customer adding to wishlist
                wbean.addtoWishlist(listId, itemid, itemName, user, cost);
                rd = req.getRequestDispatcher("product.jsp?loginstate=1");
                rd.forward(req, resp);
            } else if ("Relist".equals(resellerWishlistaction)) {
                // reseller add to wishlist successful
                wbean.addtoWishlist(listId, itemid, itemName, user, cost);
                rd = req.getRequestDispatcher("resellerProduct.jsp?loginstate=1");
                rd.forward(req, resp);
            } else if ("addReseller".equals(resellerAddCartaction)) {
                //reseller add to cart successful
                cart.additemToCart(cartid, itemid, quantity, cost, Total, user, itemName, discount);
                rd = req.getRequestDispatcher("resellerProduct.jsp?loginstate=1");
                rd.forward(req, resp);

            } else if ("add".equals(addaction)) {
               //regular customer adding to cart
                cart.additemToCart(cartid, itemid, quantity, cost, Total, user, itemName, discount);
                rd = req.getRequestDispatcher("product.jsp?loginstate=1");
                rd.forward(req, resp);
            }
        } else {
            //login failed
            resp.sendRedirect("account.jsp?sessionstate=1");
        }
//        else if("cart".equals(removefromCart)){
//        //removal successful
//            cart.removefromCart(itemid, user);
//            rd = req.getRequestDispatcher("cart.jsp");
//            rd.forward(req, resp);
//        }
//        else if("checkout".equals(checkout)){
//            String useremail=(String)req.getSession().getAttribute("myCust");
//            
//            checkoutBean pay = new checkoutBean();
//            int finalTotal = pay.amountPay(useremail);
//
//            req.setAttribute("fTotal", finalTotal);
//            req.getRequestDispatcher("product.jsp").forward(req, resp);
//        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String itemid = req.getParameter("itemID");
        String user = req.getParameter("useremail");

        RequestDispatcher rd;

//        DbConnector connect = new DbConnector();
//        connect.connectDb();

        cartBean remove = new cartBean();

        //removal successful
        remove.removefromCart(itemid, user);
        rd = req.getRequestDispatcher("cart.jsp?loginstate=1");
        rd.forward(req, resp);

    }

    public int randomID() {
        Random r = new Random();
        int Low = 100;
        int High = 1000;
        int Result = r.nextInt(High - Low) + Low;
        return Result;
    }

}
