package edu.excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    // Erro é algo irreparável, como um crash da aplicação
    // Exceção é algo que pode ser contornado usando código

    // Inicializando o coletor de dados
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {
      // Leitura dos dados
      System.out.println("Digite sua altura:");
      double altura = scanner.nextDouble();

      System.out.println("Digite seu nome:");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome:");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade:");
      int idade = scanner.nextInt();

      System.out.println("");

      // Impressão dos dados
      System.out.println("Olá, me chamo " + nome + " " + sobrenome);
      System.out.println("Tenho " + idade + " anos.");
      System.out.println("Minha altura é " + altura + "m.");
    } catch (InputMismatchException e) {
      System.out.println("Os campos idade e altura precisam ser numéricos.");
    }

    scanner.close();

    // Try - permite você criar um bloco de código
    // que será testado quanto a erros durante sua execução

    // Catch - permite destinar um bloco de código
    // que será executado caso ocorra um erro identificado em Try

    // Finally - permite a criação de um bloco de código
    // que será executado independente de ocorrência de erro

    // Try {
    // bloco de código que deverá ser executado
    // } catch (Exception e) {
    // bloco de código que captura e trata exceções
    // }
  }
}
