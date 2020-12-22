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
public class Payment {
    int paymentID;
    String payDate;
    int payTotalPrice;
    int promotionID;

    public Payment() {
    }

    public Payment(int paymentID, String payDate, int payTotalPrice, int promotionID) {
        this.paymentID = paymentID;
        this.payDate = payDate;
        this.payTotalPrice = payTotalPrice;
        this.promotionID = promotionID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public String getPayDate() {
        return payDate;
    }

    public int getPayTotalPrice() {
        return payTotalPrice;
    }

    public int getPromotionID() {
        return promotionID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public void setPayTotalPrice(int payTotalPrice) {
        this.payTotalPrice = payTotalPrice;
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentID=" + paymentID + ", payDate=" + payDate + ", payTotalPrice=" + payTotalPrice + ", promotionID=" + promotionID + '}';
    }

    
    
}
