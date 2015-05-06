package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Capicua {

    public Capicua() {
    }


    public boolean esCapicuo(String palabra, boolean espa) {

        if (palabra.length() > 2) {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
                return (true && esCapicuo(palabra.substring(1, palabra.length() - 1), true));
            } else {
                return false;
            }

        } else
            return espa;


    }
    public boolean esCapicuo(int n){

        int r,s=0,k;
        k=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==k)
        return  true;
        else
        return false;
    }


    public void run() throws IOException {
        String mipalabra;
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Es capicuo el numero: ");
        mipalabra = linea.readLine();


        if (esCapicuo(Integer.parseInt(mipalabra)))
            System.out.println("El numero  " + mipalabra + " es capicua");
        else
            System.out.println("La numero " + mipalabra + " no es capicua");

    }
}