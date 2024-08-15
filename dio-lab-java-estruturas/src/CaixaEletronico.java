public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSoliticado = 17.0;

    if (valorSoliticado <= saldo) {
      saldo -= valorSoliticado;
      System.out.println("NOVO SALDO: R$ " + saldo);
    }
  }
}
