package com.company.JSwings;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import oracle.jrockit.jfr.JFR;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by android on 28/04/2015.
 */
public class SumaNumeros extends JFrame {

    JTextField numero1;
    JTextField numero2;
    JTextField jresult;

    public SumaNumeros(){

        super("Suma de dos nuemros");

        Container c = getContentPane();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Numero 1"));
        panel.add(numero1 = new JTextField(20));
        panel.add(new JLabel("Numero 2"));
        panel.add(numero2 = new JTextField(20));
        panel.add(new JLabel("la suma es:"));
        JButton sumar = new JButton("Sumar");
        sumar.addActionListener(new mievento());
        panel.add(sumar);
        jresult = new JTextField(20);
        jresult.setEditable(false);
        panel.add(jresult);
        c.add(panel);
        pack();
        setVisible(true);
    }


    public class mievento implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        jresult.setText(String.valueOf(Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText())));
        }
    }
}
