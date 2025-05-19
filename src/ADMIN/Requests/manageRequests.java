/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN.Requests;

import static ADMIN.Documents.createDocument.sess;
import ADMIN.adminDashBoard;
import config.PanelPrinter;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class manageRequests extends javax.swing.JFrame {

    /**
     * Creates new form manageRequests
     */
    public manageRequests() {
        initComponents();
        loadRequestsTable();
    }

    private void loadRequestsTable() {
        String selectedStatus = (String) filterby.getSelectedItem();
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "SELECT r.req_id, c.fname, c.lname, d.doc_type, r.request_date, r.status, r.approved_by, a.fname AS approver_fname, a.lname AS approver_lname, r.approval_date " +
                             "FROM requests r " +
                             "LEFT JOIN citizens ci ON r.citizen_id = ci.citizen_id " +
                             "LEFT JOIN users c ON ci.U_id = c.U_id " +
                             "LEFT JOIN documents d ON r.doc_id = d.doc_id " +
                             "LEFT JOIN users a ON r.approved_by = a.U_id ";
                if (selectedStatus != null && !selectedStatus.equals("Filter By:")) {
                    sql += " WHERE r.status = ? ";
                }
                sql += " ORDER BY CASE WHEN r.status = 'Pending' THEN 1 WHEN r.status = 'Approved' THEN 2 WHEN r.status = 'Rejected' THEN 3 ELSE 4 END, r.request_date DESC";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                if (selectedStatus != null && !selectedStatus.equals("Filter By:")) {
                    pst.setString(1, selectedStatus);
                }
                java.sql.ResultSet rs = pst.executeQuery();

                javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false; // Make table cells non-editable
                    }
                };
                model.addColumn("Request ID");
                model.addColumn("Citizen Name");
                model.addColumn("Document Type");
                model.addColumn("Request Date");
                model.addColumn("Status");
                model.addColumn("Approved By");
                model.addColumn("Approval Date");

                while (rs.next()) {
                    int reqId = rs.getInt("req_id");
                    String citizenName = rs.getString("fname") + " " + rs.getString("lname");
                    String docType = rs.getString("doc_type");
                    java.sql.Timestamp requestDate = rs.getTimestamp("request_date");
                    String status = rs.getString("status");
                    String approverName = null;
                    int approvedBy = rs.getInt("approved_by");
                    if (approvedBy != 0) {
                        approverName = rs.getString("approver_fname") + " " + rs.getString("approver_lname");
                    }
                    java.sql.Timestamp approvalDate = rs.getTimestamp("approval_date");

                    model.addRow(new Object[] {
                        reqId,
                        citizenName,
                        docType,
                        requestDate,
                        status,
                        approverName,
                        approvalDate
                    });
                }

                requesttable.setModel(model);
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
        addDocu = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editDocu = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        requesttable = new javax.swing.JTable();
        backbutton = new javax.swing.JLabel();
        filterby = new javax.swing.JComboBox<>();
        rejectrequest = new javax.swing.JButton();
        approverequest = new javax.swing.JButton();
        printRequest = new javax.swing.JButton();
        viewRequest = new javax.swing.JButton();

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
        maindesktop.add(filterby, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 40));

        rejectrequest.setBackground(new java.awt.Color(137, 207, 241));
        rejectrequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rejectrequest.setForeground(new java.awt.Color(0, 0, 0));
        rejectrequest.setText("REJECT");
        rejectrequest.setBorder(null);
        rejectrequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectrequestMouseClicked(evt);
            }
        });
        maindesktop.add(rejectrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 40));

        approverequest.setBackground(new java.awt.Color(137, 207, 241));
        approverequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        approverequest.setForeground(new java.awt.Color(0, 0, 0));
        approverequest.setText("APPROVE");
        approverequest.setBorder(null);
        approverequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approverequestMouseClicked(evt);
            }
        });
        maindesktop.add(approverequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, 40));

        printRequest.setBackground(new java.awt.Color(137, 207, 241));
        printRequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        printRequest.setForeground(new java.awt.Color(0, 0, 0));
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
        maindesktop.add(printRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 90, 40));

        viewRequest.setBackground(new java.awt.Color(137, 207, 241));
        viewRequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        viewRequest.setForeground(new java.awt.Color(0, 0, 0));
        viewRequest.setText("VIEW");
        viewRequest.setBorder(null);
        viewRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRequestMouseClicked(evt);
            }
        });
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });
        maindesktop.add(viewRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 90, 40));

        jPanel2.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 710, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDocuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseClicked
        new createRequest().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addDocuMouseClicked

    private void addDocuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseEntered
        addDocu.setBackground(bodycolor);
    }//GEN-LAST:event_addDocuMouseEntered

    private void addDocuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDocuMouseExited
        addDocu.setBackground(navcolor);
    }//GEN-LAST:event_addDocuMouseExited

    private void editDocuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseClicked
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a request to edit.");
            return;
        }
        String status = (String) requesttable.getValueAt(selectedRow, 4);
        if (!"Pending".equalsIgnoreCase(status)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Only pending requests can be edited.");
            return;
        }
        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        updateRequest updateReqForm = new updateRequest();
        updateReqForm.setVisible(true);
        updateReqForm.loadRequestData(reqId);
        this.dispose();
    }//GEN-LAST:event_editDocuMouseClicked

    private void editDocuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseEntered
        editDocu.setBackground(bodycolor);
    }//GEN-LAST:event_editDocuMouseEntered

    private void editDocuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDocuMouseExited
        editDocu.setBackground(navcolor);
    }//GEN-LAST:event_editDocuMouseExited

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        new adminDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

    private void rejectrequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectrequestMouseClicked
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a request to reject.");
            return;
        }
        String status = (String) requesttable.getValueAt(selectedRow, 4);
        if (!"Pending".equalsIgnoreCase(status)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Only pending requests can be rejected.");
            return;
        }
        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "UPDATE requests SET status = ?, approved_by = ?, approval_date = NOW() WHERE req_id = ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, "Rejected");
                pst.setInt(2, sess.getUid());
                pst.setInt(3, reqId);
                int result = pst.executeUpdate();
                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Request rejected successfully.");
                    loadRequestsTable();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed to reject request.");
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error rejecting request: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_rejectrequestMouseClicked

    private void approverequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approverequestMouseClicked
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a request to approve.");
            return;
        }
        String status = (String) requesttable.getValueAt(selectedRow, 4);
        if (!"Pending".equalsIgnoreCase(status)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Only pending requests can be approved.");
            return;
        }
        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                String sql = "UPDATE requests SET status = ?, approved_by = ?, approval_date = NOW() WHERE req_id = ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, "Approved");
                pst.setInt(2, sess.getUid());
                pst.setInt(3, reqId);
                int result = pst.executeUpdate();
                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Request approved successfully.");
                    loadRequestsTable();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed to approve request.");
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error approving request: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_approverequestMouseClicked

    private void printRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printRequestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printRequestMouseClicked

    private void printRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRequestActionPerformed
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a request to print.");
            return;
        }

        String status = (String) requesttable.getValueAt(selectedRow, 4);
        if (!"Approved".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "Only approved requests can be printed.");
            return;
        }

        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        String docType = (String) requesttable.getValueAt(selectedRow, 2);

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

    private void viewRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRequestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRequestMouseClicked

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed
        int selectedRow = requesttable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a request to view.");
            return;
        }

        String status = (String) requesttable.getValueAt(selectedRow, 4);
        if (!"Approved".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "Only approved requests can be viewed.");
            return;
        }

        int reqId = (int) requesttable.getValueAt(selectedRow, 0);
        String citizenName = (String) requesttable.getValueAt(selectedRow, 1);
        String docType = (String) requesttable.getValueAt(selectedRow, 2);

        try {
            config.config db = new config.config();
            try (java.sql.Connection con = db.getConnection()) {
                // Query to get detailed request info including citizen details
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

                    // Instantiate and show the appropriate certificate JFrame
                    switch (docType.toLowerCase()) {
                        case "barangay clearance":
                            CERTIFICATES.clearance clearanceForm = new CERTIFICATES.clearance();
                            clearanceForm.setName(fname + " " + lname);
                            clearanceForm.setAge(""); // Age not available in schema
                            clearanceForm.setDateIssued(requestDate.toString());
                            clearanceForm.setBrgyCaptani("Baranggay Captain"); // Placeholder, adjust as needed
                            clearanceForm.setVisible(true);
                            break;
                        case "barangay indigency certificate":
                            CERTIFICATES.indigency indigencyForm = new CERTIFICATES.indigency();
                            indigencyForm.setName(fname + " " + lname);
                            indigencyForm.setAge(""); // Age not available in schema
                            indigencyForm.setDateIssued(requestDate.toString());
                            indigencyForm.setBrgyCaptani("Baranggay Captain"); // Placeholder, adjust as needed
                            indigencyForm.setVisible(true);
                            break;
                        case "barangay certificate of residency":
                            CERTIFICATES.residency residencyForm = new CERTIFICATES.residency();
                            residencyForm.setName(fname + " " + lname);
                            residencyForm.setPurok("Purok 1"); // Placeholder, adjust as needed
                            residencyForm.setBrgyCaptani("Baranggay Captain"); // Placeholder, adjust as needed
                            residencyForm.setVisible(true);
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
            JOptionPane.showMessageDialog(this, "Error loading request details: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewRequestActionPerformed

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
            java.util.logging.Logger.getLogger(manageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addDocu;
    private javax.swing.JButton approverequest;
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel citizenName;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editDocu;
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
    private javax.swing.JButton rejectrequest;
    private javax.swing.JTable requesttable;
    private javax.swing.JLabel user_name;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}
