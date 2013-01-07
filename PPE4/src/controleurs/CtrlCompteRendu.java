/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import vues.VueCompteRendu;

/**
 *
 * @author btssio
 */
public class CtrlCompteRendu extends ControleurAbstrait {

    public CtrlCompteRendu(ControleurAbstrait controleur) {
        super(controleur);
        vue = new VueCompteRendu(this);
        this.afficherVue();
    }
    
      
}    

