package com.company.Recursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 20/04/2015.
 */
public class Palindroma {
    public void Palindroma(){}


    public boolean espalindroma(String palabra, boolean espa )
    {

        if(palabra.length()>2)
        {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1))
            {
               return (true && espalindroma(palabra.substring(1, palabra.length() - 1), true));
            }
            else
            {
                return false;
            }

        }
       else
            return espa;


    }

    public  void  run() throws IOException {
        String mipalabra;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Es palindroma la palabra?: ");
       mipalabra= linea.readLine();



        if(espalindroma(mipalabra.toUpperCase(), false))
            System.out.println("La palabra "+mipalabra+ " es palindroma");
        else
            System.out.println("La palabra "+mipalabra+ " no es palindroma");

    }



}
