
import Database.User;
import Database.userDao;
import java.awt.GridBagLayout;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatics
 */
public class Menu extends javax.swing.JFrame {
     
    /**
     * Creates new form Menu
     */
    
    
    User list;
    int empIndex;
    public Menu(int index) {
        initComponents();
        //MainjScrollPanel.setViewportView(new customermanagement());
        list = userDao.getUser(index);
        empIndex = index;
        System.out.println("Welcome "+list.getEmpName()+" "+list.getEmpSername());
        if (list.getTypeWordID() == 2) {
            productmanagement.setEnabled(false);
            ordermanangement.setEnabled(false);
            admin.setEnabled(false);
            System.out.println("Type : EmpFront");
            MainjScrollPanel.setViewportView(new PsearchProductPanel(empIndex));
        }
        else if (list.getTypeWordID() == 3) {
            sellproduct.setEnabled(false);
            
            member.setEnabled(false);
            admin.setEnabled(false);
            System.out.println("Type : EmpBack");
            MainjScrollPanel.setViewportView(new Productmanagement());
        }else{
            System.out.println("Type : Admin");
            MainjScrollPanel.setViewportView(new PsearchProductPanel(empIndex));
            
        }
        
        //testdynamicpanel
       
        
        
        
    }

    Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenujScrollPanel = new javax.swing.JScrollPane();
        ManuPanel = new javax.swing.JPanel();
        sellproduct = new javax.swing.JButton();
        productmanagement = new javax.swing.JButton();
        ordermanangement = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        member = new javax.swing.JButton();
        MainjScrollPanel = new javax.swing.JScrollPane();
        namestore = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(220, 120));
        setResizable(false);

        sellproduct.setText("ขายสินค้า");
        sellproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellproductActionPerformed(evt);
            }
        });

        productmanagement.setText("จัดการสินค้า");
        productmanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productmanagementActionPerformed(evt);
            }
        });

        ordermanangement.setText("จัดการการสั่งซื้อ");
        ordermanangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordermanangementActionPerformed(evt);
            }
        });

        admin.setText("เจ้าของร้าน");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        member.setText("สมาชิก");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManuPanelLayout = new javax.swing.GroupLayout(ManuPanel);
        ManuPanel.setLayout(ManuPanelLayout);
        ManuPanelLayout.setHorizontalGroup(
            ManuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(member, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(productmanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellproduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ordermanangement, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        ManuPanelLayout.setVerticalGroup(
            ManuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sellproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productmanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ordermanangement, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        MenujScrollPanel.setViewportView(ManuPanel);

        namestore.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        namestore.setText("ShoesStore");

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenujScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainjScrollPanel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(namestore, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 952, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namestore, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MenujScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 375, Short.MAX_VALUE))
                    .addComponent(MainjScrollPanel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellproductActionPerformed
        MainjScrollPanel.setViewportView(new PsearchProductPanel(empIndex));
    }//GEN-LAST:event_sellproductActionPerformed

    private void productmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productmanagementActionPerformed
       MainjScrollPanel.setViewportView(new Productmanagement());
       
    }//GEN-LAST:event_productmanagementActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        MainjScrollPanel.setViewportView(new AdminPanel());
    }//GEN-LAST:event_adminActionPerformed

    private void ordermanangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordermanangementActionPerformed
        MainjScrollPanel.setViewportView(new ViewOrderProduct(empIndex));
    }//GEN-LAST:event_ordermanangementActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        MainjScrollPanel.setViewportView(new Managemantcustomer());
    }//GEN-LAST:event_memberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                          logOut(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void logOut(){
        LoginFrom logout = new LoginFrom();
                    logout.setVisible(true);
                    setVisible(false); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(5).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MainjScrollPanel;
    private javax.swing.JPanel ManuPanel;
    private javax.swing.JScrollPane MenujScrollPanel;
    private javax.swing.JButton admin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton member;
    private javax.swing.JLabel namestore;
    private javax.swing.JButton ordermanangement;
    private javax.swing.JButton productmanagement;
    private javax.swing.JButton sellproduct;
    // End of variables declaration//GEN-END:variables
}
