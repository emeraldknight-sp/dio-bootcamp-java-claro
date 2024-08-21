import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Vamos contar um pouco.");
    System.out.println("A partir de qual número você quer contar? ");
    int numero1 = input.nextInt();

    System.out.println("Até qual número você deseja contar? ");
    int numero2 = input.nextInt();

    try {
      contar(numero1, numero2);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }

    input.close();
  }

  static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
    if (primeiroParametro > segundoParametro) {
      throw new ParametrosInvalidosException();
    }

    for (int i = primeiroParametro; i <= segundoParametro; i++) {
      System.out.println("Contando o número " + i);
    }
  }
}
