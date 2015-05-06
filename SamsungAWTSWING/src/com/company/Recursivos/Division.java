package com.company.Recursivos;

import com.company.JSwings.Mensaje;

import java.io.IOException;


/**
 * Created by android on 20/04/2015.
 */
public class Division {

    public void Division(){}

   public int dividir(int dividendo, int divisor) {

       if (divisor >dividendo)
       return 0;
       else
       return dividir(dividendo - divisor, divisor)+1;

   }

    public void run ()  throws IOException {

        int a;
        int b;

       a = Mensaje.callInteger("Introduzca Dividendo");
       b =  Mensaje.callInteger("Introduzca divisor");
        Mensaje.Display("Division por restas: "+dividir(a, b),"Resultado");

    }

}
