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
public class BillCustomerTableModel extends AbstractTableModel{
    ArrayList<BillCustomer> billCustomerList = BillCustomerDao.getBillCustomer();
    String[] columnName ={"billID","dateBuy","cusID","paymentID","empID"};
    @Override
    public int getRowCount() {
        return billCustomerList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BillCustomer billCustomer = billCustomerList.get(rowIndex);
        switch(columnIndex){
            case 0 : return billCustomer.getBillID();
            case 1 : return billCustomer.getDateBuy();
            case 2 : return billCustomer.getCusID();
            case 3 : return billCustomer.getPaymentID();
            case 4 : return billCustomer.getEmpID();
            
        }
        return "";
    }
    
}
