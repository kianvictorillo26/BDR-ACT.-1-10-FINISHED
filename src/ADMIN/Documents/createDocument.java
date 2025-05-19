/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN.Documents;

import ADMIN.adminDashBoard;
import ADMIN.Documents.manageDocuments;
import config.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class createDocument extends javax.swing.JFrame {

    /**
     * Creates new form createDocument
     */
    public createDocument() {
        initComponents();
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
        documentype = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        documentdescription = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        addDocument = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE A DOCUMENT");
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
        jLabel6.setText("Document Type:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, 30));

        documentype.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        documentype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        documentype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        documentype.setOpaque(false);
        documentype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentypeActionPerformed(evt);
            }
        });
        jPanel2.add(documentype, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Document Description:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, 30));

        documentdescription.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        documentdescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        documentdescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        documentdescription.setOpaque(false);
        documentdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentdescriptionActionPerformed(evt);
            }
        });
        jPanel2.add(documentdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 180, 30));

        jPanel3.setBackground(new java.awt.Color(110, 177, 214));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDocument.setBackground(new java.awt.Color(110, 177, 214));
        addDocument.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addDocument.setForeground(new java.awt.Color(0, 0, 0));
        addDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addDocument.setText("ADD");
        addDocument.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDocumentMouseClicked(evt);
            }
        });
        jPanel3.add(addDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 50));

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

    private void documentypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentypeActionPerformed

    private void documentdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentdescriptionActionPerformed

    private void addDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocumentMouseClicked
        String docType = documentype.getText().trim();
        String docDesc = documentdescription.getText().trim();
        
        if (docType.isEmpty() || docDesc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!");
            return;
        }
        
        try {
            config.config db = new config.config();
            try (Connection con = db.getConnection()) {
                String sql = "INSERT INTO documents (doc_type, doc_description, created_by, date_created) VALUES (?, ?, ?, NOW())";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, docType);
                pst.setString(2, docDesc);
                // pst.setInt(3, 1); // Default admin ID or get from session
                int createdBy = sess.getUid(); // Assuming session class has this method
                pst.setInt(3, createdBy);
                
                int result = pst.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Document added successfully!");
                    new manageDocuments().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add document!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_addDocumentMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(createDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createDocument().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDocument;
    private javax.swing.JLabel back;
    private javax.swing.JTextField documentdescription;
    private javax.swing.JTextField documentype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
