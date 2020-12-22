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
public class viewOrderTable extends AbstractTableModel {
    ArrayList<Orders> orderlist = OrdersDao.getOrders();
    String[] columnName ={"รหัสออเดอร์","วันที่สั่ง","วันที่จ่าย","รวมจ่าย","รหัสพนักงาน"};
    public int getRowCount() {
        return orderlist.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnName.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Orders orders = orderlist.get(rowIndex);
           switch(columnIndex){
            case 0 : return orders.getOrdersID();
            case 1 : return orders.getOrderDate();
            case 2 : return orders.getPayProductDate();
            case 3 : return orders.getPayProductTotal();
            case 4 : return orders.getEmpID();
        }
        return ""; //To change body of generated methods, choose Tools | Templates.
    }
    public void setData(ArrayList<Orders> orderlist){
        this.orderlist = orderlist;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
}
