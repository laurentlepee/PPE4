package modele.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//import modele.metier.CodeEtat;
//import modele.metier.Equipier;
//import modele.metier.Jour;
//import modele.metier.ListePresences;
//import modele.metier.Patient;
//import modele.metier.Presence;

/**
 *
 * @author btssio
 * @version finale (après modification de la BD)
 */
public abstract class Dao {

    private String piloteJdbc;
    protected String urlBd;
    protected String loginBd;
    protected String mdpBd;
    private Connection cnx;
    // requêtes à préparer
    private PreparedStatement pstmtLireUnEquipier;
    private PreparedStatement pstmtModifierUnePresence;
    private PreparedStatement pstmtAjouterUnePresence;
    private PreparedStatement pstmtLireLesPresencesUnEquipier;
    private PreparedStatement pstmtLireTousLesEquipiers;
    private PreparedStatement pstmtLireTousLesCodesEtat;
    private PreparedStatement pstmtLireTousLesPatients;
    
    public Dao(String piloteJdbc, String urlBd, String loginBd, String mdpBd) {
        this.piloteJdbc = piloteJdbc;
        this.urlBd = urlBd;
        this.loginBd = loginBd;
        this.mdpBd = mdpBd;
    }

        public Dao() {
        this.piloteJdbc = piloteJdbc;
        this.urlBd = urlBd;
        this.loginBd = loginBd;
        this.mdpBd = mdpBd;
    }
    
