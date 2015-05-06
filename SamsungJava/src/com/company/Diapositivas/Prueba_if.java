package com.company.Diapositivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Fabricio on 21/04/2015.
 */
public class Prueba_if {

    public  void Prueba_if()  {


    }
    public void leer() throws IOException {
        int dato;
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Numero: ");
        dato = Integer.parseInt(linea.readLine());
        if ((dato % 2) == 0)
            System.out.println("es par");
        else System.out.println("es impar");
    }

}
