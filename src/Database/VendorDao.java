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
public class VendorDao {
    public  static boolean insert(Vendor ven){
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Vendor (\n" +
"                       venEmail,\n" +
"                       venTel,\n" +
"                       venAddress,\n" +
"                       vanName\n" +
"                   )\n" +
"                   VALUES (\n" +
"                       '%s',\n" +
"                       '%s',\n" +
"                       '%s',\n" +
"                       '%s'\n" +
"                   );";
            System.out.println(String.format(sql, ven.getVenEmail(),ven.getVenTel(),ven.getVenAddress(),ven.getVanName()));
            stm.execute(String.format(String.format(sql, ven.getVenEmail(),ven.getVenTel(),ven.getVenAddress(),ven.getVanName())));
            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }
    public  static boolean update(Vendor ven){
        String sql ="UPDATE Vendor\n" +
"   SET \n" +
"       vanName = '%s',\n" +
"       venAddress = '%s',\n" +
"       venTel = '%s',\n" +
"       venEmail = '%s'\n" +
" WHERE \n" +
"       venID = %d \n" +
"       ;";
        Connection conn = Database.connect();
        try { 
            Statement stm = conn.createStatement();
            
            
            System.out.println(String.format(sql, ven.getVanName(),ven.getVenAddress(),ven.getVenTel(),ven.getVenEmail(),ven.venID));
            stm.execute(String.format(sql, ven.getVanName(),ven.getVenAddress(),ven.getVenTel(),ven.getVenEmail(),ven.venID));           
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static boolean delete(Vendor ven){
        String sql = "DELETE FROM Vendor WHERE venID = %d;" ;
        Connection conn = Database.connect();
        
        try { 
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql,ven.venID));
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static ArrayList<Vendor> getVendor(){
        ArrayList<Vendor> list = new ArrayList();
        
        
        
         Connection conn = Database.connect();
        
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT venID,\n" +
"       vanName,\n" +
"       venAddress,\n" +
"       venTel,\n" +
"       venEmail\n" +
"  FROM Vendor;";
           ResultSet rs = stm.executeQuery(sql);
           
            
            
            while ( rs.next()) {
                
                
                Vendor ven = toObjact(rs);
                list.add(ven);
                
               
               
            }
            Database.close();
            return list;
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    private static Vendor toObjact(ResultSet rs) throws SQLException {
        Vendor ven;
        ven = new Vendor();
        ven.setVenID(rs.getInt("venID"));
        ven.setVanName(rs.getString("vanName"));
        ven.setVenAddress(rs.getString("venAddress"));
        ven.setVenTel(rs.getString("venTel"));
        ven.setVenEmail(rs.getString("venEmail"));
        return ven;
    }
    public static Vendor getVendor(int venID) {
        String sql = "SELECT * FROM Vendor WHERE venID = %d;";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql,venID));
            if(rs.next()){
                Vendor ven = toObjact(rs);
                Database.close();
                return ven;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    public static void save(Vendor ven){
        if(ven.getVenID()<0){
            insert(ven);
        }else{
            update(ven);
        }
    }
}
