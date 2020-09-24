
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Liam
 * @author Henry
 * @author Kyle
 */
public class StorePage extends javax.swing.JFrame {

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    ArrayList<Product> productList = new ArrayList<>();
    int storeID = 0;

    /**
     * Creates new form StorePage
     *
     * @param login
     * @param rs
     * @param conn
     */
    public StorePage(LoginPage login, ResultSet rs, Connection conn) {
        login.dispose();
        initComponents();
        setInitialGUIState();
        try {
            StoreNameLbl.setText(rs.getString("staff_Name"));
            storeID = rs.getInt("store_ID");
            this.conn = conn;
            loadAllProducts_ResetProductTable();
        } catch (SQLException ex) {
            Logger.getLogger(StorePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setInitialGUIState() {
        setSize(1270, 730);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        UpdateOrderBtn.setVisible(false);
        removeProductBtn.setVisible(false);
        AddtoOrderBtn.setVisible(false);
        QuantitySpnr.setEnabled(false);
        QuantitySpnr.setValue(1);
        ProductsTbl.setDefaultEditor(Object.class, null);
        YourOrdersTbl.setDefaultEditor(Object.class, null);
        ConfirmOrderBtn.setEnabled(false);
        lblNoProducts.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExitLbl = new javax.swing.JLabel();
        MinLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        StoreNameLbl = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JButton();
        lblNoProducts = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTbl = new javax.swing.JTable();
        ProductLbl = new javax.swing.JLabel();
        QuantityLbl = new javax.swing.JLabel();
        ProductTf = new javax.swing.JTextField();
        QuantitySpnr = new javax.swing.JSpinner();
        OutofStockRdio = new javax.swing.JRadioButton();
        LowonStockRdio = new javax.swing.JRadioButton();
        UpdateOrderBtn = new javax.swing.JButton();
        YourOrderLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        YourOrdersTbl = new javax.swing.JTable();
        ConfirmOrderBtn = new javax.swing.JButton();
        AddtoOrderBtn = new javax.swing.JButton();
        removeProductBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        ExitLbl.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        ExitLbl.setForeground(new java.awt.Color(255, 255, 255));
        ExitLbl.setText("x");
        ExitLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ExitLblMouseMoved(evt);
            }
        });
        ExitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLblMouseClicked(evt);
            }
        });
        jPanel1.add(ExitLbl);
        ExitLbl.setBounds(1220, 0, 27, 64);

        MinLbl.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        MinLbl.setForeground(new java.awt.Color(255, 255, 255));
        MinLbl.setText("-");
        MinLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinLblMouseMoved(evt);
            }
        });
        MinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLblMouseClicked(evt);
            }
        });
        jPanel1.add(MinLbl);
        MinLbl.setBounds(1180, 0, 19, 64);

        jPanel2.setBackground(new java.awt.Color(133, 1, 41));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        StoreNameLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        StoreNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        StoreNameLbl.setText("StoreName");
        jPanel3.add(StoreNameLbl);
        StoreNameLbl.setBounds(50, 10, 240, 40);

        btnSignOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignOut.setForeground(new java.awt.Color(255, 255, 255));
        btnSignOut.setText("Sign Out");
        btnSignOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(133, 1, 41), 3, true));
        btnSignOut.setContentAreaFilled(false);
        btnSignOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSignOutMouseMoved(evt);
            }
        });
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignOut);
        btnSignOut.setBounds(990, 10, 90, 30);

        lblNoProducts.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNoProducts.setForeground(new java.awt.Color(255, 0, 0));
        lblNoProducts.setText("No products found");
        jPanel3.add(lblNoProducts);
        lblNoProducts.setBounds(450, 10, 390, 44);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1090, 60);

        ProductsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Units Per Crate", "product_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTbl);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 100, 470, 410);

        ProductLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductLbl.setForeground(new java.awt.Color(255, 255, 255));
        ProductLbl.setText("Product:");
        jPanel2.add(ProductLbl);
        ProductLbl.setBounds(640, 110, 70, 17);

        QuantityLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QuantityLbl.setForeground(new java.awt.Color(255, 255, 255));
        QuantityLbl.setText("Product Quantity:");
        jPanel2.add(QuantityLbl);
        QuantityLbl.setBounds(580, 150, 140, 17);

        ProductTf.setEditable(false);
        jPanel2.add(ProductTf);
        ProductTf.setBounds(730, 110, 160, 20);

        QuantitySpnr.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        QuantitySpnr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantitySpnrStateChanged(evt);
            }
        });
        QuantitySpnr.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                QuantitySpnrPropertyChange(evt);
            }
        });
        jPanel2.add(QuantitySpnr);
        QuantitySpnr.setBounds(730, 150, 160, 20);

        OutofStockRdio.setBackground(new java.awt.Color(133, 1, 41));
        OutofStockRdio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OutofStockRdio.setForeground(new java.awt.Color(255, 255, 255));
        OutofStockRdio.setText("Out of Stock");
        OutofStockRdio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutofStockRdioMouseClicked(evt);
            }
        });
        jPanel2.add(OutofStockRdio);
        OutofStockRdio.setBounds(670, 430, 120, 25);

        LowonStockRdio.setBackground(new java.awt.Color(133, 1, 41));
        LowonStockRdio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LowonStockRdio.setForeground(new java.awt.Color(255, 255, 255));
        LowonStockRdio.setText("Low on Stock");
        LowonStockRdio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LowonStockRdioMouseClicked(evt);
            }
        });
        jPanel2.add(LowonStockRdio);
        LowonStockRdio.setBounds(830, 430, 120, 25);

        UpdateOrderBtn.setBackground(new java.awt.Color(168, 153, 104));
        UpdateOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateOrderBtn.setText("Update Quantity");
        UpdateOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateOrderBtn);
        UpdateOrderBtn.setBounds(630, 200, 170, 25);

        YourOrderLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        YourOrderLbl.setForeground(new java.awt.Color(255, 255, 255));
        YourOrderLbl.setText("Your Order:");
        jPanel2.add(YourOrderLbl);
        YourOrderLbl.setBounds(600, 240, 90, 14);

        YourOrdersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Number of Crates"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        YourOrdersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YourOrdersTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(YourOrdersTbl);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(580, 260, 452, 160);

        ConfirmOrderBtn.setBackground(new java.awt.Color(168, 153, 104));
        ConfirmOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConfirmOrderBtn.setText("Confirm Order");
        ConfirmOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ConfirmOrderBtn);
        ConfirmOrderBtn.setBounds(740, 480, 140, 25);

        AddtoOrderBtn.setBackground(new java.awt.Color(168, 153, 104));
        AddtoOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddtoOrderBtn.setText("Add to Order");
        AddtoOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoOrderBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddtoOrderBtn);
        AddtoOrderBtn.setBounds(630, 200, 170, 25);

        removeProductBtn.setBackground(new java.awt.Color(168, 153, 104));
        removeProductBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeProductBtn.setText("Remove product");
        removeProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductBtnActionPerformed(evt);
            }
        });
        jPanel2.add(removeProductBtn);
        removeProductBtn.setBounds(810, 200, 170, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 100, 1090, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Lifestyle_Overlay.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1270, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1270, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitLblMouseClicked

    private void MinLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLblMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinLblMouseClicked

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        LoginPage lp = new LoginPage();
        lp.signOut(this);
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void ProductsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTblMouseClicked
        AddtoOrderBtn.setVisible(true);
        QuantitySpnr.setEnabled(false);
        ProductTf.setText(ProductsTbl.getValueAt(ProductsTbl.getSelectedRow(), 0) + "");
        QuantitySpnr.setValue(1);
        UpdateOrderBtn.setVisible(false);
        removeProductBtn.setVisible(false);
        YourOrdersTbl.clearSelection();
    }//GEN-LAST:event_ProductsTblMouseClicked

    private void UpdateOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderBtnActionPerformed

        int index = YourOrdersTbl.getSelectedRow();
        int ID = Integer.parseInt("" + YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 2));
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProduct_ID() == ID) {
                productList.get(i).setAmountOfCrates(Integer.parseInt(QuantitySpnr.getValue() + ""));
            }
        }
        refreshProductList();
        refreshCurrentOrderList();
        YourOrdersTbl.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_UpdateOrderBtnActionPerformed

    private void YourOrdersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YourOrdersTblMouseClicked
        ProductTf.setText("" + YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 0));
        QuantitySpnr.setValue(YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 1));
        AddtoOrderBtn.setVisible(false);
        QuantitySpnr.setEnabled(true);
        UpdateOrderBtn.setVisible(true);
        removeProductBtn.setVisible(true);
    }//GEN-LAST:event_YourOrdersTblMouseClicked

    private void AddtoOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoOrderBtnActionPerformed
        addToOrder();
    }//GEN-LAST:event_AddtoOrderBtnActionPerformed

    boolean sleeping = false;
    private void LowonStockRdioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LowonStockRdioMouseClicked
        if (!sleeping) {
            try {
                sleeping = true;
                Thread.sleep(500);
                sleeping = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(StorePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (OutofStockRdio.isSelected()) {
                OutofStockRdio.setSelected(false);
                if (LowonStockRdio.isSelected()) {
                    OutofStockRdio.setSelected(false);
                }
            }
        }
    }//GEN-LAST:event_LowonStockRdioMouseClicked

    private void ConfirmOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderBtnActionPerformed
        if (OutofStockRdio.isSelected() && LowonStockRdio.isSelected()) {
            OutofStockRdio.setForeground(Color.RED);
            LowonStockRdio.setForeground(Color.RED);
        } else {
            addOrder();
            AddtoOrderBtn.setVisible(true);
            ProductsTbl.setRowSelectionInterval(0, 0);
            ProductTf.setText(ProductsTbl.getValueAt(ProductsTbl.getSelectedRow(), 0) + "");
            QuantitySpnr.setValue(1);
            UpdateOrderBtn.setVisible(false);
            removeProductBtn.setVisible(false);
            QuantitySpnr.setEnabled(false);
            OutofStockRdio.setForeground(Color.WHITE);
            LowonStockRdio.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_ConfirmOrderBtnActionPerformed

    private void ExitLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLblMouseMoved
        ExitLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_ExitLblMouseMoved

    private void MinLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLblMouseMoved
        MinLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MinLblMouseMoved

    private void btnSignOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseMoved
        btnSignOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSignOutMouseMoved

    private void removeProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductBtnActionPerformed
        removeFromOrder();
    }//GEN-LAST:event_removeProductBtnActionPerformed

    private void QuantitySpnrPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_QuantitySpnrPropertyChange
        System.out.println(Integer.parseInt(QuantitySpnr.getValue() + ""));
        if (Integer.parseInt(QuantitySpnr.getValue() + "") < 1) {
            System.out.println("aaa");
            QuantitySpnr.setValue(1);
        }
    }//GEN-LAST:event_QuantitySpnrPropertyChange

    private void QuantitySpnrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantitySpnrStateChanged
        System.out.println(Integer.parseInt(QuantitySpnr.getValue() + ""));
        if (Integer.parseInt(QuantitySpnr.getValue() + "") < 1) {
            System.out.println("aaa");
            QuantitySpnr.setValue(1);
        }
    }//GEN-LAST:event_QuantitySpnrStateChanged

    private void OutofStockRdioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutofStockRdioMouseClicked

        if (!sleeping) {
            try {
                sleeping = true;
                Thread.sleep(500);
                sleeping = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(StorePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (LowonStockRdio.isSelected()) {
                LowonStockRdio.setSelected(false);
                if (OutofStockRdio.isSelected()) {
                    LowonStockRdio.setSelected(false);
                }
            }
        }
    }//GEN-LAST:event_OutofStockRdioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoOrderBtn;
    private javax.swing.JButton ConfirmOrderBtn;
    private javax.swing.JLabel ExitLbl;
    private javax.swing.JRadioButton LowonStockRdio;
    private javax.swing.JLabel MinLbl;
    private javax.swing.JRadioButton OutofStockRdio;
    private javax.swing.JLabel ProductLbl;
    private javax.swing.JTextField ProductTf;
    private javax.swing.JTable ProductsTbl;
    private javax.swing.JLabel QuantityLbl;
    private javax.swing.JSpinner QuantitySpnr;
    private javax.swing.JLabel StoreNameLbl;
    private javax.swing.JButton UpdateOrderBtn;
    private javax.swing.JLabel YourOrderLbl;
    private javax.swing.JTable YourOrdersTbl;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNoProducts;
    private javax.swing.JButton removeProductBtn;
    // End of variables declaration//GEN-END:variables

    private void loadAllProducts_ResetProductTable() throws SQLException {
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM Product");
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Product name", "Units per crate", "Product ID"}, 0);
        productList = new ArrayList<>();
        boolean productExists = false;
        while (rs.next()) {
            productExists = true;
            Product p = new Product(rs.getInt("product_ID"), rs.getString("product_Name"), rs.getInt("product_UnitsPerCrate"));
            productList.add(p);
            Object product[] = {p.getProduct_Name(), p.getProduct_UnitsPerCrate(), p.getProduct_ID()};
            model.addRow(product);
        }
        if (!productExists) {
            lblNoProducts.setVisible(true);
        }
        ProductsTbl.setModel(model);
    }

    private void addToOrder() {
        int ID = Integer.parseInt("" + ProductsTbl.getValueAt(ProductsTbl.getSelectedRow(), 2));
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProduct_ID() == ID) {
                productList.get(i).setIsOnCurrentOrder(true);
                productList.get(i).setAmountOfCrates(Integer.parseInt(QuantitySpnr.getValue() + ""));
            }
        }
        refreshCurrentOrderList();
        AddtoOrderBtn.setVisible(false);
        QuantitySpnr.setEnabled(true);
        UpdateOrderBtn.setVisible(true);
        removeProductBtn.setVisible(true);
        refreshProductList();
        YourOrdersTbl.setRowSelectionInterval(getNrItemsInOrder() - 1, getNrItemsInOrder() - 1);
        ConfirmOrderBtn.setEnabled(true);
    }

    private void removeFromOrder() {
        int index = YourOrdersTbl.getSelectedRow();
        int ID = Integer.parseInt("" + YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 2));
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProduct_ID() == ID) {
                productList.get(i).setIsOnCurrentOrder(false);
                productList.get(i).setAmountOfCrates(1);
            }
        }
        refreshProductList();
        refreshCurrentOrderList();
        clearPopulatedFields();
        try {
            YourOrdersTbl.setRowSelectionInterval(index - 1, index - 1);
            ProductTf.setText("" + YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 0));
            QuantitySpnr.setValue(YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 1));
        } catch (Exception e) {
            try {
                YourOrdersTbl.setRowSelectionInterval(index, index);
                ProductTf.setText("" + YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 0));
                QuantitySpnr.setValue(YourOrdersTbl.getValueAt(YourOrdersTbl.getSelectedRow(), 1));
            } catch (Exception e2) {
                ProductsTbl.setRowSelectionInterval(0, 0);
                ProductTf.setText(ProductsTbl.getValueAt(ProductsTbl.getSelectedRow(), 0) + "");
                ConfirmOrderBtn.setEnabled(false);
                QuantitySpnr.setValue(1);
                AddtoOrderBtn.setVisible(true);
                QuantitySpnr.setEnabled(false);
                removeProductBtn.setVisible(false);
                UpdateOrderBtn.setVisible(false);
            }
        }
    }

    private void refreshCurrentOrderList() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Product name", "Number of crates", "Product ID"}, 0);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).isOnCurrentOrder()) {
                Object product[] = {productList.get(i).getProduct_Name(), productList.get(i).getAmountOfCrates(), productList.get(i).getProduct_ID()};
                model.addRow(product);
            }
        }
        YourOrdersTbl.setModel(model);
    }

    private void refreshProductList() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Product name", "Units per crate", "Product ID"}, 0);
        for (int i = 0; i < productList.size(); i++) {
            if (!productList.get(i).isOnCurrentOrder()) {
                Object product[] = {productList.get(i).getProduct_Name(), productList.get(i).getProduct_UnitsPerCrate(), productList.get(i).getProduct_ID()};
                model.addRow(product);
            }
        }
        ProductsTbl.setModel(model);
    }

    private void addOrder() {
        String urgency = "normal";
        if (OutofStockRdio.isSelected()) {
            urgency = "out";
        }
        if (LowonStockRdio.isSelected()) {
            urgency = "low";
        }
        try {
            if (getNrItemsInOrder() > 0) {
                Long t = Calendar.getInstance().getTimeInMillis();
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO Orders (order_Date, urgency, order_Status, store_ID) VALUES (?,?,?,?)",
                        Statement.RETURN_GENERATED_KEYS)) {
                    ps.setTimestamp(1, new java.sql.Timestamp(t));
                    ps.setString(2, urgency);
                    ps.setInt(3, 0);
                    ps.setInt(4, storeID);
                    ps.executeUpdate();
                    rs = ps.getGeneratedKeys();
                    int orderID = -1;
                    if (rs.next()) {
                        orderID = Integer.parseInt(rs.getLong(1) + "");
                    }
                    if (orderID != -1) {
                        for (int i = 0; i < productList.size(); i++) {
                            if (productList.get(i).isOnCurrentOrder) {
                                productList.get(i).setIsOnCurrentOrder(false);
                                int nr_Crates = productList.get(i).getAmountOfCrates();
                                int product_ID = productList.get(i).getProduct_ID();
                                st.executeUpdate("INSERT INTO OrderDetails (od_CratesOrdered,product_ID,order_ID) VALUES (" + nr_Crates + "," + product_ID + "," + orderID + ");");
                            }
                        }
                        JOptionPane.showMessageDialog(this,
                                "Successfully placed order!",
                                "SUCCESS",
                                JOptionPane.PLAIN_MESSAGE);
                        clearPopulatedFields();
                        UpdateOrderBtn.setVisible(false);
                        removeProductBtn.setVisible(false);
                        loadAllProducts_ResetProductTable();
                        refreshCurrentOrderList();
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this,
                    "Failed to place order",
                    "Failure",
                    JOptionPane.ERROR_MESSAGE);
            Logger
                    .getLogger(StorePage.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearPopulatedFields() {
        ProductTf.setText("");
        QuantitySpnr.setValue(1);
    }

    private int getNrItemsInOrder() {
        int nr_Products_In_Order = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).isOnCurrentOrder) {
                nr_Products_In_Order++;
            }
        }
        return nr_Products_In_Order;
    }

    private static class Product {

        int product_ID;
        String product_Name;
        int product_UnitsPerCrate;
        int crates = 1;
        boolean isOnCurrentOrder = false;

        public boolean isOnCurrentOrder() {
            return isOnCurrentOrder;
        }

        public void setIsOnCurrentOrder(boolean isOnCurrentOrder) {
            this.isOnCurrentOrder = isOnCurrentOrder;
        }

        public int getAmountOfCrates() {
            return crates;
        }

        public void setAmountOfCrates(int amount) {
            this.crates = amount;
        }

        public Product(int product_ID, String product_Name, int product_UnitsPerCrate) {
            this.product_ID = product_ID;
            this.product_Name = product_Name;
            this.product_UnitsPerCrate = product_UnitsPerCrate;
        }

        public int getProduct_ID() {
            return product_ID;
        }

        public String getProduct_Name() {
            return product_Name;
        }

        public int getProduct_UnitsPerCrate() {
            return product_UnitsPerCrate;
        }
    }
}
