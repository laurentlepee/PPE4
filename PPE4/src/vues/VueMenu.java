/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vues;

import controleurs.*;

/**
 *
 * @author btssio
 */
public class VueMenu extends VueAbstraite {
    /**
     * Creates new form VueMenu
     */
    public VueMenu(ControleurAbstrait controleur) {
        super(controleur);

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

        jbtnVisiteur = new javax.swing.JButton();
        jbtnCompteRendu = new javax.swing.JButton();
        jbtnQuitter = new javax.swing.JButton();
        jLabelTitre = new javax.swing.JLabel();
        jButtonPraticiens = new javax.swing.JButton();
        jButtonMédicaments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnVisiteur.setText("Visiteur");
        jbtnVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVisiteurActionPerformed(evt);
            }
        });

        jbtnCompteRendu.setText("CompteRendu");
        jbtnCompteRendu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCompteRenduActionPerformed(evt);
            }
        });

        jbtnQuitter.setText("Quitter");
        jbtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuitterActionPerformed(evt);
            }
        });

        jLabelTitre.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabelTitre.setText("Gestion des comptes-rendus");

        jButtonPraticiens.setText("Praticiens");
        jButtonPraticiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPraticiensActionPerformed(evt);
            }
        });

        jButtonMédicaments.setText("Médicaments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnVisiteur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnCompteRendu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPraticiens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMédicaments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnQuitter)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabelTitre)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre)
                .addGap(18, 18, 18)
                .addComponent(jbtnVisiteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCompteRendu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPraticiens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMédicaments)
                .addGap(18, 18, 18)
                .addComponent(jbtnQuitter)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVisiteurActionPerformed
        ((CtrlMenu)controleur).choisirVisiteur();
    }//GEN-LAST:event_jbtnVisiteurActionPerformed

    private void jbtnCompteRenduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCompteRenduActionPerformed
        ((CtrlMenu)controleur).choisirCompteRendu();
    }//GEN-LAST:event_jbtnCompteRenduActionPerformed

    private void jbtnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuitterActionPerformed
        ((CtrlMenu)controleur).quitter();
    }//GEN-LAST:event_jbtnQuitterActionPerformed

    private void jButtonPraticiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPraticiensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPraticiensActionPerformed

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
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VueMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMédicaments;
    private javax.swing.JButton jButtonPraticiens;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JButton jbtnCompteRendu;
    private javax.swing.JButton jbtnQuitter;
    private javax.swing.JButton jbtnVisiteur;
    // End of variables declaration//GEN-END:variables
}