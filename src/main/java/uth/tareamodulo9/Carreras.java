/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.tareamodulo9;

import javax.swing.JComboBox;

/**
 *
 * @author MICHAEL GUERRA M
 */
public class Carreras {
    
    /**
     *
     * @param CarrerasComb
     */
    public static void Carrera(JComboBox CarrerasComb){ 
 
        CarrerasComb.addItem("Ing. Computacion");
        CarrerasComb.addItem("Ing. Administracion");
        CarrerasComb.addItem("Ing. Industrial");
    }

    private static void removeAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
