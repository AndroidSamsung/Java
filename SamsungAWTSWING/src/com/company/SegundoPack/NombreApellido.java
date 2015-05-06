package com.company.SegundoPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class NombreApellido {

    public void NombreApellido(){}

    public  void imprimirNombre(String _cadena){
        String [] campos = _cadena.split(",");
        System.out.print(campos[1]+" " +campos[0]);

    }


    public void run()throws IOException {
        String mipalabra;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Escriba sus Apellido, Nombre: ");
        mipalabra= linea.readLine();
        imprimirNombre(mipalabra);


    }
}
