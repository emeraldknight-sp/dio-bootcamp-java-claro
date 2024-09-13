package edu.java.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinho;

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome) {
    carrinho.add(new Item(nome));
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

  public int obterNumeroItens() {
    return carrinho.size();
  }

  public void obterNomeItens() {
    System.out.println(carrinho);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Vassoura");
    carrinho.adicionarItem("Água sanitária");
    carrinho.adicionarItem("Desinfetante");
    carrinho.adicionarItem("Esponja");
    carrinho.adicionarItem("Odorizador");

    System.out.println("Quantidade de itens no carrinho: " + carrinho.obterNumeroItens());
    carrinho.obterNomeItens();

    carrinho.removerItem("Odorizador");
    
    System.out.println("Quantidade de itens no carrinho: " + carrinho.obterNumeroItens());
    carrinho.obterNomeItens();
  }
}