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
 * @author informatics
 */
public class Bill_DetailTableModel extends AbstractTableModel {
    ArrayList<Bill_Detail> bill_DetailList = Bill_DetailDao.getBill_Details();
    String[] columnName ={"Bill_DetailID","productID","billID"};
    @Override
    public int getRowCount() {
        return bill_DetailList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bill_Detail bill_Detail = bill_DetailList.get(rowIndex);
       
        switch(columnIndex){
            case 0 : return bill_Detail.getBill_DetailID();
            case 1 : return bill_Detail.getProductID();
            case 2 : return bill_Detail.getBillID();
            
        }
        return "";
    }
    
}
