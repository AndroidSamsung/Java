package com.company.Recursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 20/04/2015.
 */
public class Division {

    public void Division(){}

   public int dividir(int dividendo, int divisor) {

       if (divisor >dividendo)
       return 0;
       else
       return dividir(dividendo - divisor, divisor)+1;

   }

    public void run ()  throws IOException {

        int a;
        int b;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduzca Dividendo");
       a = Integer.parseInt (linea.readLine());
        System.out.println("Introduzca divisor");
        b= Integer.parseInt (linea.readLine());

        System.out.println("Division por restas: "+dividir(a, b));

    }

}
