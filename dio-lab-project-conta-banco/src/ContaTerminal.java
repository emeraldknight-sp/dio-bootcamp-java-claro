import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome completo! ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Agora digite uma conta: ");
        int conta = scanner.nextInt();

        System.out.print("Agora digite uma agencia para sua conta: ");
        String agencia = scanner.next();

        System.out.print("Agora digite o valor que irá depositar na sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência atual é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque! Deseja sacar? Aperte Y para SIM ou N para NÃO.");

    }
}
