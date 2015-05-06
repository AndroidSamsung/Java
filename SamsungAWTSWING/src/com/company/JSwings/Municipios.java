package com.company.JSwings;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 28/04/2015.
 */
public class Municipios extends JFrame{

    JComboBox listamuniciios;
    JTextField seleccion;

    public Municipios(){

        super("Mis municipios");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        listamuniciios = new JComboBox();
        String[] lista = new String[]{"Municipios","Pinto", "Alcorcon","Leganez"};
        for(int i=0;i<lista.length;i++)
            listamuniciios.addItem(lista[i]);

        listamuniciios.addActionListener(new MiEvento());

        panel.add(listamuniciios, BorderLayout.NORTH);

        JButton ok = new JButton("OK");
        ok.addActionListener(new MiEvento());

        panel.add(ok, BorderLayout.WEST);
        seleccion = new JTextField(30);
        seleccion.setEditable(false);
        panel.add(seleccion, BorderLayout.EAST);

        c.add(panel);
        pack();
        setVisible(true);
    }

    public class MiEvento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand().equals("comboBoxChanged"))
                    seleccion.setText("Municipio seleccionado: " + ((JComboBox) e.getSource()).getSelectedItem());

            else
                Mensaje.Display("Ha seleccionado "+listamuniciios.getSelectedItem(),"Municipio");
        }
    }
}
