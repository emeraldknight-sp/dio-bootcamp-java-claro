package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.Aparelho;
import edu.fabrica.aplicativos.ReprodutorAudio;

public class ApplePod implements ReprodutorAudio, Aparelho {
  public void tocarMusica() {
    System.out.println("TOCANDO MUSICA NO IPOD");
  }

  public void pausarMusica() {
    System.out.println("PAUSANDO MUSICA NO IPOD");
  }

  public void pularMusica() {
    System.out.println("PULANDO MUSICA NO IPOD");
  }

  public void voltarMusica() {
    System.out.println("VOLTANDO MUSICA NO IPOD");
  };

  public void ligar() {
    System.out.println("LIGANDO IPOD");
  }

  public void desligar() {
    System.out.println("DESLIGANDO IPOD");
  }

  public void carregar() {
    System.out.println("CARREGANDO IPOD");
  };
}
