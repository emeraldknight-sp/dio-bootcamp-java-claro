package edu.repeticao;

import java.util.Random;

public class DoWhile {
  public static void main(String[] args) {
    System.out.println("Discando...");

    do {
      // Executando repetidas vezes até alguém atender
      System.out.println("Telefone tocando");
    } while (tocando());

    System.out.println("Alô!!!");

    // do {
    // comando que será executado até que a
    // expressão de validação torne-se falsa
    // } while (expressão de validação);
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu?" + atendeu);

    // Negando o ato de continuar tocando
    return !atendeu;
  }
}
