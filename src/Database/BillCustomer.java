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
public class BillCustomer {
        int billID;
        String dateBuy;
        int cusID; 
        int paymentID;
        int empID;

    public BillCustomer() {
    }

    public BillCustomer(int billID, String dateBuy, int cusID, int paymentID, int empID) {
        this.billID = billID;
        this.dateBuy = dateBuy;
        this.cusID = cusID;
        this.paymentID = paymentID;
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "BillCustomer{" + "billID=" + billID + ", dateBuy=" + dateBuy + ", cusID=" + cusID + ", paymentID=" + paymentID + ", empID=" + empID + '}';
    }

    public int getBillID() {
        return billID;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public int getCusID() {
        return cusID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
}
