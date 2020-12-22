/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Database {
    static String url = "jdbc:sqlite:./db/ShoesStoreDB.db";
    static Connection conn = null;
    
    
   public static void close() {
        try {
            if(conn != null){
                
                conn.close();
            System.out.println("close");
            conn = null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection connect() {
        
        if(conn != null) return conn;
        //        if(user.equals("admin")&&password.equals("admin")){
//            Menu menu = new Menu();
//            menu.setVisible(true);
//        }else{
//            JOptionPane.showMessageDialog(this, "Error : Username or Password incorrect!!");
//    }

try {
    System.out.print("Connect Status : ");
    conn = DriverManager.getConnection(url);
    System.out.println("Data Connect");
    return conn;
} catch (SQLException ex) {
    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("Error Connect");
    
}
return null;
    }
    
}
