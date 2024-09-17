package edu.java.collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
  private Set<Produto> inventario;

  public CadastroProduto() {
    this.inventario = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    inventario.add(new Produto(nome, cod, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(inventario);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(inventario);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProduto inventario = new CadastroProduto();
    inventario.adicionarProduto(1, "Agua Mineral s/ Gás", 1.50, 10);
    inventario.adicionarProduto(2, "Agua Mineral c/ Gás", 2.50, 5);
    inventario.adicionarProduto(3, "Refrigerante Coca Cola", 2.75, 7);
    inventario.adicionarProduto(4, "Refrigerante Fanta Laranja", 3.10, 15);
    inventario.adicionarProduto(5, "Refrigerante Fanta Uva", 1.00, 20);
    inventario.adicionarProduto(6, "Refrigerante Sprite", 6.25, 13);
    inventario.adicionarProduto(2, "Biscoito", 2.75, 22);
    inventario.adicionarProduto(4, "Bolacha", 1.59, 17);

    System.out.println(inventario.inventario);

    System.out.println(inventario.exibirProdutosPorNome());

    System.out.println(inventario.exibirProdutosPorPreco());
  }
}
