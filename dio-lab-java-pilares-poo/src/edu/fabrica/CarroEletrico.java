package edu.fabrica;

public class CarroEletrico implements Carro {
  public void ligar() {
    System.out.println("Carro elétrico ligado.");
  }

  public void desligar() {
    System.out.println("Carro elétrico desligado.");
  }

  public void acelerar() {
    System.out.println("Carro elétrico acelerando.");
  }
}