package com.company.Calculadoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;


public class JCalculadora extends JFrame {

    private MiCalculadora miCalculadora;

    private  final Color  backgroud = new Color(60, 63, 65);
    private  final Color  backgroudDisplay = new Color(43, 43, 43);
    private  final Color  foregroundWhile = new Color(255, 242, 246);
    private  final Color  backgroudOperations = new Color(203, 128, 9);
    private  final Color  backgroudOperationsPresset = new Color(255, 10, 60);


    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton bDec,bMas,bMenos,bPor,bDiv,bIgual,bBorrar;
    private JButton bmasMemoria, bmenosMemoria, bRaiz,ballDelete, bmasmenos, bcuadrados;

    private JTextField tfDisplay;
    private JTextField resultdisplay;

    public JCalculadora (){
        super("Calculadora SWING");

       // setLayout(new BorderLayout());
        miCalculadora = new MiCalculadora();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("...Cerrando Ventana");
                System.exit(0);
            }
        });


        JPanel panelcalculadora = new JPanel();
        panelcalculadora.setLayout(new BorderLayout());





        JPanel panelNumerosOperaciones = new JPanel();
        panelNumerosOperaciones.setLayout(new BorderLayout());

        panelNumerosOperaciones.add(crearPanelEspeciales(), BorderLayout.NORTH);
        panelNumerosOperaciones.add(crearNumeros(), BorderLayout.WEST);
        panelNumerosOperaciones.add(crearPanelOperaciones(), BorderLayout.EAST);


        panelcalculadora.add(crearDisplay(), BorderLayout.NORTH);
        panelcalculadora.add(panelNumerosOperaciones,BorderLayout.CENTER);





      //  pTeclado.setBackground(backgroud);

        add(panelcalculadora);

        setSize(240,380);
        setResizable(false);

        setVisible(true);
    }

    private JPanel crearDisplay(){

        JPanel p = new JPanel( new GridLayout(2,1) );

        resultdisplay = new JTextField();
        resultdisplay = new JTextField();
        resultdisplay.setForeground(foregroundWhile);
        resultdisplay.setBackground(backgroudDisplay);
        resultdisplay.setHorizontalAlignment(JTextField.LEFT);
        resultdisplay.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 18));
         p.add(resultdisplay);

        tfDisplay = new JTextField();
        tfDisplay = new JTextField();
        tfDisplay.setForeground(foregroundWhile);
        tfDisplay.setBackground(backgroudDisplay);
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);

        tfDisplay.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 30));



        p.add(tfDisplay);




        return p;

    }
    private JPanel crearNumeros(){
        b0 = crearNumero("0");
        b1 = crearNumero("1");
        b2 = crearNumero("2");
        b3 = crearNumero("3");
        b4 = crearNumero("4");
        b5 = crearNumero("5");
        b6 = crearNumero("6");
        b7 = crearNumero("7");
        b8 = crearNumero("8");
        b9 = crearNumero("9");

        bBorrar = crearNumero("c");
        bDec = crearNumero(".");

        JPanel p = new JPanel( new GridLayout(4,3) );

        // Agrego los botones al panel fila 0 (la mas arriba)

        // fila 1 (la segunda comenzando desde arriba)
        p.add(b7); p.add(b8); p.add(b9);
        // fila 2 (la segunda comenzando desde arriba)
        p.add(b4); p.add(b5); p.add(b6);
        // fila 3 (la tercera comenzando desde arriba)
        p.add(b1); p.add(b2); p.add(b3);
        //Fila 4
        p.add(bBorrar); p.add(b0); p.add(bDec);
        return p;
    }
    private JPanel crearPanelEspeciales(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,4));


        bmasMemoria = crearBotonOperacionEspecial("M+");
        bmenosMemoria = crearBotonOperacionEspecial("M");
        bRaiz = crearBotonOperacionEspecial("\u221A");
        //178 cuadrado;
        //177 mas menos
        char a;

        ballDelete = crearBotonOperacionEspecial(String.valueOf("CA"));
        a= 177;
        bmasmenos = crearBotonOperacionEspecial(String.valueOf(a));
        a=178;

        bcuadrados = crearBotonOperacionEspecial("x"+String.valueOf(a));

        panel.add(bmasMemoria);
        panel.add(bmenosMemoria);
        panel.add(bmasmenos);
        panel.add(bRaiz);
        panel.add(ballDelete);
        panel.add(bcuadrados);

        return  panel;
    }
    private JPanel crearPanelOperaciones(){

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));


        bMas =crearBotonOperacion("+");
        bMenos =crearBotonOperacion("-");
        bDiv = crearBotonOperacion("/");
        bPor = crearBotonOperacion("x");
        bIgual = crearBotonOperacion("=");

        panel.add(bMas);
        panel.add(bMenos);
        panel.add(bDiv);
        panel.add(bPor);
        panel.add(bIgual);
        return  panel;
    }


    private JButton crearBotonOperacion(String label) {

        Dimension t = new Dimension(80,65);

        JButton xb = new JButton(label);
        xb.setBackground(backgroudOperations);
        xb.setForeground(foregroundWhile);
        xb.setName(label);


        Font fuente = new Font("Dialog", Font.ROMAN_BASELINE, 30);
        xb.setFont(fuente);
        xb.setMinimumSize(t);
        xb.setPreferredSize(t);
        xb.addActionListener(new eventoOperaciones());

        return xb;
    }
    private JButton crearNumero(String label){
        JButton xb = new JButton(label);
        xb.setBackground(backgroud);
        xb.setForeground(foregroundWhile);
        xb.setName(label);
        Font fuente=new Font("Dialog", Font.ROMAN_BASELINE, 30);
        xb.setFont(fuente);
        xb.addActionListener(new eventoButton());

        return xb;
    }
    private JButton crearBotonOperacionEspecial(String label) {

        Dimension t = new Dimension(30,30);
        JButton xb = new JButton(label);
        xb.setBackground(new Color(113, 113, 113));
        xb.setForeground(foregroundWhile);
        xb.setName(label);
        Font fuente = new Font("Dialog", Font.ROMAN_BASELINE, 15);
        xb.setFont(fuente);
        xb.setMinimumSize(t);
        xb.setPreferredSize(t);
       xb.addActionListener(new eventoOperacionesEspeciales());

        return xb;
    }


    public class eventoButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String nt = e.getActionCommand();
            if (nt.equals("c"))
                tfDisplay.setText("");
            else {
                if(miCalculadora.isTypedcomplete()) {
                    if(miCalculadora.getTypeoperation().equals("="))
                    {
                        resultdisplay.setText("");
                        tfDisplay.setText(nt);
                    }
                    else {
                        tfDisplay.setText(nt);
                        miCalculadora.setTypedcomplete(false);
                    }
                }
                else if(!miCalculadora.isTypedcomplete())
                {
                    if(nt.equals("."))
                    {
                        if(!tfDisplay.getText().contains("."))
                            tfDisplay.setText(tfDisplay.getText() + nt);
                    }
                    else
                        tfDisplay.setText(tfDisplay.getText() + nt);

                }

            }

        }
    }

    public class eventoOperaciones implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            operaciones(e.getActionCommand());
        }
    }

    public class eventoOperacionesEspeciales implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operacionesEspeciales(e.getSource());
        }
    }



    private float men;
    private boolean typed, typedmenos;


    private void operaciones (String op){
        try {

            if(tfDisplay.getText().equals(""))
                return;

            //Grafico los datos
            if(!miCalculadora.isTypedcomplete())
                resultdisplay.setText(resultdisplay.getText() +tfDisplay.getText()+ op);

           else if(miCalculadora.getTypeoperation().equals("=")){
                   resultdisplay.setText(tfDisplay.getText()+op);
                }
            else{
                resultdisplay.setText(resultdisplay.getText()+op);
                 }

            //Almaceno los numeros
            if (miCalculadora.getNumero1() == 0.0)
                miCalculadora.setNumero1(Double.parseDouble(tfDisplay.getText()));
            else
                miCalculadora.setNumero2(Double.parseDouble(tfDisplay.getText()));

            miCalculadora.makeOperation();
            miCalculadora.setTypeoperation(op);

            tfDisplay.setText(String.valueOf(miCalculadora.getResult()));

          //  resultdisplay.setText(resultdisplay.getText() + op);
        }
        catch (Exception ex){}

    }

    private void operacionesEspeciales(Object op){
        Color enabled = new Color(113, 113, 113);
        Color disabled = new Color(210, 5, 42);
        if(op ==bmasMemoria) {
            try {
                men = Float.parseFloat(tfDisplay.getText());
                typed = true;
                bmasMemoria.setBackground(disabled);
            }
            catch (Exception ex){}
        }

        else if(op ==bmenosMemoria)
        {
            tfDisplay.setText(String.valueOf(men));
            bmasMemoria.setBackground(enabled);
        }
        else if(op ==ballDelete){

            tfDisplay.setText("");
            resultdisplay.setText("");
            miCalculadora.clearAllDates();

        }
        else if(op ==bRaiz){
            if(!tfDisplay.getText().equals(""))
                resultdisplay.setText(resultdisplay.getText() +"√"+tfDisplay.getText());
            Double numero;
            numero =  Math.sqrt(Double.valueOf(tfDisplay.getText()));
            miCalculadora.setResult(numero);
            tfDisplay.setText(String.valueOf(miCalculadora.getResult()));
            miCalculadora.setTypedcomplete(true);
        }

        else if(op == bmasmenos){
            if(!tfDisplay.getText().equals("")) {
                Double numaux = Double.valueOf(tfDisplay.getText());
                numaux = (-1)*numaux;
                tfDisplay.setText(String.valueOf(numaux));
            }


        }

        else if(op ==bcuadrados)
        {
            if(!tfDisplay.getText().equals(""))
            {
                float cuad = Float.valueOf(tfDisplay.getText());
                char a;
                a=178;
                resultdisplay.setText(resultdisplay.getText()+tfDisplay.getText()+String.valueOf(a));
                cuad = cuad*cuad;
                tfDisplay.setText(String.valueOf(cuad));
                typed = true;
            }

        }


    }

}



