package com.company.Eventos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by android on 24/04/2015.
 */
public class DemoListener4 extends Frame {

    private Button boton;

    public DemoListener4()

    {
        super("Demo");
        setLayout(new FlowLayout());
        boton = new Button("Boton");
        // agrego un listener al boton
        add(boton);

        addWindowListener(new EscuchaVentana()); // relaciono un WindowListener con el Frame
        addMouseMotionListener(new EscuchaMouse());

        setSize(200, 150);
        setVisible(true);
    }

    class EscuchaVentana implements WindowListener //clase interna
    {
        public void windowClosing(WindowEvent e) {// para cerrar la ventana y finalizar el programa correctamente son tres pasos:
// 1 – ocultar la ventana con setVisible(false)
// 2 – liberarla con el metodo dispose
// 3 – finalizar la aplicacion con System.exit
            System.out.println("oculto...");
            setVisible(false);
            System.out.println("Libero...");
            dispose();
            System.out.println("Bye bye...");
            System.exit(0);
        }

        // la interface WindowListener tiene 7 metodos hay que sobrescribirlos todos aunque sea dejandolos vacios
        public void windowActivated(WindowEvent e) {
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowOpened(WindowEvent e) {
        }
    }

    class EscuchaMouse implements MouseMotionListener
    {
        @Override
        public void mouseDragged(MouseEvent e) {

        }
        public void mouseMoved(MouseEvent e)
        {
            int distancia = 10;
            Point pMouse = e.getPoint();

            Dimension dimBoton = boton.getSize();
            Point pBoton = boton.getLocation();

            int difX1 = Math.abs(pBoton.x-pMouse.x);
            int difX2 = Math.abs((pBoton.x+dimBoton.width)-pMouse.x);
            int difY1 = Math.abs(pBoton.y-pMouse.y);
            int difY2 = Math.abs((pBoton.y+dimBoton.height)-pMouse.y);

            if(difX1<distancia||difX2<distancia||difY1<distancia||difY2 <distancia)
                setLocation(difX1,difY1);
            else
                setLocation(difX2,difY2);

        }

    }




}
