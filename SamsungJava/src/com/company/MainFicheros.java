package com.company;



import com.company.Ficheros.MezclaNatural;
import com.company.Ficheros.NumerosFichero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 22/04/2015.
 */
public class MainFicheros {

    public static void main(String [] args) throws NumberFormatException, IOException
    {
        BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));


     /*    AppFicheroTexto appficheros = new AppFicheroTexto();
       System.out.println("Copiar fichroA, ficheroB en FicheroAB");
        System.out.println("inserte rutas en Formato RutaFichero1 , rutaFichero2 , rutaFicheroSalida");
        System.out.println("Formato C:\\[Ruta]\\[nombreFichero].[extencion]");
        appficheros.copiarFicheros(linea.readLine());

    */

    /*   AnalisarFichero xFichero = new AnalisarFichero();
        System.out.println("Analisar fichero en busqueda de mayusculas minusculas, simbolos, y errores");
        System.out.println("inserte rutas en Formato C:\\[Ruta]\\[nombreFichero].[extencion]");
        xFichero.analizameFichero(linea.readLine());
        System.out.println("Hay: " + xFichero.getNumerocaracteres() + " caracteres");
        System.out.println("Hay: " + xFichero.getNumerosignos() + " simbolos");
        System.out.println("Hay: "+xFichero.getNumeromayusculas()+" mayusculas");
        System.out.println("Hay: "+xFichero.getNumerominusculas()+" minusculas");
        System.out.println("Hay: "+xFichero.getNumerodigitos()+" digitos distintos");
    */
        NumerosFichero xnumeros = new NumerosFichero();

    /*    System.out.println("Ordenar numeros de 2 ficheros a uno");
        System.out.println("De cuantos ficheros va a ordenar los numeros");
        try {

            xnumeros.setnumeroFicherosCopiar(Integer.parseInt(linea.readLine()));
            System.out.println("ingrese ruta Fichero destino");
            xnumeros.setBufferedWriter(linea.readLine());
            xnumeros.copiarOrdenadarContenido();



        }
        catch (Errores e)
        {
            System.out.println(e.getMessage());
        }
        */

        System.out.println("Mescla natural");
        MezclaNatural xNatural = new MezclaNatural();
        System.out.println("Introduzca ruta fichero");
        xNatural.setFicheroOrigien(linea.readLine());
        System.out.println("Introduzca ruta destino");
        xNatural.setFicheroSalida(linea.readLine());




    }
}
