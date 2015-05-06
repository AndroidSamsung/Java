package com.company.Recursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 20/04/2015.
 */
public class SumaDigitos {

    public void SumaDigitos(){}


    public int suma(String numero ){

        if(numero.length()>0){
           // System.out.println(numero.substring(0,1));
            return  Integer.parseInt(numero.substring(0,1))+ suma(numero.substring(1));
        }
        return  0;
    }
    public int sumarestos(int num){
            if(num>0)
          return num%10 + sumarestos(num/10);
        else
                return 0;

        }



    public void run()throws IOException {

        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sumador de cifras");
        System.out.println("Introduzca un numero");
       // System.out.println("La suma de sus cifras son: "+suma(linea.readLine()));
        System.out.println("La suma de sus cifras son: "+sumarestos(Integer.parseInt(linea.readLine())));


    }
}
