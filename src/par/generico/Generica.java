package par.generico;

public class Generica <K, V> {
    private K chave;
    private V valor;

    public Generica(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }
}
