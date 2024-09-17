import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> agenda;

  public AgendaContatos() {
    this.agenda = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    agenda.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(agenda);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato c : agenda) {
      if (c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoParaAtualizar = null;
    for (Contato c : agenda) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoParaAtualizar = c;
        break;
      }
    }
    return contatoParaAtualizar;
  }
}