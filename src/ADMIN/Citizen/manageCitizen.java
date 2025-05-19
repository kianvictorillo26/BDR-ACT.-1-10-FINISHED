/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN.Citizen;

import ADMIN.adminDashBoard;
import config.config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class manageCitizen extends javax.swing.JFrame {

    /**
     * Creates new form manageCitizen
     */
    public manageCitizen() {
        initComponents();
        loadCitizenTable();
    }

         Color navcolor = new Color(41,50,57);  
        Color headcolor = new Color(137,207,24); 
        Color bodycolor = new Color(110,177,214);
        
    private void loadCitizenTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Citizen ID");
        model.addColumn("User ID");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Address");
        model.addColumn("Status");

        config conf = new config();
        try (Connection conn = conf.getConnection()) {
            String sql = "SELECT c.Citizen_Id, u.U_Id, u.fname, u.lname, u.address, c.status FROM citizens c JOIN users u ON c.U_Id = u.U_Id";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("Citizen_Id"),
                    rs.getInt("U_Id"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("address"),
                    rs.getString("status")
                });
            }
            citizenTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading citizens: " + e.getMessage());
        }
    }
    
    private int getSelectedCitizenId() {
        int selectedRow = citizenTable.getSelectedRow();
        if (selectedRow == -1) {
            return -1;
        }
        return (int) citizenTable.getValueAt(selectedRow, 0);
    }
    
    private String getSelectedCitizenStatus() {
        int selectedRow = citizenTable.getSelectedRow();
        if (selectedRow == -1) {
            return null;
        }
        return (String) citizenTable.getValueAt(selectedRow, 5);
    }
    
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
        addbutton = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editbutton = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        activatebutton = new javax.swing.JPanel();
        activate = new javax.swing.JLabel();
        deletebutton = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        citizenTable = new javax.swing.JTable();
        backbutton = new javax.swing.JLabel();

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

        addbutton.setBackground(new java.awt.Color(41, 50, 57));
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbuttonMouseExited(evt);
            }
        });
        addbutton.setLayout(null);

        add.setBackground(new java.awt.Color(44, 71, 35));
        add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        addbutton.add(add);
        add.setBounds(40, 10, 80, 20);

        navbar.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 40));

        editbutton.setBackground(new java.awt.Color(41, 50, 57));
        editbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editbuttonMouseExited(evt);
            }
        });
        editbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setBackground(new java.awt.Color(44, 71, 35));
        edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit.setText("EDIT");
        editbutton.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        navbar.add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 40));

        activatebutton.setBackground(new java.awt.Color(41, 50, 57));
        activatebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activatebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                activatebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                activatebuttonMouseExited(evt);
            }
        });
        activatebutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        activate.setBackground(new java.awt.Color(44, 71, 35));
        activate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        activate.setForeground(new java.awt.Color(255, 255, 255));
        activate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activate.setText("ACTIVATE/DEACTIVATE");
        activatebutton.add(activate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 20));

        navbar.add(activatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 160, 40));

        deletebutton.setBackground(new java.awt.Color(41, 50, 57));
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebuttonMouseExited(evt);
            }
        });
        deletebutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setBackground(new java.awt.Color(44, 71, 35));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("DELETE");
        deletebutton.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        navbar.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 40));

        jPanel2.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 420));

        header.setBackground(new java.awt.Color(137, 207, 241));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE CITIZEN");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 40));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 710, 40));

        maindesktop.setBackground(new java.awt.Color(110, 177, 214));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));
        maindesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        citizenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(citizenTable);

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked
        new createCitizen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addbuttonMouseClicked

    private void addbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseEntered
        addbutton.setBackground(bodycolor);
    }//GEN-LAST:event_addbuttonMouseEntered

    private void addbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseExited
        addbutton.setBackground(navcolor);
    }//GEN-LAST:event_addbuttonMouseExited

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int selectedRow = citizenTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a citizen to edit.");
            return;
        }

        int citizenId = (int) citizenTable.getValueAt(selectedRow, 0);
        int userId = (int) citizenTable.getValueAt(selectedRow, 1);
        String fname = (String) citizenTable.getValueAt(selectedRow, 2);
        String lname = (String) citizenTable.getValueAt(selectedRow, 3);
        String address = (String) citizenTable.getValueAt(selectedRow, 4);

        updateCitizen updateForm = new updateCitizen();
        updateForm.setVisible(true);
        updateForm.uid.setText(String.valueOf(userId));
        updateForm.fname.setText(fname);
        updateForm.lname.setText(lname);
        updateForm.address.setText(address);

        this.dispose();
    }//GEN-LAST:event_editbuttonMouseClicked

    private void editbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseEntered
        editbutton.setBackground(bodycolor);
    }//GEN-LAST:event_editbuttonMouseEntered

    private void editbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseExited
        editbutton.setBackground(navcolor);
    }//GEN-LAST:event_editbuttonMouseExited

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        new adminDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

    private void activatebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseClicked
        int citizenId = getSelectedCitizenId();
        if (citizenId == -1) {
            JOptionPane.showMessageDialog(this, "Please select a citizen.");
            return;
        }
        String status = getSelectedCitizenStatus();
        if (status == null) {
            JOptionPane.showMessageDialog(this, "Unable to determine citizen status.");
            return;
        }
        config conf = new config();
        try (Connection conn = conf.getConnection()) {
            String newStatus;
            if ("Pending".equalsIgnoreCase(status) || "Inactive".equalsIgnoreCase(status)) {
                newStatus = "Active";
            } else if ("Active".equalsIgnoreCase(status)) {
                newStatus = "Inactive";
            } else {
                JOptionPane.showMessageDialog(this, "Status change not allowed for current status: " + status);
                return;
            }
            String sql = "UPDATE citizens SET status = ? WHERE Citizen_Id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newStatus);
            pst.setInt(2, citizenId);
            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Citizen status updated to " + newStatus + " successfully.");
                loadCitizenTable();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update citizen status.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating citizen status: " + e.getMessage());
        }
    }//GEN-LAST:event_activatebuttonMouseClicked

    private void activatebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseEntered
        activatebutton.setBackground(bodycolor);
    }//GEN-LAST:event_activatebuttonMouseEntered

    private void activatebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseExited
        activatebutton.setBackground(navcolor);
    }//GEN-LAST:event_activatebuttonMouseExited

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseEntered
        deletebutton.setBackground(bodycolor);
    }//GEN-LAST:event_deletebuttonMouseEntered

    private void deletebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseExited
         deletebutton.setBackground(navcolor);
    }//GEN-LAST:event_deletebuttonMouseExited

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
            java.util.logging.Logger.getLogger(manageCitizen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCitizen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCitizen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCitizen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCitizen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel activate;
    private javax.swing.JPanel activatebutton;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addbutton;
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel citizenName;
    private javax.swing.JTable citizenTable;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletebutton;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editbutton;
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
