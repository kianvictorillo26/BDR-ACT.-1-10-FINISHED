/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITIZEN;

import ADMIN.Requests.*;
import ADMIN.Documents.*;
import ADMIN.adminDashBoard;
import ADMIN.Documents.manageDocuments;
import config.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class requestDocument extends javax.swing.JFrame {

    /**
     * Creates new form createDocument
     */
    public requestDocument() {
        initComponents();
        // Load citizens into combobox
        loadCitizens();
        // Load documents into combobox
        loadDocuments();
        // Set current timestamp in datefield
        setCurrentTimestamp();
    }

    private void loadCitizens() {
        // Set citizenName field to current session user's full name
        Session sess = Session.getInstance();
        String fullName = sess.getFname() + " " + sess.getLname();
        citizenName.setText(fullName);
    }

    private void loadDocuments() {
        try {
            config.config db = new config.config();
            try (Connection con = db.getConnection()) {
                String sql = "SELECT doc_id, doc_type FROM documents";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                java.sql.ResultSet rs = pst.executeQuery();
                documenttypecbox.removeAllItems();
                documenttypecbox.addItem("Select Document");
                while (rs.next()) {
                    int docId = rs.getInt("doc_id");
                    String docType = rs.getString("doc_type");
                    // Store docId and docType as item, display docType
                    documenttypecbox.addItem(docId + " - " + docType);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading documents: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void setCurrentTimestamp() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new java.util.Date());
        datefield.setText(currentTime);
    }

    public static Session sess = Session.getInstance();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        requestDocument = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datefield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        documenttypecbox = new javax.swing.JComboBox<>();
        citizenName = new javax.swing.JTextField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REQUEST A DOCUMENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 30, 590, 60);

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(137, 207, 241));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Citizen:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 30));

        jPanel3.setBackground(new java.awt.Color(110, 177, 214));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestDocument.setBackground(new java.awt.Color(110, 177, 214));
        requestDocument.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        requestDocument.setForeground(new java.awt.Color(0, 0, 0));
        requestDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestDocument.setText("SUBMIT");
        requestDocument.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestDocumentMouseClicked(evt);
            }
        });
        jPanel3.add(requestDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Document Type:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 30));

        datefield.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        datefield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        datefield.setEnabled(false);
        datefield.setOpaque(false);
        datefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datefieldActionPerformed(evt);
            }
        });
        jPanel2.add(datefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 180, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 30));

        documenttypecbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Document" }));
        jPanel2.add(documenttypecbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 180, 30));

        citizenName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        citizenName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        citizenName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        citizenName.setEnabled(false);
        citizenName.setOpaque(false);
        citizenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citizenNameActionPerformed(evt);
            }
        });
        jPanel2.add(citizenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 180, 30));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 100, 680, 300);

        back.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/back-arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 20, 64, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestDocumentMouseClicked
        // Use current session user ID (U_Id) to get citizen_id
        Session sess = Session.getInstance();
        int userId = sess.getUid();

        if (userId == 0) {
            JOptionPane.showMessageDialog(this, "No logged in user found.");
            return;
        }

        String selectedDoc = (String) documenttypecbox.getSelectedItem();
        if (selectedDoc == null || selectedDoc.equals("Select Document")) {
            JOptionPane.showMessageDialog(this, "Please select a document.");
            return;
        }

        int docId;
        try {
            String[] parts = selectedDoc.split(" - ", 2);
            docId = Integer.parseInt(parts[0]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid document selection.");
            return;
        }

        String status = "Pending";

        try {
            config.config db = new config.config();
            try (Connection con = db.getConnection()) {
                // Get citizen_id from citizens table using U_Id
                String getCitizenIdSql = "SELECT citizen_id FROM citizens WHERE U_Id = ?";
                PreparedStatement getCitizenIdPst = con.prepareStatement(getCitizenIdSql);
                getCitizenIdPst.setInt(1, userId);
                java.sql.ResultSet rsCitizen = getCitizenIdPst.executeQuery();
                int citizenId = 0;
                if (rsCitizen.next()) {
                    citizenId = rsCitizen.getInt("citizen_id");
                } else {
                    JOptionPane.showMessageDialog(this, "Citizen record not found for user.");
                    return;
                }

                // Check if citizen_id exists in citizens table
                String checkSql = "SELECT COUNT(*) FROM citizens WHERE citizen_id = ?";
                PreparedStatement checkPst = con.prepareStatement(checkSql);
                checkPst.setInt(1, citizenId);
                java.sql.ResultSet rs = checkPst.executeQuery();
                if (rs.next()) {
                    int count = rs.getInt(1);
                    if (count == 0) {
                        JOptionPane.showMessageDialog(this, "Citizen does not exist.");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error verifying citizen.");
                    return;
                }

                String sql = "INSERT INTO requests (citizen_id, doc_id, status) VALUES (?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, citizenId);
                pst.setInt(2, docId);
                pst.setString(3, status);

                int result = pst.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Request submitted successfully!");
                    new citizenDashBoard().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to submit request!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_requestDocumentMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void datefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datefieldActionPerformed

    private void citizenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citizenNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citizenNameActionPerformed

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
            java.util.logging.Logger.getLogger(requestDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(requestDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(requestDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(requestDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new requestDocument().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField citizenName;
    private javax.swing.JTextField datefield;
    private javax.swing.JComboBox<String> documenttypecbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel requestDocument;
    // End of variables declaration//GEN-END:variables
}
