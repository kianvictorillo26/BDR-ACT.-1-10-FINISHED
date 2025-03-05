/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;


import Config.config;
import bdrApp.CitizenForm;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KIAN VICTORILLO
 */
public class userPage extends javax.swing.JInternalFrame {

    public userPage() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    public void displayData(){
        try{
            config conf = new config();
            ResultSet rs = conf.getData("SELECT * FROM users");
            table_users.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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
    
    search.setOpaque(false);
    search.setBackground(new Color(0,0,0,0));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JPanel();
        signinButton = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        signinButton1 = new javax.swing.JLabel();
        cancel2 = new javax.swing.JPanel();
        signinButton2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        signinButton4 = new javax.swing.JLabel();
        cancel5 = new javax.swing.JPanel();
        signinButton5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        Search = new javax.swing.JPanel();
        signinButton3 = new javax.swing.JLabel();
        cancel3 = new javax.swing.JPanel();
        signinButton6 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(41, 50, 57));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Citizens");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(137, 207, 241));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton.setBackground(new java.awt.Color(137, 207, 241));
        signinButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton.setText("ADD");
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
        add.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        delete.setBackground(new java.awt.Color(137, 207, 241));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton1.setBackground(new java.awt.Color(137, 207, 241));
        signinButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton1.setText("DELETE");
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
        delete.add(signinButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, -1));

        cancel2.setBackground(new java.awt.Color(137, 207, 241));
        cancel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel2MouseExited(evt);
            }
        });
        cancel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton2.setBackground(new java.awt.Color(137, 207, 241));
        signinButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton2.setText("ADD");
        signinButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton2MouseExited(evt);
            }
        });
        cancel2.add(signinButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        delete.add(cancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 40));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 120, 40));

        edit.setBackground(new java.awt.Color(137, 207, 241));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton4.setBackground(new java.awt.Color(137, 207, 241));
        signinButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton4.setText("EDIT");
        signinButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton4MouseExited(evt);
            }
        });
        edit.add(signinButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, -1));

        cancel5.setBackground(new java.awt.Color(137, 207, 241));
        cancel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel5MouseExited(evt);
            }
        });
        cancel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton5.setBackground(new java.awt.Color(137, 207, 241));
        signinButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton5.setText("ADD");
        signinButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton5MouseExited(evt);
            }
        });
        cancel5.add(signinButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        edit.add(cancel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 40));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 40));

        search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setOpaque(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, 30));

        table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_users);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 680, 270));

        Search.setBackground(new java.awt.Color(137, 207, 241));
        Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
        });
        Search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton3.setBackground(new java.awt.Color(137, 207, 241));
        signinButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton3.setText("Search");
        signinButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton3MouseExited(evt);
            }
        });
        Search.add(signinButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        cancel3.setBackground(new java.awt.Color(137, 207, 241));
        cancel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel3MouseExited(evt);
            }
        });
        cancel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton6.setBackground(new java.awt.Color(137, 207, 241));
        signinButton6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        signinButton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinButton6.setText("ADD");
        signinButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButton6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButton6MouseExited(evt);
            }
        });
        cancel3.add(signinButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        Search.add(cancel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 40));

        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseClicked

    }//GEN-LAST:event_signinButtonMouseClicked

    private void signinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseEntered

    }//GEN-LAST:event_signinButtonMouseEntered

    private void signinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseExited

    }//GEN-LAST:event_signinButtonMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      JFrame mainFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        CitizenForm cs = new CitizenForm();
        cs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        buttonBorderAnimation(add);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        buttonDefaultColor(add);
    }//GEN-LAST:event_addMouseExited

    private void signinButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseClicked

    private void signinButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseEntered

    private void signinButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton1MouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
         buttonBorderAnimation(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        buttonDefaultColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void signinButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton2MouseClicked

    private void signinButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton2MouseEntered

    private void signinButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton2MouseExited

    private void cancel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel2MouseClicked

    private void cancel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel2MouseEntered

    private void cancel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel2MouseExited

    private void signinButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton4MouseClicked

    private void signinButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton4MouseEntered

    private void signinButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton4MouseExited

    private void signinButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton5MouseClicked

    private void signinButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton5MouseEntered

    private void signinButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton5MouseExited

    private void cancel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel5MouseClicked

    private void cancel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel5MouseEntered

    private void cancel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel5MouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        buttonBorderAnimation(edit);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        buttonDefaultColor(edit);
    }//GEN-LAST:event_editMouseExited

    private void signinButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton3MouseClicked

    private void signinButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton3MouseEntered

    private void signinButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton3MouseExited

    private void signinButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton6MouseClicked

    private void signinButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton6MouseEntered

    private void signinButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButton6MouseExited

    private void cancel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel3MouseClicked

    private void cancel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel3MouseEntered

    private void cancel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel3MouseExited

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMouseClicked

    private void SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseEntered
         buttonBorderAnimation(Search);
    }//GEN-LAST:event_SearchMouseEntered

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
         buttonDefaultColor(Search);
    }//GEN-LAST:event_SearchMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Search;
    private javax.swing.JPanel add;
    private javax.swing.JPanel cancel2;
    private javax.swing.JPanel cancel3;
    private javax.swing.JPanel cancel5;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    private javax.swing.JLabel signinButton;
    private javax.swing.JLabel signinButton1;
    private javax.swing.JLabel signinButton2;
    private javax.swing.JLabel signinButton3;
    private javax.swing.JLabel signinButton4;
    private javax.swing.JLabel signinButton5;
    private javax.swing.JLabel signinButton6;
    private javax.swing.JTable table_users;
    // End of variables declaration//GEN-END:variables
}
