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
public class PaymentDao {

    public static int insert(Payment payment) {
        int id = -1;
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Payment (\n"
                    + "                        promotionID,\n"
                    + "                        payTotalPrice\n"
                    + "                    )\n"
                    + "                    VALUES (\n"
                    + "                        %d,\n"
                    + "                        %d\n"
                    + "                    );";
            System.out.println(String.format(sql, payment.getPromotionID(), payment.getPayTotalPrice()));
            stm.execute(String.format(sql, payment.getPromotionID(), payment.getPayTotalPrice()));
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

    public static boolean update(Payment payment) {
        String sql = "UPDATE Payment\n"
                + "   SET \n"
                + "       payDate = '%s',\n"
                + "       payTotalPrice = %d,\n"
                + "       promotionID = %d\n"
                + " WHERE paymentID = %d\n"
                + ";";
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();

            System.out.println(String.format(sql, payment.getPayTotalPrice(), payment.getPromotionID(), payment.getPaymentID()));
            stm.execute(String.format(sql, payment.getPayTotalPrice(), payment.getPromotionID(), payment.getPaymentID()));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static boolean delete(Payment payment) {
        String sql = "DELETE FROM Payment WHERE paymentID = %d;";
        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql, payment.paymentID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static ArrayList<Payment> getUsers() {
        ArrayList<Payment> list = new ArrayList();

        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT paymentID,\n"
                    + "       payDate,\n"
                    + "       payTotalPrice,\n"
                    + "       promotionID\n"
                    + "  FROM Payment";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                Payment payment = toObjact(rs);
                list.add(payment);

            }
            Database.close();
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    private static Payment toObjact(ResultSet rs) throws SQLException {
        Payment payment;
        payment = new Payment();
        payment.setPaymentID(rs.getInt("paymentID"));
        payment.setPayDate(rs.getString("payDate"));
        payment.setPayTotalPrice(rs.getInt("payTotalPrice"));
        payment.setPromotionID(rs.getInt("promotionID"));

        return payment;
    }

    public static Payment getPayment(int paymentID) {
        String sql = "SELECT * FROM Payment WHERE paymentID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql, paymentID));
            if (rs.next()) {
                Payment payment = toObjact(rs);
                Database.close();
                return payment;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    public static void save(Payment payment) {
        if (payment.getPaymentID() < 0) {
            insert(payment);
        } else {
            update(payment);
        }
    }

}
