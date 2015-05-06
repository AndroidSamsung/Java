package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 22/04/2015.
 */
public class AnalisisStringChar extends  AnalisisString {


    public int getVecesCaracter(String _char){
        int total=0;
        String _cadena = cadena.toUpperCase(); //Copio la cadena y la paso a mayusculas

        _char = _char.toUpperCase();

        String[] array = _cadena.split("");

        for(int i=0;i<array.length;i++){
            if(_char.equals(array[i]))
                total++;
        }
        return total;
    }



    public void run() throws IOException {

        String mipalabra;
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Analisis de cadena:");
        mipalabra = linea.readLine();
        setCadena(mipalabra);

        System.out.println("Que caracter quiere buscar?: ");
        System.out.println("Hay "+getVecesCaracter(linea.readLine()));
        System.out.println(deleteSpaces());

    }

}
