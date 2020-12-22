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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author informatics
 */
public class productDao {

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> productList = new ArrayList();

        String[] colunName = {"รหัสสินค้า", "ชื่อสินค้า"};

        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT productID,\n"
                    + "       proName,\n"
                    + "       proGeneration,\n"
                    + "       proBand,\n"
                    + "       proSize,\n"
                    + "       proQty,\n"
                    + "       proPrice,\n"
                    + "       color,\n"
                    + "       venID\n"
                    + "  FROM Product";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                Product product = toObjact(rs);
                productList.add(product);

            }
            Database.close();
            return productList;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    private static Product toObjact(ResultSet rs) throws SQLException {
        Product product;
        product = new Product();
        product.setProductID(rs.getInt("productID"));
        product.setProName(rs.getString("proName"));
        product.setProGeneration(rs.getString("proGeneration"));
        product.setProBand(rs.getString("proBand"));
        product.setProSize(rs.getInt("proSize"));
        product.setProQty(rs.getInt("proQty"));
        product.setProPrice(rs.getInt("proPrice"));
        product.setColor(rs.getString("color"));
        product.setVenID(rs.getInt("venID"));
        return product;
    }

    public static Product getProduct(int productID) {
        String sql = "SELECT productID,\n"
                + "       proName,\n"
                + "       proGeneration,\n"
                + "       proBand,\n"
                + "       proSize,\n"
                + "       proQty,\n"
                + "       proPrice,\n"
                + "       color,\n"
                + "       venID\n"
                + "  FROM Product\n"
                + " WHERE productID = %d";
        Connection conn = Database.connect();
        Statement stm;

        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql, productID));
            if (rs.next()) {
                Product product = toObjact(rs);
                Database.close();
                return product;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }

    public static boolean insert(Product product) {
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Product ( venID,\n"
                    + "                        color,\n"
                    + "                        proPrice,\n"
                    + "                        proQty,\n"
                    + "                        proSize,\n"
                    + "                        proBand,\n"
                    + "                        proGeneration,\n"
                    + "                        proName)\n"
                    + "                    VALUES (\n"
                    + "%d,\n"
                    + "'%s',\n"
                    + "                        %d,\n"
                    + "                        %d,\n"
                    + "                        %d,\n"
                    + "                        '%s',\n"
                    + "                        '%s',\n"
                    + "                        '%s'\n"
                    + "                    );";
            System.out.println(String.format(sql, product.getVenID(), product.getColor(), product.getProPrice(), product.getProQty(), product.getProSize(), product.getProBand(), product.getProGeneration(), product.getProName()));
            stm.execute(String.format(sql, product.getVenID(), product.getColor(), product.getProPrice(), product.getProQty(), product.getProSize(), product.getProBand(), product.getProGeneration(), product.getProName()));
            Database.close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }

    public static boolean update(Product product) {
        String sql = "UPDATE Product\n"
                + "   SET \n"
                + "       proName = '%s',\n"
                + "       proGeneration = '%s',\n"
                + "       proBand = '%s',\n"
                + "       proSize = %d,\n"
                + "       proQty = %d,\n"
                + "       proPrice = %d,\n"
                + "color = '%s',\n"
                + "venID = %d\n"
                + " WHERE productID = %d;";
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();

            System.out.println(String.format(sql, product.getProName(), product.getProGeneration(), product.getProBand(), product.getProSize(), product.getProQty(), product.getProPrice(), product.getColor(), product.getVenID(), product.ProductID));
            stm.execute(String.format(sql, product.getProName(), product.getProGeneration(), product.getProBand(), product.getProSize(), product.getProQty(), product.getProPrice(), product.getColor(), product.getVenID(), product.ProductID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static boolean delete(Product product) {
        String sql = "DELETE FROM Product WHERE productID = %d";
        Connection conn = Database.connect();

        try {
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql, product.ProductID));
            Database.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }

    public static void save(Product product) {
        if (product.getProductID() < 0) {
            insert(product);
        } else {
            update(product);
        }
    }

}
