package edu.java.collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> dicionario;

  public ConjuntoPalavrasUnicas() {
    this.dicionario = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    dicionario.add(new String(palavra));
  }

  public void removerPalavra(String palavra) {
    String palavraParaRemover = "";
    for (String p : dicionario) {
      if (p.equals(palavra)) {
        palavraParaRemover = p;
        break;
      }
    }
    dicionario.remove(palavraParaRemover);
  }

  public boolean verificarPalavra(String palavra) {
    return dicionario.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    System.out.println(dicionario);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas dicionario = new ConjuntoPalavrasUnicas();
    dicionario.adicionarPalavra("Optimus");
    dicionario.adicionarPalavra("Prime");
    dicionario.adicionarPalavra("Galvatron");
    dicionario.adicionarPalavra("Megraton");
    dicionario.adicionarPalavra("Starscream");

    dicionario.exibirPalavrasUnicas();

    dicionario.removerPalavra("Optimus");

    dicionario.exibirPalavrasUnicas();

    System.out.println("A palavra 'Nemesis' está no conjunto? " + dicionario.verificarPalavra("Nemesis"));

    System.out.println("A palavra 'Prime' está no conjunto? " + dicionario.verificarPalavra("Prime"));
  }

}
