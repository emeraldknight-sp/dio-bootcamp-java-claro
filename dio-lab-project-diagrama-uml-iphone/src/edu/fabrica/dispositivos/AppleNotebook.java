package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.NavegadorInternet;

public class AppleNotebook implements NavegadorInternet {
  public void buscarPaginaInternet() {
    System.out.println("BUSCANDO PAGINA NO COMPUTADOR");
  }

  public void carregarPaginaInternet() {
    System.out.println("CARREGANDO PAGINA NO COMPUTADOR");
  }

  public void abrirNovaGuia() {
    System.out.println("ABRINDO NOVA GUIA NO COMPUTADOR");
  }

  public void abrirNovaJanela() {
    System.out.println("ABRINDO NOVA JANELA NO COMPUTADOR");
  }

}
