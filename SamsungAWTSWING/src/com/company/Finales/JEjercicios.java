package com.company.Finales;

import com.company.JSwings.Mensaje;
import com.company.Recursivos.Division;
import com.company.Recursivos.Palindroma;
import com.company.Recursivos.SumaDigitos;
import com.company.Recursivos.SumaVector;
import com.company.SegundoPack.*;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 04/05/2015.
 */
public class JEjercicios extends JFrame{

    JPanel jrecursivos, jdospack, jswing;
    JPanel contenido;
    MenuItem recursivos, segundopack, swing;

    Opciones opciones;

    //Ejercicios Segundo pack
    NombreApellido miNombre;
    Tiempo xtiempo ;
    PromedioEdades xedad;
    Piramide xPiramide ;
    MiVector xVector;
    Divisibles xDivisibles;
    AnalisarVector xAna;
    Temperaturas xtemp;
    InvertirVector xInv;
    DNI xDNI;
    Capicua xCapicua;
    AnalisisString xstring;
    AnalisisStringChar xcahr;






    public JEjercicios (){

        super("lista ejercicios");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        contenido = new JPanel(new FlowLayout(FlowLayout.CENTER));

        opciones = new Opciones();

        panelrecursivos();
        panelsegundoPack();
        paneljswing();

        JButton ok = new JButton("OK");
        ok.addActionListener(e -> opciones.ejecutar());
        contenido.add(ok);


        add(contenido);

        setMenuBar(menu());
         pack();
        setVisible(true);

    }

    private MenuBar menu(){
        MenuBar barraDeMenu = new MenuBar();
        Menu ejer = new Menu("Ejercicios");

        recursivos = new MenuItem("Recursivos");
        segundopack = new MenuItem("Segundo pack");
        swing = new MenuItem("Swing");


        recursivos.addActionListener(new ListenerItem());
        segundopack.addActionListener(new ListenerItem());
        swing.addActionListener(new ListenerItem());


        ejer.add(recursivos);
        ejer.add(segundopack);
        ejer.add(swing);

        barraDeMenu.add(ejer);

        return  barraDeMenu;
    }

    private  void panelrecursivos(){
        jrecursivos = new JPanel();

        Border   border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Recursivos");

        jrecursivos.setBorder(titulo);
        jrecursivos.setLayout(new BoxLayout(jrecursivos, BoxLayout.Y_AXIS));


        ButtonGroup group = new ButtonGroup();

        String[] listabuttons = new String[] {"Division","Palindroma","Suma Digitos", "Suma Vector"};

        for(int i=0; i<listabuttons.length;i++)
        {
            JRadioButton rb = new JRadioButton(listabuttons[i]);
            rb.addActionListener(new RadioListener());
            group.add(rb);
            jrecursivos.add(rb);

        }
        jrecursivos.setVisible(true);


        contenido.add(jrecursivos);
    }







    private  void panelsegundoPack(){
        jdospack = new JPanel();

        Border   border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Segundo pack");

        jdospack.setBorder(titulo);


        ButtonGroup group = new ButtonGroup();
        String[] listabuttons = new String[] {"Nombre Apellido","Tiempo","Promedio Edades", "Suma Vector"};

        for(int i=0; i<listabuttons.length;i++)
        {
            JRadioButton rb = new JRadioButton(listabuttons[i]);
            rb.addActionListener(new RadioListener());
            group.add(rb);
            jdospack.add(rb);

        }

        jdospack.setVisible(false);

        contenido.add(jdospack);


    }

    private  void paneljswing(){
        jswing = new JPanel();

        Border   border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Swing");

        jswing.setBorder(titulo);

        ButtonGroup group = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("Swing");

        group.add(r1);


        jswing.add(r1);

        jswing.setVisible(false);

        contenido.add(jswing);


    }


//listeners

