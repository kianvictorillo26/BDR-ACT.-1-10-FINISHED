
package BDR;

import ADMIN.adminDashBoard;
import BDR.registrationForm;
import BDR.forgotpassword;
import CITIZEN.citizenDashBoard;
import config.Session;
import config.config;
import config.passwordHasher;
import config.logger;
import java.awt.BasicStroke;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author KIAN VICTORILLO
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm1
     */
    public loginForm() {
        initComponents();
    }
    static String status;
    static String type;
    


public static boolean logAcc(String username, String password) {
    config conf = new config();
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet resultSet = null;
    
    try {
        connection = conf.getConnection();
        String query = "SELECT U_Id, fname, lname, address, account_type, email, uname, pname, status, contact FROM users WHERE uname = ?";
        pstmt = connection.prepareStatement(query);
        pstmt.setString(1, username.trim());
        
        resultSet = pstmt.executeQuery();

        if (resultSet.next()) {
            String hashedPass = resultSet.getString("pname");
            String rehashedPass = passwordHasher.hashPassword(password);

            System.out.println("DEBUG - Stored hash: " + hashedPass);
            System.out.println("DEBUG - Computed hash: " + rehashedPass);
            
            if (hashedPass != null && hashedPass.equals(rehashedPass)) {
                // Set session data
                Session sess = Session.getInstance();
                sess.setUid(resultSet.getInt("U_Id"));
                sess.setFname(resultSet.getString("fname"));
                sess.setLname(resultSet.getString("lname"));
                sess.setAddress(resultSet.getString("address"));
                sess.setAccount_type(resultSet.getString("account_type"));
                sess.setEmail(resultSet.getString("email"));
                sess.setContact(resultSet.getString("contact"));
                sess.setUname(resultSet.getString("uname"));
                sess.setStatus(resultSet.getString("status"));
                sess.setUserType(resultSet.getString("account_type")); // Added this line
                
                // Check citizen status if user is citizen
                if ("citizen".equalsIgnoreCase(sess.getAccount_type())) {
                    String citizenStatus = null;
                    try {
                        java.sql.Connection conn = new config().getConnection();
                        java.sql.PreparedStatement pst = conn.prepareStatement("SELECT status FROM citizens WHERE U_Id = ?");
                        pst.setInt(1, sess.getUid());
                        java.sql.ResultSet rs = pst.executeQuery();
                        if (rs.next()) {
                            citizenStatus = rs.getString("status");
                        }
                        rs.close();
                        pst.close();
                        conn.close();
                    } catch (Exception e) {
                        // Log or handle exception if needed
                    }
                    if ("Pending".equalsIgnoreCase(citizenStatus)) {
                        // If citizen status is pending, do not allow to proceed to citizenDashBoard
                        JOptionPane.showMessageDialog(null, "Your citizen registration is still pending approval. You will be redirected to the user dashboard.", "Pending Approval", JOptionPane.INFORMATION_MESSAGE);
                        sess.setAccount_type("user"); // Downgrade to user to redirect to userDashboardRevise
                    }
                }
                
                // Log user login
                logger.logToDatabase(sess.getUid(), "User logged in");
                logger.info("User logged in: " + sess.getUid());
                
                // Do not close connection here; let caller manage connection lifecycle
                
                return true;
            } else {
                System.out.println("DEBUG - Password mismatch");
                JOptionPane.showMessageDialog(null, "Invalid credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            System.out.println("DEBUG - User not found");
            JOptionPane.showMessageDialog(null, "User not found", "Login Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "System Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "System error: " + ex.getMessage(), "System Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (pstmt != null) pstmt.close();
            // Removed closing connection here to avoid premature close
            // if (connection != null) conf.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
Color navcolor = new Color(41,50,57);  
    Color headcolor = new Color(137,207,24); 
    Color bodycolor = new Color(110,177,214);
    Color hover = new Color(110,177,214);
    Color deffbutton = new Color(137,207,241);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
    panel.setBackground(hover);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.0f)));
}
    void buttonDefaultColor(JPanel panel){
    panel.setBackground(deffbutton);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userPass = new javax.swing.JPasswordField();
        cancel = new javax.swing.JPanel();
        signinButton = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        showpass = new javax.swing.JCheckBox();
        logIn = new javax.swing.JPanel();
        signinButton1 = new javax.swing.JLabel();
        creatAccount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BRGY.DOCUMENT REQUEST");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 50, 57), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 30, 590, 60);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LOGIN PAGE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 90, 140, 30);

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BARANGGAY DOCUMENT REQUEST");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 280, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Management System");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        userName.setBackground(new java.awt.Color(137, 207, 241));
        userName.setForeground(new java.awt.Color(0, 0, 0));
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 220, 50));

        userPass.setBackground(new java.awt.Color(137, 207, 241));
        userPass.setForeground(new java.awt.Color(0, 0, 0));
        userPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userPass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        userPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassActionPerformed(evt);
            }
        });
        jPanel2.add(userPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 220, 50));

        cancel.setBackground(new java.awt.Color(137, 207, 241));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton.setBackground(new java.awt.Color(137, 207, 241));
        signinButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton.setForeground(new java.awt.Color(0, 0, 0));
        signinButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton.setText("CANCEL");
        signinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButtonMouseExited(evt);
            }
        });
        cancel.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, 70, -1));

        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 40));

        jPanel9.setBackground(new java.awt.Color(137, 207, 241));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 20));

        showpass.setBackground(new java.awt.Color(137, 207, 241));
        showpass.setForeground(new java.awt.Color(0, 0, 0));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 173, -1, 30));

        logIn.setBackground(new java.awt.Color(137, 207, 241));
        logIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInMouseExited(evt);
            }
        });
        logIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton1.setBackground(new java.awt.Color(137, 207, 241));
        signinButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton1.setForeground(new java.awt.Color(0, 0, 0));
        signinButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton1.setText("LOG IN");
        signinButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton1MouseExited(evt);
            }
        });
        logIn.add(signinButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, -1));

        jPanel2.add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 40));

        creatAccount.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        creatAccount.setForeground(new java.awt.Color(0, 0, 0));
        creatAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creatAccount.setText("New User? Click Here to Register.");
        creatAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creatAccountMouseClicked(evt);
            }
        });
        jPanel2.add(creatAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fogot Password");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 120, 310, 280);

        jPanel3.setBackground(new java.awt.Color(137, 207, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/bdrLogo.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 280));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 120, 340, 280);

        maximize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setText("—");
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        jPanel1.add(maximize);
        maximize.setBounds(690, 10, 30, 22);

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(724, 10, 30, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void userPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassActionPerformed

    private void signinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseClicked

    }//GEN-LAST:event_signinButtonMouseClicked

    private void signinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseEntered

    }//GEN-LAST:event_signinButtonMouseEntered

    private void signinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseExited
      
    }//GEN-LAST:event_signinButtonMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
                userPass.setEchoChar((char)0);
            }else{
                userPass.setEchoChar('*');
            }
    }//GEN-LAST:event_showpassActionPerformed

    private void signinButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseClicked

    private void signinButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseEntered

    private void signinButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseExited

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
String user = userName.getText();
String pass = new String(userPass.getPassword());

