package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class MiVector {

    int[] vector;
    int contador;
    public int tamanoVector(){
        return vector.length;
    }
    public void MiVector(){contador=0;}

    public void inicializarVector(int tamano){
        vector = new int[tamano];
    }

    public void rellenar(int elemento){

        vector[contador]= elemento;
        contador++;
    }
    public void mostrar(int pos){
        System.out.println("Elemento "+pos+" valor "+vector[pos] );
    }




    public void run()throws IOException {

        BufferedReader linea = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el numero de elementos: ");

        inicializarVector(Integer.parseInt(linea.readLine())); //Creo los elemtos

        for(int i=0;i<tamanoVector();i++) {
            System.out.print("Elemento ");
            rellenar(Integer.parseInt(linea.readLine()));
        }
        System.out.println("Los elementos en el vector son");
        for(int i=0;i<tamanoVector();i++)
             mostrar(i);


    }
}
