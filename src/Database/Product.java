/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author informatics
 */
public class Product {
    int ProductID;
    String proName;
    String proGeneration;
    String proBand;
    int proSize;
    int proQty;
    int proPrice;
    String color;
    int venID;
    String[] columnNames;

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", proName=" + proName + ", proGeneration=" + proGeneration + ", proBand=" + proBand + ", proSize=" + proSize + ", proQty=" + proQty + ", proPrice=" + proPrice + ", color=" + color + ", venID=" + venID + '}';
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProGeneration() {
        return proGeneration;
    }

    public void setProGeneration(String proGeneration) {
        this.proGeneration = proGeneration;
    }

    public String getProBand() {
        return proBand;
    }

    public void setProBand(String proBand) {
        this.proBand = proBand;
    }

    public int getProSize() {
        return proSize;
    }

    public void setProSize(int proSize) {
        this.proSize = proSize;
    }

    public int getProQty() {
        return proQty;
    }

    public void setProQty(int proQty) {
        this.proQty = proQty;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVenID() {
        return venID;
    }

    public void setVenID(int venID) {
        this.venID = venID;
    }

    public Product(int ProductID, String proName, String proGeneration, String proBand, int proSize, int proQty, int proPrice, String color, int venID) {
        this.ProductID = ProductID;
        this.proName = proName;
        this.proGeneration = proGeneration;
        this.proBand = proBand;
        this.proSize = proSize;
        this.proQty = proQty;
        this.proPrice = proPrice;
        this.color = color;
        this.venID = venID;
    }
    

    public Product() {
    }

    public boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getString(String customerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
    
    
     
    
}
