
import Database.User;
import Database.UserTableModel;
import Database.userDao;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ManagementEmployess extends javax.swing.JPanel {

    /**
     * Creates new form ManagementEmployess
     */



    
    public ManagementEmployess() {
 
        initComponents();
        updateTable();
    }

    private void updateTable() {
        userTableModel.setData(userDao.getUsers());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EMPjScroll = new javax.swing.JScrollPane();
        EMPjtabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        searchEmp = new javax.swing.JButton();
        AddEmp = new javax.swing.JButton();
        EditEmp = new javax.swing.JButton();
        DeleteEmp = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1108, 631));

        EMPjScroll.setPreferredSize(new java.awt.Dimension(944, 605));
        EMPjScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPjScrollMouseClicked(evt);
            }
        });

        EMPjtabel.setModel(userTableModel);
        EMPjtabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPjtabelMouseClicked(evt);
            }
        });
        EMPjScroll.setViewportView(EMPjtabel);

        searchEmp.setText("ดูพนักงาน");
        searchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpActionPerformed(evt);
            }
        });

        AddEmp.setText("เพิ่มพนักงาน");
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        EditEmp.setText("แก้ไขพนักงาน");
        EditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpActionPerformed(evt);
            }
        });

        DeleteEmp.setText("ลบพนักงาน");
        DeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DeleteEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(AddEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EMPjScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EMPjScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpActionPerformed
         searchEmpPage();
 
    }//GEN-LAST:event_searchEmpActionPerformed

    private void searchEmpPage() {
        
        EMPjScroll.setViewportView(new Tabelemp());
       
    }


    private void EditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpActionPerformed
        editEmpPage();
    }//GEN-LAST:event_EditEmpActionPerformed

    private void editEmpPage() throws HeadlessException {
        EMPjScroll.setViewportView(new EditEmployeesPanel(id));
        try {
            EMPjScroll.setViewportView(new EditEmployeesPanel(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "เลือกสมาชิกที่ต้องการแก้ไข!!");
        }
    }

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        regEmpPage();
        
    }//GEN-LAST:event_AddEmpActionPerformed

    private void regEmpPage() {
        EMPjScroll.setViewportView(new regEmployeesPanel());
    }
    static int id;
    private void DeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmpActionPerformed
        deleteEmp();
        
    }//GEN-LAST:event_DeleteEmpActionPerformed

    private void EMPjScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPjScrollMouseClicked
//        String idStr = EMPjtabel.getValueAt(EMPjtabel.getSelectedRow(), 0).toString();
//        id = Integer.parseInt(idStr);
    }//GEN-LAST:event_EMPjScrollMouseClicked

    private void EMPjtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPjtabelMouseClicked
        empTable();
    }//GEN-LAST:event_EMPjtabelMouseClicked

    private void empTable() throws NumberFormatException {
        String idStr = EMPjtabel.getValueAt(EMPjtabel.getSelectedRow(), 0).toString();
        id = Integer.parseInt(idStr);
    }

    private User deluser;
    UserTableModel userTableModel = new UserTableModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JButton DeleteEmp;
    private javax.swing.JScrollPane EMPjScroll;
    private javax.swing.JTable EMPjtabel;
    private javax.swing.JButton EditEmp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchEmp;
    // End of variables declaration//GEN-END:variables

    private void deleteEmp() {

       try{
       User newDelete = new User();
       deluser = userDao.getUser(id);
       newDelete = deluser;
       newDelete.setWorkStatus("ลาออก");
       userDao.update(newDelete);
        JOptionPane.showMessageDialog(this,"พนักงาน "+newDelete.getEmpName()+" ลาออกแล้ว");
        updateTable();
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "เลือกสมาชิกที่ต้องการลบ!!");
        }


        JOptionPane.showMessageDialog(this,"ลบพนักงาน "+userDao.getUser(id).getEmpName()+" เรียบร้อยแล้ว");
        userDao.delete(userDao.getUser(id));
        updateTable();
        searchEmpPage();
        

    }
}
