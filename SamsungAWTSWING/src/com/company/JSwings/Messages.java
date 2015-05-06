package com.company.JSwings;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.MultiPixelPackedSampleModel;

/**
 * Created by android on 27/04/2015.
 */
public class Messages  extends JFrame{


    public  Messages(){

        super("Menasjes dialogos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);


        JOptionPane.showMessageDialog(null, "Este es un mensaje de Dialogo",
                "MESAJE DE DIALOGOS", JOptionPane.WARNING_MESSAGE);

        int numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" +
                " numero para multiplicarlo por 2"));

        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+numero*2,
                "Multipliccaion x 2", JOptionPane.INFORMATION_MESSAGE);

        Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");

        String opcion= color.toString();

        JOptionPane.showMessageDialog(null, "ha seleccionado el color: "+opcion,
                "Su COLOR", JOptionPane.INFORMATION_MESSAGE);


        int resp=JOptionPane.showConfirmDialog(null, "Usas mucho el JOptionPane?");

        if (JOptionPane.OK_OPTION == resp){

            JOptionPane.showMessageDialog(null, "OK",
                    "Respuesta ", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(JOptionPane.NO_OPTION ==resp){

            JOptionPane.showMessageDialog(null, "NO",
                    "Respuesta ", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "OK",
                    "Respuesta ", JOptionPane.INFORMATION_MESSAGE);
        }


        JCheckBox chec=new JCheckBox("Prueba");
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion",
                "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"opcion 1", "opcion 2", "opcion 3", chec}, "opcion 1");
        if (seleccion != -1)
        {
            Mensaje.Display("La opciones seleccionada es: " + (seleccion+1), "Seleccion");

        }
        Mensaje.Display("Selecciono checkbox:? " + chec.isSelected(), "CHECK");

        Container contentpane = getContentPane();//Obtengo el objeto contenedor del frame




        JPanel panel = new JPanel();//Se crea un objeto de tipo JPanel
        panel.setLayout(new BorderLayout());

     JButton  miBotton = new JButton("Click me", new ImageIcon("Icons\\icon_java.png"));
      //  miBotton.addMouseListener(new manejadorMouse());
        miBotton.setName("padre");
        miBotton.addActionListener(new manejador());
        panel.add(miBotton, BorderLayout.CENTER);

    JButton   noPadre = new JButton("Dialog");
        noPadre.setName("sin");
        noPadre.addActionListener(new manejador());
        panel.add(noPadre, BorderLayout.NORTH);

        setLayout(new FlowLayout());
        this.add(panel);


      //  contentpane.add(panel);//Se añade el panel al objeto contenedor del frame

       // setLayout(new BorderLayout());
        setVisible(true);





    }

   public   class manejador implements ActionListener{

       public void actionPerformed(ActionEvent e) {

           if(((JButton)e.getSource()).getName().equals("padre")) {
               JOptionPane.showMessageDialog((JButton) e.getSource(), "padre Click ME",
                       "Dialog whit father", JOptionPane.INFORMATION_MESSAGE);
           }
           else {
               JOptionPane.showMessageDialog(null, "Dialog sin padre",
                       "Dialog no father", JOptionPane.INFORMATION_MESSAGE);
           }
       }

   }

}



