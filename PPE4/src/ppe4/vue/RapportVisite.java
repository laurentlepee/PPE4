/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe4.Vue;

/**
 *
 * @author ldesirest
 */
public class RapportVisite extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public RapportVisite() {
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

        jTextFieldNumeroRapportRapport = new javax.swing.JTextField();
        jTextFieldDateRapportRapport = new javax.swing.JTextField();
        jTextFieldMotifVisiteRapport = new javax.swing.JTextField();
        jComboBoxPraticienRapport = new javax.swing.JComboBox();
        jButtonDetailsPraticienRapport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBilanRapport = new javax.swing.JTextArea();
        jLabelTitreRapport = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPraticienRapport = new javax.swing.JLabel();
        jLabelNumeroRapportRapport = new javax.swing.JLabel();
        jLabelDateRapportRapport = new javax.swing.JLabel();
        jLabelMotifVisiteRapport = new javax.swing.JLabel();
        jLabelBilanRapport = new javax.swing.JLabel();
        jLabelOffreRapport = new javax.swing.JLabel();
        jComboBoxMedicamentRapport = new javax.swing.JComboBox();
        jLabelMedicamentRapport = new javax.swing.JLabel();
        jLabelEchantillonRapport = new javax.swing.JLabel();
        jTextFieldEchantillonRapport = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonQuitRapport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNumeroRapportRapport.setText("jTextField1");

        jTextFieldDateRapportRapport.setText("jTextField2");

        jTextFieldMotifVisiteRapport.setText("jTextField3");
        jTextFieldMotifVisiteRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotifVisiteRapportActionPerformed(evt);
            }
        });

        jComboBoxPraticienRapport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonDetailsPraticienRapport.setText("Détails");

        jTextAreaBilanRapport.setColumns(20);
        jTextAreaBilanRapport.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBilanRapport);

        jLabelTitreRapport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTitreRapport.setText("Rapport de visite");

        jLabelPraticienRapport.setText("Praticien");

        jLabelNumeroRapportRapport.setText("Numero Rapport");

        jLabelDateRapportRapport.setText("Date Rapport");

        jLabelMotifVisiteRapport.setText("Motif Visite");

        jLabelBilanRapport.setText("BILAN");

        jLabelOffreRapport.setText("Offre d'échantillon");

        jComboBoxMedicamentRapport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelMedicamentRapport.setText("Médicament");

        jLabelEchantillonRapport.setText("Nb. Echantillons");

        jTextFieldEchantillonRapport.setText("jTextField4");

        jButtonQuitRapport.setText("Quitter");
        jButtonQuitRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitRapportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonQuitRapport)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumeroRapportRapport)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPraticienRapport, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelDateRapportRapport, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelMotifVisiteRapport, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelBilanRapport, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumeroRapportRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDateRapportRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMotifVisiteRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBoxPraticienRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonDetailsPraticienRapport)
                                            .addGap(24, 24, 24)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelOffreRapport)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jComboBoxMedicamentRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldEchantillonRapport))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelMedicamentRapport)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelEchantillonRapport))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabelTitreRapport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTitreRapport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroRapportRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroRapportRapport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDetailsPraticienRapport)
                        .addComponent(jComboBoxPraticienRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPraticienRapport))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDateRapportRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateRapportRapport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMotifVisiteRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMotifVisiteRapport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBilanRapport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedicamentRapport)
                    .addComponent(jLabelEchantillonRapport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEchantillonRapport, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxMedicamentRapport, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelOffreRapport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonQuitRapport)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMotifVisiteRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotifVisiteRapportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotifVisiteRapportActionPerformed

    private void jButtonQuitRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitRapportActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButtonQuitRapportActionPerformed

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
            java.util.logging.Logger.getLogger(RapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RapportVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RapportVisite().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetailsPraticienRapport;
    private javax.swing.JButton jButtonQuitRapport;
    private javax.swing.JComboBox jComboBoxMedicamentRapport;
    private javax.swing.JComboBox jComboBoxPraticienRapport;
    private javax.swing.JLabel jLabelBilanRapport;
    private javax.swing.JLabel jLabelDateRapportRapport;
    private javax.swing.JLabel jLabelEchantillonRapport;
    private javax.swing.JLabel jLabelMedicamentRapport;
    private javax.swing.JLabel jLabelMotifVisiteRapport;
    private javax.swing.JLabel jLabelNumeroRapportRapport;
    private javax.swing.JLabel jLabelOffreRapport;
    private javax.swing.JLabel jLabelPraticienRapport;
    private javax.swing.JLabel jLabelTitreRapport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaBilanRapport;
    private javax.swing.JTextField jTextFieldDateRapportRapport;
    private javax.swing.JTextField jTextFieldEchantillonRapport;
    private javax.swing.JTextField jTextFieldMotifVisiteRapport;
    private javax.swing.JTextField jTextFieldNumeroRapportRapport;
    // End of variables declaration//GEN-END:variables
}
