package inter.generica;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeProdutos implements Repositorio<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void salvar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto salvo: " + produto);
    }
}