    public void connecter() throws DaoException {
        try {
            Class.forName(piloteJdbc);
            cnx = DriverManager.getConnection(urlBd, loginBd, mdpBd);
            // préparer les requêtes
//            pstmtLireUnEquipier = cnx.prepareStatement(
//                    "SELECT * FROM EQUIPIER WHERE ID_EQUIPIER=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            pstmtLireTousLesEquipiers = cnx.prepareStatement(
//                    "SELECT * FROM EQUIPIER", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            pstmtAjouterUnePresence = cnx.prepareStatement(
//                    "INSERT INTO PRESENCE (ID_EQUIPIER, JOUR, CODE) "
//                    + " VALUES (?, ?, ?)");
//            pstmtModifierUnePresence = cnx.prepareStatement(
//                    "UPDATE PRESENCE SET CODE=? "
//                    + " WHERE ID_EQUIPIER=? AND JOUR=? ");
//            pstmtLireLesPresencesUnEquipier = cnx.prepareStatement(
//                    "SELECT * FROM PRESENCE "
//                    +" INNER JOIN CODE_ETAT ON PRESENCE.CODE= CODE_ETAT.CODE"
//                    + " WHERE ID_EQUIPIER=? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            pstmtLireTousLesCodesEtat = cnx.prepareStatement(
//                    "SELECT * FROM CODE_ETAT", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//                        pstmtLireTousLesPatients = cnx.prepareStatement(
//                    "SELECT * FROM PATIENT", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

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
//    
//    /**
//     * lireTousLesEquipiers
//     * Les listes de présence des équipiers ne sont pas renseignées
//     * @return Liste (collection ArrayList) de tous les équipiers de la BD
//     * @throws DaoException 
//     */
//    public List<Equipier> lireTousLesEquipiers() throws DaoException{
//        try {
//            List<Equipier> desEquipiers= new ArrayList<Equipier>();
//            ResultSet rs = pstmtLireTousLesEquipiers.executeQuery();
//            while (rs.next()) {
//                Equipier unEquipier = chargerUnEnregistrementEquipier(rs);
//                desEquipiers.add(unEquipier);
//            }            
//            return desEquipiers;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - lireTousLesEquipiers : pb JDBC\n" + ex.getMessage());
//        }
//    }
//
//    /**
//     * Lire dans la base de données un équipier d'après son identifiant
//     * La liste de présence de l'équipier n'est pas renseignée
//     * @param id : identifiant de l'équipier
//     * @return objet Equipier ou null
//     * @throws DaoException 
//     */
//    public Equipier lireUnEquipier(int id) throws DaoException {
//        try {
//            Equipier equipier = null;
//            pstmtLireUnEquipier.setInt(1, id);
//            ResultSet rs = pstmtLireUnEquipier.executeQuery();
//            if (rs.next()) {
//                equipier = chargerUnEnregistrementEquipier(rs);
//            }
//            return equipier;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - lireUnEquipier : pb JDBC\n" + ex.getMessage());
//        }
//    }
//
//    /**
//     * lireLesPresencesUnEquipier
//     * @param id
//     * @return
//     * @throws DaoException 
//     */
//    public ListePresences lireLesPresencesUnEquipier(int id) throws DaoException {
//        try {
//            ListePresences lesPresences = new ListePresences();
//            pstmtLireLesPresencesUnEquipier.setInt(1, id);
//            ResultSet rs = pstmtLireLesPresencesUnEquipier.executeQuery();
//            while (rs.next()) {
//                Presence unePresence = chargerUnEnregistrementPresence(rs);
//                lesPresences.put(unePresence.getJour(), unePresence);
//            }
//            return lesPresences;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - lireLesPresencesUnEquipier : pb JDBC\n" + ex.getMessage());
//        }
//    }
//    
//    /**
//     * ajouterUnePresence
//     * @param idEquipier
//     * @param presence
//     * @return
//     * @throws DaoException 
//     */
//    public int ajouterUnePresence(int idEquipier,Presence presence) throws DaoException {
//        try {
//            pstmtAjouterUnePresence.setInt(1, idEquipier);
//            pstmtAjouterUnePresence.setDate(2, presence.getJour().toSqlDate());
//            pstmtAjouterUnePresence.setString(3,String.valueOf((presence.getEtatPresence()).getCode()) );
//            int nb= pstmtAjouterUnePresence.executeUpdate();
//            return nb;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - ajouterUnePresence : pb JDBC\n" + ex.getMessage());
//        }
//    }
//
//    /**
//     * modifierUnePresence
//     * @param idEquipier
//     * @param presence
//     * @return
//     * @throws DaoException 
//     */
//    public int modifierUnePresence(int idEquipier,Presence presence) throws DaoException {
//        try {
//            pstmtModifierUnePresence.setString(1, String.valueOf((presence.getEtatPresence()).getCode()));
//            pstmtModifierUnePresence.setInt(2, idEquipier);
//            pstmtModifierUnePresence.setDate(3, presence.getJour().toSqlDate());
//            int nb= pstmtModifierUnePresence.executeUpdate();
//            return nb;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - modifierUnePresence : pb JDBC\n" + ex.getMessage());
//        }
//    }
//    
//    /**
//     * lireTousLesCodesEtat
//     * @return
//     * @throws DaoException 
//     */
//    public List<CodeEtat> lireTousLesCodesEtat() throws DaoException{
//        try {
//            List<CodeEtat> desCodesEtat= new ArrayList<CodeEtat>();
//            ResultSet rs = pstmtLireTousLesCodesEtat.executeQuery();
//            while (rs.next()) {
//                CodeEtat unCodeEtat = new CodeEtat(rs.getString("CODE").charAt(0), rs.getString("LIBELLE"));
//                desCodesEtat.add(unCodeEtat);
//            }            
//            return desCodesEtat;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - lireTousLesCodesEtat : pb JDBC\n" + ex.getMessage());
//        }
//    }
//    
//           /**
//     * lireTousLesPatients
//     * Les listes de présence des équipiers ne sont pas renseignées
//     * @return Liste (collection ArrayList) de tous les équipiers de la BD
//     * @throws DaoException 
//     */
//    public List<Patient> lireTousLesPatients() throws DaoException{
//        try {
//            List<Patient> desPatients= new ArrayList<Patient>();
//            ResultSet rs = pstmtLireTousLesPatients.executeQuery();
//            while (rs.next()) {
//                Patient unPatient = chargerUnEnregistrementPatient(rs);
//                desPatients.add(unPatient);
//            }            
//            return desPatients;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - lireTousLesPatients : pb JDBC\n" + ex.getMessage());
//        }
//    }
//
//    //----------------------------------------------------------------------
//    //  Méthodes privées
//    //----------------------------------------------------------------------
//    
//    /**
//     * chargerUnEnregistrementEquipier
//     * Instancie un objet equipier avec les valeurs lues dans la base de données
//     * La jointure avec la table PRESENCE n'est pas effectuée
//     * @param rs enregistrement de la table Equipier courant
//     * @return un objet Equipier, dont la liste des "présences" n'est pas renseignée
//     * @throws DaoException 
//     */
//    private Equipier chargerUnEnregistrementEquipier(ResultSet rs) throws DaoException {
//        try {
//            Equipier equipier = new Equipier();
//            equipier.setId(rs.getInt("ID_EQUIPIER"));
//            equipier.setNom(rs.getString("NOM"));
//            equipier.setPrenom(rs.getString("PRENOM"));
//            if (rs.getInt("VOLONTAIRE_DIMANCHE") == 1) {
//                equipier.setDimanche(true);
//            } else {
//                equipier.setDimanche(false);
//            }
//            return equipier;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - chargerUnEnregistrementEquipier : pb JDBC\n" + ex.getMessage());
//        }
//    }
//
//    /**
//     * chargerUnEnregistrementPresence
//     * Instancie un objet Presence avec les valeurs lues dans la base de données
//     * Le ResultSet rs contient les colonnes issues de la jointure avec la table CODE_ETAT
//     * @param rs enregistrement courant issu de la jointure entre les tables PRESENCE et CODE_ETAT 
//     * @return un objet Presence, avec son objet CodeEtat
//     * @throws DaoException 
//     */
//    private Presence chargerUnEnregistrementPresence(ResultSet rs) throws DaoException {
//        try {
//            Presence presence = new Presence();
//            presence.setJour(new Jour(rs.getDate("JOUR").getTime())); // il faut convertir la sql.Date en Jour
//            char code =  rs.getString("PRESENCE.CODE").charAt(0);
//            String lib= rs.getString("CODE_ETAT.LIBELLE");
//            presence.setEtatPresence(new CodeEtat(code, lib));
//            return presence;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - chargerUnEnregistrementPresence : pb JDBC\n" + ex.getMessage());
//        }
//    }
//           /**
//     * chargerUnEnregistrementEquipier
//     * Instancie un objet equipier avec les valeurs lues dans la base de données
//     * La jointure avec la table PRESENCE n'est pas effectuée
//     * @param rs enregistrement de la table Equipier courant
//     * @return un objet Equipier, dont la liste des "présences" n'est pas renseignée
//     * @throws DaoException 
//     */
//    private Patient chargerUnEnregistrementPatient(ResultSet rs) throws DaoException {
//        try {
//            Patient patient = new Patient();
//            patient.setNumero(rs.getInt("NUMERO"));
//            patient.setNom(rs.getString("NOM"));
//            patient.setPrenom(rs.getString("PRENOM"));
//            patient.setAdresse(rs.getString("ADRESSE"));
//            patient.setTelephone(rs.getString("TELEPHONE"));
//            return patient;
//        } catch (SQLException ex) {
//            throw new DaoException("DAO - chargerUnEnregistrementPatient : pb JDBC\n" + ex.getMessage());
//        }
//    }
}
