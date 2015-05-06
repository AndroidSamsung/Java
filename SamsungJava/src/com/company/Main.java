package com.company;

import com.company.Diapositivas.*;
import com.company.Ejercicio.Adivina;
import com.company.Ejercicio.Comparacion;
import com.company.Ejercicio.Nota;
import com.company.Ejercicio.SumaNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 17/04/2015.
 */
public class Main {


    public static void main(String [] args) throws NumberFormatException, IOException
    {

        //Variables
        SumaNumeros sumnumeros;
        Nota nota;
        Comparacion comparacion;
        Adivina adivina;

        NumerosEnteros numerosEnteros;

        Prueba_if ejer1 = new Prueba_if();
      //  ejer1.leer();

        Ejercicio2 ejer2 = new Ejercicio2();
        //  ejer2.introduzcir();

        Prueba_swicth ejer3 = new Prueba_swicth();
       // ejer3.seleccion();
        Calculadora cl = new Calculadora();
        //cl.init();

        boolean programa= true;
        while (programa) {

        BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ejercicios JAVA 20-04-2015 ");
        System.out.println("(1) Sumar 15 numeros");
        System.out.println("(2) Tipo de nota");
        System.out.println("(3) Comparar numeros");
        System.out.println("(4) Adivina el numero");
        System.out.println("(5) Numeros enteros ");
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
           sumnumeros = new SumaNumeros();
            sumnumeros.run();
            break;
        case 2:
            nota = new Nota();
            nota.run();
            break;
        case 3:
            comparacion = new Comparacion();
            comparacion.run();
            break;
        case 4:
            adivina = new Adivina();
            adivina.run();
            break;
        case 5:
            numerosEnteros = new NumerosEnteros();
            numerosEnteros.run();
            break;
        default:
            System.out.println("opcion no valida");
            break;
    }
}















    }
}
