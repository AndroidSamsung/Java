package com.company.Eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by android on 24/04/2015.
 */
public class EscuchaSalir implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("oculto...");
        //setVisible(false);
        System.out.println("Libero...");
       // dispose();
        System.out.println("Bye bye...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
