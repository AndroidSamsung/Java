package com.company.JSwings;


import com.sun.xml.internal.ws.api.server.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 28/04/2015.
 */
public class ComboColor extends JFrame {

    int r,g,b;
    JPanel panel;


    public ComboColor(){

        super("Colores");
        Container c = getContentPane();

         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JComboBox vr = new JComboBox();
        for(int i=0; i<=255;i++)
            vr.addItem(i);

        JComboBox vg = new JComboBox();
        for(int i=0; i<=255;i++)
            vg.addItem(i);

        JComboBox vb = new JComboBox();
        for(int i=0; i<=255;i++)
            vb.addItem(i);


        vr.setName("r");
        vg.setName("g");
        vb.setName("b");

        MiEvento cambiaCanal = new MiEvento();
        vr.addActionListener(cambiaCanal);
        vg.addActionListener(cambiaCanal);
        vb.addActionListener(cambiaCanal);

        JPanel colores = new JPanel();
        colores.setLayout(new BoxLayout(colores, BoxLayout.Y_AXIS));

        JPanel color_r = new JPanel();
        color_r.setLayout(new FlowLayout());
        color_r.add(new JLabel("Canal R"));
        color_r.add(vr);


        JPanel color_g = new JPanel();
        color_g.setLayout(new FlowLayout());
        color_g.add(new JLabel("Canal G"));
        color_g.add(vg);

        JPanel color_b = new JPanel();
        color_b.setLayout(new FlowLayout());
        color_b.add(new JLabel("Canal B"));
        color_b.add(vb);

        colores.add(color_r);
        colores.add(color_g);
        colores.add(color_b);

        color_b.setBackground(new Color(45, 40, 49,0));
        colores.setBackground(new Color(255, 90, 39,37));



        JPanel cont = new JPanel();
        cont.setLayout(new FlowLayout());
        cont.add(colores);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton cambiar = new JButton("Cambiar color");
        //cambiar.setMargin(new Insets(20, 20, 30, 20));
        panel.add(cambiar);
        cont.add(panel);

        JPanel p = new JPanel();
        c.setLayout(new BorderLayout());
        c.add(cont);

        pack();
        setVisible(true);
    }

    public class MiEvento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (((JComboBox)e.getSource()).getName()){
                case "r":
                    r= ((JComboBox)e.getSource()).getSelectedIndex();

                    break;
                case "g":
                    g= ((JComboBox)e.getSource()).getSelectedIndex();
                    break;
                case "b":
                    b= ((JComboBox)e.getSource()).getSelectedIndex();
                    break;

            }

            panel.setBackground(new Color(r,g,b));

        }
    }
}
