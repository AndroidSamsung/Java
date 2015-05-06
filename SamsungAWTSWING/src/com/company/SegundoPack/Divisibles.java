package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Divisibles {

    int[] vector;
    int contador;

    public Divisibles(){ vector = new int[20]; contador=0; }

    public void rellenar(int elemento){
        vector[contador]= elemento;
        contador++;
    }
    public void mostrar(int pos){
        if(vector[pos]%3==0)
        System.out.println("Numero "+vector[pos]+ " es divisible por 3" );
        else
            System.out.println("Numero "+vector[pos]+ " NO divisible por 3" );

    }

    public void run () throws IOException {

        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el 20 numeros ");
        for(int i=0;i<20;i++) {
            System.out.print("Numero "+(i+1)+" :");
            rellenar(Integer.parseInt(linea.readLine()));
        }
        for(int i=0;i<20;i++) {
            mostrar(i);
        }


    }
}
