package edu.java.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> catalogo;

  public CatalogoLivros() {
    this.catalogo = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    catalogo.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisaPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();

    if (!catalogo.isEmpty()) {
      for (Livro l : catalogo) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }

    return livrosPorAutor;
  }

  public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

    if (!catalogo.isEmpty()) {
      for (Livro l : catalogo) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
    }

    return livrosPorIntervaloAnos;
  }

  public Livro pesquisaPorTitulo(String titulo) {
    Livro livroPorTitulo = null;

    if (!catalogo.isEmpty()) {
      for (Livro l : catalogo) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();
    catalogo.adicionarLivro("Titulo 1", "Autor 5", 2000);
    catalogo.adicionarLivro("Titulo 2", "Autor 4", 2010);
    catalogo.adicionarLivro("Titulo 3", "Autor 3", 2020);
    catalogo.adicionarLivro("Titulo 4", "Autor 2", 2010);
    catalogo.adicionarLivro("Titulo 5", "Autor 1", 2024);

    System.out.println(catalogo.pesquisaPorAutor("Autor 2"));
    System.out.println(catalogo.pesquisaPorTitulo("Titulo 2"));
    System.out.println(catalogo.pesquisaPorIntervaloAnos(2000, 2010));
  }

}
