/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN.Requests;

import ADMIN.Documents.*;
import ADMIN.adminDashBoard;
import ADMIN.Documents.manageDocuments;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class updateRequest extends javax.swing.JFrame {

    private int documentId;

    /**
     * Creates new form updateDocument
     */
    public updateRequest() {
        initComponents();
        fillDocumentTypeComboBox();
    }

    private void fillDocumentTypeComboBox() {
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "SELECT doc_type FROM documents";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                java.sql.ResultSet rs = pst.executeQuery();
                documenttypecbox.removeAllItems();
                documenttypecbox.addItem("Select Document");
                while (rs.next()) {
                    documenttypecbox.addItem(rs.getString("doc_type"));
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading document types: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        updateDocument = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        documenttypecbox = new javax.swing.JComboBox<>();
        datefield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        citizenfield = new javax.swing.JTextField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE DOCUMENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 30, 590, 60);

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(137, 207, 241));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 20));

        jPanel3.setBackground(new java.awt.Color(110, 177, 214));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateDocument.setBackground(new java.awt.Color(110, 177, 214));
        updateDocument.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        updateDocument.setForeground(new java.awt.Color(0, 0, 0));
        updateDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateDocument.setText("UPDATE");
        updateDocument.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateDocumentMouseClicked(evt);
            }
        });
        jPanel3.add(updateDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Citizen:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Document Type:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 30));

        documenttypecbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Document" }));
        jPanel2.add(documenttypecbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 180, 30));

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

        citizenfield.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        citizenfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        citizenfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        citizenfield.setEnabled(false);
        citizenfield.setOpaque(false);
        citizenfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citizenfieldActionPerformed(evt);
            }
        });
        jPanel2.add(citizenfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 180, 30));

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

    private int requestId; // to hold the request id being updated

    public void loadRequestData(int reqId) {
        this.requestId = reqId;
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "SELECT r.req_id, c.fname, c.lname, d.doc_type, r.request_date, r.status, r.doc_id, ci.citizen_id " +
                             "FROM requests r " +
                             "LEFT JOIN citizens ci ON r.citizen_id = ci.citizen_id " +
                             "LEFT JOIN users c ON ci.U_id = c.U_id " +
                             "LEFT JOIN documents d ON r.doc_id = d.doc_id " +
                             "WHERE r.req_id = ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, reqId);
                java.sql.ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String citizenName = rs.getString("fname") + " " + rs.getString("lname");
                    citizenfield.setText(citizenName);
                    datefield.setText(rs.getTimestamp("request_date").toString());
                    // Set document type combobox selection
                    String docType = rs.getString("doc_type");
                    for (int i = 0; i < documenttypecbox.getItemCount(); i++) {
                        if (documenttypecbox.getItemAt(i).equals(docType)) {
                            documenttypecbox.setSelectedIndex(i);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading request data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void updateDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDocumentMouseClicked
        String selectedDocType = (String) documenttypecbox.getSelectedItem();
        if (selectedDocType == null || selectedDocType.equals("Select Document")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a document type.");
            return;
        }
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                // Get doc_id for selected document type
                String docIdSql = "SELECT doc_id FROM documents WHERE doc_type = ?";
                java.sql.PreparedStatement docPst = con.prepareStatement(docIdSql);
                docPst.setString(1, selectedDocType);
                java.sql.ResultSet docRs = docPst.executeQuery();
                int docId = -1;
                if (docRs.next()) {
                    docId = docRs.getInt("doc_id");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Selected document type not found.");
                    return;
                }
                // Update the request with new doc_id
                String updateSql = "UPDATE requests SET doc_id = ? WHERE req_id = ?";
                java.sql.PreparedStatement updatePst = con.prepareStatement(updateSql);
                updatePst.setInt(1, docId);
                updatePst.setInt(2, this.requestId);
                int result = updatePst.executeUpdate();
                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Request updated successfully.");
                    this.dispose();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed to update request.");
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating request: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateDocumentMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void datefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datefieldActionPerformed

    private void citizenfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citizenfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citizenfieldActionPerformed

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
            java.util.logging.Logger.getLogger(updateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField citizenfield;
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
    private javax.swing.JLabel updateDocument;
    // End of variables declaration//GEN-END:variables
}
