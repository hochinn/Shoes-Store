
import Database.BillCustomer;
import Database.BillCustomerDao;
import Database.Customer;
import Database.CustomerDao;
import Database.Database;
import Database.Product;
import Database.ProductTableModel;
import Database.User;
import Database.basket;
import Database.basketTable;
import Database.productDao;
import Database.userDao;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.HeadlessException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatics
 */
public class PsearchProductPanel extends javax.swing.JPanel {

    /**
     * Creates new form searchProductJPanel
     */
    ProductTableModel productTableModel = new ProductTableModel();
    basketTable basetTable = new basketTable();
    int empIndex;
    int cusID = 0;
    ArrayList<basket> basket = new ArrayList<basket>();

    public PsearchProductPanel(int empIndex) {
        this.empIndex = empIndex;
        initComponents();
        proId.setEnabled(false);
        proName.setEnabled(false);
        proBrand.setEnabled(false);
        proGen.setEnabled(false);
        proColor.setEnabled(false);
        proPrice.setEnabled(false);
        proSize.setEnabled(false);
        staffNameField.setEnabled(false);
        cusNameTextField.setEnabled(false);
        User user = userDao.getUser(empIndex);
        staffNameField.setText(user.getEmpName() + " " + user.getEmpSername());
        basetTable.setData(basket);
        updateTable();

    }

