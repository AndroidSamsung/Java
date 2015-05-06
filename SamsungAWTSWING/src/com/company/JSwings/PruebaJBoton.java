package com.company.JSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 27/04/2015.
 */
public class PruebaJBoton  extends JFrame{

   JButton botonSimple;
    JButton botonElegante;

    public PruebaJBoton()
    { super( "Prueba de botones" );
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        botonSimple = new JButton( "Boton simple" );
        c.add( botonSimple );
        Icon icono1 = new ImageIcon( "Imagenes\\MUSICA.png" );
        Icon icono2 = new ImageIcon( "Imagenes\\JAVADHC.PNG" );
        botonElegante = new JButton("Boton elegante",icono1);

        botonElegante.setRolloverIcon( icono2 );
//agregamos el boton al panel de contenido
        c.add( botonElegante );

        ManejadorBoton manejador = new ManejadorBoton();
        botonElegante.addActionListener( manejador );
        botonSimple.addActionListener( manejador );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize( 300, 100 );
        setVisible(true);
    } // fin del constructor de PruebaBoton

    private class ManejadorBoton implements ActionListener {
        public void actionPerformed( ActionEvent e )
        {JOptionPane.showMessageDialog( null, "Usted oprimio:" + e.getActionCommand() );
        } }
}
