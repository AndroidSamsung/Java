package com.company.Diapositivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 20/04/2015.
 */
public class NumerosEnteros {

    public void  NumerosEnteros(){}

    public void  run()throws NumberFormatException, IOException
    {
        int rango;
        int numero;
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Introduce el numero de elementos: ");
        numero= Integer.parseInt (linea.readLine());
        int[] d = new int[numero];
        float media;
        System.out.println ("Introduce " + numero + " numeros enteros: ");
        for(int i=0;i<numero;i++)
            d[i] = Integer.parseInt (linea.readLine());
        media = media (d,numero);
        System.out.println("El valor medio es: " + media);
        rango = max(d,numero) - min (d,numero);
        System.out.println("y el rango: " + rango);
    }
    static float media(int[] dato1,int nE) {
        float resul=0;
        for( int i=0; i<nE; i++)
            resul+=dato1[i];
        return resul/nE; }
    static int min(int[]dato1, int nE)
    {
        int resul;
        resul = dato1[0];
        for(int i=1; i<nE;i++)
            if(dato1[i] <resul)
                resul = dato1[i];
        return resul;
    }
    static int max(int[]dato1, int nE)
    {
        int resul;
        resul = dato1[0];
        for(int i=1; i<nE;i++)
            if(dato1[i] > resul)
                resul = dato1[i];
        return resul;
    }

}
