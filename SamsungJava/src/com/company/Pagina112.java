package com.company;


import com.company.Ejercicio.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Pagina112 {

    public static void main(String [] args) throws Exception {

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


        boolean programa= true;
        while (programa) {

            BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ejercicios JAVA 20-04-2015 ");
            System.out.println("(1) String con el típico formato \"apellidos, nombre\"");
            System.out.println("(2) Almacena el tiempo transcurrido del día en segundos");
            System.out.println("(3) El promedio de las edades ingresadas");
            System.out.println("(4) N filas de números naturales impares");
            System.out.println("(5) Muestra por consola el indice y el valor al que corresponde en evector ");
            System.out.println("(6) Vector indicando a la derecha de cada uno si es divisible por 3");
            System.out.println("(7) Array desde el teclado y calcule y muestre: la suma, el valor medio, el mayor y el menor");
            System.out.println("(8) Calcular su media y cuáles de las temperaturas son inferiores a la media.");
            System.out.println("(9) Invierta un vector");
            System.out.println("(10) Calcula la letra de un DNI");
            System.out.println("(11) En desarrollo ");
            System.out.println("(12) El numero introducido es capicúa,");
            System.out.println("(13) Determine el número de mayúsculas y el número de minúsculas");
            System.out.println("(14) Indique el número de veces que se encuentra el carácter");
            System.out.println("(0) Salir");
            System.out.print("Opcion: ");
            int opc;
            opc = Integer.parseInt (linea.readLine());



            switch (opc) {
                case 0:
                    programa = false;
                    System.out.println("programa finalizado");
                    break;
                case 1:
                    miNombre = new NombreApellido();
                    miNombre.run();
                    break;
                case 2:
                    xtiempo = new Tiempo();
                    xtiempo.run();
                    break;
                case 3:
                    xedad = new PromedioEdades();
                    xedad.run();

                    break;
                case 4:
                    xPiramide = new Piramide();
                    xPiramide.run();

                    break;
                case 5:
                    xVector = new MiVector();
                    xVector.run();
                    break;

                case 6:
                    xDivisibles = new Divisibles();
                    xDivisibles.run();

                    break;
                case 7:
                    xAna = new AnalisarVector();
                    xAna.run();

                    break;
                case 8:
                    xtemp = new Temperaturas();
                    xtemp.run();

                    break;
                case 9:
                    xInv = new InvertirVector();
                    xInv.run();

                    break;
                case 10:
                    xDNI = new DNI();
                    xDNI.run();
                    break;
                case 11:
                    run_ejer11();

                    break;
                case 12:
                    xCapicua = new Capicua();
                    xCapicua.run();

                    break;
                case 13:
                    xstring = new AnalisisString();
                    xstring.run();

                    break;
                case 14:
                    xcahr = new AnalisisStringChar();
                    xcahr.run();
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }

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
