package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProduto cadastroProduto = new CadastroProduto();

        // Adicionando produtos ao cadastro
        cadastroProduto.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProduto.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProduto.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProduto.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProduto.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProduto.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}