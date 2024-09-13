package edu.java.collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  private List<Pessoa> registro;

  public OrdenacaoPessoas() {
    this.registro = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    registro.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(registro);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(registro);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas registro = new OrdenacaoPessoas();
    registro.adicionarPessoa("Samuel", 16, 1.67);
    registro.adicionarPessoa("João", 19, 1.65);
    registro.adicionarPessoa("Lucas", 15, 1.70);
    registro.adicionarPessoa("Tiago", 18, 1.72);
    registro.adicionarPessoa("Pedro", 17, 1.75);

    System.out.println(registro.registro);
    System.out.println(registro.ordenarPorAltura());
    System.out.println(registro.ordenarPorIdade());
  }
}
