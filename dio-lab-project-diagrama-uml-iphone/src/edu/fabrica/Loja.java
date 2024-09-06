package edu.fabrica;

import edu.fabrica.aplicativos.AgendaTelefonica;
import edu.fabrica.aplicativos.NavegadorInternet;
import edu.fabrica.aplicativos.ReprodutorAudio;
import edu.fabrica.dispositivos.ApplePhone;

public class Loja {
  public static void main(String[] args) {
    ApplePhone iPhone = new ApplePhone();

    AgendaTelefonica agenda = iPhone;
    ReprodutorAudio mp3 = iPhone;
    NavegadorInternet safari = iPhone;

    agenda.discarNumero();
    mp3.tocarMusica();
    safari.carregarPaginaInternet();
  }

}
