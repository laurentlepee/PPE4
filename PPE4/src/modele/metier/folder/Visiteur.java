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
    //  Gestion de la liste des présences
    //----------------------------------------------------------------------
    public boolean ajouterUnePresence(Presence unePresence) {
        return lesPresences.put(unePresence.getJour(), unePresence) == null;
    }

    public boolean supprimerUnePresence(Jour unJour) {
        return lesPresences.remove(unJour) != null;
    }

    public Presence rechercherUnePresence(Jour unJour) {
        Presence p= lesPresences.get(unJour);
        return p;
    }

    //----------------------------------------------------------------------
    //  toString
    //  Accesseurs et Mutateurs
    //----------------------------------------------------------------------    
    @Override
    public String toString() {
        return String.format("%1$-5s%2$-20s%3$-20s", id, nom, prenom);
    }

    /**
     * Etat complet de l'objet : pour le test et le débogage
     * @return 
     */
    public String versChaine() {
        String resu = "";
        resu += "Equipier{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dimanche=" + dimanche;
        resu += "\n\tPrésences :\n";
        for (Map.Entry<Jour, Presence> entree : lesPresences.entrySet()) {
            Presence p = entree.getValue();
            resu += "\t\t" + p + "\n";
        }
        resu += '}';
        return resu;
    }
    
    
    public boolean isDimanche() {
        return dimanche;
    }

    public void setDimanche(boolean dimanche) {
        this.dimanche = dimanche;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ListePresences getLesPresences() {
        return lesPresences;
    }

    public void setLesPresences(ListePresences lesPresences) {
        this.lesPresences = lesPresences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
