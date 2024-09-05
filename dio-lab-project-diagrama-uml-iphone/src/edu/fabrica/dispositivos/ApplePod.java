package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.ReprodutorAudio;

public class ApplePod implements ReprodutorAudio {
  public void tocarMusica() {
    System.out.println("TOCANDO MUSICA NO iPOD");
  }

  public void pausarMusica() {
    System.out.println("PAUSANDO MUSICA NO iPOD");
  }

  public void pularMusica() {
    System.out.println("PULANDO MUSICA NO iPOD");
  }

  public void voltarMusica() {
    System.out.println("VOLTANDO MUSICA NO iPOD");
  };
}
