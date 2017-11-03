/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.servlets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.HelaTae2.bean.DbConnector;
import lk.HelaTae2.bean.itemBean;

/**
 *
 * @author Admin
 */
@WebServlet(name = "itemServlet", urlPatterns = {"/itemServlet"})
public class itemServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String itemimg=req.getParameter("itemimg");
       String itemid = req.getParameter("itemid");
       String itemname = req.getParameter("itemName");
       String itemdescrip = req.getParameter("itemDescrip");
        JFrame frame=null;
       int itemunits = Integer.parseInt(req.getParameter("stockUnits"));
       
       int itemdiscount = Integer.parseInt(req.getParameter("itemDiscount"));
       int itemprice = Integer.parseInt(req.getParameter("itemPrice"));
       String itemavail = req.getParameter("stockAvailability");
       String itemcategory = req.getParameter("radiobtn");
       
//       DbConnector dao = new DbConnector();
//       dao.connectDb();
        
       RequestDispatcher rd;
       
        itemBean ibean = new itemBean();
        browseImages(itemimg);
        if(ibean.addItem(itemid, itemname, itemdescrip, itemunits, itemdiscount, itemprice, itemavail, itemcategory)){
            JOptionPane.showMessageDialog(frame,"Item was added successfully!");
            rd = req.getRequestDispatcher("adminUploadItem.jsp?loginstate=1");
            rd.forward(req,resp);
        }else{
            JOptionPane.showMessageDialog(frame,"Something went wrong! Try again!");
            resp.sendRedirect("adminUploadItem.jsp?loginstate=1");
        }
        
        
    }
    
    public boolean browseImages(String id) {
        boolean flag = false;
        BufferedImage img = null;
        File file = null;

        try {
            file = new File("C:\\Users\\Admin\\Desktop\\Images" + id);
            img = ImageIO.read(file);

        } catch (Exception e) {
        }
        try {
            file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\HelaTae2\\web\\img\\products");
            ImageIO.write(img, "jpg", file);
        } catch (Exception e) {
        }
        return flag;
    }
    
}
