/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdrApp;

import java.awt.BasicStroke;  
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author KIAN VICTORILLO
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm1
     */
    public registrationForm() {
        initComponents();
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
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        search2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        search4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        search7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        search8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        search9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel3.setText("REGISTRATION PAGE ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 90, 240, 30);

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(137, 207, 241));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        search2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search2.setOpaque(false);
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        jPanel2.add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Last Name:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        search6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search6.setOpaque(false);
        search6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search6ActionPerformed(evt);
            }
        });
        jPanel2.add(search6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Address:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        search4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search4.setOpaque(false);
        search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search4ActionPerformed(evt);
            }
        });
        jPanel2.add(search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Contact Number:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        search5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search5.setOpaque(false);
        search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search5ActionPerformed(evt);
            }
        });
        jPanel2.add(search5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Email:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        search7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search7.setOpaque(false);
        search7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search7ActionPerformed(evt);
            }
        });
        jPanel2.add(search7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("User Name:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 30));

        search8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search8.setOpaque(false);
        search8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search8ActionPerformed(evt);
            }
        });
        jPanel2.add(search8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 180, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("User Type:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 30));

        search9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search9.setOpaque(false);
        search9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search9ActionPerformed(evt);
            }
        });
        jPanel2.add(search9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 180, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CITIZEN", "ADMIN" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Password:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        jPanel3.setBackground(new java.awt.Color(110, 177, 214));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(110, 177, 214));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTER");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 160, 60));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 120, 680, 280);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
      setState(ICONIFIED);
    }//GEN-LAST:event_maximizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      int a =JOptionPane.showConfirmDialog(null,"Confirm Exit?");
      if(a == JOptionPane.YES_OPTION){
            System.exit(0);
      }         
    }//GEN-LAST:event_closeMouseClicked

    private void search9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search9ActionPerformed

    private void search8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search8ActionPerformed

    private void search7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search7ActionPerformed

    private void search5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search5ActionPerformed

    private void search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search4ActionPerformed

    private void search6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search6ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search2ActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel maximize;
    private javax.swing.JTextField search2;
    private javax.swing.JTextField search4;
    private javax.swing.JTextField search5;
    private javax.swing.JTextField search6;
    private javax.swing.JTextField search7;
    private javax.swing.JTextField search8;
    private javax.swing.JTextField search9;
    // End of variables declaration//GEN-END:variables
}
