package edu.java.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    carrinho.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();

    for (Item i : carrinho) {
      if (i.getNome().equalsIgnoreCase(nome)) {
        itensParaRemover.add(i);
      }
    }
    carrinho.removeAll(itensParaRemover);
  }

  public double calcularValorTotal() {
    double valorTotal = 0;

    if (!carrinho.isEmpty()) {
      for (Item i : carrinho) {
        valorTotal += i.getPreco() * i.getQuantidade();
      }
    }
    return valorTotal;
  }

  public void exibirItens() {
    System.out.println(carrinho);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Água de côco", 5.73, 4);
    carrinho.adicionarItem("Energético", 6.50, 2);
    carrinho.adicionarItem("Kit Coquetelaria 2.0", 49.90, 1);
    carrinho.adicionarItem("Whisky Black Label", 129.9, 2);
    carrinho.adicionarItem("Gelo", 3.75, 5);

    System.out.println("Valor total: R$" + carrinho.calcularValorTotal());
    carrinho.exibirItens();

    carrinho.removerItem("Gelo");

    System.out.println("Valor total: R$" + carrinho.calcularValorTotal());
    carrinho.exibirItens();
  }
}