package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class PromedioEdades {
    int total;
    int edades;
    int mayores;

    public void PromedioEdades(){this.total=0; mayores=0; edades=0;}
    public void dameEdad(int edad){
        edades +=edad;
        total++;
        if(edad>=50)
            mayores++;
    }
    public void promedio(){
        System.out.println("Hay "+total+" edades");
        System.out.println("El promedio de edades es: " + edades / total);
        System.out.println("hay un "+(100*mayores)/total+" % de personas mayores de 50 anos");

    }

    public void run()throws IOException {
        int edad;
       BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));

        do{
            System.out.println("ingresa edad,0 para terminar:");
            edad=Integer.parseInt(linea.readLine());
            if(edad!=0)
                 dameEdad(edad);
        }
        while (edad!=0);
        promedio();

    }

}
