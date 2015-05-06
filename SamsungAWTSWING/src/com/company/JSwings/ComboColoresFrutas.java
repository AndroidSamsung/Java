package com.company.JSwings;


import javafx.scene.control.RadioButton;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 29/04/2015.
 */
public class ComboColoresFrutas  extends JFrame{
    int r,g,b;
    JLabel jimagen;
    JTextField texto;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    String op;

    final Color transparente = new Color(0,0,0,0);

    public ComboColoresFrutas(){

        super("Tres paneles");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel1_ComboFrutas();
        panel2_Colores();
        panel3_Seleccion();

        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(panel3, BorderLayout.SOUTH);

        add(panel);

        pack();
        this.setVisible(true);
    }

    public  void panel1_ComboFrutas(){
        panel1 = new JPanel(new FlowLayout());
        JComboBox  comboBox = new JComboBox();
        String[] items = new String[]{ "Manzana", "Naranja", "Platano","Fresa", "Uva","Mango"};
        for (int i=0; i<items.length;i++)
            comboBox.addItem(items[i]);
        comboBox.addActionListener(new EventoCombo());

        panel1.add(comboBox);
        texto = new JTextField(30);
        texto.setText("La Fruta es: Manzana");
        panel1.add(texto);
     }

    public void panel2_Colores(){

        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

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

        color_r.setBackground(transparente);
        color_g.setBackground(transparente);
        color_b.setBackground(transparente);

        panel2.add(color_r);
        panel2.add(color_g);
        panel2.add(color_b);

    }

    public void panel3_Seleccion(){
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

        JPanel rb = new JPanel();
        rb.setLayout(new BorderLayout());

        JPanel pradios = new JPanel();
        pradios.setLayout(new BoxLayout(pradios, BoxLayout.X_AXIS));
        JRadioButton r1 = new JRadioButton("panel 1");
        JRadioButton r2 = new JRadioButton("panel 2");
        JRadioButton r3 = new JRadioButton("panel 3");

        eventoRadioButton seleccionaoperacion = new eventoRadioButton();
        r1.addActionListener(seleccionaoperacion);
        r2.addActionListener(seleccionaoperacion);
        r3.addActionListener(seleccionaoperacion);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        pradios.add(r1);
        pradios.add(r2);
        pradios.add(r3);

        JButton bt = new JButton("SET COLOR");
        bt.addActionListener(new eventoButton());


        jimagen = new JLabel();
        jimagen.setIcon(new ImageIcon("Imagenes\\Manzana.jpg"));
        jimagen.setBorder(BorderFactory.createEmptyBorder(0, 60, 0, 0));

        rb.add(pradios, BorderLayout.CENTER);
        rb.add(bt, BorderLayout.SOUTH);

        //panel3.add(pradios);
        panel3.add(rb);
        panel3.add(jimagen);

    }


    public class  EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            jimagen.setIcon(new ImageIcon("Imagenes\\" + ((JComboBox) e.getSource()).getSelectedItem()+".png"));
            texto.setText("La Fruta es: " + ((JComboBox) e.getSource()).getSelectedItem());
        }
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

          //  panel.setBackground(new Color(r,g,b));

        }
    }

    public class eventoRadioButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            op= e.getActionCommand();
        }
    }

    public class eventoButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setColorPanel();
        }
    }

    public void setColorPanel(){

        switch (op){
            case "panel 1":
                panel1.setBackground(new Color(r,g,b));
                break;
            case "panel 2":
                panel2.setBackground(new Color(r,g,b));
                break;
            case "panel 3":
                panel3.setBackground(new Color(r,g,b));
                break;



        }

    }

}
