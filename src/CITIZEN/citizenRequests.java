/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITIZEN;

import ADMIN.Requests.*;
import static ADMIN.Documents.createDocument.sess;
import ADMIN.adminDashBoard;
import BDR.loginForm;
import java.awt.Color;
import config.PanelPrinter;
import config.Session;
import javax.swing.JOptionPane;
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

            // Step 1: Get citizen_id
            String getCitizenIdSql = "SELECT citizen_id FROM citizens WHERE U_Id = ?";
            try (java.sql.PreparedStatement getCitizenIdPst = con.prepareStatement(getCitizenIdSql)) {
                getCitizenIdPst.setInt(1, userId);
                java.sql.ResultSet rsCitizen = getCitizenIdPst.executeQuery();

                if (!rsCitizen.next()) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Citizen record not found for user.");
                    return;
                }

                int citizenId = rsCitizen.getInt("citizen_id");

                // Step 2: Build SQL with optional filter
                String sql = "SELECT r.req_id AS 'Request ID', d.doc_type AS 'Document Type', " +
                             "r.request_date AS 'Request Date', r.status AS 'Status' " +
                             "FROM requests r " +
                             "JOIN documents d ON r.doc_id = d.doc_id " +
                             "WHERE r.citizen_id = ? ";

                boolean hasFilter = selectedStatus != null && !"Filter By:".equals(selectedStatus);
                if (hasFilter) {
                    sql += "AND LOWER(r.status) = LOWER(?) ";

                }

                sql += "ORDER BY r.request_date DESC";

                // Step 3: Prepare and set parameters
                try (java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setInt(1, citizenId);
                    if (hasFilter) {
                        pst.setString(2, selectedStatus);
                    }

                    // Debugging logs
                    System.out.println("Executing SQL: " + sql);
                    System.out.println("citizenId: " + citizenId);
                    if (hasFilter) {
                        System.out.println("Status filter: " + selectedStatus);
                    }

                    // Step 4: Execute and display in table
                    java.sql.ResultSet rs = pst.executeQuery();
                    requesttable.setModel(DbUtils.resultSetToTableModel(rs));

                    // Optional: Check for empty table
                    if (!rs.isBeforeFirst()) {
                        System.out.println("No request data found for the selected filter.");
                        // Optionally, clear the table or show a message in the UI
                    }
                }
            }
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
        user_name = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        citizenName = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        requesttable = new javax.swing.JTable();
        backbutton = new javax.swing.JLabel();
        filterby = new javax.swing.JComboBox<>();
        printRequest = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
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

        citizenName.setBackground(new java.awt.Color(44, 71, 35));
        citizenName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        citizenName.setForeground(new java.awt.Color(255, 255, 255));
        citizenName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citizenName.setText("USER");
        navbar.add(citizenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 20));

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

        printRequest.setBackground(new java.awt.Color(137, 207, 241));
        printRequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        printRequest.setText("PRINT");
        printRequest.setBorder(null);
        printRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printRequestMouseClicked(evt);
            }
        });
        printRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRequestActionPerformed(evt);
            }
        });
        maindesktop.add(printRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, 40));

        jPanel2.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 710, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        new citizenDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Session sess = Session.getInstance();
        
        if(sess.getUid()== 0){
            JOptionPane.showMessageDialog(null, " No Account, Log In First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();            
        }else{
                 citizenName.setText(""+sess.getFname());
                 acc_id.setText(""+sess.getUid());
        } // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void printRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printRequestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printRequestMouseClicked

    private void printRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRequestActionPerformed
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a request to print.");
            return;
        }

        String status = (String) requesttable.getValueAt(selectedRow, 3);
        if (!"Approved".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "Only approved requests can be printed.");
            return;
        }

        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        String docType = (String) requesttable.getValueAt(selectedRow, 1);

        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "SELECT u.fname, u.lname, d.doc_type, r.request_date " +
                "FROM requests r " +
                "JOIN citizens ci ON r.citizen_id = ci.citizen_id " +
                "JOIN users u ON ci.U_Id = u.U_Id " +
                "JOIN documents d ON r.doc_id = d.doc_id " +
                "WHERE r.req_id = ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, reqId);
                java.sql.ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    java.sql.Date requestDate = rs.getDate("request_date");

                    switch (docType.toLowerCase()) {
                        case "barangay clearance":
                        CERTIFICATES.clearance clearanceForm = new CERTIFICATES.clearance();
                        clearanceForm.setName(fname + " " + lname);
                        clearanceForm.setAge(""); // Age not available in schema
                        clearanceForm.setDateIssued(requestDate.toString());
                        clearanceForm.setBrgyCaptani("Baranggay Captain"); // Placeholder
                        clearanceForm.setVisible(true);
                        new config.PanelPrinter(clearanceForm.clearancepanel).printPanel();
                        break;
                        case "barangay indigency certificate":
                        CERTIFICATES.indigency indigencyForm = new CERTIFICATES.indigency();
                        indigencyForm.setName(fname + " " + lname);
                        indigencyForm.setAge(""); // Age not available in schema
                        indigencyForm.setDateIssued(requestDate.toString());
                        indigencyForm.setBrgyCaptani("Baranggay Captain"); // Placeholder
                        indigencyForm.setVisible(true);
                        new config.PanelPrinter(indigencyForm.indigencypanel).printPanel();
                        break;
                        case "barangay certificate of residency":
                        CERTIFICATES.residency residencyForm = new CERTIFICATES.residency();
                        residencyForm.setName(fname + " " + lname);
                        residencyForm.setPurok("Purok 1"); // Placeholder
                        residencyForm.setBrgyCaptani("Baranggay Captain"); // Placeholder
                        residencyForm.setVisible(true);
                        new config.PanelPrinter(residencyForm.residencypanel).printPanel();
                        break;
                        default:
                        JOptionPane.showMessageDialog(this, "Unsupported document type: " + docType);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Request details not found.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error printing request: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_printRequestActionPerformed

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
    private javax.swing.JButton printRequest;
    private javax.swing.JTable requesttable;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
