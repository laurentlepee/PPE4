/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import javax.swing.JOptionPane;
import vues.VueMenu;

/**
 *
 * @author btssio
 *
 */
public class CtrlMenu extends ControleurAbstrait {
    // références sur les fonctionnalités auxquelles le menu donne accès
    private CtrlVisiteur ctrlVisiteur;
    private CtrlCompteRendu ctrlCompteRendu;
    private CtrlMédicaments ctrlMédicaments;
    //private CtrlPraticiens ctrlPraticiens;

    public CtrlMenu(ControleurAbstrait controleur) {
        super(controleur);
        changerLookAndFeel();
        vue = new VueMenu(this);
        this.afficherVue();
    }

    public void choisirVisiteur() {
        if (ctrlVisiteur == null) {
            ctrlVisiteur = new CtrlVisiteur(this);
        } else {
            ctrlVisiteur.afficherVue();
        }
        this.cacherVue();
    }

    public void choisirCompteRendu() {
        if (ctrlCompteRendu == null) {
            ctrlCompteRendu = new CtrlCompteRendu(this);
        } else {
            ctrlCompteRendu.afficherVue();
        }
        this.cacherVue();
    }
    
    public void choisirMédicaments() {
        if (ctrlMédicaments == null) {
            ctrlMédicaments = new CtrlMédicaments(this);
        } else {
            ctrlMédicaments.afficherVue();
        }
        this.cacherVue();
    }
    
    /**
     * public void choisirPraticiens() {
        if (ctrlPraticiens == null) {
            ctrlPraticiens = new CtrlPraticiens(this);
        } else {
            ctrlPraticiens.afficherVue();
        }
        this.cacherVue();
    }
    */
    

    public void quitter() {
        int rep;
        rep = JOptionPane.showConfirmDialog(vue, "Quitter l'application\nEtes-vous sûr(e) ?", "Saisie des présences", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // fermer la vue
            cacherVue();
            vue.dispose();
            // mettre fin à l'application
            System.exit(0);
        }
    } 
    

    private void changerLookAndFeel() {
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
    }
}
