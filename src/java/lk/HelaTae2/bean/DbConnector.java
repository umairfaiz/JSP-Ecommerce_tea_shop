/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.HelaTae2.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DbConnector {
    
    Connection con;
    public Connection connectDb(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBHaleTae","umair","1234");
        } 
        catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
            
        }
        return con;
    }

}
