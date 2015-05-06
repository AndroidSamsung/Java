package com.company.JSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 27/04/2015.
 */
public class RadionButtonDemo extends JFrame {

    JLabel picture;
    public  RadionButtonDemo()

    {
        super("Radion Button selecctions");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));


        JRadioButton pajaroButton = new JRadioButton("pajaro");
        pajaroButton.setSelected(true);
        JRadioButton gatoButton = new JRadioButton("gato");
        JRadioButton perroButton = new JRadioButton("perro");
        JRadioButton conejoButton = new JRadioButton("conejo");
        JRadioButton caballoButton = new JRadioButton("caballo");
        //creamos un grupo y los a�adimos
        ButtonGroup group = new ButtonGroup();
        group.add(pajaroButton);
        group.add(gatoButton);
        group.add(perroButton);
        group.add(conejoButton);
        group.add(caballoButton);

        RadioListener myListener = new RadioListener();
        pajaroButton.addActionListener(myListener);
        gatoButton.addActionListener(myListener);
        perroButton.addActionListener(myListener);
        conejoButton.addActionListener(myListener);
        caballoButton.addActionListener(myListener);



        panelLeft.add(pajaroButton);
        panelLeft.add(gatoButton);
        panelLeft.add(perroButton);
        panelLeft.add(conejoButton);
        panelLeft.add(caballoButton);


        JPanel panelRight = new JPanel();
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        picture = new JLabel();
        picture.setIcon(new ImageIcon("Imagenes\\pajaro.png"));
        panelRight.add(picture);

        add(panelLeft, BorderLayout.WEST);
        add(panelRight, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    class RadioListener implements ActionListener
    { public void actionPerformed(ActionEvent e)
          {
              picture.setIcon(new ImageIcon("Imagenes\\"+e.getActionCommand()+".png"));

        }
    }

}
