package com.company.Menus;

import java.awt.*;

/**
 * Created by android on 24/04/2015.
 */
public class MenuCurso extends Frame {
    private MenuBar barraDeMenu;
    private Menu vista;
    private Menu salir;
    private MenuItem v1;
    private MenuItem v2;
    private MenuItem v3;
    private MenuItem exit;

    public MenuCurso (){
        super("Mi Menu de Ejemplo");
        setLayout(new FlowLayout());
        barraDeMenu = new MenuBar();
        vista = new Menu("Vista");
        v1= new MenuItem("vista1");
        v2= new MenuItem("vista2");
        v3= new MenuItem("vista3");
        vista.add(v1);vista.add(v2);
        vista.addSeparator();
        vista.add(v3);
        salir = new Menu("Salir");
        exit=new MenuItem("Salir");
        salir.add(exit);
        barraDeMenu.add(vista);
        barraDeMenu.add(salir);
        setMenuBar(barraDeMenu);
        setSize(400,400);
        setVisible(true); }



}
