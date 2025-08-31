package par.generico;

public class Main {
    public static void main(String[] args) {
        Generica<String, Integer> stringInt = new Generica<>("Igor Agiani Silva", 1994);
        System.out.println("Chave: " + stringInt.getChave() + " - Valor: " + stringInt.getValor());

        Generica<Integer, String> intString = new Generica<>(10, "Produto");
        System.out.println("Chave: " + intString.getChave() + " - Valor: " + intString.getValor());
    }
}
