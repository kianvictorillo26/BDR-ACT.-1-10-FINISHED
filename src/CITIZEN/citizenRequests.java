/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITIZEN;

import ADMIN.Requests.*;
import static ADMIN.Documents.createDocument.sess;
import ADMIN.adminDashBoard;
import java.awt.Color;
import config.PanelPrinter;
import net.proteanit.sql.DbUtils;  // Added import for rs2xml library


public class citizenRequests extends javax.swing.JFrame {

    /**
     * Creates new form manageRequests
     */
    public citizenRequests() {
        initComponents();
        loadRequestsTable();
    }

private void loadRequestsTable() {
    String selectedStatus = (String) filterby.getSelectedItem();
    try {
        config.config db = new config.config();
        try (java.sql.Connection con = db.getConnection()) {
            int userId = config.Session.getInstance().getUid();

            String getCitizenIdSql = "SELECT citizen_id FROM citizens WHERE U_Id = ?";
            java.sql.PreparedStatement getCitizenIdPst = con.prepareStatement(getCitizenIdSql);
            getCitizenIdPst.setInt(1, userId);
            java.sql.ResultSet rsCitizen = getCitizenIdPst.executeQuery();

            int citizenId = 0;
            if (rsCitizen.next()) {
                citizenId = rsCitizen.getInt("citizen_id");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Citizen record not found for user.");
                return;
            }

            String sql = "SELECT r.req_id, d.doc_type, r.request_date, r.status " +
                    "FROM requests r " +
                    "JOIN documents d ON r.doc_id = d.doc_id " +
                    "WHERE r.citizen_id = ?";

            if (selectedStatus != null && !selectedStatus.equals("Filter By:")) {
                sql += " AND r.status = ?";
            }

            sql += " ORDER BY r.request_date DESC";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, citizenId);
            if (selectedStatus != null && !selectedStatus.equals("Filter By:")) {
                pst.setString(2, selectedStatus);
            }

            java.sql.ResultSet rs = pst.executeQuery();

            // Existing code to build the table model...
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error loading requests: " + e.getMessage());
        e.printStackTrace();
    }
}


    private void documenttypecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documenttypecboxActionPerformed
        loadRequestsTable();
    }//GEN-LAST:event_documenttypecboxActionPerformed

    private void filterbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterbyActionPerformed
        loadRequestsTable();
    }//GEN-LAST:event_filterbyActionPerformed

    Color navcolor = new Color(41,50,57);  
        Color headcolor = new Color(137,207,24); 
        Color bodycolor = new Color(110,177,214);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        citizenName = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        requesttable = new javax.swing.JTable();
        backbutton = new javax.swing.JLabel();
        filterby = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 181, 104));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(41, 50, 57));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 255, 255));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("Citizen Name");
        navbar.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/user-logo.png"))); // NOI18N
        navbar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 90));

        citizenName.setBackground(new java.awt.Color(44, 71, 35));
        citizenName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        citizenName.setForeground(new java.awt.Color(255, 255, 255));
        citizenName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citizenName.setText("USER");
        navbar.add(citizenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 20));

        user_name.setBackground(new java.awt.Color(44, 71, 35));
        user_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name.setText("CURRENT USER ID:");
        navbar.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, 28));

        acc_id.setBackground(new java.awt.Color(44, 71, 35));
        acc_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("Account ID");
        navbar.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 160, 28));

        jPanel2.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 420));

        header.setBackground(new java.awt.Color(137, 207, 241));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE REQUESTS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 40));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 710, 40));

        maindesktop.setBackground(new java.awt.Color(110, 177, 214));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));
        maindesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requesttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(requesttable);

        maindesktop.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 610, 300));

        backbutton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        backbutton.setForeground(new java.awt.Color(0, 0, 0));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/back-arrow.png"))); // NOI18N
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });
        maindesktop.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        filterby.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        filterby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter By:", "Pending", "Rejected", "Approved" }));
        maindesktop.add(filterby, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 180, 40));

        jPanel2.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 710, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        new citizenDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(citizenRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citizenRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citizenRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citizenRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new citizenRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel citizenName;
    private javax.swing.JComboBox<String> filterby;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JTable requesttable;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
