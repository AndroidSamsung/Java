package com.company.Ventanas;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.BufferUnderflowException;

/**
 * Created by android on 24/04/2015.
 */
public class Chat extends Frame{

    Button loggin;
    Button send;
    Button logout;
    TextField nickname;
    List chathistory;
    TextField chatSend;

    Panel plogin;
    Panel phistory;
    Panel psend;

    public Chat (){

        super();

        this.setBackground(Color.DARK_GRAY);

        setLayout(new BorderLayout());

        plogin = crearLogin_logout();

        add(plogin, BorderLayout.NORTH);

        phistory = crearChatHistory();
        add(phistory, BorderLayout.CENTER);
        psend = crearChatSend();
        add(psend, BorderLayout.SOUTH);
        pack();
        setVisible(true);
}

    public Panel crearLogin_logout(){
        Panel p = new Panel((new FlowLayout(FlowLayout.LEFT)));
        Label lb = new Label("Nick:");
        lb.setForeground(Color.white);
        p.add(lb);
        nickname = new TextField(10);
        p.add(nickname);
        loggin = new Button("loggin");
        p.add(loggin);
        logout = new Button("logout");
        p.add(logout);
        return p;
    }
    public Panel crearChatHistory(){
        Panel p = new Panel(new BorderLayout());
        Label lb = new Label("Conversacion");
        lb.setForeground(Color.white);
        p.add(lb, BorderLayout.NORTH);
        chathistory = new List();
        p.add(chathistory);
        return p;
    }

    public Panel crearChatSend(){
        Panel p = new Panel(new BorderLayout());
        Label msn = new Label("Mensaje");
        msn.setForeground(Color.white);

        p.add(msn, BorderLayout.WEST);

        chatSend = new TextField();
        p.add(chatSend, BorderLayout.CENTER);

        send = new Button("enviar");
        p.add(send, BorderLayout.EAST);
        return p;
    }

    //Versiones

}
