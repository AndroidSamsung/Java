package com.company.Recursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 20/04/2015.
 */
public class SumaVector {

    public void SumaVector(){}


    public int suma (int[] vector, int pos){
        if(vector.length>0) {
            if (vector.length > pos)
                return  vector[pos]+suma(vector, ++pos);
            else return 0;


        }
        else return 0;
    }



    public void run()throws IOException {
        int numero;

        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Introduce el numero de elementos: ");
        numero= Integer.parseInt (linea.readLine());
        int[] d = new int[numero];

        System.out.println ("Introduce " + numero + " numeros enteros: ");
        for(int i=0;i<numero;i++)
            d[i] = Integer.parseInt (linea.readLine());

        System.out.println ("la suma es:"+suma(d,0));




    }
}
