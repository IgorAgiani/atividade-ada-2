package inter.generica;

public class Main {
    public static void main(String[] args) {

        RepositorioDeAlunos repoAlunos = new RepositorioDeAlunos();
        repoAlunos.salvar("Igor");
        repoAlunos.salvar("Cicinha");
        repoAlunos.salvar("Scooby\n");


        RepositorioDeProdutos repoProdutos = new RepositorioDeProdutos();
        repoProdutos.salvar(new Produto("Caderno", 45.90));
        repoProdutos.salvar(new Produto("Mochila", 80.00));
        repoProdutos.salvar(new Produto("Estojo", 5.00));

    }
}
