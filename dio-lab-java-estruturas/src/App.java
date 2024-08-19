import edu.excepcionais.CepInvalidoExcecao;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // Estruturas condicionais
    // if-else, switch-case

    boolean variavel = true;

    if (variavel) {
      System.out.println("Verdadeiro.");
    } else {
      System.out.println("Falso.");
    }

    final int verificador = 18;
    String idade = 17 >= verificador ? "Maior de idade" : "Menor de idade";

    switch (idade) {
      case "Maior de idade":
        System.out.println("Tem mais ou menos 18 anos");
        break;
      case "Menor de idade":
        System.out.println("Tem menos de 18 anos");
        break;
      // default:
      // break;
    }

    // Estruturas de repetição
    // for, while, do-while

    for (int i = 1; i <= 20; i++) {
      System.out.println(i + " carneirinho(s).");
      if (i == 20) {
        System.out.println("Joãozinho dormiu.");
      }
    }

    String[] alunos = { "FELIPE", "JONAS", "MATEUS", "OTAVIO", "PAULO" };

    // Forma abreviada do for (forEach)
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é " + aluno);
    }

    // Estruturas de exceção
    // try-catch-finally, throw

    String cepFormatado;
    try {
      cepFormatado = formatarCep("64500600");
      System.out.println(cepFormatado);
    } catch (CepInvalidoExcecao e) {
      System.out.println("O cep não corresponde com as regras de negócio.");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoExcecao {
    if (cep.length() != 8) {
      throw new CepInvalidoExcecao();
    }

    return "64.500-600";
  }
}
