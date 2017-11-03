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
public class biddingBean {
    private String itemid, bidid,useremail,itemname;
    private int bidvalue,existingbid;
    Connection con;
    Statement stmt;
    ResultSet rs;

    public biddingBean() {
        
        DbConnector dbcon = new DbConnector();
        this.setCon(dbcon.connectDb());
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getBidid() {
        return bidid;
    }

    public void setBidid(String bidid) {
        this.bidid = bidid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getBidvalue() {
        return bidvalue;
    }

    public void setBidvalue(int bidvalue) {
        this.bidvalue = bidvalue;
    }

    public int getExistingbid() {
        return existingbid;
    }

    public void setExistingbid(int existingbid) {
        this.existingbid = existingbid;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public boolean addBid(String bidid, String name,int userbid,int currentBid,String useremail,String itemid){
        boolean flag= false;
        String sqlQueary ="INSERT INTO UMAIR.BIDDINGDETAILS VALUES ('"+bidid+"', '"+name+"', "+userbid+", "+currentBid+", '"+useremail+"', '"+itemid+"')";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        
        return flag;
    }
    public int maxbid(){
        
        String sql1 = "SELECT max (CURRENTBID) FROM BIDDINGDETAILS";
        
       try {
             stmt=con.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 existingbid = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return existingbid;
        
    }
    public boolean updatebid(String id, int currentBid, String email){
        boolean flag= false;
        String sqlQueary ="UPDATE BIDDINGITEMS SET CURRENTBID= "+currentBid+" , BIDDEREMAIL='"+email+"' WHERE ITEMID='"+id+"'";
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
