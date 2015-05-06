package com.company.JSwings;

import com.sun.javafx.sg.prism.NGShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by android on 04/05/2015.
 */
public class ModeloJList extends JFrame {

    JTextField textotitulo;
    JTextField campo;
    JList listaNombres;
    JLabel  mensaje;
    JButton agregar;
    JButton eliminar;
    JButton borrar;
    private DefaultListModel modelo;

    public ModeloJList ()
    {
        super("Curso Java JList");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel arreglo = new JPanel();
        arreglo.setLayout(new GridLayout(2,1));
        arreglo.add(panelNorte());
        arreglo.add(panelCentro());

        panel.add(arreglo, BorderLayout.CENTER);
        //panel.add(panelCentro(), BorderLayout.CENTER);
        panel.add(panelSouth(), BorderLayout.SOUTH);


        add(panel);
        pack();
        setVisible(true);

    }
    private  JTextField panelNorte(){

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        textotitulo = new JTextField();
        textotitulo.setEditable(false);
        textotitulo.setText("JList");
        textotitulo.setFont(new Font(textotitulo.getFont().getFontName(), textotitulo.getFont().getStyle(), 20));
        textotitulo.setHorizontalAlignment(SwingConstants.CENTER);

        Dimension t = new Dimension(20,30);

        textotitulo.setMaximumSize(t);
        textotitulo.setMinimumSize(t);
        textotitulo.setPreferredSize(t);
        //panel.add(textotitulo);

        return  textotitulo;

    }
    private JPanel panelCentro()
    {

        JPanel panel = new JPanel(new FlowLayout());
        campo = new JTextField(20);
        panel.add(campo);

        agregar = new JButton("Agregar");
        agregar.addActionListener(new EventosJbuttons());
        panel.add(agregar);

        return  panel;
    }

    private JPanel panelSouth()
    {

        JPanel panel = new JPanel(new BorderLayout());

        listaNombres = new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        modelo = new DefaultListModel();
        listaNombres.setModel(modelo);

        JScrollPane  scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 120, 220, 80);
        scrollLista.setViewportView(listaNombres);

        eliminar = new JButton("eliminar");
        borrar = new JButton("borrar");

        eliminar.addActionListener(new EventosJbuttons());
        borrar.addActionListener(new EventosJbuttons());

        panel.add(scrollLista, BorderLayout.NORTH);
        panel.add(eliminar, BorderLayout.WEST);
        panel.add(borrar, BorderLayout.EAST);

        mensaje = new JLabel("mensajes");
        panel.add(mensaje, BorderLayout.SOUTH);

        return  panel;
    }





    public class EventosJbuttons implements ActionListener{
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == agregar) {
                agregarNombre();
                mensaje.setText("Se agrego un nuevo elemento");
            }
            if (evento.getSource() == eliminar) {
                eliminarNombre(listaNombres.getSelectedIndex());
            }

            if (evento.getSource() == borrar) {
                borrarLista();
                        mensaje.setText("Se borro toda la lista");
            }
        }
    }
    private void agregarNombre() {
            String nombre =campo.getText();
            modelo.addElement(nombre);
            listaNombres.setModel(modelo);
            campo.setText("");
    }
    private void eliminarNombre(int indice) {
        if (indice>=0) {
            modelo.removeElementAt(indice);
                mensaje.setText("Se elimino un elemento en la posicion "+indice);
        }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar un indice" ,"Error", JOptionPane.ERROR_MESSAGE);
                mensaje.setText("NO se selecciono ningún elemento");}}

    private void borrarLista() {
            modelo.clear();}


}
