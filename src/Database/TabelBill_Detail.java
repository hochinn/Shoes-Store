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
public class TabelBill_Detail extends AbstractTableModel {

    ArrayList<Bill_Detail> list = Bill_DetailDao.getBill_Details();
    String[] columnName = {"Bill_DetailID", "Product", "Item"};

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
        Bill_Detail billd = list.get(rowIndex);
        
        String text = productDao.getProduct(billd.getProductID()).getProName();
        System.out.println(text);
        switch (columnIndex) {
            case 0:
                return billd.getBill_DetailID();
            case 1:
                return text;

            case 2:
                return billd.getItem();

        }
        return "";
    }

    public void setData(ArrayList<Bill_Detail> billd) {
        this.list = billd;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column]; //To change body of generated methods, choose Tools | Templates.
    }

}
