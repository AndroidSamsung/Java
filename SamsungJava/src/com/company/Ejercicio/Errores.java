package com.company.Ejercicio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by android on 22/04/2015.
 */
public class Errores extends Exception {


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Errores(String s) { super(ANSI_RED+s+ANSI_RESET); }



    public static void isNumberValid(String elemento) throws Errores{
        if(elemento.indexOf(".")!=-1)
            throw new Errores(elemento+ " Error no tiene formato valido ejemplo [5,99]");
    }

    public static void isNumber(String elemento) throws Errores {
        if(containsCharacteres(elemento))
            throw new Errores(elemento+ " Error  no puede contener letras");
    }

    private static boolean containsCharacteres(String elemento){

        String[] letras =  {"A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","Ñ","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};
        elemento = elemento.toUpperCase(); //A nayuscukas
        String[] array = elemento.split("");

        for(int i=0;i<array.length;i++){
            for(int l=0; l<letras.length;l++)
                if(letras[l].equals(array[i]))
                    return true;
        }
        return false;
    }

    public static void verificarErrorAnalisis(int[] totalanalisislinea)  throws Errores{
        boolean errores = true;
        for(int i=0; i< totalanalisislinea.length;i++) {
            if (totalanalisislinea[i] != 0)
                errores = false;
        }
        if(errores)
            throw new Errores("Se a encuentrado un caracter erroneo en el texto\n");

    }


    public static boolean fileExist(String ruta) throws Errores{
      boolean exits = false;
        try{
         FileWriter fw = new FileWriter(ruta, true);
         fw.close();
         exits= true;
        }
        catch (IOException ex){
            exits= false;
            throw new Errores("Fichero no encontrado \n");
        }
        finally {
            return exits;
        }

    }

    public static boolean fileExistToRead(String ruta) throws Errores{
        boolean exits = false;
        try{
            FileReader fw = new FileReader(ruta);
            fw.close();
            exits= true;
        }
        catch (IOException ex){
            exits= false;
            throw new Errores("Fichero no encontrado \n");
        }
        finally {
            return exits;
        }

    }





}
