public class Main {

	public static void main(String[] args) {
		Cliente emerald = new Cliente();
		emerald.setNome("Emerald");

		Conta cc = new ContaCorrente(emerald);
		Conta poupanca = new ContaPoupanca(emerald);

		cc.depositar(500);
		cc.transferir(500, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();

		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);

		System.out.println("Contas de bancos: ");
		for (Conta conta : banco.getContas()) {
			System.out.println(conta);
		}
	}

}
