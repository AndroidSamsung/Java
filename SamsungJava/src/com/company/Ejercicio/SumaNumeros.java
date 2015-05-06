package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 17/04/2015.
 */
public class SumaNumeros {

    public void SumaNumeros(){}
    public void run() throws IOException {

        int num=1;
        int sum=0;

        System.out.println("suma 15 numeros");
        BufferedReader linea;
        while (num<=15){
            linea =new BufferedReader (new InputStreamReader(System.in));
            System.out.print("introduzca numero "+num+": ");
            sum += Integer.parseInt(linea.readLine());
            num++;
        }
        System.out.print("Suman total "+sum);







    }
}
