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
public class ProductTableModel  extends AbstractTableModel  {
    ArrayList<Product> productList = productDao.getProducts();
    String[] columnName ={"รหัสสินค้า","ชื่อสินค้า","ยี่ห้อสินค้า","รุ่น","ไซร์","จำนวน","ราคา","สี","บริษัทคู่ค้า"};
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Product product = productList.get(rowIndex);
           switch(columnIndex){
            case 0 : return product.getProductID();
            case 1 : return product.getProName();
            case 2 : return product.getProGeneration();
            case 3 : return product.getProBand();
            case 4 : return product.getProSize();
            case 5 : return product.getProQty();
            case 6 : return product.getProPrice();
            case 7 : return product.getColor();
            case 8 : return product.getVenID();
        }
        return "";
    }
    public void setData(ArrayList<Product> productList){
        this.productList = productList;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
}
