package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.Aparelho;
import edu.fabrica.aplicativos.NavegadorInternet;

public class AppleNotebook implements NavegadorInternet, Aparelho {
  public void buscarPaginaInternet() {
    System.out.println("BUSCANDO PAGINA NO MACBOOK");
  }

  public void carregarPaginaInternet() {
    System.out.println("CARREGANDO PAGINA NO MACBOOK");
  }

  public void abrirNovaGuia() {
    System.out.println("ABRINDO NOVA GUIA NO MACBOOK");
  }

  public void abrirNovaJanela() {
    System.out.println("ABRINDO NOVA JANELA NO MACBOOK");
  }

  public void ligar() {
    System.out.println("LIGANDO MACBOOK");
  }

  public void desligar() {
    System.out.println("DESLIGANDO MACBOOK");
  }

  public void carregar() {
    System.out.println("CARREGANDO MACBOOK");
  };
}
