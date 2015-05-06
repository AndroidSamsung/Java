package com.company.SegundoPack;

import org.omg.CORBA.portable.ValueOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class Tiempo {

    public void Tiempo(){}

    public void miTiempo(int valor){

        int horas = valor/3600;
        int minutos = (valor-horas*3600)/60;
        int segundos = valor-(minutos*60)-(horas*3600);


         System.out.print("Horas:"+ horas);
        System.out.print(" minutos:"+minutos);
        System.out.print(" segundos:"+segundos);

    }

    public  void run ()throws IOException {
        String miTiempo;
        BufferedReader linea=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Ingrese los segundos a calcular: ");

        miTiempo(Integer.parseInt(linea.readLine()));



    }
}
