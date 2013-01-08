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
public class VueMédicaments extends VueAbstraite {

    /**
     * Creates new form VueMédicaments
     */
    public VueMédicaments(ControleurAbstrait controleur) {
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

        jLabelTitreMédicaments = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCodeMédicaments = new javax.swing.JLabel();
        jLabelNomMédicaments = new javax.swing.JLabel();
        jLabelFamilleMédicaments = new javax.swing.JLabel();
        jLabelCompositionMédicaments = new javax.swing.JLabel();
        jLabelEffetsMédicaments = new javax.swing.JLabel();
        jTextFieldNomMédicaments = new javax.swing.JTextField();
        jTextFieldCodeMédicaments = new javax.swing.JTextField();
        jTextFieldFamilleMédicaments = new javax.swing.JTextField();
        jTextFieldCompositionMédicaments = new javax.swing.JTextField();
        jLabelContreMédicaments = new javax.swing.JLabel();
        jLabelPrixMédicaments = new javax.swing.JLabel();
        jbtnQuitMédicaments = new javax.swing.JButton();
        jButtonSuivantMédicaments = new javax.swing.JButton();
        jButtonPrécédentMédicaments = new javax.swing.JButton();
        jScrollPaneEffetsMédicaments = new javax.swing.JScrollPane();
        jTextAreaEffetsMédicaments = new javax.swing.JTextArea();
        jScrollPaneContreMédicaments = new javax.swing.JScrollPane();
        jTextAreaContreMédicaments = new javax.swing.JTextArea();
        jTextFieldPrixMédicaments = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitreMédicaments.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabelTitreMédicaments.setText("Médicaments");

        jLabelCodeMédicaments.setText("Code");

        jLabelNomMédicaments.setText("Nom commercial");

        jLabelFamilleMédicaments.setText("Famille");

        jLabelCompositionMédicaments.setText("Composition");

        jLabelEffetsMédicaments.setText("Effets indésirable");

        jTextFieldNomMédicaments.setText("jTextField1");

        jTextFieldCodeMédicaments.setText("jTextField2");

        jTextFieldFamilleMédicaments.setText("jTextField3");

        jTextFieldCompositionMédicaments.setText("jTextField4");

        jLabelContreMédicaments.setText("Contre indication");

        jLabelPrixMédicaments.setText("Prix echantillon");

        jbtnQuitMédicaments.setText("Retour");
        jbtnQuitMédicaments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuitMédicamentsActionPerformed(evt);
            }
        });

        jButtonSuivantMédicaments.setText("Suivant");

        jButtonPrécédentMédicaments.setText("Précédent");

        jTextAreaEffetsMédicaments.setColumns(20);
        jTextAreaEffetsMédicaments.setRows(5);
        jScrollPaneEffetsMédicaments.setViewportView(jTextAreaEffetsMédicaments);

        jTextAreaContreMédicaments.setColumns(20);
        jTextAreaContreMédicaments.setRows(5);
        jScrollPaneContreMédicaments.setViewportView(jTextAreaContreMédicaments);

        jTextFieldPrixMédicaments.setText("jTextField5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonPrécédentMédicaments)
                .addGap(18, 18, 18)
                .addComponent(jButtonSuivantMédicaments)
                .addGap(18, 18, 18)
                .addComponent(jbtnQuitMédicaments)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabelTitreMédicaments)
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCodeMédicaments)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNomMédicaments)
                                .addComponent(jLabelFamilleMédicaments)
                                .addComponent(jLabelCompositionMédicaments)
                                .addComponent(jLabelEffetsMédicaments)
                                .addComponent(jLabelContreMédicaments, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelPrixMédicaments))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPrixMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldCodeMédicaments)
                            .addComponent(jTextFieldNomMédicaments)
                            .addComponent(jTextFieldFamilleMédicaments)
                            .addComponent(jTextFieldCompositionMédicaments)
                            .addComponent(jScrollPaneEffetsMédicaments, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPaneContreMédicaments))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitreMédicaments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodeMédicaments)
                    .addComponent(jTextFieldCodeMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomMédicaments)
                    .addComponent(jTextFieldNomMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFamilleMédicaments)
                    .addComponent(jTextFieldFamilleMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompositionMédicaments)
                    .addComponent(jTextFieldCompositionMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneEffetsMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEffetsMédicaments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneContreMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContreMédicaments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrixMédicaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrixMédicaments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnQuitMédicaments)
                    .addComponent(jButtonSuivantMédicaments)
                    .addComponent(jButtonPrécédentMédicaments)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnQuitMédicamentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuitMédicamentsActionPerformed
        controleur.retourner();
    }//GEN-LAST:event_jbtnQuitMédicamentsActionPerformed

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
            java.util.logging.Logger.getLogger(VueMédicaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueMédicaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueMédicaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueMédicaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VueMédicaments().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrécédentMédicaments;
    private javax.swing.JButton jButtonSuivantMédicaments;
    private javax.swing.JLabel jLabelCodeMédicaments;
    private javax.swing.JLabel jLabelCompositionMédicaments;
    private javax.swing.JLabel jLabelContreMédicaments;
    private javax.swing.JLabel jLabelEffetsMédicaments;
    private javax.swing.JLabel jLabelFamilleMédicaments;
    private javax.swing.JLabel jLabelNomMédicaments;
    private javax.swing.JLabel jLabelPrixMédicaments;
    private javax.swing.JLabel jLabelTitreMédicaments;
    private javax.swing.JScrollPane jScrollPaneContreMédicaments;
    private javax.swing.JScrollPane jScrollPaneEffetsMédicaments;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaContreMédicaments;
    private javax.swing.JTextArea jTextAreaEffetsMédicaments;
    private javax.swing.JTextField jTextFieldCodeMédicaments;
    private javax.swing.JTextField jTextFieldCompositionMédicaments;
    private javax.swing.JTextField jTextFieldFamilleMédicaments;
    private javax.swing.JTextField jTextFieldNomMédicaments;
    private javax.swing.JTextField jTextFieldPrixMédicaments;
    private javax.swing.JButton jbtnQuitMédicaments;
    // End of variables declaration//GEN-END:variables
}
