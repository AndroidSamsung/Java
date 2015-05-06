package com.company.JSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 28/04/2015.
 */
public class Operaciones extends JFrame {

    JTextField numero1;
    JTextField numero2;
    JTextField jresult;
    String op;

    public Operaciones(){
        super("Operaciones");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = getContentPane();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Numero 1"));
        panel.add(numero1 = new JTextField(20));
        panel.add(new JLabel("Numero 2"));
        panel.add(numero2 = new JTextField(20));

        JRadioButton suma = new JRadioButton("sumar");
        JRadioButton resta = new JRadioButton("restar");
        JRadioButton multiplicacion = new JRadioButton("multiplicar");
        JRadioButton division = new JRadioButton("dividir");

        eventoRadioButton seleccionaoperacion = new eventoRadioButton();
        suma.addActionListener(seleccionaoperacion);
        resta.addActionListener(seleccionaoperacion);
        multiplicacion.addActionListener(seleccionaoperacion);
        division.addActionListener(seleccionaoperacion);

        ButtonGroup group = new ButtonGroup();
        group.add(suma);
        group.add(resta);
        group.add(multiplicacion);
        group.add(division);

        panel.add(suma);
        panel.add(resta);
        panel.add(multiplicacion);
        panel.add(division);


        JButton operar = new JButton("Resolver");
        operar.addActionListener(new mievento());
        panel.add(operar);

        panel.add(new JLabel("la operacioon es:"));

        jresult = new JTextField(20);
        jresult.setEditable(false);
        panel.add(jresult);
        c.add(panel);
        pack();
        setVisible(true);
 }
    public class eventoRadioButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            op= e.getActionCommand();
        }
    }
    public class mievento implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            switch (op){

                case "sumar":
                    jresult.setText(String.valueOf(Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText())));
                    break;
                case "restar":
                    jresult.setText(String.valueOf(Integer.parseInt(numero1.getText()) - Integer.parseInt(numero2.getText())));
                    break;
                case "multiplicar":
                    jresult.setText(String.valueOf(Integer.parseInt(numero1.getText()) * Integer.parseInt(numero2.getText())));
                    break;
                case "dividir":
                    jresult.setText(String.valueOf(Integer.parseInt(numero1.getText()) / Integer.parseInt(numero2.getText())));
                    break;
            }

        }
    }
}
