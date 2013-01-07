/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import vues.VueMédicaments;

/**
 *
 * @author btssio
 */
public class CtrlMédicaments extends ControleurAbstrait {

    public CtrlMédicaments(ControleurAbstrait controleur) {
        super(controleur);
        vue = new VueMédicaments(this);
        this.afficherVue();
    }
    
      
}    

