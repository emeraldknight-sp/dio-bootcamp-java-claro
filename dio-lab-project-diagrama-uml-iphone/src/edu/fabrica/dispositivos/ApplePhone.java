package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.AgendaTelefonica;
import edu.fabrica.aplicativos.Aparelho;
import edu.fabrica.aplicativos.NavegadorInternet;
import edu.fabrica.aplicativos.ReprodutorAudio;

public class ApplePhone implements ReprodutorAudio, AgendaTelefonica, NavegadorInternet, Aparelho {

  public void buscarPaginaInternet() {
    System.out.println("BUSCANOD PAGINA DA INTERNET NO IPHONE.");
  }

  public void carregarPaginaInternet() {
    System.out.println("CARREGANDO PAGINA DA INTERNET NO IPHONE.");
  }

  public void abrirNovaGuia() {
    System.out.println("ABRIR NOVA GUIA NO IPHONE.");
  }

  public void abrirNovaJanela() {
    System.out.println("ABRIR NOVA JANELA NO IPHONE.");
  }

  public void discarNumero() {
    System.out.println("DISCANDO NUMERO NO IPHONE.");
  }

  public void salvarNumero() {
    System.out.println("SALVANDO NUMERO NO IPHONE.");
  }

  public void verificarChamadasPerdidas() {
    System.out.println("VERIFICANDO CHAMADAS PERDIDAS NO IPHONE.");
  }

  public void tocarMusica() {
    System.out.println("TOCANDO MUSICA NO IPHONE.");
  }

  public void pausarMusica() {
    System.out.println("PAUSANDO MUSICA NO IPHONE.");
  }

  public void pularMusica() {
    System.out.println("PULANDO MUSICA NO IPHONE.");
  }

  public void voltarMusica() {
    System.out.println("VOLTANDO MUSICA NO IPHONE.");
  }

  public void gravarCorreioVozVirtual() {
    System.out.println("GRAVANDO CORREIO DE VOZ NO IPHONE");
  };

  public void ouvirCorreioVozVirtual() {
    System.out.println("OUVINDO CORREIO DE VOZ VIRTUAL NO IPHONE.");
  }

  public void ligar() {
    System.out.println("LIGANDO IPHONE");
  }

  public void desligar() {
    System.out.println("DESLIGANDO IPHONE");
  }

  public void carregar() {
    System.out.println("CARREGANDO IPHONE");
  };
}
