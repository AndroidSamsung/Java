package com.company.Ficheros;

import com.company.Ejercicio.Errores;

import javax.swing.plaf.synth.SynthUI;
import java.io.*;

/**
 * Created by android on 23/04/2015.
 */
public class MezclaNatural {

    BufferedReader br;
    BufferedWriter bw;

    private  void fileExistToRead(String ruta) throws Errores{

        try{
            FileReader fr = new FileReader(ruta);
            fr.close();
        }
        catch (IOException e){
            throw new Errores("Fichero no encontrado para lectura \n");
        }


    }

    private void fileExistToWrite(String ruta) throws Errores{
        try{
            FileReader fr = new FileReader(ruta);
            fr.close();

        }
        catch (IOException ex){


        }


    }


    public void  setFicheroOrigien(String ruta){
        try{

            fileExistToRead(ruta);
            br = new BufferedReader(new FileReader(ruta));
        }
        catch (Errores e){
            System.out.println(e.getMessage());
        }
        catch (IOException ex){

        }


    }

    public void setFicheroSalida(String ruta){

        try{
            fileExistToWrite(ruta);
          bw = new BufferedWriter(new FileWriter(ruta));

        }
        catch (Errores e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){

        }
    }
}
