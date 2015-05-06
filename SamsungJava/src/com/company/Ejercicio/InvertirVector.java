package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class InvertirVector {

    int[] vector;
    int contador;

    public InvertirVector(){ contador=0;}

    public void rellenar(int elemento){
        vector[contador]= elemento;
        contador++;
    }
    public void inicializarVector(int tamano){
        vector = new int[tamano];

    }
    public int getLength(){
        return vector.length;
    }
    public void inverVector(){
        int aux= 0;
        for(int i=0; i<vector.length/2;i++) {
           aux = vector[(vector.length - 1) - i];
            vector[(vector.length - 1) - i] = vector[i];
            vector[i]=aux;
        }

    }
    public void mostrar(int pos){
        System.out.println("Elemento "+(pos+1)+" valor "+vector[pos] );
    }
    public void  run ()throws IOException {


        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el tamano del vector: ");
        inicializarVector(Integer.parseInt(linea.readLine())); //Creo los elemtos

        for(int i=0;i<getLength();i++) {
            System.out.print("Elemento "+(i+1)+" :");
            rellenar(Integer.parseInt(linea.readLine()));
        }
        System.out.println("Vector: ");
        for(int i=0;i<getLength();i++) {
            mostrar(i);
        }
        inverVector();
        System.out.println("Vector invertido: ");
        for(int i=0;i<getLength();i++) {
            mostrar(i);
        }



    }

}
