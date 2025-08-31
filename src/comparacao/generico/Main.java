package comparacao.generico;

public class Main {
    public static void main(String[] args) {
        Comparacao<Integer> comparacaoInt = new Comparacao<>(13, 27);

        System.out.println("Em relação ao número " + comparacaoInt.getValor1() +
                 " e ao número " + comparacaoInt.getValor2() +
                " o Número Maior é: " + comparacaoInt.maior());

        Comparacao<String> comparacaoStr = new Comparacao<>("ADA", "GOOGLE");

        System.out.println("Em relação a palavra, " + comparacaoStr.getValor1() +
                 " e a palavra, " + comparacaoStr.getValor2() +
                " o a palavra Maior é: " + comparacaoStr.maior());
    }
}
