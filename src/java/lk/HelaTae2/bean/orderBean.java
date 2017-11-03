package lk.HelaTae2.bean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class orderBean {
    private String orderid,itemid,useremail,country,orderdate,ordernotes;
    private int ordertotal,totalquantity;
    Connection con;
    Statement stmt;

    public orderBean() {
        DbConnector dbcon = new DbConnector();
        this.setCon(dbcon.connectDb());
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrdernotes() {
        return ordernotes;
    }

    public void setOrdernotes(String ordernotes) {
        this.ordernotes = ordernotes;
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

    public boolean orderDetails(String ordid, String useremail,String purchDate,int ordTotal,int totQty){
        
        boolean flag = false;
        
        String sqlQueary1 = "insert into ORDERDETAIL VALUES ('"+ordid+"','"+useremail+"','"+purchDate+"',"+ordTotal+","+totQty+")";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
            String sqlQueary2="DELETE from CARTDETAIL where USEREMAIL='"+useremail+"'";
            stmt=con.createStatement();
            stmt.executeUpdate(sqlQueary2);
            
        } catch (SQLException ex) {
            
        }
        return flag;
    
    }
   
    public Boolean deliveryNote(String messageID, String name, String email, String subject, String message, String Recv ){
        boolean flag = false;
        
        
        String sqlQueary ="INSERT INTO MESSAGEDETAILS VALUES('"+messageID+"','"+name+"','"+email+"','"+subject+"','"+message+"','"+Recv+"')";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    
    
    
}
