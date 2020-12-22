/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatics
 */
public class CustomerDao {
    public  static boolean insert(Customer cus){
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Customer(\n" +
            "                         name,\n" +
            "                         surname,\n" + 
            "                         tel,\n" +  
            "                         birthday,\n" +
            "                         email\n" +
            "                         )\n" +

            "                     VALUES (\n" +
            "                         '%s',\n" +
            "                         '%s',\n" +
            "                         '%s',\n" +
            "                         '%s',\n" +
            "                         '%s'\n" +
            "                     );";
            
            System.out.println(String.format(sql,cus.getName() ,cus.getSurname(),cus.getTel(),cus.getBirthday(),cus.getEmail()));
            stm.execute(String.format(sql,cus.getName(),cus.getSurname(),cus.getTel(),cus.getBirthday(),cus.getEmail()));
            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }
    public  static boolean update(Customer cus){
        String sql ="UPDATE Customer\n" +
                    "   SET \n" +
                    "       name = '%s',\n" +
                    "       surname = '%s',\n" +
                    "       tel = '%s',\n" +
                    "       birthday = '%s',\n" +
                    "       email = '%s'\n" +
                    " WHERE \n" +
                    "       cusID = %d\n" +
                    ";";
        Connection conn = Database.connect();
        try { 
            Statement stm = conn.createStatement();
            
            
            System.out.println(String.format(sql, cus.getName(),cus.getSurname(),cus.getTel(),cus.getBirthday(),cus.getEmail(),cus.cusID));
            stm.execute(String.format(sql, cus.getName(),cus.getSurname(),cus.getTel(),cus.getBirthday(),cus.getEmail(),cus.cusID));           
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static boolean delete(Customer cus){
        String sql = "DELETE FROM Customer WHERE cusID = %d" ;
        Connection conn = Database.connect();
        
        try { 
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql,cus.cusID));
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    
    
    public  static ArrayList<Customer> getCustomer(){
        ArrayList<Customer> list = new ArrayList();
        
        
        
         Connection conn = Database.connect();
        
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT cusID,\n" +
                        "       name,\n" +
                        "       surname,\n" +
                        "       tel,\n" +
                        "       birthday,\n" +
                        "       email\n" +
                        "  FROM Customer";
            ResultSet rs = stm.executeQuery(sql);
           
            
            
            while ( rs.next()) {
                
                
                Customer cus = toObjact(rs);
                list.add(cus);
                
               
               
            }
            Database.close();
            return list;
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    private static Customer toObjact(ResultSet rs) throws SQLException {
        Customer cus;
        cus = new Customer();
        cus.setCusID(rs.getInt("cusID"));
        cus.setName(rs.getString("name"));
        cus.setSurname(rs.getString("surname"));
        cus.setTel(rs.getString("Tel"));
        cus.setBirthday(rs.getString("birthday"));
        cus.setEmail(rs.getString("email"));
       
        return cus;
    }
    public static Customer getCustomer(int cusID) {
        String sql = "SELECT * FROM Customer WHERE cusID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql,cusID));
            if(rs.next()){
                Customer cus = toObjact(rs);
                Database.close();
                return cus;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    public static void save(Customer cus){
        if(cus.getCusID()<0){
            insert(cus);
        }else{
            update(cus);
        }
    }

    
}
