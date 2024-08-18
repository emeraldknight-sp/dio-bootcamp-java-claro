package edu.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While {
  public static void main(String[] args) {
    double mesada = 50.0;
    while (mesada > 0) {
      double valorDoce = valorAleatorio();

      if (valorDoce > mesada) {
        valorDoce = mesada;
      };
      
      System.out.println("Doce do valor: " + valorDoce + ". Adicionado no carrinho.");
      mesada = mesada - valorDoce;
    }

    System.out.println("Mesada R$ " + mesada);
    System.out.println("Joãozinho gastou toda sua mesada em doces.");

    // while (expressão booleana de validação) {
    //   comando que será executado até que a 
    //   expressão de validação torne-se falsa.
    // }
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
