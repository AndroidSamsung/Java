package com.company.Ficheros;

import com.company.Ejercicio.Errores;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.*;

/**
 * Created by android on 23/04/2015.
 */
public class NumerosFichero {

    BufferedReader[] listafichero;
    BufferedWriter bw;
    String numeros="";
    int nFicheros;
    public NumerosFichero(){numeros=""; nFicheros=0;}

    public void setBufferedWriter(String ruta) {
        try{

            if(Errores.fileExist(ruta)){ //El fichero existe

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
        catch (Errores e){
            System.out.println(e.getMessage());
        }
    }

    public void setnumeroFicherosCopiar(int nFicheros) throws Errores{
        this.nFicheros = nFicheros;
        listafichero = new  BufferedReader[nFicheros];
        for(int i =0; i< nFicheros;i++) {
            System.out.println("Ruta fichero " + (i + 1));
            try {
                BufferedReader linea=new BufferedReader(new InputStreamReader(System.in));
                listafichero[i] = new BufferedReader(new FileReader(linea.readLine()));
            }
            catch(IOException ex) {
                throw new Errores("Se a encuentrado el fichero origen\n");
            }
        }
    }

    public void  copiarOrdenadarContenido(){
        System.out.println("Leyendo contenido...");
        for(int i=0; i<nFicheros;i++){
            try {
                leerNumerosFichero(listafichero[i]);
                numeros+=",";
            }
           catch (Exception ex){
               System.out.println(ex);
           }
        }
        System.out.println("Ordenado numeros..");
        ordenar_contenido();
        System.out.println("Copiando a fichero...");
        copiarFicheroFromOrdenando(numeros);
        System.out.println("proceso terminado");
    }


    private  void  ordenar_contenido(){


        String[] x_numeros = numeros.split(","); //los pongo en un array
        int[] n_numeros = new int[x_numeros.length]; //Borro la ultima coma

        //Relleno el array de numeros
       for(int i =0; i<n_numeros.length;i++){
           n_numeros[i]= Integer.parseInt(x_numeros[i]);
         }
       n_numeros = ordenarLista(n_numeros);

        numeros="";
        for (int i=0; i<n_numeros.length;i++) {
            if(i==n_numeros.length-1)
                numeros +=n_numeros[i];
            else
            numeros += n_numeros[i] + ",";
        }


    }

    private int[] ordenarLista(int lista[]){

        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;

                }
            }
        }
        return lista;
    }


    private  void  leerNumerosFichero(BufferedReader origen){
        //Leemos el fichero y lo mostramos por pantalla
        try {
            String linea = origen.readLine();
            while (linea != null) {
                numeros+=linea;
                linea = origen.readLine();
            }


        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }


    private void copiarFicheroFromOrdenando(String ordenados){

        //Leemos el fichero y lo mostramos por pantalla
        try {
            bw.write(ordenados);
            bw.flush();//Guardo el fichero
            bw.close();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }


}
