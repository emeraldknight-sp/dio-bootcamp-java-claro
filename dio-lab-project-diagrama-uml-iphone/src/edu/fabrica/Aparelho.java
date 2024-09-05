package edu.fabrica;

import edu.fabrica.dispositivos.ApplePhone;
import edu.fabrica.dispositivos.SmartPhone;

public class Aparelho {
  public static void main(String[] args) {
    SmartPhone motoQ = new SmartPhone();
    ApplePhone iPhone = new ApplePhone();

    iPhone.gravarCorreioVozVirtual();
    motoQ.tocarMusica();
  }

}
