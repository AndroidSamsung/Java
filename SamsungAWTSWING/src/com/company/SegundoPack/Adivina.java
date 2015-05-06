package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

/**
 * Created by android on 17/04/2015.
 */
public class Adivina {

    public void Adivina(){}

    public void run() throws IOException {

        Date fecha1 = new Date ();

        Random rnd = new Random();
        rnd.setSeed( fecha1.getSeconds());

        int num=0;
        boolean isNum = false;


        System.out.println("Adivina el numero");
     //   System.out.println("El numero a adivinar es: ");

        num = rnd.nextInt();
        System.out.println("El numero a adivinar es (rnd): "+ Integer.toString(num));

        BufferedReader linea;
      //  BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
      //  num = Integer.parseInt(linea.readLine());
int xnum;
        while (!isNum){

            linea = new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Adivina N es? ");
            xnum = Integer.parseInt(linea.readLine());
            if(num > xnum )
                 System.out.println("es mayor");
            else if(num == xnum ) {
                System.out.println("Es el numero");
                isNum=true;
            }

            else
                System.out.println("es menor");
           }




    }
}
