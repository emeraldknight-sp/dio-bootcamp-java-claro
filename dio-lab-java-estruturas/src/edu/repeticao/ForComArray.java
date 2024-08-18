package edu.repeticao;

public class ForComArray {
  public static void main(String[] args) {
    String[] alunos = { "FELIPE", "JONAS", "MATEUS", "OTAVIO", "PAULO" };

    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
    }

    // Forma abreviada do for (forEach)
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é " + aluno);
    }
  }
}
