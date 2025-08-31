package caixa.generica;

public class Main {
    public static void main(String[] args) {

        Generica<String> string1 = new Generica<>("Igor Agiani Silva");
        System.out.println(string1.getObjeto());

        Generica<Integer> int1 = new Generica<>(123);
        System.out.println(int1.getObjeto());
    }
}


