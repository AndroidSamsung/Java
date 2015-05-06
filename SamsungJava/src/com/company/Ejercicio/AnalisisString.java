package com.company.Ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by android on 21/04/2015.
 */
public class AnalisisString {

    String cadena;

    public AnalisisString(){}

    public int getVecesCaracter(String _char){
        int total=0;
        String[] array = cadena.split("");
        for(int i=0;i<array.length;i++){
            if(_char.equals(array[i]))
                total++;
        }
        return total;
    }
    public String deleteSpaces(){
        return cadena.replace(" ", "");

    }

    public int getnumMayus(){
        int total=0;

        String[] letras =  {"A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","Ñ","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};

        String[] array = cadena.split("");

        for(int i=0;i<array.length;i++){
            for(int l=0; l<letras.length;l++)
                if(letras[l].equals(array[i]))
                    total++;
        }

        return total;
    }

    public int getnumMin(){
        int total=0;
        String[] letras =  {"a","b","c","d","e","f","g","h","i",
                "j","k","l","m","n","ñ","o","p","q",
                "r","s","t","u","v","w","x","y","z"};
        String[] array = cadena.split("");

        for(int i=0;i<array.length;i++){
            for(int l=0; l<letras.length;l++)
                if(letras[l].equals(array[i]))
                    total++;
        }
        return total;
    }

    public void setCadena(String cadena){
        this.cadena = cadena;

    }

    public void run() throws IOException {
        String mipalabra;
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Analisis de cadena:");
        mipalabra = linea.readLine();
        setCadena(mipalabra);
        System.out.println("La palabra tiene " + getnumMayus() + " mayusculas");
        System.out.println("La palabra tiene "+getnumMin()+" minusculas");




    }

}