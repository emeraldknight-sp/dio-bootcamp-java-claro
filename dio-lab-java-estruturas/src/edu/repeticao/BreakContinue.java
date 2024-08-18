package edu.repeticao;

public class BreakContinue {
  public static void main(String[] args) {
    for (int variavelX = 0; variavelX < 5; variavelX++) {
      if (variavelX == 3) {
        break;
      }

      System.out.println("NUMERO: " + variavelX);
    }

    for (int variavelY = 0; variavelY < 5; variavelY++) {
      if (variavelY == 3) {
        continue;
      }

      System.out.println("NUMERO: " + variavelY);
    }
  }
}
