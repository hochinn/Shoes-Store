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
public class VendorTableModel extends AbstractTableModel  {
    ArrayList<Vendor> vendorList = VendorDao.getVendor();
    String[] columnName ={"รหัสบริษัท","ชื่อบริษัท","ที่อยู่บริษัท","เบอร์โทร","อีเมลล์"};
    @Override
    public int getRowCount() {
        return vendorList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Vendor vendor = vendorList.get(rowIndex);
           switch(columnIndex){
            case 0 : return vendor.getVenID();
            case 1 : return vendor.getVanName();
            case 2 : return vendor.getVenAddress();
            case 3 : return vendor.getVenTel();
            case 4 : return vendor.getVenEmail();
        }
        return "";
    }
    public void setData(ArrayList<Vendor> vendorList){
        this.vendorList = vendorList;
        fireTableDataChanged();
    }
    @Override
    public String getColumnName(int column) {
        return columnName[column];
    } 
}
