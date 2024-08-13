public class Usuario {
  public static void main(String[] args) {
    SmartTV SmartTV = new SmartTV();

    System.out.println("A TV está ligada? " + SmartTV.ligada);
    System.out.println("Canal atual? " + SmartTV.canal);
    System.out.println("Volume atual? " + SmartTV.volume);

    System.out.println("****************************************");

    SmartTV.ligar();

    SmartTV.aumentarCanal();

    SmartTV.aumentarVolume();
    SmartTV.diminuirVolume();
    SmartTV.diminuirVolume();

    SmartTV.mudarCanal(45);

    System.out.println("****************************************");

    System.out.println("A TV está ligada? " + SmartTV.ligada);
    System.out.println("Canal atual? " + SmartTV.canal);
    System.out.println("Volume atual? " + SmartTV.volume);System.out.println();
  }
}
