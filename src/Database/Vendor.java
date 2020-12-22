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
public class Vendor {
    int venID;
    String vanName;
    String venAddress;
    String venTel;
    String venEmail;

    public Vendor() {
    }

    public Vendor(int venID, String vanName, String venAddress, String venTel, String venEmail) {
        this.venID = venID;
        this.vanName = vanName;
        this.venAddress = venAddress;
        this.venTel = venTel;
        this.venEmail = venEmail;
    }

    public int getVenID() {
        return venID;
    }

    public String getVanName() {
        return vanName;
    }

    public String getVenAddress() {
        return venAddress;
    }

    public String getVenTel() {
        return venTel;
    }

    public String getVenEmail() {
        return venEmail;
    }

    @Override
    public String toString() {
        return "Vendor{" + "venID=" + venID + ", vanName=" + vanName + ", venAddress=" + venAddress + ", venTel=" + venTel + ", venEmail=" + venEmail + '}';
    }

    public void setVenID(int venID) {
        this.venID = venID;
    }

    public void setVanName(String vanName) {
        this.vanName = vanName;
    }

    public void setVenAddress(String venAddress) {
        this.venAddress = venAddress;
    }

    public void setVenTel(String venTel) {
        this.venTel = venTel;
    }

    public void setVenEmail(String venEmail) {
        this.venEmail = venEmail;
    }
    
    
}
