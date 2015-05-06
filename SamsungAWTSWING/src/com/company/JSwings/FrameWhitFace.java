package com.company.JSwings;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by android on 30/04/2015.
 */
public class FrameWhitFace extends JFrame {


    public  FrameWhitFace (){
        super("Cara");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        setContentPane(panel);

        panel.setLayout(null);

        setSize(300, 300);
        setVisible(true);



    }



    public void paint (Graphics g)
    {
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.black);

        g.fillOval(85, 110, 30, 30);
        g.fillOval(180, 110, 30, 30);

        g.fillOval(95,170, 110, 50);
        g.setColor(Color.yellow);
        g.fillOval(95,165, 110, 50);


    }



}
