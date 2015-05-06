package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 17/04/2015.
 */
public class Nota {
    public void Nota(){}

    public void run()throws IOException {

        int num;
        BufferedReader linea =new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Tipo de nota");
        System.out.print("introduzca una nota entera entre 0-10:  ");
        num = Integer.parseInt(linea.readLine());

        if(num<=4)
            System.out.println("insuficiente");
        else if (num<=7)
        System.out.println("suficiente");
        else if (num<=10)
        System.out.println("bien");
        else
        System.out.println("nota incorrecta");



    }
}
