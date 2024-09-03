package edu.fabrica;

public class Concessionaria {
  public static void main(String[] args) {
    Carro meuCarroEsportivo = new CarroEsportivo();
    Carro meuCarroEletrico = new CarroEletrico();

    meuCarroEsportivo.ligar();
    meuCarroEsportivo.acelerar();
    meuCarroEsportivo.desligar();

    meuCarroEletrico.ligar();
    meuCarroEletrico.acelerar();
    meuCarroEletrico.desligar();
  }
}
