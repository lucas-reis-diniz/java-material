package com.lucas.test;

public class secondClass {

    public secondClass(int number) {
        System.out.println("Second class criada com sucesso");
        System.out.println(number);
    }

    protected void test1() {
        // Esse metodo apenas podera ser acessado por arquivos dentra da mesma pasta
        System.out.println("Método 'Teste' criado com sucesso");
    }

    private void test2() {
        // Esse metodo só pode ser acessado dentro do mesmo arquivo
    }

}
