package com.company.Menus;

import java.awt.*;

/**
 * Created by android on 24/04/2015.
 */
public class Menu1 extends Frame {

    private  MenuBar barramenu;

    private Menu file, edit,help;
    private MenuItem open,save,close,msalir,exit;

    private MenuItem cut,copy,paste,delete,search,remplace;
    private MenuItem hsearch, index;




public Menu1(){

    super("3 menus");

    barramenu = new MenuBar();

     file = new Menu("File");

        open = new MenuItem("Abrir");
        save = new MenuItem("Guardar");
        close = new MenuItem("Cerrar");
        msalir = new MenuItem("Menu salir");
        exit = new MenuItem("Salir");

    file.add(open);
    file.add(save);
    file.add(close);
    file.addSeparator();
    file.add(msalir);
    file.add(exit);

    edit = new Menu("Edit");

        cut = new MenuItem("Cortar");
        copy = new MenuItem("Copiar");
        paste = new MenuItem("Pegar");
        delete = new MenuItem("Eliminar");
        search = new MenuItem("Buscar");
        remplace = new MenuItem("Remplazar");

    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(delete);

    edit.addSeparator();

    edit.add(search);
    edit.add(remplace);

    help = new Menu("help");
        hsearch = new MenuItem("Search:");
        index = new MenuItem("indice");
    help.add(hsearch);
    help.add(index);


    barramenu.add(file);
    barramenu.add(edit);
    barramenu.add(help);

    setMenuBar(barramenu);
    setSize(400,400);
    setVisible(true);


}

}
