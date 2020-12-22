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
public class BillCustomerDao {

    public static int insert(BillCustomer bill) {
        int id = -1;
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO BillCustomer (\n"
                    + "                             empID,\n"
                    + "                             paymentID,\n"
                    + "                             cusID\n"
                    + "                         )\n"
                    + "                         VALUES (\n"
                    + "                             %d,\n"
                    + "                             %d,\n"
                    + "                             %d\n"
                    + "                         );";

            System.out.println(String.format(sql, bill.getEmpID(), bill.getPaymentID(), bill.getCusID()));
            stm.execute(String.format(sql, bill.getEmpID(), bill.getPaymentID(), bill.getCusID()));

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

    public static boolean update(BillCustomer bill) {
        String sql = "UPDATE BillCustomer\n"
                + "   SET \n"
                + "       cusID = %d,\n"
                + "       paymentID = %d,\n"
                + "       empID = %d\n"
                + " WHERE \n"
                + "       billID = %d\n"
                + "       ;";
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();

            System.out.println(String.format(sql, bill.getCusID(), bill.getPaymentID(), bill.getEmpID(), bill.billID));
            stm.execute(String.format(sql, bill.getCusID(), bill.getPaymentID(), bill.getEmpID(), bill.billID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static boolean delete(BillCustomer bill) {
        String sql = "DELETE FROM BillCustomer WHERE billID = %d;";
        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql, bill.billID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static ArrayList<BillCustomer> getBillCustomer() {
        ArrayList<BillCustomer> list = new ArrayList();

        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT billID,\n"
                    + "       dateBuy,\n"
                    + "       cusID,\n"
                    + "       paymentID,\n"
                    + "       empID\n"
                    + "  FROM BillCustomer";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                BillCustomer bill = toObjact(rs);
                list.add(bill);

            }
            Database.close();
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    private static BillCustomer toObjact(ResultSet rs) throws SQLException {
        BillCustomer bill;
        bill = new BillCustomer();
        bill.setBillID(rs.getInt("billID"));
        bill.setDateBuy(rs.getString("dateBuy"));
        bill.setCusID(rs.getInt("cusID"));
        bill.setPaymentID(rs.getInt("paymentID"));
        bill.setEmpID(rs.getInt("empID"));

        return bill;
    }

    public static BillCustomer getBillCustomer(int billID) {
        String sql = "SELECT * FROM BillCustomer WHERE billID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql, billID));
            if (rs.next()) {
                BillCustomer billD = toObjact(rs);
                Database.close();
                return billD;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    public static void save(BillCustomer bill) {
        if (bill.getBillID() < 0) {
            insert(bill);
        } else {
            update(bill);
        }
    }

}
