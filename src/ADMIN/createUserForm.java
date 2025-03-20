/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import BDR.loginForm;
import static BDR.registrationForm.emails;
import static BDR.registrationForm.usernames;
import Config.config;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KIAN VICTORILLO
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
        
        
    } public boolean duplicateChecker(){
        config conf = new config();
        try{
            String query = "SELECT * FROM users WHERE uname = '"+uname.getText()+"' OR email = '"+email.getText()+"'";
            ResultSet resultSet = conf.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("email");
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    email.setText(null);
                }
                usernames = resultSet.getString("uname");
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    uname.setText(null);
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ADD = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ui = new javax.swing.JTextField();
        UPDATE = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DELETE = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CLEAR = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CANCEL = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        REFRESH = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(137, 207, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.setOpaque(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Last Name:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        lname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Address:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        address.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        address.setOpaque(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 180, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Contact Number:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        contact.setOpaque(false);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Email:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.setOpaque(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("User Name:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        uname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        uname.setOpaque(false);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Password:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        pname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pname.setOpaque(false);
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel2.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 30));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel2.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 180, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("User Type:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 30));

        ADD.setBackground(new java.awt.Color(110, 177, 214));
        ADD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(110, 177, 214));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ADDLayout = new javax.swing.GroupLayout(ADD);
        ADD.setLayout(ADDLayout);
        ADDLayout.setHorizontalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ADDLayout.setVerticalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2))
        );

        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 160, 60));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CITIZEN", "ADMIN" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel2.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Account Status:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("User ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));

        ui.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ui.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ui.setOpaque(false);
        ui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiActionPerformed(evt);
            }
        });
        jPanel2.add(ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 180, 30));

        UPDATE.setBackground(new java.awt.Color(110, 177, 214));
        UPDATE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UPDATE.setEnabled(false);

        jLabel3.setBackground(new java.awt.Color(110, 177, 214));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("UPDATE");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UPDATELayout = new javax.swing.GroupLayout(UPDATE);
        UPDATE.setLayout(UPDATELayout);
        UPDATELayout.setHorizontalGroup(
            UPDATELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UPDATELayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        UPDATELayout.setVerticalGroup(
            UPDATELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, 60));

        DELETE.setBackground(new java.awt.Color(110, 177, 214));
        DELETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(110, 177, 214));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DELETE");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DELETELayout = new javax.swing.GroupLayout(DELETE);
        DELETE.setLayout(DELETELayout);
        DELETELayout.setHorizontalGroup(
            DELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DELETELayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DELETELayout.setVerticalGroup(
            DELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DELETELayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 60));

        CLEAR.setBackground(new java.awt.Color(110, 177, 214));
        CLEAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(110, 177, 214));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CLEAR");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CLEARLayout = new javax.swing.GroupLayout(CLEAR);
        CLEAR.setLayout(CLEARLayout);
        CLEARLayout.setHorizontalGroup(
            CLEARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLEARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CLEARLayout.setVerticalGroup(
            CLEARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLEARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, 60));

        CANCEL.setBackground(new java.awt.Color(110, 177, 214));
        CANCEL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setBackground(new java.awt.Color(110, 177, 214));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CANCEL");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CANCELLayout = new javax.swing.GroupLayout(CANCEL);
        CANCEL.setLayout(CANCELLayout);
        CANCELLayout.setHorizontalGroup(
            CANCELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CANCELLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CANCELLayout.setVerticalGroup(
            CANCELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CANCELLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        REFRESH.setBackground(new java.awt.Color(110, 177, 214));
        REFRESH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setBackground(new java.awt.Color(110, 177, 214));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("REFRESH");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout REFRESHLayout = new javax.swing.GroupLayout(REFRESH);
        REFRESH.setLayout(REFRESHLayout);
        REFRESHLayout.setHorizontalGroup(
            REFRESHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, REFRESHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        REFRESHLayout.setVerticalGroup(
            REFRESHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, REFRESHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(REFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 30, 520, 480);

        maximize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setText("—");
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        jPanel1.add(maximize);
        maximize.setBounds(520, 0, 30, 22);

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(550, 0, 30, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if(fname.getText().isEmpty()
            || lname.getText().isEmpty()
            || email.getText().isEmpty()
            || uname.getText().isEmpty()
            || pname.getText().isEmpty()
            || contact.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Required!");
        }else if(pname.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password Must be longer than 8!");
        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist!");
        }else{
            config conf = new config();
            if(conf.insertData("INSERT INTO users (fname, lname, address, account_type, email, uname, pname, contact, status) "
                + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+address.getText()+"'"
                + ", '"+us.getSelectedItem()+"', '"+email.getText()+"', '"+uname.getText()+"'"
                + ", '"+pname.getText()+"', '"+contact.getText()+"','"+us.getSelectedItem()+"')")==1)
            {
                JOptionPane.showMessageDialog(null, "Registered Successfully!");
                userPage up = new userPage();
                up.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Connection Error!!");
            
        }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_maximizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a =JOptionPane.showConfirmDialog(null,"Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            loginForm lf = new loginForm();
            lf.setVisible(true);
        }

    }//GEN-LAST:event_closeMouseClicked

    private void uiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDMouseClicked

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADD;
    private javax.swing.JPanel CANCEL;
    private javax.swing.JPanel CLEAR;
    private javax.swing.JPanel DELETE;
    private javax.swing.JPanel REFRESH;
    private javax.swing.JPanel UPDATE;
    public javax.swing.JTextField address;
    private javax.swing.JLabel close;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    private javax.swing.JLabel maximize;
    public javax.swing.JTextField pname;
    public javax.swing.JTextField ui;
    public javax.swing.JTextField uname;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
