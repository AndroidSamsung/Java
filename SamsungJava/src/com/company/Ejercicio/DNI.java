package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class DNI {

    public DNI(){}

    public String getLeter(int numero){
        String[] letras =  {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return Integer.toString(numero)+letras[numero%23];
    }

    public void run()throws IOException {


        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el numero de dnir: ");

       System.out.println(getLeter(Integer.parseInt(linea.readLine()))); //Creo los elemtos


    }
}
