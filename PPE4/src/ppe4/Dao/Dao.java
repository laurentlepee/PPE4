package ppe4.Dao;

import java.sql.*;
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
    private PreparedStatement pstmtVisiteur;
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
            pstmtVisiteur = cnx.prepareStatement(
                    "SELECT Vis_NOM, VIS_PRENOM FROM VISITEUR", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtVisiteurSelection = cnx.prepareStatement(
                    "SELECT * FROM VISITEUR WHERE PRA_NUM=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            throw new DaoException("DAO - connecter : pb de connexion\n" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new DaoException("DAO - connecter : pb de pilote JDBC\n" + ex.getMessage());
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