package com.company.Ficheros;

import javax.swing.plaf.synth.SynthUI;
import java.io.*;
import java.sql.BatchUpdateException;

/**
 * Created by android on 22/04/2015.
 */
public class AppFicheroTexto {

    BufferedReader[] listafichero;
    int nFicheros;
    BufferedReader br;
    BufferedWriter bw;

    public void numeroFicherosCopiar(int nFicheros){
        this.nFicheros = nFicheros;
        listafichero = new  BufferedReader[nFicheros];
        for(int i =0; i< nFicheros;i++) {
            System.out.println("Ruta fichero " + i + 1);
            try {
                BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));
                listafichero[i] = new BufferedReader(new FileReader(linea.readLine()));
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
    }
}
    public void  copiarFicheros(String rutas){
            rutas = rutas.replace(" ","");
        String[] array = rutas.split(",");
        this.nFicheros = 2;
        listafichero = new  BufferedReader[nFicheros];
        for(int i =0; i< nFicheros;i++) {
            try {
                listafichero[i] = new BufferedReader(new FileReader(array[i]));
            }
            catch (IOException ex)
            {
                System.out.println("El sistema no puede encontrar el archivo " + array[i]);
            }
        }
        setBufferedWriter(array[array.length - 1]); //Pregunto por el fichero destino
        for(int i=0;i<nFicheros;i++){
            try {
                copiarFicheroFrom(listafichero[i]);
            }
            catch (Exception ex){}
        }

        System.out.println("Se an unido los ficheros correctamente");
    }

    public void copiarFicheroFrom(BufferedReader origen){

    //Leemos el fichero y lo mostramos por pantalla
        try {
            String linea = origen.readLine();
            while (linea != null) {
                bw.write(linea);
                linea = origen.readLine();
                bw.newLine();
            }
            bw.flush();//Guardo el fichero
        }
        catch (IOException ex){
            System.out.println(ex);
            }
    }


    public AppFicheroTexto (){}

    public BufferedReader getBufferReader(){
        return br;
    }

    public BufferedWriter getBufferedWriter() {
        return bw;
    }

    public void setBufferReader(String ruta) {
        try {
            this.br = new BufferedReader(new FileReader(ruta));
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    public void setBufferedWriter(String ruta) {
        try{

            if(new File(ruta).exists()){ //El fichero existe

                BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Ya existe un fichero destino con ese nomnbre desea sobre escribirlo y/n:");
                String YN = linea.readLine();
                if(YN.equals("y")){
                    System.out.println("Se ha borrado su archivo");
                    this.bw = new BufferedWriter(new FileWriter(ruta));
                }
                else{
                     this.bw = new BufferedWriter(new FileWriter(ruta,true)); //Continuo en el fichero
                }
            }
            else{
                    this.bw = new BufferedWriter(new FileWriter(ruta));

            }

        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    public void copyFileInFile(BufferedReader br){

    }

}
