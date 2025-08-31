package troca.generico;

import static troca.generico.Troca.trocar;

public class Main {
    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Lista de Numeros: ");
        for (int n : numeros) {
            System.out.print(n + ". ");
        }

        trocar(numeros, 1, 3);

        System.out.println("\nNova Lista de Números: ");
        for (int n : numeros) {
            System.out.print(n + ". ");
        }


        String[] palavras = {"maçã", "banana", "cereja", "damasco"};
        System.out.println("\n\nLista de Frutas: ");
        for (String s : palavras) {
            System.out.print(s + ". ");
        }

        trocar(palavras, 0, 2);

        System.out.println("\nNova lista de Frutas: ");
        for (String s : palavras) {
            System.out.print(s + ". ");
        }
    }
}

