package com.company.Diapositivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Fabricio on 21/04/2015.
 */
public class Prueba_swicth {
    public void Prueba_swicth(){}
    public void seleccion()  throws IOException {
        int opc;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Opcion: ");
        opc = Integer.parseInt (linea.readLine());
        switch (opc)
        { case 1: System.out.println("lunes"); break;
            case 2: System.out.println("martes"); break;
            case 3: System.out.println("miercoles"); break;
            case 4: System.out.println("jueves"); break;
            case 5: System.out.println("viernes"); break;
            case 6: System.out.println("sabado"); break;
            case 7: System.out.println("domingo"); break;
            default: System.out.println("opcion no valida");
                break;
        }


    }
}
