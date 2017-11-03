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
public class feedbackBean {
    private String msgID;    
    private String custname;
    private String custemail;
    private String feedsubject;
    private String feedMsg;
    private String msgReceiver;
    
    Connection con;
    Statement stmt;

    public feedbackBean() {
        DbConnector mylogindao = new DbConnector();
        this.setCon(mylogindao.connectDb());
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getFeedsubject() {
        return feedsubject;
    }

    public void setFeedsubject(String feedsubject) {
        this.feedsubject = feedsubject;
    }

    public String getFeedMsg() {
        return feedMsg;
    }

    public void setFeedMsg(String feedMsg) {
        this.feedMsg = feedMsg;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public String getMsgReceiver() {
        return msgReceiver;
    }

    public void setMsgReceiver(String msgReceiver) {
        this.msgReceiver = msgReceiver;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public Boolean sendFeedback(String messageID, String name, String email, String subject, String message, String Recv ){
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
    public Boolean removeCustEmail (String email,String message){
        boolean flag = false;
        
        String sqlQueary ="delete FROM MESSAGEDETAILS where CUSTMESSAGE='"+message+"' and RECEIVER='"+email+"'";
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