    public class ListenerItem implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == recursivos) {
                opciones.setTipoEjercicisio("Recursivos");
                jrecursivos.setVisible(true);
                jdospack.setVisible(false);
                jswing.setVisible(false);
            }
            else if(e.getSource() == segundopack) {
                opciones.setTipoEjercicisio("Segundo Pack");
                jdospack.setVisible(true);
                jrecursivos.setVisible(false);
                jswing.setVisible(false);
            }

            else if(e.getSource() == swing) {
                opciones.setTipoEjercicisio("Swing");
                jdospack.setVisible(false);
                jrecursivos.setVisible(false);
                jswing.setVisible(true);
            }
              //  panelrecursivos();
        }
    }

    public class RadioListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
            {
                opciones.setTipoOperacion(e.getActionCommand().toString());
            }
    }


    // Objeto Opciones
    public class Opciones{
        String op;
        String tipo;

        public void setTipoEjercicisio(String tipo){
            this.tipo = tipo;
        }

        public void setTipoOperacion(String op){
            this.op= op;
        }

        public  void ejecutar(){

            if(tipo.equals("Recursivos"))
                loadSwichRecursivos();
            else if(tipo.equals("Segundo Pack"))
                loadSwichSegudoPack();


        }


        private void loadSwichRecursivos() {

            Mensaje.Display("Vease en consola", op);

            try {
                switch (op) {
                    case "Division":
                        Division r = new Division();
                        r.run();

                        break;
                    case "Palindroma":
                        Palindroma rp = new Palindroma();
                        rp.run();
                        break;

                    case "Suma Digitos":
                        SumaDigitos sd = new SumaDigitos();
                        sd.run();
                        break;

                    case "Suma Vector":
                        SumaVector sv = new SumaVector();
                        sv.run();
                        break;


                }
            }

            catch(Exception ex){}


        }

        private void loadSwichSegudoPack(){
try {
    Mensaje.Display("Vease en consola",op);
    switch (op) {
        case "Nombre Apellido":
            NombreApellido miNombre = new NombreApellido();
            miNombre.run();
            break;
        case "Tiempo":
            xtiempo = new Tiempo();
            xtiempo.run();
            break;
        case "Promedio Edades":
            xedad = new PromedioEdades();
            xedad.run();

            break;
        case "Piramide":
            xPiramide = new Piramide();
            xPiramide.run();

            break;
        case "Mi vector":
            xVector = new MiVector();
            xVector.run();
            break;

        case "Divisible":
            xDivisibles = new Divisibles();
            xDivisibles.run();

            break;
        case "Analisis Vector":
            xAna = new AnalisarVector();
            xAna.run();

            break;
        case "Temperaturas":
            xtemp = new Temperaturas();
            xtemp.run();

            break;
        case "Invertir Vector":
            xInv = new InvertirVector();
            xInv.run();

            break;
        case "DNI":
            xDNI = new DNI();
            xDNI.run();
            break;
        case "Guarda Notas":
            run_ejer11();

            break;
        case "Capicua":
            xCapicua = new Capicua();
            xCapicua.run();

            break;
        case "Analisis string":
            xstring = new AnalisisString();
            xstring.run();

            break;
        case "String char":
            xcahr = new AnalisisStringChar();
            xcahr.run();
            break;
    }
}
catch (Exception e){}

        }

    }

    public static void run_ejer11() throws Exception{

        GuardaNotas xNotas = new GuardaNotas();
        BufferedReader nota=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Cargar 10 notas");
        for(int i=0;i<10;i++) {
            System.out.print("Nota[" + (i + 1) + "] ");
            if(!xNotas.setNota(nota.readLine())) i--; //Si la nota no es correcta vuelvo a pedirla
            System.out.println();
        }
        System.out.println("Inserte los 10 alumnos");
        for(int i=0;i<10;i++){
            System.out.print("Alumno [" + (i + 1) + "]: ");
            xNotas.setNombre(nota.readLine());
            System.out.println();
        }
        xNotas.visualizarDatos();
    }


}
