/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN.Documents;

import ADMIN.adminDashBoard;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class manageDocuments extends javax.swing.JFrame {

    /**
     * Creates new form manageDocuments
     */
    public manageDocuments() {
        initComponents();
        loadDocumentsTable();
    }

    private void loadDocumentsTable() {
        try {
            config.config db = new config.config();
            try (Connection con = db.getConnection()) {
                String sql = "SELECT doc_id, doc_type, doc_description, created_by, date_created FROM documents";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                // Create table model with column names
                DefaultTableModel model = new DefaultTableModel(
                    new String[] {"Document ID", "Type", "Description", "Created By", "Date Created"}, 0
                );

                // Add rows to table model
                while(rs.next()) {
                    model.addRow(new Object[] {
                        rs.getInt("doc_id"),
                        rs.getString("doc_type"),
                        rs.getString("doc_description"),
                        rs.getInt("created_by"),
                        rs.getTimestamp("date_created")
                    });
                }

                documentsTable.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading documents: " + e.getMessage());
            e.printStackTrace();
        }
    }

        Color navcolor = new Color(41,50,57);  
        Color headcolor = new Color(137,207,24); 
        Color bodycolor = new Color(110,177,214);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        citizenName = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        addDocu = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editDocu = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        deleteDocument = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        documentsTable = new javax.swing.JTable();
        backbutton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        addDocu.setBackground(new java.awt.Color(41, 50, 57));
        addDocu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDocuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDocuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addDocuMouseExited(evt);
            }
        });
        addDocu.setLayout(null);

        add.setBackground(new java.awt.Color(44, 71, 35));
        add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        addDocu.add(add);
        add.setBounds(40, 10, 80, 20);

        navbar.add(addDocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 40));

        editDocu.setBackground(new java.awt.Color(41, 50, 57));
        editDocu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDocuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editDocuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editDocuMouseExited(evt);
            }
        });
        editDocu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setBackground(new java.awt.Color(44, 71, 35));
        edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("EDIT");
        editDocu.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        navbar.add(editDocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 40));

        deleteDocument.setBackground(new java.awt.Color(41, 50, 57));
        deleteDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteDocumentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteDocumentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteDocumentMouseExited(evt);
            }
        });
        deleteDocument.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setBackground(new java.awt.Color(44, 71, 35));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("DELETE");
        deleteDocument.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        navbar.add(deleteDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 40));

        jPanel2.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 420));

        header.setBackground(new java.awt.Color(137, 207, 241));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE DOCUMENTS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 40));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 710, 40));

        maindesktop.setBackground(new java.awt.Color(110, 177, 214));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));
        maindesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        documentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(documentsTable);

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

        jPanel2.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 710, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDocuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseClicked
        new createDocument().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addDocuMouseClicked

    private void addDocuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseEntered
        addDocu.setBackground(bodycolor);
    }//GEN-LAST:event_addDocuMouseEntered

    private void addDocuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseExited
        addDocu.setBackground(navcolor);
    }//GEN-LAST:event_addDocuMouseExited

    private void editDocuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseClicked
        int selectedRow = documentsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a document to edit.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) documentsTable.getModel();
        int docId = (int) model.getValueAt(selectedRow, 0);
        String docType = (String) model.getValueAt(selectedRow, 1);
        String docDesc = (String) model.getValueAt(selectedRow, 2);

        updateDocument updateDocForm = new updateDocument();
        updateDocForm.setVisible(true);
        updateDocForm.documentype.setText(docType);
        updateDocForm.documentdescription.setText(docDesc);
        updateDocForm.setDocumentId(docId);

        this.dispose();
    }//GEN-LAST:event_editDocuMouseClicked

    private void editDocuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseEntered
        editDocu.setBackground(bodycolor);
    }//GEN-LAST:event_editDocuMouseEntered

    private void editDocuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseExited
        editDocu.setBackground(navcolor);
    }//GEN-LAST:event_editDocuMouseExited

    private void deleteDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDocumentMouseClicked
        int selectedRow = documentsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a document to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) documentsTable.getModel();
        int docId = (int) model.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this document?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            config.config db = new config.config();
            try (Connection con = db.getConnection()) {
                String sql = "DELETE FROM documents WHERE doc_id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, docId);

                int result = pst.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Document deleted successfully!");
                    loadDocumentsTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete document!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteDocumentMouseClicked

    private void deleteDocumentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDocumentMouseEntered
        deleteDocument.setBackground(bodycolor);
    }//GEN-LAST:event_deleteDocumentMouseEntered

    private void deleteDocumentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDocumentMouseExited
        deleteDocument.setBackground(navcolor);
    }//GEN-LAST:event_deleteDocumentMouseExited

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        new adminDashBoard().setVisible(true);
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
            java.util.logging.Logger.getLogger(manageDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageDocuments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageDocuments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addDocu;
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel citizenName;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deleteDocument;
    private javax.swing.JTable documentsTable;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editDocu;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
