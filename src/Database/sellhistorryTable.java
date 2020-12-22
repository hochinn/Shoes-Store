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
public class sellhistorryTable extends AbstractTableModel {
     ArrayList<BillCustomer> list = BillCustomerDao.getBillCustomer();
     String[] columnName ={"BillID","DateBuy","Costomer","Price","Emproyee"};

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
        BillCustomer bill = list.get(rowIndex);
        bill = list.get(rowIndex);
        int a = bill.getPaymentID();
        Payment pay = PaymentDao.getPayment(a);
        
        
        Customer cos = CustomerDao.getCustomer(bill.getCusID());
        User user = userDao.getUser(bill.getEmpID());
        System.out.println(pay);
        switch(columnIndex){
            case 0:return bill.getBillID();
            case 1:return bill.getDateBuy();
            
            case 2:return cos.getName()+" "+cos.getSurname();
            
            case 3:return pay.getPayTotalPrice();
            case 4:return user.getEmpName()+" "+user.getEmpSername();
            
            
        }
        return "";
    }
    public void  setData(ArrayList<BillCustomer> bill){
        this.list = bill;
        fireTableDataChanged();
        
        
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
