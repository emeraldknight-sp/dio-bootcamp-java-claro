package edu.java.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    this.estoque = new HashMap<>();
  }

  public void adicionarProdutos(long cod, String nome, int quantidade, double preco) {
    estoque.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoque);
  }

  public double calcularValorTotal() {
    double valorTotalEstoque = 0d;
    if (!estoque.isEmpty()) {
      for (Produto p : estoque.values()) {
        valorTotalEstoque += p.getPreco() * p.getQuantidade();
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
        }
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    
  }
}
