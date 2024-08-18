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

    // Estruturas de exceção
    // try-catch-finally, throw
  }
}
