
import Database.UserTableModel;
import Database.userDao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Tabelemp extends javax.swing.JPanel {

    /**
     * Creates new form Tabelemp
     */
    UserTableModel userTableModel = new UserTableModel();
    ManagementEmployess mm = new ManagementEmployess();
    public Tabelemp() {
        initComponents();
        userTableModel.setData(userDao.getUsers());
         updateTable();
    }
 private void updateTable() {
        userTableModel.setData(userDao.getUsers());
    }
 private void empTable() throws NumberFormatException {
        String idStr = Emptable.getValueAt(Emptable.getSelectedRow(), 0).toString();
        mm.id = Integer.parseInt(idStr);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Emptable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(936, 595));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(944, 605));

        Emptable.setModel(userTableModel);
        Emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Emptable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmptableMouseClicked
        empTable();        // TODO add your handling code here:
    }//GEN-LAST:event_EmptableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Emptable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
