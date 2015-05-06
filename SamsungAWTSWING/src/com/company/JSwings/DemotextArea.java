package com.company.JSwings;

import com.sun.corba.se.impl.protocol.BootstrapServerRequestDispatcher;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by android on 30/04/2015.
 */
public class DemotextArea extends JFrame{

    String[] datos;

  private final  Color trapsparente = new Color(0,0,0,0);
    private final Color edades = new Color(255, 186, 6,0);
    private final Color personal = new Color(100, 145, 210,0);
    JTextArea miTexto;
    JTextField dni;
    Dimension t = new Dimension(300,300);
    Dimension d = new Dimension(60,300);

    private Border border;

    public  DemotextArea(){

        super("Demo text area");

        datos = new String[3];

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel norte =  new JPanel();


        norte.setLayout(new BorderLayout());


        norte.add(panelEdad(), BorderLayout.WEST);

        panelPersonal();

        norte.add(panelPersonal(), BorderLayout.EAST);


        panel.add(norte, BorderLayout.NORTH);
        panel.add(panelTexto(), BorderLayout.CENTER);
        panel.add(relleno(), BorderLayout.EAST);
        panel.add(relleno(), BorderLayout.WEST);

        add(panel);
        pack();
        setVisible(true);



    }
    public  JPanel relleno (){
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setMinimumSize(d);
        p.setPreferredSize(d);
        return p;


    }

    public JPanel panelEdad(){

        Color background = new Color(220, 220, 1);
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.add(new JLabel("Seleccione su edad"));
        JRadioButton r1 = new JRadioButton("18-20");
        JRadioButton r2 = new JRadioButton("21-40");
        JRadioButton r3 = new JRadioButton("41-60");
        JRadioButton r4 = new JRadioButton("60 o mas");

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);


        EventoRadioButton evento =  new EventoRadioButton();
        r1.addActionListener(evento);
        r2.addActionListener(evento);
        r3.addActionListener(evento);
        r4.addActionListener(evento);

        p.add(r1);
        p.add(r2);
        p.add(r3);
        p.add(r4);

        r1.setBackground(background);
        r2.setBackground(background);
        r3.setBackground(background);
        r4.setBackground(background);
        p.setBackground(background);

       // p.setBackground(new Color(255, 186, 6));
        return p;
    }
    public JPanel panelPersonal(){

        Color background = new Color(247, 151, 104);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        p.add(new JLabel("DNI"));

        dni = new JTextField(10);
        p.add(dni);


        p.add(new JLabel("Profesion"));
        JComboBox  listaprofesiones = new JComboBox();
        String[] lista = new String[]{"Ingeniero","Arquitecto", "Periodista","Economista"};
        for(int i=0;i<lista.length;i++)
            listaprofesiones.addItem(lista[i]);


        listaprofesiones.addActionListener(new EventoComboBox());


        p.add(listaprofesiones);
        JButton imp = new JButton("Imprimir datos");

        imp.addActionListener(e -> { miTexto.setText("Eddad entre: " + datos[0] + "\n" + "De profesion: " + datos[1] + "\n" + "DNI numero: " + dni.getText() + "\n");});

        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Resultados");
        p.setBorder(titulo);

        p.add(imp);
        p.setBackground(background);
      //  GroupLayout gr = new GroupLayout("Resultado");

      //  p.add(panelTexto());




        return p;
 }
    private  JPanel panelTexto(){
        JPanel p = new JPanel();

        p.setLayout(new BorderLayout());
        p.add(new JLabel("Area resultados"), BorderLayout.NORTH);
        miTexto = new JTextArea();

        JScrollPane scroll = new JScrollPane(miTexto);
        scroll.setPreferredSize(new Dimension(400,400));
        p.add(scroll, BorderLayout.CENTER);

      //  p.add(miTexto, BorderLayout.CENTER);
        return p;


    }

    public class EventoComboBox implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            datos[1]= ((JComboBox) e.getSource()).getSelectedItem().toString();
        }
    }
    public class EventoRadioButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            datos[0]= e.getActionCommand();
        }
    }


}
