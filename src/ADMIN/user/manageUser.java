
package ADMIN.user;

import ADMIN.*;
import BDR.loginForm;
import ADMIN.user.manageUser;
import config.Session;
import java.awt.Color;
import BDR.*;
import config.config;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



public class manageUser extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public manageUser() {
        initComponents();
        displayData();
    }
    
     public void displayData(){
        try{
            config conf = new config();
            // Select only necessary columns and filter for pending users for activation
            ResultSet rs = conf.getData("SELECT u_id, fname, lname, uname, account_type, status FROM users");
            // Convert ResultSet to TableModel manually
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
            model.addColumn("User ID");
            model.addColumn("First Name");
            model.addColumn("Last Name");
            model.addColumn("Username");
            model.addColumn("Account Type");
            model.addColumn("Status");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("u_id"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("uname"),
                    rs.getString("account_type"),
                    rs.getString("status")
                });
            }
            usersTable.setModel(model);
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
     }
    Color navcolor = new Color(41,50,57);  
    Color headcolor = new Color(137,207,24); 
    Color bodycolor = new Color(110,177,214);

/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        p_add = new javax.swing.JPanel();
        ADD1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        citizenName = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        p_add1 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        editbutton = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        activatebutton = new javax.swing.JPanel();
        activate = new javax.swing.JLabel();
        deletebutton = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        p_add.setBackground(new java.awt.Color(41, 50, 57));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        ADD1.setBackground(new java.awt.Color(44, 71, 35));
        ADD1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ADD1.setForeground(new java.awt.Color(255, 255, 255));
        ADD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADD1.setText("ADD");
        p_add.add(ADD1);
        ADD1.setBounds(0, 10, 160, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        p_add1.setBackground(new java.awt.Color(41, 50, 57));
        p_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add1MouseExited(evt);
            }
        });
        p_add1.setLayout(null);

        add.setBackground(new java.awt.Color(44, 71, 35));
        add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        p_add1.add(add);
        add.setBounds(40, 10, 80, 20);

        navbar.add(p_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 40));

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

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 30, -1));

        maximize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setText("—");
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        header.add(maximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 0, 30, -1));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 710, 40));

        maindesktop.setBackground(new java.awt.Color(110, 177, 214));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));
        maindesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(usersTable);

        maindesktop.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 610, 300));

        back.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/back-arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        maindesktop.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jPanel2.add(maindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 710, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_maximizeMouseClicked

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
        } 
    }//GEN-LAST:event_formWindowActivated

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        createUser cuf = new createUser();
        cuf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(bodycolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        createUser cuf = new createUser();
        cuf.setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_p_add1MouseClicked

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        p_add1.setBackground(bodycolor);
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add1MouseExited

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to edit.");
            return;
        }
        // Get user data from selected row
        int userId = (int) usersTable.getValueAt(selectedRow, 0);
        String fname = (String) usersTable.getValueAt(selectedRow, 1);
        String lname = (String) usersTable.getValueAt(selectedRow, 2);
        String uname = (String) usersTable.getValueAt(selectedRow, 3);
        String accountType = (String) usersTable.getValueAt(selectedRow, 4);
        String status = (String) usersTable.getValueAt(selectedRow, 5);

        // Open updateUser form and set fields
        updateUser updateForm = new updateUser();
        updateForm.setVisible(true);

        updateForm.uid.setText(String.valueOf(userId));
        updateForm.fname.setText(fname);
        updateForm.lname.setText(lname);
        updateForm.uname.setText(uname);
        updateForm.utype.setSelectedItem(accountType);
        updateForm.us.setSelectedItem(status);

        // We need to fetch additional fields like address, contact, email from DB for this user
        config conf = new config();
        try {
            java.sql.ResultSet rs = conf.getData("SELECT address, contact, email FROM users WHERE u_id = " + userId);
            if (rs.next()) {
                updateForm.address.setText(rs.getString("address"));
                updateForm.contact.setText(rs.getString("contact"));
                updateForm.email.setText(rs.getString("email"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user details: " + e.getMessage());
        }

        this.dispose();
    }//GEN-LAST:event_editbuttonMouseClicked

    private void editbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseEntered
        editbutton.setBackground(bodycolor);
    }//GEN-LAST:event_editbuttonMouseEntered

    private void editbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseExited
        editbutton.setBackground(navcolor);
    }//GEN-LAST:event_editbuttonMouseExited

    private void activatebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseClicked
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user.");
            return;
        }
        String status = (String) usersTable.getValueAt(selectedRow, 5); // Assuming status column index 5
        if (status == null) {
            JOptionPane.showMessageDialog(this, "Unable to determine user status.");
            return;
        }
        int userId = (int) usersTable.getValueAt(selectedRow, 0); // Assuming user ID column index 0
        config conf = new config();
        try (java.sql.Connection conn = conf.getConnection()) {
            String newStatus;
            if ("Pending".equalsIgnoreCase(status) || "Inactive".equalsIgnoreCase(status)) {
                newStatus = "Active";
            } else if ("Active".equalsIgnoreCase(status)) {
                newStatus = "Inactive";
            } else {
                JOptionPane.showMessageDialog(this, "Status change not allowed for current status: " + status);
                return;
            }
            String sql = "UPDATE users SET status = ? WHERE u_id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newStatus);
            pst.setInt(2, userId);
            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "User status updated to " + newStatus + " successfully.");
                displayData();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user status.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating user status: " + e.getMessage());
        }
    }//GEN-LAST:event_activatebuttonMouseClicked

    private void activatebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseEntered
        activatebutton.setBackground(bodycolor);
    }//GEN-LAST:event_activatebuttonMouseEntered

    private void activatebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activatebuttonMouseExited
        activatebutton.setBackground(navcolor);
    }//GEN-LAST:event_activatebuttonMouseExited

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
            return;
        }
        int userId = (int) usersTable.getValueAt(selectedRow, 0); // Assuming user ID column index 0
        config conf = new config();
        try (java.sql.Connection conn = conf.getConnection()) {
            String sql = "DELETE FROM users WHERE u_id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, userId);
            int deleted = pst.executeUpdate();
            if (deleted > 0) {
                JOptionPane.showMessageDialog(this, "User deleted successfully.");
                displayData();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete user.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error deleting user: " + e.getMessage());
        }
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseEntered
        deletebutton.setBackground(bodycolor);
    }//GEN-LAST:event_deletebuttonMouseEntered

    private void deletebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseExited
        deletebutton.setBackground(navcolor);
    }//GEN-LAST:event_deletebuttonMouseExited

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
            java.util.logging.Logger.getLogger(manageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADD1;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel activate;
    private javax.swing.JPanel activatebutton;
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel citizenName;
    private javax.swing.JLabel close;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletebutton;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editbutton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel maximize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add1;
    private javax.swing.JLabel user_name;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
