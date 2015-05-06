package com.company.JSwings;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 28/04/2015.
 */
public class ComboFrutas extends JFrame{

    JComboBox comboBox;
    JTextField texto;
    JLabel jimagen;

    public  ComboFrutas(){
        super("Seleccion de Frutas");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();


        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());

        setLayout(new BorderLayout());

        JPanel sup = new JPanel(new FlowLayout());
        sup.setBackground(new Color(7, 0, 210));



        comboBox = new JComboBox();
        String[] items = new String[]{ "Manzana", "Naranja", "Platano","Fresa", "Uva","Mango"};

        for (int i=0; i<items.length;i++)
                 comboBox.addItem(items[i]);

        comboBox.addActionListener(new MiEvento());

        sup.add(comboBox);
         texto = new JTextField(30);
         texto.setText("La Fruta es: Manzana");
        sup.add(texto);
        jimagen = new JLabel();
        jimagen.setIcon(new ImageIcon("Imagenes\\Manzana.jpg"));
        jimagen.setBorder(BorderFactory.createEmptyBorder(0,60, 0, 0));

        contenedor.add(sup, BorderLayout.NORTH);
        contenedor.add(jimagen, BorderLayout.CENTER);

        c.add(contenedor);

        pack();
        setVisible(true);
    }
    public class MiEvento implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

         jimagen.setIcon(new ImageIcon("Imagenes\\" + ((JComboBox) e.getSource()).getSelectedItem()+".png"));
            texto.setText("La Fruta es: " + ((JComboBox) e.getSource()).getSelectedItem());
        }
    }

}
