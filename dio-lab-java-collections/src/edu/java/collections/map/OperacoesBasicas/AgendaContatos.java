import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agenda;

  public AgendaContatos() {
    this.agenda = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer numero) {
    agenda.put(nome, numero);
  }

  public void removerContato(String nome) {
    if (!agenda.isEmpty()) {
      agenda.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agenda);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agenda.isEmpty()) {
      numeroPorNome = agenda.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    agenda.adicionarContato("João", 123);
    agenda.adicionarContato("Pedro", 224);
    agenda.adicionarContato("Tiago", 519);
    agenda.adicionarContato("Mateus", 456);
    agenda.adicionarContato("Zacarias", 659);
    agenda.adicionarContato("Tiago", 557);

    agenda.exibirContatos();

    agenda.removerContato("Tiago");
    agenda.exibirContatos();

    System.out.println("O número é: " + agenda.pesquisarPorNome("Pedro"));

  }
}