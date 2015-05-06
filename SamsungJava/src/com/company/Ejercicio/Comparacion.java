package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 17/04/2015.
 */
public class Comparacion {

    public void Comparacion(){}

    public void run() throws IOException {

        int num1;
        int num2;
        BufferedReader linea =new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Comparar dos numeros");
        System.out.print("Numero A: ");
        num1 = Integer.parseInt(linea.readLine());

        linea =new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Numero B: ");
        num2 = Integer.parseInt(linea.readLine());

        if (num1> num2)
            System.out.println(num1 +" mayor que "+ num2);
        else if (num1< num2)
            System.out.println(num2 +" mayor que "+ num1);
        else
            System.out.println("son iguales");

    }

}


