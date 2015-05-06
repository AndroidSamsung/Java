package com.company.JSwings;

import javax.swing.*;

/**
 * Created by android on 27/04/2015.
 */
public class Mensaje {

    public  static void Display(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje,
                titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public static int callInteger(String mensaje){
       return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String callString(String mensaje){

        return  JOptionPane.showInputDialog(mensaje).toString();
    }


}
