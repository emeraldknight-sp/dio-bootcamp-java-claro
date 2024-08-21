package edu.candidatuas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo.");

    String[] candidatos = { "FELIPE", "MARCIA", "MARCELA", "RAFAEL", "PAULA" };

    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = false;

      if (continuarTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println("Contato realizado com sucesso.");
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
    } else {
      System.out.println("Não conseguimos contato com" + candidato + ". Número máximo de tentativas.");
    }
  }

  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MARCIA", "MARCELA", "RAFAEL", "PAULA" };

    System.out.println("Imprimindo lista de candidados selecionados.");

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato Nº" + (indice++) + " é " + candidatos[indice]);
    }

    System.out.println("Forma abreviada com forEach");

    for (String candidato : candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "MARCELA", "JULIANO", "RAFAEL", "SERGIO", "PAULA", "RESENDE" };
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contra-proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
}
