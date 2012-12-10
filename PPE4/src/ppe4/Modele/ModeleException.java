/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe4.Modele;

/**
 *
 * @author btssio
 */
public class ModeleException extends Exception{
    /**
     * Creates a new instance of <code>DaoException</code> without detail message.
     */
    public ModeleException() {
    }

    /**
     * Constructs an instance of <code>DaoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ModeleException(String msg) {
        super(msg);
    }
}
