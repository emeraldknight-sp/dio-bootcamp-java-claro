
public class Carro extends Veiculo {

  @Override
  public void ligar() {
    conferindoCambio();
    conferindoCombustivel();
    System.out.println("CARRO LIGADO!");
  }

  private void conferindoCambio() {
    System.out.println("CAMBIO OK.");
  }

  private void conferindoCombustivel() {
    System.out.println("COMBUSTIVEL OK.");
  }
}