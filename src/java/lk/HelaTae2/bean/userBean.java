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
public class userBean {
    private String useremail;
    private String password; 
    private String customerName;
    private String customerAddress;
    private String customerCardDetails;
    private String customerEmail;
    private String customerPassword;
    private String customerType;
    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    /**
     * @return the useremail
     */
    public userBean(){
        DbConnector mylogindao = new DbConnector();
        this.setCon(mylogindao.connectDb());
    }
    public String getUseremail() {
        return useremail;
    }

    /**
     * @param useremail the useremail to set
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCardDetails() {
        return customerCardDetails;
    }

    public void setCustomerCardDetails(String customerCardDetails) {
        this.customerCardDetails = customerCardDetails;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    
    
    public boolean addUser(String custID, String custName, String custAddr, String custCardDetails, String custEmail, String custPwd,String custTyp){
        boolean flag = false;
        
        String sqlQueary1 = "INSERT into USERLOGINDETAILS values ('"+custID+"','"+custName+"','"+custAddr+"','"+custCardDetails+"','"+custEmail+"','"+custPwd+"','"+custTyp+"')";
         try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    public boolean isUserExist(String u, String p){
    boolean flag = false;

     String sqlqueary= "Select * from USERLOGINDETAILS where CUSTOMEREMAIL='"+u+"' and CUSTOMERPASSWORD='"+p+"'";
    try {
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sqlqueary);
        while(rs.next()){
            flag = true;
        }
    } catch (SQLException ex) {

    }
    return flag;
    }
    
    public boolean checkUser(String e){
    boolean flag = false;

     String sqlqueary= "Select * from USERLOGINDETAILS where CUSTOMEREMAIL='"+e+"'";
    try {
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sqlqueary);
        while(rs.next()){
            flag = true;
        }
    } catch (SQLException ex) {

    }
    return flag;
    }
    public Boolean updateUserinfo(String custEmail, String custAdd, String custPass, String custCard) {
        boolean flag = false;

        String sqlQueary = "UPDATE USERLOGINDETAILS SET CUSTOMERADRESS='" + custAdd + "' , CUSTOMERPASSWORD='" + custPass + "',CUSTOMERCARDDETAILS='" + custCard + "' where CUSTOMEREMAIL='" + custEmail + "'";
        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sqlQueary) > 0) {
                flag = true;
            }
        } catch (SQLException ex) {

        }
        return flag;
    }
    public boolean resetPassword(String email, String pwd){
    boolean flag = false;

     String sqlqueary= "update USERLOGINDETAILS set CUSTOMERPASSWORD='"+pwd+"' where CUSTOMEREMAIL='"+email+"'";
    try {
        stmt=con.createStatement();
            if(stmt.executeUpdate(sqlqueary)>0){
                flag=true;
            }
    } catch (SQLException ex) {

    }
    return flag;
    }
    public String checkUserType(String custEmail) {
        
        String sqlQueary = "SELECT CUSTOMERTYPE FROM USERLOGINDETAILS where CUSTOMEREMAIL='"+custEmail+"'";
        try {
           stmt=con.createStatement();
            rs = stmt.executeQuery(sqlQueary);
            if(rs.next()){
                 customerType = rs.getString(1);
            }
        } catch (SQLException ex) {

        }
        return customerType;
    }
}
