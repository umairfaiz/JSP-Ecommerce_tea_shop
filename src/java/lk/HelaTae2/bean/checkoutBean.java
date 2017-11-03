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

/**
 *
 * @author Admin
 */
public class checkoutBean {
    Connection con;
    Statement stmt;
    ResultSet rs;
    private String itemid, useremail, country, purchasedate, notes, paymenttype;
    private int ordertotal,totalquantity;
    private int amountPay;
    private int charges;

    public checkoutBean() {
        
        DbConnector dbcon = new DbConnector();
           this.setCon(dbcon.connectDb());
    }

    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(String purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public int getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(int ordertotal) {
        this.ordertotal = ordertotal;
    }

    public int getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(int totalquantity) {
        this.totalquantity = totalquantity;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    public int amountPay(String useremail){
        
        String sql1 = "SELECT sum (TOTAL) FROM CARTDETAIL where USEREMAIL='"+useremail+"'";
        
       try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 amountPay = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return amountPay;
        
    }
    public int totalQty(String useremail){
        
        String sql1 ="SELECT sum (QTY) FROM CARTDETAIL where USEREMAIL='"+useremail+"'";
        try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 totalquantity = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return totalquantity;
    }
    public boolean shippingInfo(String useremail, String ordEmail, String ordAddress, String ordDeli, String ordNotes){
        boolean flag = false;
        String sqlQueary1 = "insert into SHIPPINGDETAILS VALUES ('"+useremail+"','"+ordEmail+"','"+ordAddress+"','"+ordDeli+"','"+ordNotes+"')";
        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sqlQueary1) > 0) {
                flag = true;
            }
        } catch (SQLException ex) {

        }
        return flag;
    }
    public int deliveryCharges(String country){
        
        String sql1 ="SELECT CHARGES from SHIPPINGCHARGES where COUNTRY='"+country+"'";
        try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 charges = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return charges;
    }
//    public int premiumPoints(String useremail, String couponid){
//        
//        String sql1 ="SELECT sum (QTY) FROM CARTDETAIL where USEREMAIL='"+useremail+"'";
//        try {
//             stmt=con.createStatement();
//            rs = stmt.executeQuery(sql1);
//            if(rs.next()){
//                 totalquantity = Integer.parseInt(rs.getString(1));
//            }
//        } catch (SQLException ex) {
//            
//        }
//        return totalquantity;
//    }
    
}
