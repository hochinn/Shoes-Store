/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.util.Date;

/**
 *
 * @author KiTTiWaT
 */
public class Customer {
    int cusID;
    String name;
    String surname;
    String Tel;
    String birthday;
    String email;

    public Customer() {
        
    }

    public Customer(int cusID, String name, String surname, String Tel, String birthday, String email) {
        this.cusID = cusID;
        this.name = name;
        this.surname = surname;
        this.Tel = Tel;
        this.birthday = birthday;
        this.email = email;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusID=" + cusID + ", name=" + name + ", surname=" + surname + ", Tel=" + Tel + ", birthday=" + birthday + ", email=" + email + '}';
    }

}

