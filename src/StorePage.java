
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam
 */
public class StorePage extends javax.swing.JFrame {

    /**
     * Creates new form StorePage
     */
    
    
    public StorePage(LoginPage login, ResultSet rs) {
        login.dispose();
        initComponents();
        setSize(1270,730);
        this.setLocationRelativeTo(null);
        ButtonGroup G = new ButtonGroup();
        G.add(OutofStockRdio);
        G.add(LowonStockRdio);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTbl = new javax.swing.JTable();
        ProductLbl = new javax.swing.JLabel();
        QuantityLbl = new javax.swing.JLabel();
        ProductTf = new javax.swing.JTextField();
        QuantitySpnr = new javax.swing.JSpinner();
        OutofStockRdio = new javax.swing.JRadioButton();
        LowonStockRdio = new javax.swing.JRadioButton();
        AddtoOrderBtn = new javax.swing.JButton();
        YourOrderLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        YourOrdersTbl = new javax.swing.JTable();
        ConfirmOrderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        ExitLbl.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        ExitLbl.setForeground(new java.awt.Color(255, 255, 255));
        ExitLbl.setText("x");
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
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignOut);
        btnSignOut.setBounds(990, 10, 90, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1090, 60);

        ProductsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Units Per Crate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
        jPanel2.add(ProductTf);
        ProductTf.setBounds(730, 110, 160, 20);
        jPanel2.add(QuantitySpnr);
        QuantitySpnr.setBounds(730, 150, 160, 20);

        OutofStockRdio.setBackground(new java.awt.Color(133, 1, 41));
        OutofStockRdio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OutofStockRdio.setForeground(new java.awt.Color(255, 255, 255));
        OutofStockRdio.setText("Out of Stock");
        jPanel2.add(OutofStockRdio);
        OutofStockRdio.setBounds(670, 430, 120, 25);

        LowonStockRdio.setBackground(new java.awt.Color(133, 1, 41));
        LowonStockRdio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LowonStockRdio.setForeground(new java.awt.Color(255, 255, 255));
        LowonStockRdio.setText("Low on Stock");
        jPanel2.add(LowonStockRdio);
        LowonStockRdio.setBounds(830, 430, 120, 25);

        AddtoOrderBtn.setBackground(new java.awt.Color(168, 153, 104));
        AddtoOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddtoOrderBtn.setText("Add to Order");
        jPanel2.add(AddtoOrderBtn);
        AddtoOrderBtn.setBounds(740, 200, 140, 25);

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
        jScrollPane2.setViewportView(YourOrdersTbl);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(580, 260, 452, 160);

        ConfirmOrderBtn.setBackground(new java.awt.Color(168, 153, 104));
        ConfirmOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConfirmOrderBtn.setText("Confirm Order");
        jPanel2.add(ConfirmOrderBtn);
        ConfirmOrderBtn.setBounds(740, 480, 140, 25);

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
    private javax.swing.JLabel YourOrderLbl;
    private javax.swing.JTable YourOrdersTbl;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
