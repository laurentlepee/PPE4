/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import vues.VuePraticiens;

/**
 *
 * @author btssio
 */
public class CtrlPraticiens extends ControleurAbstrait {

    public CtrlPraticiens(ControleurAbstrait controleur) {
        super(controleur);
        vue = new VuePraticiens(this);
        this.afficherVue();
    }
    
      
}    