if (user.isEmpty() || pass.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please fill all fields");
} else {
    if (logAcc(user, pass)) {
        Session sess = Session.getInstance();
        String status = sess.getStatus();
        String userType = sess.getAccount_type(); // Changed to getAccount_type()
        
        // Only allow "Active" status to log in
        if (!"Active".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(null, "Account not active. Contact admin.");
        } else {
            JOptionPane.showMessageDialog(null, "Login successful");
            
            if ("admin".equalsIgnoreCase(userType)) {
                new adminDashBoard().setVisible(true);
            } else if ("citizen".equalsIgnoreCase(userType)) {
                new CITIZEN.citizenDashBoard().setVisible(true);
            } else {
                new USER.userDashboardRevise().setVisible(true);
            }
            this.dispose();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid credentials");
    }
}
   
    }//GEN-LAST:event_logInMouseClicked

    private void logInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseEntered
        buttonBorderAnimation(logIn);
    }//GEN-LAST:event_logInMouseEntered

    private void logInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseExited
        buttonDefaultColor(logIn);
    }//GEN-LAST:event_logInMouseExited

    private void creatAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creatAccountMouseClicked
        registrationForm rf = new registrationForm();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_creatAccountMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
      setState(ICONIFIED);
    }//GEN-LAST:event_maximizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      int a =JOptionPane.showConfirmDialog(null,"Confirm Exit?");
      if(a == JOptionPane.YES_OPTION){
            System.exit(0);
      }         
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new forgotpassword().setVisible(true);this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel creatAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel logIn;
    private javax.swing.JLabel maximize;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JLabel signinButton;
    private javax.swing.JLabel signinButton1;
    private javax.swing.JTextField userName;
    private javax.swing.JPasswordField userPass;
    // End of variables declaration//GEN-END:variables
}
