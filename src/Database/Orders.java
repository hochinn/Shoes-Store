/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.Date;

/**
 *
 * @author Master
 */
public class Orders {
    int ordersID;
    String orderDate;
    String payProductDate;
    int payProductTotal;
    int empID;

    public Orders() {
    }

    public Orders(int ordersID, String orderDate, String payProductDate, int payProductTotal, int empID) {
        this.ordersID = ordersID;
        this.orderDate = orderDate;
        this.payProductDate = payProductDate;
        this.payProductTotal = payProductTotal;
        this.empID = empID;
    }

    public int getOrdersID() {
        return ordersID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getPayProductDate() {
        return payProductDate;
    }

    public int getPayProductTotal() {
        return payProductTotal;
    }

    public int getEmpID() {
        return empID;
    }

    public void setOrdersID(int ordersID) {
        this.ordersID = ordersID;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setPayProductDate(String payProductDate) {
        this.payProductDate = payProductDate;
    }

    public void setPayProductTotal(int payProductTotal) {
        this.payProductTotal = payProductTotal;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Orders{" + "ordersID=" + ordersID + ", orderDate=" + orderDate + ", payProductDate=" + payProductDate + ", payProductTotal=" + payProductTotal + ", empID=" + empID + '}';
    }

    public void setOrderDate(Date startDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
     
}
