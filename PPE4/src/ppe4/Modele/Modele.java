/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 ULTRA VENER!!!!
 
 */
package ppe4.Modele;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author btssio
 */
public abstract class Modele {
    private String piloteJdbc;
    private String urlBd;
    private String loginBd;
    private String mdpBd;
    private Connection cnx;
    
    // requêtes à préparer
    private PreparedStatement pstmtRequete1;
    private PreparedStatement pstmtRequete2;
    private PreparedStatement pstmtRequete3;
    private PreparedStatement pstmtRequete4;
    private PreparedStatement pstmtRequete5;
    private PreparedStatement pstmtRequete6;

    public Modele(String piloteJdbc, String urlBd, String loginBd, String mdpBd) {
        this.piloteJdbc = piloteJdbc;
        this.urlBd = urlBd;
        this.loginBd = loginBd;
        this.mdpBd = mdpBd;
    }

    public void connecter() throws ModeleException {
        try {
            Class.forName(piloteJdbc);
            cnx = DriverManager.getConnection(urlBd, loginBd, mdpBd);
            // préparer les requêtes
            pstmtRequete1 = cnx.prepareStatement(
                    "SELECT * FROM EQUIPIER WHERE ID_EQUIPIER=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtRequete2 = cnx.prepareStatement(
                    "SELECT * FROM EQUIPIER", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtRequete3 = cnx.prepareStatement(
                    "INSERT INTO PRESENCE (ID_EQUIPIER, JOUR, CODE) "
                    + " VALUES (?, ?, ?)");
            pstmtRequete4 = cnx.prepareStatement(
                    "UPDATE PRESENCE SET CODE=? "
                    + " WHERE ID_EQUIPIER=? AND JOUR=? ");
            pstmtRequete5 = cnx.prepareStatement(
                    "SELECT * FROM PRESENCE "
                    +" INNER JOIN CODE_ETAT ON PRESENCE.CODE= CODE_ETAT.CODE"
                    + " WHERE ID_EQUIPIER=? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmtRequete6 = cnx.prepareStatement(
                    "SELECT * FROM CODE_ETAT", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            throw new ModeleException("DAO - connecter : pb de connexion\n" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new ModeleException("DAO - connecter : pb de pilote JDBC\n" + ex.getMessage());
        }
    }

    
}
