package com.company.JSwings;

import com.sun.org.apache.xml.internal.security.algorithms.MessageDigestAlgorithm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by android on 30/04/2015.
 */
public class AdminPass extends JFrame{

    JPasswordField mipass;
    String pass;

    public AdminPass (){

        super("password");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
                mipass.requestFocus();

            }
        });



        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());


        panel.add(new JLabel("Introduzca contrasena"));
        mipass = new JPasswordField(20);
        mipass.addKeyListener(new MyKeyListener());

        panel.add(mipass);
        panel.add(botones());
        add(panel);
        pack();
        setVisible(true);



    }
    private  JPanel botones(){
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());


        JButton ok = new JButton("ok");

        ok.addKeyListener(new MyKeyListener());

        ok.addActionListener(e -> verificarPass());

        p.add(ok, BorderLayout.NORTH);

        JButton help = new JButton("Ayuda");

        help.addActionListener(e -> Mensaje.Display("Contacte con el administrador", "Help"));

        p.add(help, BorderLayout.SOUTH);

        p.setSize(300, 40);

        return p;

    }

    private void verificarPass(){
        pass ="";
        char[] mpas = mipass.getPassword();
        for(int i=0;i<mpas.length;i++)
            pass= pass+mpas[i];

        if(pass.equals("root"))
            JOptionPane.showMessageDialog(null, "En hora buena ha escrito la contraseñas correcta",  "GOOD", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Contrasena incorrecta intente de nueveo",  "BAD", JOptionPane.ERROR_MESSAGE);

    }

    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
            String tecla = "Intro";
            if(tecla.equals(KeyEvent.getKeyText(e.getKeyCode())))
                verificarPass();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }



}
