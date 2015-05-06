package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class AnalisarVector {

    int[] vector;
    int contador;

    public int[] getVector(){return vector;}


    public AnalisarVector(){ vector = new int[10]; contador=0;}

    public void rellenar(int elemento){
        vector[contador]= elemento;
        contador++;
    }
    public int getValuePos(int pos){
       return  vector[pos];

    }
    public int menorVector(int[] mivector) {
        int min=mivector[0];
        for(int n=0;n< mivector.length;n++){
           if(min>mivector[n])
                min = mivector[n];
        }
        return min;

    }

    public int mayorVector(int[] mivector) {
        int max=mivector[0];
        for(int n=0;n< mivector.length;n++){
            if(max<mivector[n])
            max = mivector[n];
        }
        return max;
    }
public  int sumaVector(int[] mivector){
  int sum=0;
    for(int n=0;n< mivector.length;n++){
        sum +=mivector[n];
    }
    return sum;
}
    public int promedioVector(int[] mivector){
        return (sumaVector(mivector)/mivector.length);
    }
    public int valorMedio(int[] mivector ){


        return mivector[(mivector.length-1)/2];
    }


    public  void  run ()throws IOException {

        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el 20 numeros ");
        for(int i=0;i<10;i++) {
            System.out.print("Numero "+(i+1)+" :");
            rellenar(Integer.parseInt(linea.readLine()));
        }
        System.out.println("El menor es: "+menorVector(getVector()));
        System.out.println("El mayor es: "+mayorVector(getVector()));
        System.out.println("La suma es: "+sumaVector(getVector()));
        System.out.println("El valor del medio: " + valorMedio(getVector()));
        System.out.println("El promedio es: " + promedioVector(getVector()));



    }
}
