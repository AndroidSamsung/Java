package com.company.JSwings;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by android on 27/04/2015.
 */
public class PruebaCasillaVerificacion extends JFrame{

    private JTextField t;
    private JCheckBox negrita, cursiva;
    public PruebaCasillaVerificacion()
    {
        super( "Prueba de JCheckBox" );
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
//creamos e inicializamos el objeto JTextField
        t = new JTextField( "Texto que cambia", 28 );
//establecemos el estilo de la fuente y añadimos al panel
        t.setFont( new Font( "TimesRoman",Font.PLAIN, 14 ) );
        c.add( t );
// crea los objetos casilla de verificación
        negrita = new JCheckBox( "Negrita" );
        c.add( negrita );
        cursiva = new JCheckBox( "Cursiva" );
        c.add( cursiva );
//si se hace click en un objeto JCheckBox se genera un
// ItemEvent que puede ser manejado por un ItemListener
// (cualquier objeto de una clase que implemente la interfaz
// ItemListener)
//un objeto ItemListener debe definir el metodo
// itemStateChanged
        ManejadorCasillaVerificacion manejador= new ManejadorCasillaVerificacion();
        negrita.addItemListener( manejador );
        cursiva.addItemListener( manejador );

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing( WindowEvent e )
                    {
                        System.exit( 0 );
                    } // fin del método windowClosing
                } // fin de la clase interna anónima
        ); // fin de addWindowListener
        setSize(325, 100);
        setVisible(true);
    } // fin del constructor de PruebaCasillaVerificacion


    private class ManejadorCasillaVerificacion implements ItemListener {
        private int valNegrita = Font.PLAIN;
        private int valCursiva = Font.PLAIN;
        //con e.getSource() determinamos el onjeto sobre el que se hizo //click
//con las estructuras if-else se determina cual fue modificado y //la accion que tenemos que llevar a cabo
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
//establecemos los tipos de la nueva fuente
            t.setFont(
                    new Font( "TimesRoman", valNegrita + valCursiva, 14 ) );
        } // fin del método itemStateChanged
    } // fin de la clase interna //ManejadorCasillaVerificacion
} //


