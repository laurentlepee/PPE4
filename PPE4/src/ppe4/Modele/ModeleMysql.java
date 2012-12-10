/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe4.Modele;
/**
 *
 * @author btssio
 */
public class ModeleMysql extends Modele{
    public ModelMySql(String nomBd, String loginBd, String mdpBd) {
        super("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/"+nomBd, loginBd, mdpBd);
    }
}
