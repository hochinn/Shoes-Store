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
public class OrdersDao {

    public static int insert(Orders orders) {
        int id=-1;
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Orders (\n"
                    + "                       empID,\n"
                    + "                       payProductTotal,\n"
                    + "                       payProductDate,\n"
                    + "                       orderDate\n"
                    + "                   )\n"
                    + "                   VALUES (\n"
                    + "                       %d,\n"
                    + "                       %d,\n"
                    + "                       '%s',\n"
                    + "                       '%s'\n"
                    + "                   );";
            System.out.println(String.format(sql,  orders.getEmpID(), orders.getPayProductTotal(), orders.getPayProductDate(),orders.getOrderDate()));
            stm.execute(String.format(sql,  orders.getEmpID(), orders.getPayProductTotal(), orders.getPayProductDate(),orders.getOrderDate()));
            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt("last_insert_rowid()");
            }
            Database.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return id;
    }

    public static boolean update(Orders orders) {
        String sql = "UPDATE Orders\n"
                + "   SET \n"
                + "       orderDate = '%s',\n"
                + "       payProductDate = '%s',\n"
                + "       payProductTotal = %d,\n"
                + "       empID = %d\n"
                + " WHERE ordersID = %d\n"
                + "       ;";
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();

            System.out.println(String.format(sql, orders.getOrderDate(), orders.getPayProductDate(), orders.getPayProductTotal(), orders.getEmpID(), orders.getOrdersID()));
            stm.execute(String.format(sql, orders.getOrderDate(), orders.getPayProductDate(), orders.getPayProductTotal(), orders.getEmpID(), orders.getOrdersID()));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static boolean delete(Orders orders) {
        String sql = "DELETE FROM Orders WHERE ordersID = %d";
        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql, orders.ordersID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static ArrayList<Orders> getOrders() {
        ArrayList<Orders> list = new ArrayList();

        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT ordersID,\n"
                    + "       orderDate,\n"
                    + "       payProductDate,\n"
                    + "       payProductTotal,\n"
                    + "       empID\n"
                    + "  FROM Orders"
                    ;
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                Orders orders = toObjact(rs);
                list.add(orders);

            }
            Database.close();
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    private static Orders toObjact(ResultSet rs) throws SQLException {
        Orders orders;
        orders = new Orders();
        orders.setOrdersID(rs.getInt("ordersID"));
        orders.setOrderDate(rs.getString("orderDate"));
        orders.setPayProductDate(rs.getString("payProductDate"));
        orders.setPayProductTotal(rs.getInt("payProductTotal"));
        orders.setEmpID(rs.getInt("empID"));

        return orders;
    }

    public static Orders getOrders(int ordersID) {
        String sql = "SELECT * FROM Orders WHERE ordersID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql, ordersID));
            if (rs.next()) {
                Orders orders = toObjact(rs);
                Database.close();
                return orders;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    public static void save(Orders orders) {
        if (orders.getOrdersID() < 0) {
            insert(orders);
        } else {
            update(orders);
        }
    }

}
