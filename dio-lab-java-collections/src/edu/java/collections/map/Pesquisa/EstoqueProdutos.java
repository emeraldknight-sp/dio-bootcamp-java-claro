package edu.java.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    this.estoque = new HashMap<>();
  }

  public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
    estoque.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoque);
  }

  public double calcularValorTotal() {
    double valorTotalEstoque = 0d;
    if (!estoque.isEmpty()) {
      for (Produto p : estoque.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoque.isEmpty()) {
      for (Produto p : estoque.values()) {
        if (p.getPreco() > maiorPreco) {
          produtoMaisCaro = p;
          maiorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.exibirProdutos();

    estoque.adicionarProdutos(126, "PRODUTO A", 5, 3);
    estoque.adicionarProdutos(127, "PRODUTO B", 4, 6);
    estoque.adicionarProdutos(128, "PRODUTO C",7, 9);
    estoque.adicionarProdutos(129, "PRODUTO D", 10, 8);
    estoque.adicionarProdutos(131, "PRODUTO E", 8, 4);

    estoque.exibirProdutos();

    System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotal());
    System.out.println("Produto mais caro: R$ " + estoque.obterProdutoMaisCaro());
  }
}
