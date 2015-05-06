package com.company.Eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 24/04/2015.
 */
public class DemoListener extends Frame
{ private Button boton;
    public DemoListener()
    {super("Demo");
        setLayout(new FlowLayout());
        boton = new Button("Boton");
// agrego un listener al boton
        add(boton);
        setSize(200, 150);
        setVisible(true);

       addWindowListener(new EscuchaSalir());

    }


}
