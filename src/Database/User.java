/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Admin
 */
public class User {
    int empID;
    String loginName;
    String password;
    String empName;
    String empSername;
    String empAddress;
    String empTel;
    String empEmail;
    int empBank;
    int typeWordID;
    String workStatus;

    

    public User() {
        
    }

    public User(int empID, String loginName, String password, String empName, String empSername, String empAddress, String empTel, String empEmail, int empBank, int typeWordID, String workStatus) {
        this.empID = empID;
        this.loginName = loginName;
        this.password = password;
        this.empName = empName;
        this.empSername = empSername;
        this.empAddress = empAddress;
        this.empTel = empTel;
        this.empEmail = empEmail;
        this.empBank = empBank;
        this.typeWordID = typeWordID;
        this.workStatus = workStatus;
    }

    public int getEmpID() {
        return empID;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSername() {
        return empSername;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public String getEmpTel() {
        return empTel;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public int getEmpBank() {
        return empBank;
    }

    public int getTypeWordID() {
        return typeWordID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSername(String empSername) {
        this.empSername = empSername;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setEmpBank(int empBank) {
        this.empBank = empBank;
    }

    public void setTypeWordID(int typeWordID) {
        this.typeWordID = typeWordID;
    }
    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public String toString() {
        return "User{" + "empID=" + empID + ", loginName=" + loginName + ", password=" + password + ", empName=" + empName + ", empSername=" + empSername + ", empAddress=" + empAddress + ", empTel=" + empTel + ", empEmail=" + empEmail + ", empBank=" + empBank + ", typeWordID=" + typeWordID + ", workStatus=" + workStatus +'}';
    }
    
    

    

    

    

   

    
    
}
