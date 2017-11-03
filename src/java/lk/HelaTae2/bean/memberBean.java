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
import java.util.Date;

/**
 *
 * @author Admin
 */
public class memberBean {
    private String memberid,email;
    private int points;
    private Date joinedDate;
    Connection con;
    Statement stmt;
    ResultSet rs;

    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public memberBean() {
        DbConnector member = new DbConnector();
        this.setCon(member.connectDb());
    }
    
    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }
    public String getEmail() {
        return email;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

//    public boolean isMemberExist(String user, String pwd) {
//        boolean flag = false;
//
//        String sqlqueary = "Select * from MEMBERDETAILS where EMAIL='"+user+"' and PASSWORD='"+pwd +"'";
//        try {
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(sqlqueary);
//            while (rs.next()) {
//                flag = true;
//            }
//        } catch (SQLException ex) {
//
//        }
//        return flag;
//    }
    public int memberPoints(String user, String cid){
        String sql1 ="select POINTS from MEMBERDETAILS where EMAIL='"+user+"' and COUPONID='"+cid+"'";
        try {
             stmt=con.createStatement();
             rs = stmt.executeQuery(sql1);
            if(rs.next()){
                 points = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            
        }
        return points;
    }
}
