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
        do { System.out.print("�Que desea hacer?\n1)Suma\n2)Resta\n3)Multiplicaci�n\n4)Divis�n\n\n>> ");
            opcion = Integer.parseInt(en.readLine());
            System.out.print("Ingrese el primer n�mero: >> ");
            numero1 = Integer.parseInt(en.readLine());
            System.out.print("Ingrese el segundo n�mero: >> ");
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
                    System.out.println("La multiplicaci�n es "+resultado+"\n");
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("La divisi�n es "+resultado+"\n");
                    break; }
        }while(opcion != 0);
    }
}
