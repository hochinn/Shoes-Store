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
public class Orders_DetailDao {
     public  static boolean insert(Orders_Detail orders_Detail){
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Orders_Detail (\n" +
"                              productID,\n" +
"                              ordersID,\n" +
"                              ordersDatailPriceAll,\n" +
"                              ordersDetailSum\n" +
"                          )\n" +
"                          VALUES (\n" +
"                              %d,\n" +
"                              %d,\n" +
"                              %d,\n" +
"                              %d\n" +
"                          );";
            System.out.println(String.format(sql, orders_Detail.getProductID(),orders_Detail.getOrdersID(),orders_Detail.getOrdersDatailPriceAll(),orders_Detail.getOrdersDetailSum()));
            stm.execute(String.format(sql, orders_Detail.getProductID(),orders_Detail.getOrdersID(),orders_Detail.getOrdersDatailPriceAll(),orders_Detail.getOrdersDetailSum()));
            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }
    public  static boolean update(Orders_Detail orders_Detail){
        String sql ="UPDATE Orders_Detail\n" +
"   SET \n" +
"       ordersDetailSum = %d,\n" +
"       ordersDatailPriceAll = %d,\n" +
"       ordersID = %d,\n" +
"       productID = %d\n" +
" WHERE orders_detailID = %d ; ";
        Connection conn = Database.connect();
        try { 
            Statement stm = conn.createStatement();
            
            
            System.out.println(String.format(sql,orders_Detail.getOrdersDetailSum(),orders_Detail.getOrdersDatailPriceAll(),orders_Detail.getOrdersID(),orders_Detail.getProductID(),orders_Detail.orders_detailID ));
            stm.execute(String.format(sql,orders_Detail.getOrdersDetailSum(),orders_Detail.getOrdersDatailPriceAll(),orders_Detail.getOrdersID(),orders_Detail.getProductID(),orders_Detail.orders_detailID ));           
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static boolean delete(Orders_Detail orders_Detail){
        String sql = "DELETE FROM Orders_Detail WHERE orders_detailID = %d" ;
        Connection conn = Database.connect();
        
        try { 
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql,orders_Detail.orders_detailID));
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static ArrayList<Orders_Detail> getOrders_Detail(){
        ArrayList<Orders_Detail> list = new ArrayList();
        
        
        
         Connection conn = Database.connect();
        
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT orders_detailID,\n" +
"       ordersDetailSum,\n" +
"       ordersDatailPriceAll,\n" +
"       ordersID,\n" +
"       productID\n" +
"  FROM Orders_Detail";
           ResultSet rs = stm.executeQuery(sql);
           
            
            
            while ( rs.next()) {
                
                
                Orders_Detail orders_Detail = toObjact(rs);
                list.add(orders_Detail);
                
               
               
            }
            Database.close();
            return list;
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    private static Orders_Detail toObjact(ResultSet rs) throws SQLException {
        Orders_Detail orders_Detail;
        orders_Detail = new Orders_Detail();
        orders_Detail.setOrders_detailID(rs.getInt("orders_detailID"));
        orders_Detail.setOrdersDetailSum(rs.getInt("ordersDetailSum"));
        orders_Detail.setOrdersDetailSum(rs.getInt("ordersDatailPriceAll"));
        orders_Detail.setOrdersID(rs.getInt("ordersID"));
        orders_Detail.setProductID(rs.getInt("productID"));
        return orders_Detail;
    }
    public static Orders_Detail getOrders_Detail(int orders_detailID) {
        String sql = "SELECT * FROM Orders_Detail WHERE orders_detailID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql,orders_detailID));
            if(rs.next()){
                Orders_Detail orders_Detail = toObjact(rs);
                Database.close();
                return orders_Detail;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    public static void save(Orders_Detail orders_Detail){
        if(orders_Detail.getOrders_detailID()<0){
            insert(orders_Detail);
        }else{
            update(orders_Detail);
        }
    }
    
}
