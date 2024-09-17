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
    inventario.addAll(inventario);
    return produtosPorPreco;
  }
}
