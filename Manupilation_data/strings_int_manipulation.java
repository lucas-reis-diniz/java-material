package com.lucas.test;

public class manipulacao_de_strings_e_int {

    public static void main(String[] args) {

      int number = 10;
      String sucess = "Sucess";

      if (number >= 10) {
          //Aderir a variavel number o valor de "5"
          number = 5;

          // Adicionando 4 ao valor de number, sendo agora "9"
          number += 4;

          //Converter Inteiro em String
          String myString = Integer.toString(number);

          System.out.println(myString);

          // Como printar e concatenar varios prints no console usando ( + ou .concat )
          System.out.println(sucess + " to switch the variable number type to a string called ".concat(myString) );

          // Mostrar a possição de um character em uma string ou numero
          System.out.println(sucess.indexOf("c"));
      }


      // Podemos tambem utilizar o if ternario

        /*
            int tempo = 20;

            String resultado = (time < 18) ? "Bom dia" : "Boa noite";
            System.out.println(resultado);
         */

    }
}
