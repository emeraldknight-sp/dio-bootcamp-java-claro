package edu.repeticao;

public class For {
  public static void main(String[] args) {

    // for (bloco de inicialização; expressão booleana de validação; bloco de
    // decremento ou incremento) {
    // doSomething();
    // }

    for (int i = 1; i <= 20; i++) {
      System.out.println(i + " carneirinho(s).");
      if (i == 20) {
        System.out.println("Joãozinho dormiu.");
      }
    }
  }
}
