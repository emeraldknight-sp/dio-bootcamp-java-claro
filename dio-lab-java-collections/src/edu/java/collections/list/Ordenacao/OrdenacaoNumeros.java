package edu.java.collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  List<Integer> algarismos;

  public OrdenacaoNumeros() {
    this.algarismos = new ArrayList<>();
  }

  public void adicionarNumero(int algarismo) {
    this.algarismos.add(algarismo);
  }

  public void ordenarAscendente() {
    Collections.sort(algarismos);
  }

  public void ordenarDescendente() {
    Collections.sort(algarismos, Collections.reverseOrder());
  }

  public String toString() {
    return String.valueOf(algarismos);
  }

  public static void main(String[] args) {
    OrdenacaoNumeros meusNumeros = new OrdenacaoNumeros();
    meusNumeros.adicionarNumero(9);
    meusNumeros.adicionarNumero(6);
    meusNumeros.adicionarNumero(15);
    meusNumeros.adicionarNumero(12);
    meusNumeros.adicionarNumero(21);
    meusNumeros.adicionarNumero(18);
    meusNumeros.adicionarNumero(3);

    System.out.println("SEM ORDENAÇÃO: " + meusNumeros);

    meusNumeros.ordenarAscendente();
    System.out.println("DO MENOR PARA O MAIOR: " + meusNumeros);

    meusNumeros.ordenarDescendente();
    System.out.println("DO MAIOR PARA O MENOR: " + meusNumeros);
  }
}
