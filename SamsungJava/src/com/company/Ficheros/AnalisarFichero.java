package com.company.Ficheros;

import com.company.Ejercicio.Errores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by android on 23/04/2015.
 */
public class AnalisarFichero {

    BufferedReader br;

    public int getNumerocaracteres() {
        numerocaracteres = numerodigitos+ numerosignos+numeromayusculas+numerominusculas;
        return numerocaracteres;
    }

    public int getNumeromayusculas() {
        return numeromayusculas;
    }

    public int getNumerominusculas() {
        return numerominusculas;
    }

    public int getNumerodigitos() {
        return numerodigitos= getCantidadDigitos();
    }

    public int getNumerosignos() {
        return numerosignos;
    }

    int numerocaracteres;
    int numeromayusculas;
    int numerominusculas;
    int numerodigitos;
    int numerosignos;

    boolean[] digitos;


    public AnalisarFichero(){ digitos= new boolean[10]; numerocaracteres=0; numerodigitos=0; numeromayusculas=0;numerominusculas=0; numerosignos=0;}

    private void setBufferReader(String ruta) {
        try {
            this.br = new BufferedReader(new FileReader(ruta));
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    public int[] getnumMinusculasMayusculas(String cadena){
        int[] totales = new int[2];

        String[] letras =  {"A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","Ñ","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};

        String[] array = cadena.split(""); //Separo caracter a caracter

        for(int i=0;i<array.length;i++){
            for(int l=0; l<letras.length;l++) {
                if (letras[l].equals(array[i]))
                    totales[1]++;
                else  totales[0]++;
            }
        }

        return totales;
    }


    public int[] getMinusculasMayusculasSimbolosDigitos(String cadena){
        int[] totales = new int[4];
        for(int i=0; i<totales.length;i++ )
            totales[i]=0; //Inicializo a cero


        String[] letrasM =  {"A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","Ñ","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};

        String[] letrasm =  {"a","b","c","d","e","f","g","h","i",
                "j","k","l","m","n","ñ","o","p","q",
                "r","s","t","u","v","w","x","y","z"};
        String[] misdigitos=  {"0","1","2","3","4","5","6","7","8","9"};

        String[] signos=  {";",":",".",",","-","_","{","}","[","]",
                "*","!","","·","$","%","&","/","(",")","=","?","¿"};


        String[] array = cadena.split(""); //Separo caracter a caracter

        for(int i=0;i<array.length;i++) {

            //Busca minusculas
            for (int l = 0; l < letrasm.length; l++) {
                if (letrasM[l].equals(array[i]))
                    totales[0]++;
            }
            //Busca Mayusculas
            for (int l = 0; l < letrasM.length; l++) {
                if (letrasM[l].equals(array[i]))
                    totales[1]++;
            }
            //busca simbolos
            for (int l = 0; l < signos.length; l++) {
                if (signos[l].equals(array[i]))
                    totales[2]++;
            }


            //Busca digitos
            for (int l = 0; l < misdigitos.length; l++) {
                if (misdigitos[l].equals(array[i])) {
                    digitos[l] = true;
                    totales[3] = 1;
                }
            }
        }



        try {
            Errores.verificarErrorAnalisis(totales);
        }
        catch (Errores e)
        {
            System.out.print(e.getMessage());
        }


        return totales;
    }




    private void getDigitosinLine(String cadena){

        String[] misdigitos=  {"0","1","2","3","4","5","6","7","8","9"};
        String[] array = cadena.split(""); //Separo caracter a caracter

        for(int i=0;i<array.length;i++) {
            for(int l=0; l<misdigitos.length;l++) {
                if (misdigitos[l].equals(array[i]))
                    digitos[l]=true;
            }
        }
    }

    private int  getSimbolos(String cadena){

        int xsignos =0;
        String[] signos=  {";",":",".",",","-","_","{","}","[","]",
                "*","!","","·","$","%","&","/","(",")","=","?","¿"};
        String[] array = cadena.split(""); //Separo caracter a caracter

        for(int i=0;i<array.length;i++) {
            for(int l=0; l<signos.length;l++) {
                if (signos[l].equals(array[i]))
                    xsignos++;
            }
        }
        return xsignos;
    }

    private int getCantidadDigitos(){
        int total=0;
        for(int i=0; i<digitos.length;i++){
            if(digitos[i])
                total++;
        }
        return  total;
    }




    public void  analizameFichero( String  ruta){
        int[] analisis_por_linea;

        setBufferReader(ruta);

        try {
            String linea = br.readLine();

            while (linea!=null){  //Analisis por linea
                analisis_por_linea = getMinusculasMayusculasSimbolosDigitos(linea);
                numerominusculas+= analisis_por_linea[0];
                numeromayusculas += analisis_por_linea[1];
                numerosignos+= analisis_por_linea[2];
                //el analisis de digitos es interno

                linea = br.readLine();

            }
        }
        catch (IOException ex){}


    }
}
