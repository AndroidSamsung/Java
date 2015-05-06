package com.company.Diapositivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Fabricio on 21/04/2015.
 */
public class Calculadora {
    public void Calculadora(){}

    public void init()throws IOException {
        BufferedReader en = new BufferedReader (new InputStreamReader(System.in));
        int opcion, resultado,numero1,numero2;
        opcion = 0;
        do { System.out.print("¿Que desea hacer?\n1)Suma\n2)Resta\n3)Multiplicación\n4)Divisón\n\n>> ");
            opcion = Integer.parseInt(en.readLine());
            System.out.print("Ingrese el primer número: >> ");
            numero1 = Integer.parseInt(en.readLine());
            System.out.print("Ingrese el segundo número: >> ");
            numero2 = Integer.parseInt(en.readLine());
            switch(opcion){
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("La suma es "+resultado+"\n");
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("La resta es "+resultado+"\n");
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("La multiplicación es "+resultado+"\n");
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("La división es "+resultado+"\n");
                    break; }
        }while(opcion != 0);
    }
}
