/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CERTIFICATES;


public class clearance extends javax.swing.JFrame {

    /**
     * Creates new form clearance
     */
    public clearance() {
        initComponents();
    }

    // Setter methods to set label texts dynamically
    public void setName(String text) {
        name.setText(text);
    }

    public void setAge(String text) {
        age.setText(text);
    }

    public void setDateIssued(String text) {
        dateissued.setText(text);
    }

    public void setBrgyCaptani(String text) {
        brgycaptani.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearancepanel = new javax.swing.JPanel();
        age = new javax.swing.JLabel();
        brgycaptani = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        dateissued = new javax.swing.JLabel();
        clearanceimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearancepanel.setBackground(new java.awt.Color(255, 255, 255));
        clearancepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        age.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        age.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        age.setText("age");
        clearancepanel.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 30, 20));

        brgycaptani.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        brgycaptani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brgycaptani.setText("Baranggay Captain");
        clearancepanel.add(brgycaptani, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 170, 20));

        name.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("name");
        clearancepanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 90, 20));

        dateissued.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        dateissued.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateissued.setText("date");
        clearancepanel.add(dateissued, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 140, 20));

        clearanceimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CERTIFICATES/clearance.png"))); // NOI18N
        clearancepanel.add(clearanceimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        getContentPane().add(clearancepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 1060));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(clearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clearance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel brgycaptani;
    private javax.swing.JLabel clearanceimage;
    public javax.swing.JPanel clearancepanel;
    private javax.swing.JLabel dateissued;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
