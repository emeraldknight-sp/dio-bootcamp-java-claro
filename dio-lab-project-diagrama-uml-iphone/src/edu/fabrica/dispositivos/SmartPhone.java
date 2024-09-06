package edu.fabrica.dispositivos;

import edu.fabrica.aplicativos.AgendaTelefonica;
import edu.fabrica.aplicativos.Aparelho;
import edu.fabrica.aplicativos.ReprodutorAudio;

public class SmartPhone implements AgendaTelefonica, ReprodutorAudio, Aparelho {
  public void verificarChamadasPerdidas() {
    System.out.println("CHAMADAS PERDIDAS.");
  }

  public void salvarNumero() {
    System.out.println("SALVANDO NUMERO.");
  }

  public void discarNumero() {
    System.out.println("DISCANDO NUMERO.");
  }

  public void tocarMusica() {
    System.out.println("TOCANDO MUSICA NO TELEFONE");
  }

  public void pausarMusica() {
    System.out.println("PAUSANDO MUSICA NO TELEFONE");
  }

  public void pularMusica() {
    System.out.println("PULANDO MUSICA NO TELEFONE");
  }

  public void voltarMusica() {
    System.out.println("VOLTANDO MUSICA NO TELEFONE");
  }

  public void ligar() {
    System.out.println("LIGANDO SMARTPHONE");
  }

  public void desligar() {
    System.out.println("DESLIGANDO SMARTPHONE");
  }

  public void carregar() {
    System.out.println("CARREGANDO SMARTPHONE");
  };
}
