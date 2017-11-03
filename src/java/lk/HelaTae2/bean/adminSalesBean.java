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
public class adminSalesBean {
    Connection con;
    Statement stmt;
    ResultSet rs;
    private String orderid,useremail,purchasedate;
    private int totSales,individualtotal,individualqty,totQty;

    public adminSalesBean() {
         DbConnector dbcon = new DbConnector();
           this.setCon(dbcon.connectDb());
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getTotQty() {
        return totQty;
    }

    public void setTotQty(int totQty) {
        this.totQty = totQty;
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

    public int getTotSales() {
        return totSales;
    }

    public void setTotSales(int totSales) {
        this.totSales = totSales;
    }

    public int getIndividualtotal() {
        return individualtotal;
    }

    public void setIndividualtotal(int individualtotal) {
        this.individualtotal = individualtotal;
    }

    public int getIndividualqty() {
        return individualqty;
    }

    public void setIndividualqty(int individualqty) {
        this.individualqty = individualqty;
    }
    
    public int totalSales(){
        
        String sql1 = "SELECT sum (ORDERTOTAL) FROM ORDERDETAIL";
        
       try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 totSales = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return totSales;
    }   
    public int totalUnits(){
        
        String sql1 = "SELECT sum (TOTALQTY) FROM ORDERDETAIL";
        
       try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 totQty = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return totQty;
    }
}
    
