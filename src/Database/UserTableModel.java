/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 59160956
 */
public class UserTableModel extends AbstractTableModel {
    ArrayList<User> list = userDao.getUsers();
    String[] columnName ={"รหัสพนักงาน","บัญชีผู้ใช้","รหัสผ่าน","ชื่อพนัก","นามสกุล","ที่อยู่","เบอร์โทร","E-mail","บัญชีธนาคาร","รหัสตำแหน่ง","สถานะ"};

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return user.getEmpID();
            case 1 : return user.getLoginName();
            case 2 : return user.getPassword();
            case 3 : return user.getEmpName();
            case 4 : return user.getEmpSername();
            case 5 : return user.getEmpAddress();
            case 6 : return user.getEmpTel();
            case 7 : return user.getEmpEmail();
            case 8 : return user.getEmpBank();
            case 9 : return user.getTypeWordID();
            case 10 : return user.getWorkStatus();
        }
        return "";
    }
    public void setData(ArrayList<User> userList){
        this.list = userList;
        fireTableDataChanged();
    }
    
    public String getColumnName(int column){
        return columnName[column];
    }

    public int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
