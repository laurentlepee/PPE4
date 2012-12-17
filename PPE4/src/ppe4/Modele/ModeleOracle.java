/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe4.Modele;

/**
 *
 * @author btssio
 */
public class ModeleOracle (String , String loginBd, String mdpBd){
    super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:localhost/base_de_données@//localhost:1521/xe", loginBd, mdpBd);
}
