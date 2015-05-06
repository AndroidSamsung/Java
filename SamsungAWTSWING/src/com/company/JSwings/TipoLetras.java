package com.company.JSwings;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.chrono.JapaneseChronology;

/**
 * Created by android on 29/04/2015.
 */
public class TipoLetras  extends JFrame{

    JTextField txtTipo,txbLetra;
    int negritacursiva=1, tam=14;
    String tipo="TimesRoman";
    private JCheckBox negrita, cursiva;


    public TipoLetras (){
        super("Topo letra");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());

        JPanel check = new JPanel();
        check.setLayout( new FlowLayout());

         negrita = new JCheckBox("Negrita");
         cursiva = new JCheckBox("Cursiva");
        ManejadorCasillaVerificacion cheklistener = new ManejadorCasillaVerificacion();
        negrita.addItemListener(cheklistener );
        cursiva.addItemListener(cheklistener);


        check.add(negrita);
        check.add(cursiva);


        JComboBox tipoLetra = new JComboBox();

        String[] fonts = Toolkit.getDefaultToolkit().getFontList();
        String[] allfonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

     //   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();


        for(int i=0; i<fonts.length; i++){
            tipoLetra.addItem(fonts[i]);
        }

        for(int i=0; i<allfonts.length; i++){
            tipoLetra.addItem(allfonts[i]);
        }

        tipoLetra.addActionListener(new  MiEventoTipoletra());

        JComboBox tamanoLetra = new JComboBox();
        for(int i=0; i<=100;i++)
            tamanoLetra.addItem(i);

        tamanoLetra.addActionListener(new MiEventoTamanio());


        JPanel titam = new JPanel();
        titam.setLayout(new FlowLayout());

        titam.add(tipoLetra);
        titam.add(tamanoLetra);

        JPanel down = new JPanel();
       down.setLayout(new FlowLayout());

        JButton ok = new JButton("OK");
        ok.addActionListener(new EvnentoBoton());
        down.add(ok);

         txtTipo = new JTextField(30);

        down.add(txtTipo);

         txbLetra = new JTextField(30);
        txbLetra.setText("Tipos de letra seleccionado");

        down.add(txbLetra);




        panel.add(check, BorderLayout.NORTH);
        panel.add(titam, BorderLayout.CENTER);
        panel.add(down, BorderLayout.SOUTH);

        add(panel);
        pack();
        setVisible(true);

    }

    private  class EvnentoBoton implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            setFunte();
        }
    }


    private class ManejadorCasillaVerificacion implements ItemListener {
        private int valNegrita = Font.PLAIN;
        private int valCursiva = Font.PLAIN;

        public void itemStateChanged( ItemEvent e )
        {
            if ( e.getSource() == negrita )
                if ( e.getStateChange() == ItemEvent.SELECTED )
                    valNegrita = Font.BOLD;
                else
                    valNegrita = Font.PLAIN;
            if ( e.getSource() == cursiva )
                if ( e.getStateChange() == ItemEvent.SELECTED )
                    valCursiva = Font.ITALIC;
                else
                    valCursiva = Font.PLAIN;

            negritacursiva = valNegrita + valCursiva;
            setFunte();

        }
    }
    public class MiEventoTipoletra implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tipo = ((JComboBox) e.getSource()).getSelectedItem().toString();
            txtTipo.setText(tipo);
            //setFunte();
        }

    }

    public class MiEventoTamanio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
       tam = ((JComboBox)e.getSource()).getSelectedIndex();
          setFunte();
        }

    }


   private void setFunte(){
        txbLetra.setFont( new Font( tipo, negritacursiva, tam ) );
       txtTipo.setText(tipo);
       txbLetra.setText(tipo);



    }
}
