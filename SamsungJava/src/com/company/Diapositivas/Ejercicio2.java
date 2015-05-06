package com.company.Diapositivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Fabricio on 21/04/2015.
 */
public class Ejercicio2 {

    public void Ejercicio2()  {

    }

    public void introduzcir()  throws IOException {
        int num;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = Integer.parseInt (linea.readLine());
        if(num<10)
            System.out.println("tiene 1 cifra");
        else{ if(num<100)
            System.out.println("tiene 2 cifras");
        else {
            if (num < 1000)
                System.out.println("tiene 3 cifras");
            else {
                if (num < 10000)
                    System.out.println("tiene 4 cifras");
                else {
                    if (num < 100000)
                        System.out.println("tiene 5 cifras");
                }

            }
        }}}
}
