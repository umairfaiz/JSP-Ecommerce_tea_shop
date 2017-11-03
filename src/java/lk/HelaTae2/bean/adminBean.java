/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.bean;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class adminBean {
    
    String memberid, date, email, coupon;
    int points;
    private String msgID;    
    private String adminName;
    private String adminEmail;
    private String Subject;
    private String replyMsg;
    private String receiverEmail;
    Connection con;
    Statement stmt;

    public adminBean() {
        DbConnector dbcon = new DbConnector();
        this.setCon(dbcon.connectDb());
    }
    
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public boolean addPointstoMember(String memebrid, String jdate, String email, int points, String couponid){
        
        boolean flag = false;
        
        String sqlQueary1 = "insert INTO MEMBERDETAILS VALUES ('"+memebrid+"', '"+jdate+"','"+email+"',"+points+",'"+couponid+"')";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary1)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    
    }
    public boolean updateMemberPoints(int points, String email){
     boolean flag = false;
        
        String sqlQueary2 = "update MEMBERDETAILS SET POINTS= "+points+" where EMAIL='"+email+"'";
        try {
             stmt=con.createStatement();
            if(stmt.executeUpdate(sqlQueary2)>0){
                flag=true;
            }
        } catch (SQLException ex) {
            
        }
        return flag;
    }
    public Boolean replyforInquiry(String messageID, String name, String email, String subject, String message, String Recv ){
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
    
    public Boolean removeAdminEmail (String email,String message){
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
