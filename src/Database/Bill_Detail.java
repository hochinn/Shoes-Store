/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Master
 */
public class Bill_Detail {
    int Bill_DetailID;
    int productID;
    int billID;
    int item;

    public Bill_Detail() {
    }

    public Bill_Detail(int Bill_DetailID, int productID, int billID, int item) {
        this.Bill_DetailID = Bill_DetailID;
        this.productID = productID;
        this.billID = billID;
        this.item = item;
    }

    public int getBill_DetailID() {
        return Bill_DetailID;
    }

    public int getProductID() {
        return productID;
    }

    public int getBillID() {
        return billID;
    }

    public int getItem() {
        return item;
    }

    public void setBill_DetailID(int Bill_DetailID) {
        this.Bill_DetailID = Bill_DetailID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bill_Detail{" + "Bill_DetailID=" + Bill_DetailID + ", productID=" + productID + ", billID=" + billID + ", item=" + item + '}';
    }

    
    
}
