/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe4.vue;

/**
 *
 * @author ldesirest
 */
public class DetailsVisiteur extends javax.swing.JFrame {

    /**
     * Creates new form DetailsVisiteur
     */
    public DetailsVisiteur() {
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

        jLabelTitreVisiteur = new javax.swing.JLabel();
        jLabelCodePostalVisiteur = new javax.swing.JLabel();
        jLabelAdresseVisiteur = new javax.swing.JLabel();
        jTextFieldVilleVisiteur = new javax.swing.JTextField();
        jTextFieldCodePostalVisiteur = new javax.swing.JTextField();
        jLabelPrenomVisiteur = new javax.swing.JLabel();
        jTextFieldAdresseVisiteur = new javax.swing.JTextField();
        jLabelNomVisiteur = new javax.swing.JLabel();
        jTextFieldPrenomVisiteur = new javax.swing.JTextField();
        jButtonQuitVisiteur = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldNomVisiteur = new javax.swing.JTextField();
        jLabelVilleVisiteur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitreVisiteur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitreVisiteur.setText("Details Visiteur");

        jLabelCodePostalVisiteur.setText("Code Postal");

        jLabelAdresseVisiteur.setText("Adresse");

        jTextFieldVilleVisiteur.setText("jTextField5");

        jTextFieldCodePostalVisiteur.setText("jTextField4");

        jLabelPrenomVisiteur.setText("Prenom");

        jTextFieldAdresseVisiteur.setText("jTextField3");

        jLabelNomVisiteur.setText("Nom");

        jTextFieldPrenomVisiteur.setText("jTextField2");

        jButtonQuitVisiteur.setText("Quitter");
        jButtonQuitVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitVisiteurActionPerformed(evt);
            }
        });

        jTextFieldNomVisiteur.setText("jTextField1");
        jTextFieldNomVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomVisiteurActionPerformed(evt);
            }
        });

        jLabelVilleVisiteur.setText("Ville");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabelTitreVisiteur))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonQuitVisiteur)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCodePostalVisiteur)
                                        .addComponent(jLabelNomVisiteur, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelPrenomVisiteur, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelVilleVisiteur, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabelAdresseVisiteur))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNomVisiteur, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrenomVisiteur)
                                    .addComponent(jTextFieldAdresseVisiteur)
                                    .addComponent(jTextFieldCodePostalVisiteur)
                                    .addComponent(jTextFieldVilleVisiteur)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitreVisiteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomVisiteur)
                    .addComponent(jTextFieldNomVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenomVisiteur)
                    .addComponent(jTextFieldPrenomVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdresseVisiteur)
                    .addComponent(jTextFieldAdresseVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodePostalVisiteur)
                    .addComponent(jTextFieldCodePostalVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVilleVisiteur)
                    .addComponent(jTextFieldVilleVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonQuitVisiteur)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuitVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitVisiteurActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonQuitVisiteurActionPerformed

    private void jTextFieldNomVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomVisiteurActionPerformed

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
            java.util.logging.Logger.getLogger(DetailsVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsVisiteur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuitVisiteur;
    private javax.swing.JLabel jLabelAdresseVisiteur;
    private javax.swing.JLabel jLabelCodePostalVisiteur;
    private javax.swing.JLabel jLabelNomVisiteur;
    private javax.swing.JLabel jLabelPrenomVisiteur;
    private javax.swing.JLabel jLabelTitreVisiteur;
    private javax.swing.JLabel jLabelVilleVisiteur;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldAdresseVisiteur;
    private javax.swing.JTextField jTextFieldCodePostalVisiteur;
    private javax.swing.JTextField jTextFieldNomVisiteur;
    private javax.swing.JTextField jTextFieldPrenomVisiteur;
    private javax.swing.JTextField jTextFieldVilleVisiteur;
    // End of variables declaration//GEN-END:variables
}