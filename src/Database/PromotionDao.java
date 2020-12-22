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
public class PromotionDao {
    public  static boolean insert(Promotion pro){
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Promotion (\n" +
"                          dateEnd,\n" +
"                          dateStart,\n" +
"                          proName\n" +
"                      )\n" +
"                      VALUES (\n" +
"                          '%s',\n" +
"                          '%s',\n" +
"                          '%s',\n" +
"                      );";
            System.out.println(String.format(sql, pro.getDateEnd(),pro.getDateStart(),pro.getProName()));
            stm.execute(String.format(sql, pro.getDateEnd(),pro.getDateStart(),pro.getProName()));
            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }
    public  static boolean update(Promotion pro){
        String sql ="UPDATE Promotion\n" +
"   SET \n" +
"       proName = '%s',\n" +
"       dateStart = '%s',\n" +
"       dateEnd = '%s'\n" +
" WHERE \n" +
"       promotionID = %d\n" +
";";
        Connection conn = Database.connect();
        try { 
            Statement stm = conn.createStatement();
            
            
            System.out.println(String.format(sql, pro.getProName(),pro.getDateStart(),pro.getDateEnd(),pro.promotionID));
            stm.execute(String.format(sql, pro.getProName(),pro.getDateStart(),pro.getDateEnd(),pro.promotionID));           
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static boolean delete(Promotion pro){
        String sql = "DELETE FROM Promotion WHERE promotionID = %d" ;
        Connection conn = Database.connect();
        
        try { 
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql,pro.promotionID));
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static ArrayList<Promotion> getPromotion(){
        ArrayList<Promotion> list = new ArrayList();
        
        
        
         Connection conn = Database.connect();
        
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT promotionID,\n" +
"       proName,\n" +
"       dateStart,\n" +
"       dateEnd\n" +
"  FROM Promotion";
           ResultSet rs = stm.executeQuery(sql);
           
            
            
            while ( rs.next()) {
                
                
                Promotion pro = toObjact(rs);
                list.add(pro);
                
               
               
            }
            Database.close();
            return list;
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    private static Promotion toObjact(ResultSet rs) throws SQLException {
        Promotion pro;
        pro = new Promotion();
        pro.setPromotionID(rs.getInt("promotionID"));
        pro.setProName(rs.getString("proName"));
        pro.setDateStart(rs.getString("dateStart"));
        pro.setDateEnd(rs.getString("dateEnd"));
        return pro;
    }
    public static Promotion getPromotion(int promotionID) {
        String sql = "SELECT * FROM Promotion WHERE promotionID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql,promotionID));
            if(rs.next()){
                Promotion pro = toObjact(rs);
                Database.close();
                return pro;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    public static void save(Promotion pro){
        if(pro.getPromotionID()<0){
            insert(pro);
        }else{
            update(pro);
        }
    }

}
