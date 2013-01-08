/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier.folder;

import java.util.Map;

/**
 *
 * @author btssio
 */
public class Visiteur {
    private String VIS_MATRICULE;
    private String VIS_NOM;
    private String VIS_PRENOM;
    private String VIS_ADRESSE;
    private String VIS_CP;
    private String VIS_VILLE;
    private String VIS_DATEEMBAUCHE;
    private String SEC_CODE;
    private String LAB_CODE;

    public Visiteur() {
        this.VIS_MATRICULE = "";
        this.VIS_NOM = "";
        this.VIS_PRENOM = "";
        this.VIS_ADRESSE = "";
        this.VIS_CP = "";
        this.VIS_VILLE = "";
        this.VIS_DATEEMBAUCHE = "";
        this.SEC_CODE = "";
        this.LAB_CODE = "";
    }

    public Visiteur(String VIS_MATRICULE, String VIS_NOM, String VIS_PRENOM, String VIS_ADRESSE, String VIS_CP, String VIS_VILLE, String VIS_DATEEMBAUCHE, String SEC_CODE, String LAB_CODE) {
        this.VIS_MATRICULE = VIS_MATRICULE;
        this.VIS_NOM = VIS_NOM;
        this.VIS_PRENOM = VIS_PRENOM;
        this.VIS_ADRESSE = VIS_ADRESSE;
        this.VIS_CP = VIS_CP;
        this.VIS_VILLE = VIS_VILLE;
        this.VIS_DATEEMBAUCHE = VIS_DATEEMBAUCHE;
        this.SEC_CODE = SEC_CODE;
        this.LAB_CODE = LAB_CODE;
    }
    
    //----------------------------------------------------------------------
    //  toString
    //  Accesseurs et Mutateurs
    //----------------------------------------------------------------------    
    @Override
    public String toString() {
        return String.format("%1$-5s%2$-20s%3$-20s", VIS_MATRICULE, VIS_NOM, VIS_PRENOM, VIS_ADRESSE, VIS_CP, VIS_VILLE, VIS_DATEEMBAUCHE, SEC_CODE, LAB_CODE);
    }

    /**
     * Etat complet de l'objet : pour le test et le débogage
     * @return 
     */
    public String versChaine() {
        String resu = "";
        resu += "Visiteur{" + "Matricule =" + VIS_MATRICULE + ", nom=" + VIS_NOM + ", prenom=" + VIS_PRENOM;
        resu += '}';
        return resu;
    }

    public String getVIS_MATRICULE() {
        return VIS_MATRICULE;
    }

    public void setVIS_MATRICULE(String VIS_MATRICULE) {
        this.VIS_MATRICULE = VIS_MATRICULE;
    }

    public void setVIS_NOM(String VIS_NOM) {
        this.VIS_NOM = VIS_NOM;
    }

    public void setVIS_PRENOM(String VIS_PRENOM) {
        this.VIS_PRENOM = VIS_PRENOM;
    }

    public void setVIS_ADRESSE(String VIS_ADRESSE) {
        this.VIS_ADRESSE = VIS_ADRESSE;
    }

    public void setVIS_CP(String VIS_CP) {
        this.VIS_CP = VIS_CP;
    }

    public void setVIS_VILLE(String VIS_VILLE) {
        this.VIS_VILLE = VIS_VILLE;
    }

    public void setVIS_DATEEMBAUCHE(String VIS_DATEEMBAUCHE) {
        this.VIS_DATEEMBAUCHE = VIS_DATEEMBAUCHE;
    }

    public void setSEC_CODE(String SEC_CODE) {
        this.SEC_CODE = SEC_CODE;
    }

    public void setLAB_CODE(String LAB_CODE) {
        this.LAB_CODE = LAB_CODE;
    }
    
    

    public String getVIS_NOM() {
        return VIS_NOM;
    }

    public String getVIS_PRENOM() {
        return VIS_PRENOM;
    }

    public String getVIS_ADRESSE() {
        return VIS_ADRESSE;
    }

    public String getVIS_CP() {
        return VIS_CP;
    }

    public String getVIS_VILLE() {
        return VIS_VILLE;
    }

    public String getVIS_DATEEMBAUCHE() {
        return VIS_DATEEMBAUCHE;
    }

    public String getSEC_CODE() {
        return SEC_CODE;
    }

    public String getLAB_CODE() {
        return LAB_CODE;
    }
}
