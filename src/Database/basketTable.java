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
public class basketTable extends AbstractTableModel {

    ArrayList<basket> list = new ArrayList<basket>();
    String[] columnName = {"Product", "Item"};

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
        basket b = list.get(rowIndex);
        Product pro = productDao.getProduct(b.getProductID());
        switch (columnIndex) {
            case 0:
                return pro.getProName();
               
            case 1:
                return b.getItem();

        }
        return "";
    }
    public void  setData(ArrayList<basket> b){
        this.list = b;
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column) {
        return columnName[column]; //To change body of generated methods, choose Tools | Templates.
    }

}
