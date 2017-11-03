/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.bean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Admin
 */
public class wishlistBean {
    private String watchlistId, itemId, ItemName,useremail;
    private int productcost;
    Connection con;
    Statement stmt;

    public wishlistBean() {
        DbConnector dbcon = new DbConnector();
        this.setCon(dbcon.connectDb());
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public String getWatchlistId() {
        return watchlistId;
    }

    public void setWatchlistId(String watchlistId) {
        this.watchlistId = watchlistId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public int getProductcost() {
        return productcost;
    }

    public void setProductcost(int productcost) {
        this.productcost = productcost;
    }

    
    
    public boolean addtoWishlist(String wListID, String itemID, String itemName, String userEmail, int cost){
        boolean flag = false;
        
        String sqlQueary ="insert into WISHLISTDETAILS values('"+wListID+"','"+itemID+"','"+itemName+"','"+userEmail+"',"+cost+")";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    public boolean removefromWishlist(String itemid, String user){
        boolean flag = false;
        
        String sqlQueary1 = "delete from WISHLISTDETAILS where ITEMID = '"+itemid+"' and USEREMAIL='"+user+"'";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
}
