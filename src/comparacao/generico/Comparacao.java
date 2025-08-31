package comparacao.generico;

public class Comparacao <T extends Comparable<T>> {
    private T valor1;
    private T valor2;

    public T getValor1() {
        return valor1;
    }

    public T getValor2() {
        return valor2;
    }

    public Comparacao(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T maior() {
        if (valor1.compareTo(valor2) > 0) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
