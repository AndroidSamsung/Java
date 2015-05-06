package com.company;

import com.company.Recursivos.Division;
import com.company.Recursivos.Palindroma;
import com.company.Recursivos.SumaDigitos;
import com.company.Recursivos.SumaVector;

import java.io.IOException;


/**
 * Created by android on 20/04/2015.
 */
public class Recursivo {

    public static void main(String [] args) throws NumberFormatException, IOException
    {
        Division division = new Division();
     //   division.run();
        System.out.println("Recursivo");

        SumaVector mivector = new SumaVector();
      //  mivector.run();
        SumaDigitos misDigitos = new SumaDigitos();
     //   misDigitos.run();
        Palindroma palabra = new Palindroma();
        palabra.run();
    }
}
