package com.company.SegundoPack;

/**
 * Created by android on 22/04/2015.
 */
public class GuardaNotas {
    String[] arrayString;
    double [] arrayNotas;
    String[] arrayNotaString;
    int contador;
    int contadorStrings;

    public  GuardaNotas (){
        arrayNotas = new double[10];
        arrayString = new String[10];
        arrayNotaString = new String[10];
        contadorStrings=0;
        contador=0;
    }

    public void isNumberValid(String elemento) throws Errores{
         if(elemento.indexOf(".")!=-1)
            throw new Errores(elemento+ " Error no tiene formato valido ejemplo [5,99]");
   }

    public void isNumber(String elemento) throws Errores {
            if(containsCharacteres(elemento))
                throw new Errores(elemento+ " Error  no puede contener letras");
    }

    public boolean containsCharacteres(String elemento){

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

    public boolean setNota (String nota){

        try {
            Errores.isNumberValid(nota);  //Error formato
           Errores.isNumber(nota);   //Error si contiene letras
            nota = nota.replace(",",".");
            arrayNotas[contador] = Double.parseDouble(nota);
            notaRange(arrayNotas[contador], contador);
            contador++;
          return   true;
        }
        catch (Errores e){
            System.out.println(e.getMessage());
            return false;
        }


    }

    public void notaRange(double nota, int pos){
        if(nota<=4.99)
            arrayNotaString[pos]= "Suspenso";
        else if(nota<=6.99)
            arrayNotaString[pos]= "Bien";
        else if(nota<=8.99)
            arrayNotaString[pos]= "Notable";
        else if(nota<=10 || nota>=9)
            arrayNotaString[pos]= "Sobresaliente";
    }

    public  void  setNombre(String nombre){
        arrayString[contadorStrings]= nombre;
        contadorStrings++;
    }

    public void visualizarDatos(){
        System.out.println("Nombre Alumnos  |   Nota  | Equivalente");
        for(int i=0; i<10;i++){
            System.out.println(arrayString[i]+ " | " +arrayNotas[i]+" | "+arrayNotaString[i]);

        }

    }

    public double dividir(int num, int den) throws Errores
    {
        if (den==0)
            throw new Errores("Error");
        return ((double) num/ (double)den);
    }


}
