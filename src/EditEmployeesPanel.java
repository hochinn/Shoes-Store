
import Database.User;
import Database.userDao;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KiTTiWaT
 */
public class EditEmployeesPanel extends javax.swing.JPanel {

    /**
     * Creates new form regEmployeesPanel
     */
    User userEdit;

    public EditEmployeesPanel(int id) {
        initComponents();
        userEdit = userDao.getUser(id);

        editEmpName.setText(userEdit.getEmpName()); //----
        empSurname.setText(userEdit.getEmpSername());
        empAddress.setText(userEdit.getEmpAddress());
        empTel.setText(userEdit.getEmpTel());
        empEmail.setText(userEdit.getEmpEmail());
        empBank.setText(userEdit.getEmpBank() + "");
        typeWordID.setSelectedItem(userEdit.getTypeWordID());

        //ProID.setEnabled(false);
    }
    //asdfghjklqwertyuizxcvbhnjk

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editEmpName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        empEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        empBank = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeWordID = new javax.swing.JComboBox<>();
        confirmEditEmployees = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("แก้ไขพนักงาน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ชื่อ : ");

        editEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("นามสกุล : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ที่อยู่ : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("เบอร์โทร :");

        empTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empTelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("E-mail : ");

        empEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("บันชีธนาคาร : ");

        empBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empBankActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ตำแหน่ง : ");

        typeWordID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "พนักงานขาย", "พนักงานดูแลสินค้า"}));

        confirmEditEmployees.setText("ยืนยัน");
        confirmEditEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditEmployeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editEmpName)
                            .addComponent(empSurname)
                            .addComponent(empAddress)
                            .addComponent(empTel)
                            .addComponent(empEmail)
                            .addComponent(empBank)
                            .addComponent(typeWordID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(confirmEditEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empTel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(empEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empBank, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(typeWordID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmEditEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmEditEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditEmployeesActionPerformed
        editEmp();


    }//GEN-LAST:event_confirmEditEmployeesActionPerformed

    private void editEmp() throws NumberFormatException, HeadlessException {
        //JOptionPane.showMessageDialog(null,"success");
        try {
            User newuserEdit = new User();
            newuserEdit.setEmpID(userEdit.getEmpID());
            newuserEdit.setLoginName(userEdit.getLoginName());
            newuserEdit.setPassword(userEdit.getPassword());
            newuserEdit.setEmpName(editEmpName.getText());
            newuserEdit.setEmpSername(empSurname.getText());
            newuserEdit.setEmpAddress(empAddress.getText());
            newuserEdit.setEmpTel(empTel.getText());
            newuserEdit.setEmpEmail(empEmail.getText());
            newuserEdit.setEmpBank(Integer.parseInt(empBank.getText()));
            newuserEdit.setTypeWordID(typeWordID.getSelectedIndex() + 2);
            newuserEdit.setWorkStatus("ทำงาน");
            userDao.update(newuserEdit);
            JOptionPane.showMessageDialog(this, "แก้ไขข้อมูลพนักของคุณ " + newuserEdit.getEmpName() + " เสร็จเรียบร้อย");
            
            
           
            reForm();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ถูกต้อง");
        }
    }

    private void reForm() {
        editEmpName.setText("");
        empSurname.setText("");
        empAddress.setText("");
        empTel.setText("");
        empEmail.setText("");
        empBank.setText("");
    }

    private void empBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empBankActionPerformed

    private void empEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailActionPerformed

    private void empTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empTelActionPerformed

    private void editEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEmpNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmEditEmployees;
    private javax.swing.JTextField editEmpName;
    private javax.swing.JTextField empAddress;
    private javax.swing.JTextField empBank;
    private javax.swing.JTextField empEmail;
    private javax.swing.JTextField empSurname;
    private javax.swing.JTextField empTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> typeWordID;
    // End of variables declaration//GEN-END:variables
}
