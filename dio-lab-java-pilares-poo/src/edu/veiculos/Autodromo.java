
public class Autodromo {
  public static void main(String[] args) {
    Carro hondaNSX = new Carro();
    hondaNSX.ligar();

    Moto z400 = new Moto();
    z400.ligar();

    Veiculo coringa = z400;
    coringa.ligar();

  }
}
