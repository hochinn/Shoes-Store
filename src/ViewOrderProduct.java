
import Database.Orders;
import Database.OrdersDao;
import Database.viewOrderTable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ViewOrderProduct extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderProduct
     */
    int idEmp;
    viewOrderTable viewOrder = new viewOrderTable();
    public ViewOrderProduct(int id) {
        initComponents();
        idEmp = id;
        updateTable();
    }
    private void updateTable() {
        viewOrder.setData(OrdersDao.getOrders());
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        orderbottom = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TableProductJscoll = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        OrdersTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(1110, 650));

        orderbottom.setText("สั่งซื้อสินค้า");
        orderbottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbottomActionPerformed(evt);
            }
        });

        jButton4.setText("จ่ายเงิน");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(orderbottom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderbottom, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        OrdersTable.setModel(viewOrder);
        OrdersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdersTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(OrdersTable);

        TableProductJscoll.setViewportView(jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(TableProductJscoll, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TableProductJscoll, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderbottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbottomActionPerformed
        TableProductJscoll.setViewportView(new OrderProduct(idEmp));
    }//GEN-LAST:event_orderbottomActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        Orders neworders = new Orders();
        Orders old = OrdersDao.getOrders(idT);
        neworders.setOrdersID(idT);
        neworders.setOrderDate(old.getOrderDate());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            
        neworders.setPayProductDate(dtf.format(localDate));
        neworders.setPayProductTotal(old.getPayProductTotal());
        neworders.setEmpID(old.getEmpID());
        OrdersDao.update(neworders);
        JOptionPane.showMessageDialog(this,"จ่ายออเดอร์รหัสที่ "+idT+" ของวันที่ "+old.getOrderDate()+" เรียบร้อยแล้ว");
        //Date date = formatterUp.parse();
        /*neworders.setOrderDate(formatterUp.format(date));*/
        //neworders.setOrderDate(OrdersDao.getOrders(idT).getOrderDate());
        updateTable();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "เลือกสินค้าที่ต้องการแก้ไข!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
static int idT;
    private void OrdersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersTableMouseClicked
        String idStr = OrdersTable.getValueAt(OrdersTable.getSelectedRow(),0).toString();
        idT = Integer.parseInt(idStr);
        System.out.println(idT);
    }//GEN-LAST:event_OrdersTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrdersTable;
    private javax.swing.JScrollPane TableProductJscoll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton orderbottom;
    // End of variables declaration//GEN-END:variables
}
