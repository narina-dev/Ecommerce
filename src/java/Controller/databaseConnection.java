/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.util.*;

public class databaseConnection {
    
     static Connection con;
   
    
    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        
      
        
        Class.forName("com.mysql.jdbc.Driver");
        
        String  url = "jdbc:mysql://localhost:3306/ecomers";
        
        try{
            con = DriverManager.getConnection(url, "root", "");
            System.out.println("Database connection successful");
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Database connection fail");
        }
        
        return con;
    }
    
}
