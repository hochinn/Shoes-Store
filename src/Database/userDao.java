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

/**
 *
 * @author Master
 */
public class userDao {
    public  static boolean insert(User user){
        Connection conn = Database.connect();
        try {
            Statement stm = conn.createStatement();
            String sql = "INSERT INTO Employees (\n" +
            "                          loginName,\n" +
            "                          password,\n" +
            "                          empName,\n" +
            "                          empSername,\n" +
            "                          empAddress,\n" +
            "                          empTel,\n" +
            "                          empEmail,\n" +
            "                          empBank,\n" +
            "                          typeWordID,\n" +
            "                          workStatus\n" +
            "\n" +     
            "                      )\n" +
            "                      VALUES (\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          '%s',\n" +
            "                          %d,\n" +
            "                          %d,\n" +
            "                          '%s'\n" +
            "        \n" +
            "                          \n" +
            "                      );";
            System.out.println(String.format(sql, user.getLoginName(),user.getPassword(),user.getEmpName(),user.getEmpSername(),user.getEmpAddress(),user.getEmpTel(),user.getEmpEmail(),user.getEmpBank(),user.getTypeWordID(),user.getWorkStatus()));
            stm.execute(String.format(sql, user.getLoginName(),user.getPassword(),user.getEmpName(),user.getEmpSername(),user.getEmpAddress(),user.getEmpTel(),user.getEmpEmail(),user.getEmpBank(),user.getTypeWordID(),user.getWorkStatus()));
            Database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();

        return true;
    }
    public  static boolean update(User user){
        String sql ="UPDATE Employees\n" +
                    "   SET \n" +
                    "       loginName = '%s',\n" +
                    "       password = '%s',\n" +
                    "       empName = '%s',\n" +
                    "       empSername = '%s',\n" +
                    "       empAddress = '%s',\n" +
                    "       empTel = '%s',\n" +
                    "       empEmail = '%s',\n" +
                    "       empBank = %d,\n" +
                    "       typeWordID = %d,\n" +
                    "       workStatus = '%s'\n" +
                    " WHERE empID = %d ;";
        Connection conn = Database.connect();
        try { 
            Statement stm = conn.createStatement();
            
            
            System.out.println(String.format(sql, user.getLoginName(),user.getPassword(),user.getEmpName(),user.getEmpSername(),user.getEmpAddress(),user.getEmpTel(),user.getEmpEmail(),user.getEmpBank(),user.getTypeWordID(),user.getWorkStatus(),user.empID));
            stm.execute(String.format(sql, user.getLoginName(),user.getPassword(),user.getEmpName(),user.getEmpSername(),user.getEmpAddress(),user.getEmpTel(),user.getEmpEmail(),user.getEmpBank(),user.getTypeWordID(),user.getWorkStatus(),user.empID));           
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static boolean delete(User user){
        String sql = "DELETE FROM Employees WHERE empID = %d" ;
        Connection conn = Database.connect();
        
        try { 
            Statement stm = conn.createStatement();
            stm.execute(String.format(sql,user.empID));
            Database.close();
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return false;
    }
    public  static ArrayList<User> getUsers(){
        ArrayList<User> list = new ArrayList();
        
        
        
         Connection conn = Database.connect();
        
        try {
            Statement stm = conn.createStatement();
            String sql = "SELECT empID,\n" +
                        "       loginName,\n" +
                        "       password,\n" +
                        "       empName,\n" +
                        "       empSername,\n" +
                        "       empAddress,\n" +
                        "       empTel,\n" +
                        "       empEmail,\n" +
                        "       empBank,\n" +
                        "       typeWordID,\n" +
                        "       workStatus\n" +
                        "  FROM Employees";
           ResultSet rs = stm.executeQuery(sql);
           

            while ( rs.next()) {
                User user = toObjact(rs);
                list.add(user);
            }
            Database.close();
            return list;
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    private static User toObjact(ResultSet rs) throws SQLException {
        User user;
        user = new User();
        user.setEmpID(rs.getInt("empID"));
        user.setLoginName(rs.getString("loginName"));
        user.setPassword(rs.getString("password"));
        user.setEmpName(rs.getString("empName"));
        user.setEmpSername(rs.getString("empSername"));
        user.setEmpAddress(rs.getString("empAddress"));
        user.setEmpTel(rs.getString("empTel"));
        user.setEmpEmail(rs.getString("empEmail"));
        user.setEmpBank(rs.getInt("empBank"));
        user.setTypeWordID(rs.getInt("typeWordID"));
        user.setWorkStatus(rs.getString("workStatus"));
        return user;
    }
    public static User getUser(int empID) {
        String sql = "SELECT * FROM Employees WHERE empID = %d";
        Connection conn = Database.connect();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(String.format(sql,empID));
            if(rs.next()){
                User user = toObjact(rs);
                Database.close();
                return user;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.close();
        return null;
    }
    public static void save(User user){
        if(user.getEmpID()<0){
            insert(user);
        }else{
            update(user);
        }
    }

    
    
    
    
}
