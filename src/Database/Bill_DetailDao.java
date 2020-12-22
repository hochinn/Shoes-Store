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
public class Bill_DetailDao {

    public static boolean insert(Bill_Detail billD) {
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Bill_Detail (\n"
                    + "                            billID,\n"
                    + "                            productID,\n"
                    + "                            item\n"
                    + "                        )\n"
                    + "                        VALUES (\n"
                    + "                            %d,\n"
                    + "                            %d,\n"
                    + "                            %d\n"
                    + "                        );";

            System.out.println(String.format(sql, billD.getBillID(), billD.getItem(), billD.getProductID()));
            stm.execute(String.format(sql, billD.getBillID(), billD.getProductID(), billD.getItem()));

            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }

    public static boolean update(Bill_Detail billD) {
        String sql = "UPDATE Bill_Detail\n"
                + "   SET \n"
                + "       productID = %d,\n"
                + "       billID = %d,\n"
                + "       item = %d\n"
                + " WHERE \n"
                + "       Bill_DetailID = %d\n"
                + "       ;";
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();

            System.out.println(String.format(sql, billD.getProductID(), billD.getBillID(), billD.getItem(), billD.getBill_DetailID()));
            stm.execute(String.format(sql, billD.getProductID(), billD.getBillID(), billD.getItem(), billD.getBill_DetailID()));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static boolean delete(Bill_Detail billD) {
        String sql = "DELETE FROM Bill_Detail WHERE Bill_DetailID = %d;";
        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql, billD.Bill_DetailID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static ArrayList<Bill_Detail> getBill_Details() {
        ArrayList<Bill_Detail> list = new ArrayList();

        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM Bill_Detail";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Bill_Detail billD = toObjact(rs);
                list.add(billD);
            }
            System.out.println(list);
            Database.close();
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    private static Bill_Detail toObjact(ResultSet rs) throws SQLException {
        Bill_Detail billd;
        billd = new Bill_Detail();
        billd.setBill_DetailID(rs.getInt("Bill_DetailID"));
        billd.setProductID(rs.getInt("productID"));
        billd.setBillID(rs.getInt("billID"));
        billd.setItem(rs.getInt("item"));
        return billd;
    }

    public static Bill_Detail getBill_Detail(int Bill_DetailID) {
        String sql = "SELECT * FROM Bill_Detail WHERE Bill_DetailID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql, Bill_DetailID));
            if (rs.next()) {
                Bill_Detail billD = toObjact(rs);
                Database.close();
                return billD;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    public static void save(Bill_Detail billD) {
        if (billD.getBill_DetailID() < 0) {
            insert(billD);
        } else {
            update(billD);
        }
    }

}