    private void updateTable() {
        productTableModel.setData(productDao.getProducts());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelPaneljscroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pdId = new javax.swing.JLabel();
        proId = new javax.swing.JTextField();
        pdName = new javax.swing.JLabel();
        proName = new javax.swing.JTextField();
        pdBrand = new javax.swing.JLabel();
        proBrand = new javax.swing.JTextField();
        pdGen = new javax.swing.JLabel();
        proGen = new javax.swing.JTextField();
        pdColor = new javax.swing.JLabel();
        proColor = new javax.swing.JTextField();
        pdPrice = new javax.swing.JLabel();
        proPrice = new javax.swing.JTextField();
        pdSize = new javax.swing.JLabel();
        proSize = new javax.swing.JTextField();
        pdCount = new javax.swing.JLabel();
        proCount = new javax.swing.JComboBox<>();
        staffName = new javax.swing.JLabel();
        staffNameField = new javax.swing.JTextField();
        productId = new javax.swing.JLabel();
        searchProductID = new javax.swing.JTextField();
        productName = new javax.swing.JLabel();
        searchProductName = new javax.swing.JTextField();
        searchProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProductt = new javax.swing.JTable();
        cusIdTextField = new javax.swing.JTextField();
        cusId = new javax.swing.JLabel();
        searchCus = new javax.swing.JButton();
        cusName = new javax.swing.JLabel();
        cusNameTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        AddToCart = new javax.swing.JButton();
        goCart = new javax.swing.JButton();
        deleteProductInCart = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1110, 720));

        pdId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdId.setText("รหัสสินค้า :");

        pdName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdName.setText("ชื่อสินค้า : ");

        pdBrand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdBrand.setText("ยี่ห้อสินค้า : ");

        pdGen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdGen.setText("รุ่น : ");

        pdColor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdColor.setText("สี : ");

        proColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proColorActionPerformed(evt);
            }
        });

        pdPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdPrice.setText("ราคา :");

        pdSize.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdSize.setText("ไซส์ : ");

        pdCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pdCount.setText("จำนวน : ");

        proCount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        staffName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        staffName.setText("พนักงานขาย : ");

        productId.setText("รหัสสินค้า :");

        searchProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductIDActionPerformed(evt);
            }
        });
        searchProductID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchProductIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchProductIDKeyReleased(evt);
            }
        });

        productName.setText("ชื่อสินค้า : ");

        searchProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductNameActionPerformed(evt);
            }
        });

        searchProduct.setText("ค้นหา");
        searchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductActionPerformed(evt);
            }
        });

        tabelProductt.setModel(productTableModel);
        tabelProductt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProducttMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProductt);

        cusId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cusId.setText("สมาชิก :");

        searchCus.setText("ค้นหา");
        searchCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCusActionPerformed(evt);
            }
        });

        cusName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cusName.setText("ชื่อ : ");

        cartTable.setModel(basetTable);
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cusId)
                            .addGap(18, 18, 18)
                            .addComponent(cusIdTextField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchCus))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pdId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pdCount)
                                    .addGap(18, 18, 18)
                                    .addComponent(proCount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(proId, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pdName)
                                            .addComponent(pdBrand)
                                            .addComponent(pdGen))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(proName, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(proBrand)
                                            .addComponent(proGen))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pdPrice)
                                        .addComponent(pdSize))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(proColor, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(proPrice)
                                        .addComponent(proSize)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(staffName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(staffNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cusName)
                                    .addGap(28, 28, 28)
                                    .addComponent(cusNameTextField)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productId)
                            .addComponent(productName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productId)
                            .addComponent(searchProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdBrand))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proGen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdGen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdSize)
                            .addComponent(proSize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdCount))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(staffName)
                            .addComponent(staffNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusId)
                            .addComponent(cusIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchCus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName)
                            .addComponent(cusNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tabelPaneljscroll.setViewportView(jPanel1);

        AddToCart.setText("เพิ่มลงตระกร้า");
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });

        goCart.setText("ดูตระกร้า");
        goCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCartActionPerformed(evt);
            }
        });

        deleteProductInCart.setText("ลบสินค้าในตะกร้า");
        deleteProductInCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductInCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelPaneljscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteProductInCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelPaneljscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProductInCart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goCart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
        addToCart();
    }//GEN-LAST:event_AddToCartActionPerformed

    private void addToCart() throws HeadlessException, NumberFormatException {
        JOptionPane.showMessageDialog(this, "รหัสสินค้า : " + proId.getText() + " \n"
                + "ชื่อสินค้า : " + proName.getText() + " \n"
                + "ยี่ห้อสินค้า : " + proBrand.getText() + " \n"
                + "รุ่น : " + proGen.getText() + " \n"
                + "สี : " + proColor.getText() + " \n"
                + "ราคา : " + proPrice.getText() + " \n"
                + "ไซส์ : " + proSize.getText() + " \n"
                + "จำนวน : " + proCount.getSelectedItem() + " \n"
                + "พนักงานขาย : " + staffNameField.getText() + " \n");

        if (!proId.getText().equals("")) {
            int idProduct = Integer.valueOf(proId.getText());
            int item = Integer.valueOf(proCount.getSelectedItem().toString());

            int a = 0;
            for (int i = 0; i < basket.size(); i++) {
                if (basket.get(i).getProductID() == idProduct) {

                    basket.get(i).setItem(item + basket.get(i).getItem());

                    basetTable.setData(basket);

                    a++;
                    break;
                }

            }

            if (a == 0) {
                basket list = new basket(item, idProduct);
                basket.add(list);
                basetTable.setData(basket);
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกสินค้า");
        }

    }

    private void searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductActionPerformed
        searchProduct();
    }//GEN-LAST:event_searchProductActionPerformed

    private void searchProduct() throws HeadlessException {
        String spro = searchProductID.getText();
        String nameProduct = searchProductName.getText();

        try {
            if (!spro.equals("") || !nameProduct.equals("")) {
                ArrayList<Product> list = new ArrayList<Product>();

                if (!spro.equals("") && nameProduct.equals("")) {
                    int id1 = Integer.parseInt(spro);
                    if (productDao.getProduct(id1) != null) {
                        productt = productDao.getProduct(id1);
                        list.add(productDao.getProduct(id1));
                        productTableModel.setData(list);
                        toFrom(productt);
                    } else {
                        productTableModel.setData(productDao.getProducts());
                        JOptionPane.showMessageDialog(this, "ไม่มีสินค้า!!!");
                        clearform();
                    }
                } else if (spro.equals("") && !nameProduct.equals("")) {
                    ArrayList<Product> products = productDao.getProducts();
                    Product productget = new Product();
                    int item = 0;
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).getProName().equals(nameProduct)) {
                            productget = productDao.getProduct(products.get(i).getProductID());
                            toFrom(productget);
                            list.add(productget);
                            productTableModel.setData(list);
                            item = 1;

                        }
                    }

                    if (item == 0) {
                        JOptionPane.showMessageDialog(this, "ไม่มีสินค้า!!!");
                        productTableModel.setData(productDao.getProducts());
                        clearform();
                    }
                } else if (!spro.equals("") && !nameProduct.equals("")) {
                    int id1 = Integer.parseInt(spro);
                    Product productget = productDao.getProduct(id1);

                    if (productDao.getProduct(id1) != null && productget.getProName().equals(nameProduct)) {
                        productt = productDao.getProduct(id1);
                        list.add(productDao.getProduct(id1));
                        productTableModel.setData(list);
                        toFrom(productt);
                    } else {
                        productTableModel.setData(productDao.getProducts());
                        JOptionPane.showMessageDialog(this, "ไม่มีสินค้า!!!");
                        clearform();
                    }

                }

            } else {
                productTableModel.setData(productDao.getProducts());
                clearform();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ใส่ข้อมูลให้ถูกต้อง!!!");
        }
    }

    private void searchProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductNameActionPerformed

    }//GEN-LAST:event_searchProductNameActionPerformed

    private void searchProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProductIDActionPerformed

    private void proColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proColorActionPerformed

    private void goCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCartActionPerformed
        goCart();
    }//GEN-LAST:event_goCartActionPerformed

    private void goCart() throws HeadlessException {
        if (cusID == 0) {
            JOptionPane.showMessageDialog(this, "ใส่ข้อมูลสมาชิก!!!");
        } else if (basket.isEmpty()) {
            JOptionPane.showMessageDialog(this, "เลือกสินค้าด้วย!!!");
        } else {
            int price = 0;
            for (int i = 0; i < basket.size(); i++) {

                for (int j = 0; j < basket.get(i).getItem(); j++) {
                    Product p = productDao.getProduct(basket.get(i).getProductID());
                    price = price + p.getProPrice();
                }

            }
            tabelPaneljscroll.setViewportView(new Pcart(basket, cusID, empIndex, price));
            AddToCart.setEnabled(false);
            deleteProductInCart.setEnabled(false);
            goCart.setEnabled(false);
        }
    }

    private void tabelProducttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProducttMouseClicked
        getProToFrom();
    }//GEN-LAST:event_tabelProducttMouseClicked

    private void getProToFrom() throws NumberFormatException {
        String idStr = tabelProductt.getValueAt(tabelProductt.getSelectedRow(), 0).toString();
        int id = Integer.parseInt(idStr);

        productt = productDao.getProduct(id);

        toFrom(productt);
    }

    private void searchProductIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProductIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProductIDKeyPressed

    private void searchProductIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProductIDKeyReleased

    }//GEN-LAST:event_searchProductIDKeyReleased
    Customer customer = new Customer();
    private void searchCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCusActionPerformed
        searchCus();
    }//GEN-LAST:event_searchCusActionPerformed

    private void searchCus() throws HeadlessException {
        // TODO add your handling code here:

        String phon = cusIdTextField.getText();
        ArrayList<Customer> cus = CustomerDao.getCustomer();

        int user = 0;
        if (phon != null) {
            for (int i = 0; i < cus.size(); i++) {
                if (cus.get(i).getTel().equals(phon)) {
                    customer = CustomerDao.getCustomer(cus.get(i).getCusID());
                    user = 1;
                    cusID = customer.getCusID();
                    cusNameTextField.setText(customer.getName() + " " + customer.getSurname());
                    break;
                }
            }
            if (user == 0) {
                cusID = 0;
                JOptionPane.showMessageDialog(this, "ไม่พบลูกค้า!!!");
                cusNameTextField.setText("");
            }
        }
    }

    private void deleteProductInCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductInCartActionPerformed
        deleteProductInCart();
    }//GEN-LAST:event_deleteProductInCartActionPerformed

    private void deleteProductInCart() throws HeadlessException {

        int item = 0;
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i).getProductID() == Dsell) {
                basket.remove(i);
                item = 1;
                break;
            }
        }
        if (item == 0) {
            JOptionPane.showMessageDialog(this, "เลือกสินค้าที่จะลบ");
            Dsell = 0;
        }

        basetTable.setData(basket);
    }
    public int Dsell = 0;
    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        cartTable();
    }//GEN-LAST:event_cartTableMouseClicked

    private void cartTable() {
        String idStr = cartTable.getValueAt(cartTable.getSelectedRow(), 0).toString();
        System.out.println(idStr);
        ArrayList<Product> pro = productDao.getProducts();
        for (int i = 0; i < pro.size(); i++) {
            if (pro.get(i).getProName().equals(idStr)) {
                Dsell = pro.get(i).getProductID();
                break;
            }
        }
    }

    private Product productt;
    private User user;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel cusId;
    private javax.swing.JTextField cusIdTextField;
    private javax.swing.JLabel cusName;
    private javax.swing.JTextField cusNameTextField;
    private javax.swing.JButton deleteProductInCart;
    private javax.swing.JButton goCart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pdBrand;
    private javax.swing.JLabel pdColor;
    private javax.swing.JLabel pdCount;
    private javax.swing.JLabel pdGen;
    private javax.swing.JLabel pdId;
    private javax.swing.JLabel pdName;
    private javax.swing.JLabel pdPrice;
    private javax.swing.JLabel pdSize;
    private javax.swing.JTextField proBrand;
    private javax.swing.JTextField proColor;
    private javax.swing.JComboBox<String> proCount;
    private javax.swing.JTextField proGen;
    private javax.swing.JTextField proId;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField proPrice;
    private javax.swing.JTextField proSize;
    private javax.swing.JLabel productId;
    private javax.swing.JLabel productName;
    private javax.swing.JButton searchCus;
    private javax.swing.JButton searchProduct;
    private javax.swing.JTextField searchProductID;
    private javax.swing.JTextField searchProductName;
    private javax.swing.JLabel staffName;
    private javax.swing.JTextField staffNameField;
    private javax.swing.JScrollPane tabelPaneljscroll;
    private javax.swing.JTable tabelProductt;
    // End of variables declaration//GEN-END:variables

    private void toFrom(Product productt) {
        proId.setText("" + productt.getProductID());
        proName.setText(productt.getProName());
        proBrand.setText(productt.getProBand());
        proGen.setText(productt.getProGeneration());
        proColor.setText(productt.getColor());
        proPrice.setText("" + productt.getProPrice());
        proSize.setText("" + productt.getProSize());
        proCount.setSelectedIndex(0);

    }

    private void clearform() {
        proId.setText("");
        proName.setText("");
        proBrand.setText("");
        proGen.setText("");
        proColor.setText("");
        proPrice.setText("");
        proSize.setText("");
        proCount.setSelectedIndex(0);
    }

}
