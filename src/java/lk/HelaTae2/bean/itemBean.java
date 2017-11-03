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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class itemBean {
    private String itemid;
    private String itemname;
    private String itemdesc;
    private int stock;
    private int discount;
    private int itemprice;
    private String itemavailability;
    private String itemCate;
    Connection con;
    Statement stmt; 
    DbConnector itemdao;
    private ArrayList<itemBean> itemsList;

    public itemBean(String itemid, String itemname, String itemdesc, int discount, int itemprice, String itemavailability, String itemCate) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.itemdesc = itemdesc;
        this.discount = discount;
        this.itemprice = itemprice;
        this.itemavailability = itemavailability;
        this.itemCate = itemCate;
    }
    
    public itemBean() {
        itemdao = new DbConnector();
        this.setCon(itemdao.connectDb());
    }
    
    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        try {
            String query = String.format("select item.ITEMNAME from item where ITEMID='%s'", itemid);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                return rs.getString("ITEMNAME");                
            }
        } catch (SQLException ex) {
            Logger.getLogger(itemBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemCate() {
        return itemCate;
    }

    public void setItemCate(String itemCate) {
        this.itemCate = itemCate;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }
    
    public String getItemavailability() {
        return itemavailability;
    }

    public void setItemavailability(String itemavailability) {
        this.itemavailability = itemavailability;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }


    
    public ArrayList<itemBean> viewItems(String id, String category) {

        try {
            ArrayList<itemBean> itemsList = new ArrayList<itemBean>();
            
            String query = String.format("select ITEMID from ITEM where ITEMCATE='%s'", itemCate);
            //String sqlqueary= "select ITEMID from ITEM where ITEMCATE='"+category+"';";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String itemid =rs.getString("itemid");
                String itemname = rs.getString("itemname");
                String itemdesc = rs.getString("itemdesc"); 
                int discount = rs.getInt("discount");
                int itemprice = rs.getInt("itemprice");
                String itemavailability= rs.getString("itemavailability");
                String itemCate = rs.getString("itemCate");
                itemBean item = new itemBean(itemid,itemname,itemdesc,discount,itemprice,itemavailability,itemCate);
                itemsList.add(item);
            }
        } catch (SQLException ex) {
           
        }
            return itemsList;
    }
    
    public boolean addItem(String id, String name,String descrip, int stk, int discount, int price, String availability, String category) {
        boolean flag = false;
                            
        String sqlqueary = "INSERT INTO UMAIR.ITEM VALUES ('"+id+"', '"+name+"', '"+descrip+"', "+stk+","+discount+" , "+price+", '"+availability+"', '"+category+"')";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlqueary)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    
}
