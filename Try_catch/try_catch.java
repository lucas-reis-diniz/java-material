package com.lucas.test;

public class try_catch {

    public static void main(String[] args) {

        String string = null;

        // O Try catch verifica se uma parte do código ira haver um erro, caso o erro aconteça, ele não ira parar o funcionamento do resto do código
        // Armazenando o erro dentro do "catch"

        try {
            System.out.println(string.substring(0));
        } catch (NullPointerException e) {
            System.out.println("I have error!");
            e.printStackTrace();
        }

        System.out.println("Viu ainda funciona");
    }

}
