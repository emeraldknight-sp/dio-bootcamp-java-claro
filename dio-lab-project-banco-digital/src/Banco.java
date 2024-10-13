import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void adicionarConta(Conta conta) {
		if (conta != null) {
			contas.add(conta);
			System.out.println("Conta adicionada!");
		} else {
			System.out.println("Conta não pode ser nula.");
		}
	}
}
