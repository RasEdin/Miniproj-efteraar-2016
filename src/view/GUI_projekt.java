package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruger
 */
public class GUI_projekt extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form GUI_projekt
     */
    public GUI_projekt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPnlup = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPnlLeft = new javax.swing.JPanel();
        jpnlRight = new javax.swing.JPanel();
        jPnlDown = new javax.swing.JPanel();
        jPnlCenter = new javax.swing.JPanel();
        jPnlLblAdminPass = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPnlLblName = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPnlPassfield = new javax.swing.JPanel();
        jpassWordAdmin = new javax.swing.JPasswordField();
        jPnltxtName = new javax.swing.JPanel();
        jtxtFieldAdminName = new javax.swing.JTextField();
        jPnlBtnCancel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPnlBtnConennect = new javax.swing.JPanel();
        jBtnConnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane4.addTab("Bio Trio ", jPanel2);

        jPnlup.setPreferredSize(new java.awt.Dimension(400, 75));
        jPnlup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Wellcome to Bio Trio Admintrator Mangment .");
        jPnlup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 660, 60));

        javax.swing.GroupLayout jPnlLeftLayout = new javax.swing.GroupLayout(jPnlLeft);
        jPnlLeft.setLayout(jPnlLeftLayout);
        jPnlLeftLayout.setHorizontalGroup(
            jPnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPnlLeftLayout.setVerticalGroup(
            jPnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnlRight.setPreferredSize(new java.awt.Dimension(100, 450));

        javax.swing.GroupLayout jpnlRightLayout = new javax.swing.GroupLayout(jpnlRight);
        jpnlRight.setLayout(jpnlRightLayout);
        jpnlRightLayout.setHorizontalGroup(
            jpnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpnlRightLayout.setVerticalGroup(
            jpnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPnlDownLayout = new javax.swing.GroupLayout(jPnlDown);
        jPnlDown.setLayout(jPnlDownLayout);
        jPnlDownLayout.setHorizontalGroup(
            jPnlDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPnlDownLayout.setVerticalGroup(
            jPnlDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jLabel2.setText("Admin PAssword");

        javax.swing.GroupLayout jPnlLblAdminPassLayout = new javax.swing.GroupLayout(jPnlLblAdminPass);
        jPnlLblAdminPass.setLayout(jPnlLblAdminPassLayout);
        jPnlLblAdminPassLayout.setHorizontalGroup(
            jPnlLblAdminPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlLblAdminPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlLblAdminPassLayout.setVerticalGroup(
            jPnlLblAdminPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlLblAdminPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Admin Name");

        javax.swing.GroupLayout jPnlLblNameLayout = new javax.swing.GroupLayout(jPnlLblName);
        jPnlLblName.setLayout(jPnlLblNameLayout);
        jPnlLblNameLayout.setHorizontalGroup(
            jPnlLblNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlLblNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlLblNameLayout.setVerticalGroup(
            jPnlLblNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlLblNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlPassfieldLayout = new javax.swing.GroupLayout(jPnlPassfield);
        jPnlPassfield.setLayout(jPnlPassfieldLayout);
        jPnlPassfieldLayout.setHorizontalGroup(
            jPnlPassfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPassfieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpassWordAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlPassfieldLayout.setVerticalGroup(
            jPnlPassfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPassfieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpassWordAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtxtFieldAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFieldAdminNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnltxtNameLayout = new javax.swing.GroupLayout(jPnltxtName);
        jPnltxtName.setLayout(jPnltxtNameLayout);
        jPnltxtNameLayout.setHorizontalGroup(
            jPnltxtNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnltxtNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtFieldAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnltxtNameLayout.setVerticalGroup(
            jPnltxtNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnltxtNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtFieldAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPnlBtnCancelLayout = new javax.swing.GroupLayout(jPnlBtnCancel);
        jPnlBtnCancel.setLayout(jPnlBtnCancelLayout);
        jPnlBtnCancelLayout.setHorizontalGroup(
            jPnlBtnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBtnCancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlBtnCancelLayout.setVerticalGroup(
            jPnlBtnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBtnCancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBtnConnect.setText("Connect");
        jBtnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlBtnConennectLayout = new javax.swing.GroupLayout(jPnlBtnConennect);
        jPnlBtnConennect.setLayout(jPnlBtnConennectLayout);
        jPnlBtnConennectLayout.setHorizontalGroup(
            jPnlBtnConennectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBtnConennectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlBtnConennectLayout.setVerticalGroup(
            jPnlBtnConennectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBtnConennectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlCenterLayout = new javax.swing.GroupLayout(jPnlCenter);
        jPnlCenter.setLayout(jPnlCenterLayout);
        jPnlCenterLayout.setHorizontalGroup(
            jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCenterLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlLblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlLblAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlPassfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnltxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
            .addGroup(jPnlCenterLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jPnlBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jPnlBtnConennect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlCenterLayout.setVerticalGroup(
            jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCenterLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPnlLblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnltxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlLblAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlPassfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlBtnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlBtnConennect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)
                        .addComponent(jpnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPnlDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPnlup, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Log In", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFieldAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFieldAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFieldAdminNameActionPerformed

    private void jBtnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConnectActionPerformed
        // TODO add your handling code here:
        String name = jtxtFieldAdminName.getText();
        String Pass = new String(jpassWordAdmin.getPassword());
        String sql = "SELECT * FROM admin where name =? and pass = ? ;";
        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI_projekt.class.getName()).log(Level.SEVERE, null, ex);
            }

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login", "postgres", "12345");

            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, Pass);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Admin name and Password Matched");
                GUI_insertToDB in = new GUI_insertToDB();
                in.setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Admin name and Password Not Correct");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

//        DB_connection connect = DB_connection.getInstance();

    }//GEN-LAST:event_jBtnConnectActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_projekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConnect;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlBtnCancel;
    private javax.swing.JPanel jPnlBtnConennect;
    private javax.swing.JPanel jPnlCenter;
    private javax.swing.JPanel jPnlDown;
    private javax.swing.JPanel jPnlLblAdminPass;
    private javax.swing.JPanel jPnlLblName;
    private javax.swing.JPanel jPnlLeft;
    private javax.swing.JPanel jPnlPassfield;
    private javax.swing.JPanel jPnltxtName;
    private javax.swing.JPanel jPnlup;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JPasswordField jpassWordAdmin;
    private javax.swing.JPanel jpnlRight;
    private javax.swing.JTextField jtxtFieldAdminName;
    // End of variables declaration//GEN-END:variables
}