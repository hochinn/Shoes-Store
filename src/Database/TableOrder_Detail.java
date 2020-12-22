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
public class TableOrder_Detail extends AbstractTableModel {

    ArrayList<Orders_Detail> list = Orders_DetailDao.getOrders_Detail();

    String[] columnName = {"orders_detailID", "ordersDetailSum", "ordersDatailPriceAll", "ordersID", "productID"};

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
        Orders_Detail OD = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return OD.getOrders_detailID();
            case 1:
                return OD.getOrdersDetailSum();
            case 2:
                return OD.getOrdersDatailPriceAll();
            case 3:
                return OD.getOrdersID();
            case 4:
                return OD.getProductID();
           

        }
        return "";
    }
    public void setData(ArrayList<Orders_Detail> OD) {
        this.list = OD;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column]; //To change body of generated methods, choose Tools | Templates.
    }

}
