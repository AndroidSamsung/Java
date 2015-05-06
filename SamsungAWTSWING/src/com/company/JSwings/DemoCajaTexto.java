package com.company.JSwings;

import com.sun.prism.shader.AlphaOne_Color_Loader;
import com.sun.xml.internal.ws.api.server.Container;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by android on 29/04/2015.
 */
public class DemoCajaTexto extends JFrame {

    Dimension t = new Dimension(200,20);
    MaskFormatter mascara;
    JFormattedTextField text1;
    JTextField text2;

    JPasswordField text3;
    JTextField text4;

    public DemoCajaTexto(){
        super("Demo caja JText");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 155, 33));

        panel.add(panel1());
        panel.add(panel2());
        panel.add(panel3());
        panel.add(panel4());

        this.add(panel);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);


               // text1.setFocusLostBehavior(text2.COMMIT);

            }
        });

        setSize(500,120);
        setVisible(true);

    }

    private JPanel panel1(){
        JPanel panel= new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Campo formato"), BorderLayout.WEST);

        try{
            mascara= new MaskFormatter("AAAAAAAAAAAAAAAAAAAAAAA");
        }
        catch (Exception ex){}


        text1 = new JFormattedTextField(mascara);
        text1.setMinimumSize(t);
        text1.setPreferredSize(t);


        panel.add(text1, BorderLayout.EAST);

        panel.setBackground(new Color(0, 0, 0, 0));
        return panel;
    }
    private  JPanel panel2(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JLabel("texto del campo formato"), BorderLayout.WEST);

        text2 = new JTextField();
        text2.setMinimumSize(t);
        text2.setPreferredSize(t);
        text2.addFocusListener(new evento2());
        panel.add(text2, BorderLayout.EAST);
        panel.setBackground(new Color(0, 0, 0, 0));
        return panel;

    }

    private  JPanel panel3(){

        JPanel panel = new JPanel();
        panel.setSize(300,12);
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Contrasena"), BorderLayout.WEST);
        text3 = new JPasswordField();
        text3.setEchoChar('@');
        text3.setMinimumSize(t);
        text3.setPreferredSize(t);
        panel.add(text3, BorderLayout.EAST);
        panel.setBackground(new Color(0, 0, 0, 0));
        return panel;

    }

    private  JPanel panel4(){

        JPanel panel = new JPanel();
        panel.setSize(300, 12);
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Contrasena en claro"), BorderLayout.WEST);

        text4 = new JTextField();
        text4.setMinimumSize(t);
        text4.setPreferredSize(t);
        text4.addFocusListener(new event3());

        panel.add(text4, BorderLayout.EAST);
        panel.setBackground(new Color(0, 0, 0, 0));
        return panel;

    }
    private class evento2 implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            try {

                text2.setText(text1.getValue().toString());
                text2.setFocusable(false);
                // text1.setFocusLostBehavior(text1.COMMIT);
                text1.requestFocus();

            }
            catch (Exception ex){

            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            text2.setFocusable(true);
        }
    }
    private  class event3 implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            char[] pvalor = text3.getPassword();
            text4.setText("");
            for(int i=0;i<pvalor.length;i++){
                text4.setText(text4.getText()+pvalor[i]);
            }
            text4.setFocusable(false);
            text3.requestFocus();
        }

        @Override
        public void focusLost(FocusEvent e) {
            text4.setFocusable(true);
        }
    }

}
