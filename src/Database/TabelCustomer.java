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
 * @author Master
 */
public class TabelCustomer extends AbstractTableModel {

    ArrayList<Customer> list = CustomerDao.getCustomer();

    String[] columnName = {"รหัสลูกค้า", "ชื่อลูกค้า", "นามสกุล", "เบอร์โทร", "วันเกิด", "E-mail"};



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
        Customer cus = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cus.getCusID();
            case 1:
                return cus.getName();
            case 2:
                return cus.getSurname();
            case 3:
                return cus.getTel();
            case 4:
                return cus.getBirthday();
            case 5:
                return cus.getEmail();

        }
        return "";
    }
    public void  setData(ArrayList<Customer> cus){
        this.list = cus;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column]; //To change body of generated methods, choose Tools | Templates.
    }

}
