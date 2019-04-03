/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author GEARSPC
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Info info = new Info();

        JOptionPane.showMessageDialog(null, "su nombre es " + info.getName() + " tiene " + info.getAge() + " años " + 
        " y su altura es " + info.getHeight());

    }

}
