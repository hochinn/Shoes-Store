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
public class Orders_Detail {
    int orders_detailID;
    int ordersDetailSum;
    int ordersDatailPriceAll;
    int ordersID;
    int productID;

    public Orders_Detail() {
    }

    public Orders_Detail(int orders_detailID, int ordersDetailSum, int ordersDatailPriceAll, int ordersID, int productID) {
        this.orders_detailID = orders_detailID;
        this.ordersDetailSum = ordersDetailSum;
        this.ordersDatailPriceAll = ordersDatailPriceAll;
        this.ordersID = ordersID;
        this.productID = productID;
    }

    public int getOrders_detailID() {
        return orders_detailID;
    }

    public int getOrdersDetailSum() {
        return ordersDetailSum;
    }

    public int getOrdersDatailPriceAll() {
        return ordersDatailPriceAll;
    }

    public int getOrdersID() {
        return ordersID;
    }

    public int getProductID() {
        return productID;
    }

    public void setOrders_detailID(int orders_detailID) {
        this.orders_detailID = orders_detailID;
    }

    public void setOrdersDetailSum(int ordersDetailSum) {
        this.ordersDetailSum = ordersDetailSum;
    }

    public void setOrdersDatailPriceAll(int ordersDatailPriceAll) {
        this.ordersDatailPriceAll = ordersDatailPriceAll;
    }

    public void setOrdersID(int ordersID) {
        this.ordersID = ordersID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Orders_Detail{" + "orders_detailID=" + orders_detailID + ", ordersDetailSum=" + ordersDetailSum + ", ordersDatailPriceAll=" + ordersDatailPriceAll + ", ordersID=" + ordersID + ", productID=" + productID + '}';
    }

   
    
    
    
    
    
}
