
package ADMIN;


import BDR.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;




public class settingspage extends javax.swing.JInternalFrame {

    public settingspage() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    Color navcolor = new Color(41,50,57);  
    Color headcolor = new Color(227,236,237); 
    Color bodycolor = new Color(110,177,214);
    Color kolor = new Color(240,240,240);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        accountname = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        managerUser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        reports = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editProfile = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ADDRESS: WARD 4, MINGLANILLA ,CEBU ");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 150, 270, 20);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ACCOUNT SETTINGS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 230, 40);

        accountname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        accountname.setForeground(new java.awt.Color(255, 255, 255));
        accountname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountname.setText("ACCOUNT NAME: KIANVICTORILLO");
        accountname.setToolTipText("");
        jPanel1.add(accountname);
        accountname.setBounds(20, 60, 250, 20);

        position.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        position.setForeground(new java.awt.Color(255, 255, 255));
        position.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        position.setText("POSITION: ADMINISTRATOR");
        position.setToolTipText("");
        jPanel1.add(position);
        position.setBounds(20, 80, 250, 20);

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email.setText("EMAIL: kianvictorillo@gmail.com");
        email.setToolTipText("");
        jPanel1.add(email);
        email.setBounds(20, 100, 250, 20);

        managerUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managerUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managerUserMouseExited(evt);
            }
        });
        managerUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/edit-user 100.png"))); // NOI18N
        managerUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 50, 57));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerUser.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        fullname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullname.setText("Kian Victorillo");
        managerUser.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        jPanel1.add(managerUser);
        managerUser.setBounds(350, 10, 160, 150);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 190));

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(null);

        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/graph-report-96.png"))); // NOI18N
        reports.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reports");
        reports.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        jPanel2.add(reports);
        reports.setBounds(270, 10, 160, 150);

        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });
        logOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/legit-logout100.png"))); // NOI18N
        logOut.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log Out");
        logOut.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        jPanel2.add(logOut);
        logOut.setBounds(480, 10, 160, 150);

        editProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editProfileMouseExited(evt);
            }
        });
        editProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_Folder/edit-user 100.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        editProfile.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 110));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Edit Profile");
        editProfile.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, -1));

        jPanel2.add(editProfile);
        editProfile.setBounds(50, 10, 160, 150);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 189, 740, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managerUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerUserMouseEntered
     
    }//GEN-LAST:event_managerUserMouseEntered

    private void managerUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerUserMouseExited
     
    }//GEN-LAST:event_managerUserMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
      reports.setBackground(bodycolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(kolor);
    }//GEN-LAST:event_reportsMouseExited

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
       logOut.setBackground(bodycolor);
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
       logOut.setBackground(kolor);
    }//GEN-LAST:event_logOutMouseExited

    private void editProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseEntered
         editProfile.setBackground(bodycolor);
    }//GEN-LAST:event_editProfileMouseEntered

    private void editProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseExited
         editProfile.setBackground(kolor);
    }//GEN-LAST:event_editProfileMouseExited

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        JFrame mainFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        loginForm lf = new loginForm();
        lf.setVisible(true);
    }//GEN-LAST:event_logOutMouseClicked

    private void editProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseClicked
        new adminDetails().setVisible(true);this.dispose();
    }//GEN-LAST:event_editProfileMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
         new adminDetails().setVisible(true);this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountname;
    private javax.swing.JPanel editProfile;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel logOut;
    private javax.swing.JPanel managerUser;
    private javax.swing.JLabel position;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
