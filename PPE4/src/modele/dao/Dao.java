package modele.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modele.metier.Visiteur;
/**
 *
 * @author btssio
 * @version finale (après modification de la BD)
 */
public abstract class Dao {

    private String piloteJdbc;
    private String urlBd;
    private String loginBd;
    private String mdpBd;
    private Connection cnx;
    // requêtes à préparer
    private PreparedStatement pstmtPraticien;
    private PreparedStatement pstmtPraticienSelection;
    private PreparedStatement pstmtUnVisiteur;
    private PreparedStatement pstmtVisiteurSelection;
    

    public Dao(String piloteJdbc, String urlBd, String loginBd, String mdpBd) {
        this.piloteJdbc = piloteJdbc;
        this.urlBd = urlBd;
        this.loginBd = loginBd;
        this.mdpBd = mdpBd;
    }

    public void connecter() throws DaoException {
        try {
            Class.forName(piloteJdbc);
            cnx = DriverManager.getConnection(urlBd, loginBd, mdpBd);
            pstmtPraticien = cnx.prepareStatement(
                    "SELECT PRA_NOM, PRA_PRENOM FROM PRATICIEN", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtPraticienSelection = cnx.prepareStatement(
                    "SELECT * FROM PRATICIEN WHERE PRA_NUM=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtUnVisiteur = cnx.prepareStatement(
                    "SELECT VIS_MATRICULE, VIS_NOM, VIS_PRENOM FROM VISITEUR", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtVisiteurSelection = cnx.prepareStatement(
                    "SELECT * FROM VISITEUR WHERE PRA_NUM=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            throw new DaoException("DAO - connecter : pb de connexion\n" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new DaoException("DAO - connecter : pb de pilote JDBC\n" + ex.getMessage());
        }
    }
    
    public Visiteur chargerUnEnregistrementVisiteur(ResultSet rs) throws DaoException{
         try {
            Visiteur visiteur = new Visiteur();
            visiteur.setVIS_MATRICULE(rs.getString("VIS_MATRICULE"));
            visiteur.setVIS_NOM(rs.getString("VIS_NOM"));
            visiteur.setVIS_PRENOM(rs.getString("VIS_PRENOM"));
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DAO - chargerUnEnregistrementVisiteur : pb JDBC\n" + ex.getMessage());
        }
    }
    
    public Visiteur lireUnVisiteur(int id) throws DaoException {
        try {
            Visiteur visiteur = null;
            pstmtUnVisiteur.setInt(1, id);
            ResultSet rs = pstmtUnVisiteur.executeQuery();
            if (rs.next()) {
                visiteur = chargerUnEnregistrementVisiteur(rs);
            }
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DAO - lireUnVisiteur : pb JDBC\n" + ex.getMessage());
        }
    }
    
    public void deconnecter() throws DaoException {
        try {
            cnx.close();
        } catch (SQLException ex) {
            throw new DaoException("DAO - déconnecter : pb JDBC\n" + ex.getMessage());
        }
    }
}
