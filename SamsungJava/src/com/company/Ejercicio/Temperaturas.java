package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Temperaturas {

    int[] vector;
    int contador;


    public Temperaturas (){ contador=0;}

    public void inicializarVector(int tamano){
        vector = new int[tamano];
    }
    public int[] getVector(){return vector;}

    public void rellenar(int elemento){
        vector[contador]= elemento;
        contador++;
    }
    public int getValuePos(int pos){
        return  vector[pos];

    }
    public int getTamano(){
        return vector.length;
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

    public void losInferiores(int[] mivector){
        System.out.println("las temperaturas inferiores son: ");
        for(int i=0; i<mivector.length;i++)
            if(mivector[i]<=promedioVector(mivector))
                mostrar(i);

    }

    public void mostrar(int pos){
        System.out.println("Elemento "+(pos+1)+" valor "+vector[pos] );
    }

    public void  run ()throws IOException {

        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el numero de temperatura: ");

        inicializarVector(Integer.parseInt(linea.readLine())); //Creo los elemtos


        for(int i=0;i<getTamano();i++) {
            System.out.print("Temperatura "+(i+1)+" :");
            rellenar(Integer.parseInt(linea.readLine()));
        }

        System.out.println("la temperatura promedio es: " + promedioVector(getVector()));

      losInferiores(getVector());


    }
}
