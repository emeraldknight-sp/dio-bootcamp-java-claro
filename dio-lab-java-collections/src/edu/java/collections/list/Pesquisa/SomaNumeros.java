package edu.java.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  List<Numero> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeros.add(new Numero(numero));
  }

  public int somarTodosNumeros() {
    int valorTotal = 0;

    if (!numeros.isEmpty()) {
      for (Numero n : numeros) {
        valorTotal += n.getNumero();
      }
    }

    return valorTotal;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = numeros.get(0).getNumero();

    if (!numeros.isEmpty()) {
      for (Numero n : numeros) {
        if (n.getNumero() >= maiorNumero) {
          maiorNumero = n.getNumero();
        }
      }
    }

    return maiorNumero;
  }

  public int encontrarMenorNumero() {
    int menorNumero = numeros.get(0).getNumero();

    if (!numeros.isEmpty()) {
      for (Numero n : numeros) {
        if (n.getNumero() <= menorNumero) {
          menorNumero = n.getNumero();
        }
      }
    }

    return menorNumero;
  }

  public void mostrarNumeros() {
    System.out.println(numeros);
  }

  public static void main(String[] args) {
    SomaNumeros calculadora = new SomaNumeros();
    calculadora.adicionarNumero(6);
    calculadora.adicionarNumero(2);
    calculadora.adicionarNumero(8);
    calculadora.adicionarNumero(4);

    int valor = calculadora.somarTodosNumeros();
    System.out.println("O VALOR TOTAL É " + valor);

    int maiorValor = calculadora.encontrarMaiorNumero();
    System.out.println("O MAIOR VALOR É " + maiorValor);

    int menorValor = calculadora.encontrarMenorNumero();
    System.out.println("O MENOR VALOR É " + menorValor);

    calculadora.mostrarNumeros();
  }
}
