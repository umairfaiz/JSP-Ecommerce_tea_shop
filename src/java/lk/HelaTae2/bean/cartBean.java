/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class cartBean {
    private String cartid,useremail,itemid, itemname;
    private int qty,total,cost,discount;
    Connection con;
    Statement stmt;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    public cartBean() {
        
            DbConnector dbcon = new DbConnector();
            this.setCon(dbcon.connectDb());
            
    }

    public cartBean(String cartid, String useremail, String itemid, String itemname, int qty, int total, int cost, int discount) {
        this.cartid = cartid;
        this.useremail = useremail;
        this.itemid = itemid;
        this.itemname = itemname;
        this.qty = qty;
        this.total = total;
        this.cost = cost;
        this.discount = discount;
    }

   
    

    public boolean additemToCart(String cartid, String itemid, int qty, int cost, int total, String useremail,String itemname, int discount){
        
        boolean flag = false;
        
        String sqlQueary1 = "INSERT INTO UMAIR.CARTDETAIL VALUES ('"+cartid+"', '"+itemid+"', "+qty+", "+cost+", "+total+", '"+useremail+"', '"+itemname+"', "+discount+")";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    
    }
    
    public ArrayList viewCart(String useremail){
        ArrayList cart = new ArrayList();
        String sqlQueary1 = "SELECT * FROM CARTDETAIL where USEREMAIL = '"+useremail+"'";
        try {
            stmt=con.createStatement();
            ResultSet rs= stmt.executeQuery(sqlQueary1);
            while(rs.next()){
               this.setCartid(rs.getString("cartid"));
               this.setItemid(rs.getString("itemid"));
               this.setQty(Integer.parseInt(rs.getString("qty")));
               this.setCost(Integer.parseInt(rs.getString("cost")));
               this.setTotal(Integer.parseInt(rs.getString("total")));
               this.setUseremail(rs.getString("useremail"));
               this.setDiscount(Integer.parseInt(rs.getString("discount")));
               this.setItemname(rs.getString("itemname"));
               cartBean cartbeanentry = new cartBean(cartid, useremail, itemid, itemname, qty, total, cost, discount);
               cart.add(cartbeanentry);
            }
        } catch (SQLException ex) {
            
        }
        return cart;    
    
    }
    public boolean removefromCart(String itemid, String user){
        boolean flag = false;
        
        String sqlQueary1 = "delete from CARTDETAIL where ITEMID = '"+itemid+"' and USEREMAIL='"+user+"'";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    public boolean addWishlistitemToCart(String cartid, String itemid, int qty, int cost, int total, String useremail,String itemname, int discount){
        
        boolean flag = false;
        
        String sqlQueary1 = "INSERT INTO UMAIR.CARTDETAIL VALUES ('"+cartid+"', '"+itemid+"', "+qty+", "+cost+", "+total+", '"+useremail+"', '"+itemname+"', "+discount+")";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
            String sqlQueary2="DELETE FROM WISHLISTDETAILS where ITEMID='"+itemid+"' and USEREMAIL='"+useremail+"'";
            stmt=con.createStatement();
            stmt.executeUpdate(sqlQueary2);
        } catch (SQLException ex) {
            
        }
        return flag;
    
    }
}
