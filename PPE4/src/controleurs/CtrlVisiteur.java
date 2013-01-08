/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import vues.VueVisiteur;
import modele.metier.Visiteur; 

/**
 *
 * @author btssio
 */
public class CtrlVisiteur extends ControleurAbstrait {

    public CtrlVisiteur(ControleurAbstrait controleur) {
        super(controleur);
        vue = new VueVisiteur(this);
        this.afficherVue();
    }
    
    
    
}


