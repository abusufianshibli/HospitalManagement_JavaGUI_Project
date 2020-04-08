/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sheble Redwan
 */
public class RegesterFrom extends javax.swing.JFrame {

    /**
     * Creates new form RegesterFrom
     */
    public RegesterFrom() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorinfo = new javax.swing.JButton();
        patientinfo = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));

        doctorinfo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        doctorinfo.setText("Doctor Information");
        doctorinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorinfoActionPerformed(evt);
            }
        });

        patientinfo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        patientinfo.setText("Patient Information");
        patientinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientinfoActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheble Redwan\\Desktop\\project image\\medical-icons-collection_1172-48.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(doctorinfo)
                .addGap(170, 170, 170)
                .addComponent(patientinfo))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(doctorinfo))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(patientinfo))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorinfoActionPerformed
        Dinfo di=new Dinfo();
        di.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_doctorinfoActionPerformed

    private void patientinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientinfoActionPerformed
        DoctorPanel dp=new DoctorPanel();
        dp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_patientinfoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
HomePage hp=new HomePage();
hp.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(RegesterFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegesterFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegesterFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegesterFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegesterFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton doctorinfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton patientinfo;
    // End of variables declaration//GEN-END:variables
}
