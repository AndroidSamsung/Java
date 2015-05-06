package com.company.JSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 27/04/2015.
 */
public class Cards extends JFrame {
    JTextField l1 = new JTextField("Etiqueta1");
    JTextField l2 = new JTextField("Etiqueta2");
    JTextField l3 = new JTextField("Etiqueta3");
    JTextField l4 = new JTextField("Etiqueta4");
    JTextField l5 = new JTextField("Etiqueta5");
    JPanel NPB = new JPanel();
    JPanel p1 = new JPanel();

    JPanel p = new JPanel(new GridLayout(2, 1));

    public Cards() {
        final Container micontenedor = getContentPane();
        NPB.setLayout(new GridLayout(1, 2));
        p1.setLayout(new CardLayout(14, 14));
        micontenedor.setLayout(new BorderLayout());
        micontenedor.add(p1, BorderLayout.SOUTH);
        micontenedor.add(NPB, BorderLayout.NORTH);
        JButton N = new JButton("Proximo");
        JButton P = new JButton("Anterior");
        NPB.add(P);
        NPB.add(N);
        P.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) p1.getLayout();
                cardLayout.previous(p1);
            }
        });
        N.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) p1.getLayout();
                cardLayout.next(p1);
            }
        });


        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        micontenedor.setVisible(true);
        add(p);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
