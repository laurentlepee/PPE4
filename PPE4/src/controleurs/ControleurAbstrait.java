/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import javax.swing.JOptionPane;
import modele.dao.Dao;
import modele.dao.DaoException;
import modele.dao.DaoOracle;
import vues.VueAbstraite;

/**
 * Le contrôleur abstrait est lié <ul> <li> au controleur qui l'a "appelé"</li>
 * <li> à la vue qu'il est chargé de "gérer"</li> </ul> Le contrôleur reçoit
 * quand il est construit, la référence du contrôleur qui l'a "applelé". C'est
 * dans les contrôleurs "concrets" que la vue sera instantiée. Le contrôleur
 * factorise les comportements communs de base : afficherVue() et cacherVue()
 *
 * @author btssio
 */
public abstract class ControleurAbstrait {

    /**
     *
     */
    protected ControleurAbstrait controleur;
    public static Dao dao;
    private final String NOM_BD = "testgsb";
    private final String USER = "testgsb";
    private final String PWD = "testgsb1";
    
    /**
     *
     */
    protected VueAbstraite vue;

    /**
     *
     * @param controleur le contrôleur appelant
     */
    public ControleurAbstrait(ControleurAbstrait controleur) {
        this.controleur = controleur;
        if (dao == null) {
            // Ouvrir une connexion JDBC vers la base de données visée
            dao = new DaoOracle(NOM_BD, USER, PWD);
            try {
                dao.connecter();
            } catch (DaoException ex) {
                JOptionPane.showMessageDialog(vue, "CtrlAmbulance - instanciation - " + ex.getMessage(), "Saisie des présences", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     *
     */
    public void afficherVue() {
        vue.afficher();
    }

    /**
     *
     */
    public void cacherVue() {
        vue.cacher();
    }

    public void retourner() {
        this.controleur.afficherVue();
        this.cacherVue();
    }
}
