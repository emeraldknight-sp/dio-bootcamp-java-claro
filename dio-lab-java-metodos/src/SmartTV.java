public class SmartTV {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    System.out.println("A TV está ligada.");
    ligada = true;
  }

  public void desligar() {
    System.out.println("A TV foi desligada.");
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Volume aumentou");
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Volume diminuiu");
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal atual é " + canal);
  }

  public void aumentarCanal() {
    canal++;
  }

  public void dimniuirCanal() {
    canal--;
  }
}