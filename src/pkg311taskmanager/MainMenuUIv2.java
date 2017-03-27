/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

/**
 *
 * @author Luke
 */
public class MainMenuUIv2 extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuUIv2
     */
    
    private NavigationCntl parentNavCntl = null;
    
    public MainMenuUIv2() {
        initComponents();
    }
    
    public MainMenuUIv2(NavigationCntl newParentNavCntl) {
        parentNavCntl = newParentNavCntl;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        taskButton = new javax.swing.JButton();
        calendarButton = new javax.swing.JButton();
        contactButton1 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transparent_text_effect (1).png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(10, 20, 470, 103);

        closeButton.setBackground(new java.awt.Color(153, 153, 153));
        closeButton.setFont(new java.awt.Font("Century Schoolbook", 0, 10)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton);
        closeButton.setBounds(10, 260, 60, 21);

        taskButton.setBackground(new java.awt.Color(153, 153, 153));
        taskButton.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        taskButton.setText("Task");
        taskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskButtonActionPerformed(evt);
            }
        });
        jPanel1.add(taskButton);
        taskButton.setBounds(200, 150, 90, 29);

        calendarButton.setBackground(new java.awt.Color(153, 153, 153));
        calendarButton.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        calendarButton.setText("Calendar");
        calendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(calendarButton);
        calendarButton.setBounds(200, 250, 90, 25);

        contactButton1.setBackground(new java.awt.Color(153, 153, 153));
        contactButton1.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        contactButton1.setText("Contact");
        contactButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(contactButton1);
        contactButton1.setBounds(200, 200, 90, 29);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        jPanel1.add(BackGround);
        BackGround.setBounds(0, 0, 490, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarButtonActionPerformed

    private void taskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskButtonActionPerformed
        MainMenuUIv2.this.parentNavCntl.requestTaskCntl();
    }//GEN-LAST:event_taskButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void contactButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuUIv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUIv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUIv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUIv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUIv2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton calendarButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton contactButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton taskButton;
    // End of variables declaration//GEN-END:variables
}