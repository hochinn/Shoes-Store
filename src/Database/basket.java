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
public class basket {
    int item;
    int ProductID;

    @Override
    public String toString() {
        return "basket{" + "item=" + item + ", ProductID=" + ProductID + '}';
    }

    public void setItem(int item) {
        this.item = item;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getItem() {
        return item;
    }

    public int getProductID() {
        return ProductID;
    }

    public basket(int item, int ProductID) {
        this.item = item;
        this.ProductID = ProductID;
    }

    public basket() {
    }
    
    
}
