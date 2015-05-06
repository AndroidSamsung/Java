package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Piramide {


    public void Piramide(){}

    public int generar(int n){
        return (2*n+1);
    }
    public void lineasPiramide(int n){
        for(int i=1; i<=n;i++) {
            for (int x = 0; x < i; x++)
                System.out.print(generar(x));
            System.out.println();
        }

    }
    public void run () throws IOException {
        System.out.println("Piramide de N numeros impares:");
        System.out.print("Introduzca Tamano N= ");
        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        lineasPiramide(Integer.parseInt(linea.readLine()));
    }
    
}
