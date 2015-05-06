package com.company.JSwings;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by android on 27/04/2015.
 */
public class frame  extends JFrame {
    public frame()
    { setTitle("Curso de Java. Paneles");
        setSize(300, 200);
        addMouseListener(new manejadorMouse());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.out.println("...Cerrando Ventana");
                System.exit(0);}
            });
        Container contentpane = getContentPane();//Obtengo el objeto contenedor del frame

        JPanel panel = new JPanel();//Se crea un objeto de tipo JPanel

        contentpane.add(panel);//Se añade el panel al objeto contenedor del frame

        panel.setBackground(Color.green);

        setVisible(true);


    }
    //Definimos las clases que van a escuchar eventos
    class manejadorMouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            System.out.println("...Mouse presionado");}}
    public static void main(String[]args){
        JFrame frame=new frame();frame.setVisible(true);}
}
