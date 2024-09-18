package edu.java.collections.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventos;

  public AgendaEventos() {
    this.eventos = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    eventos.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
    System.out.println(eventosOrdenados);
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximaEvento = null;
    Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
    
    for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximaEvento = entry.getValue();
        System.out.println("O próximo evento: " + proximaEvento + " acontecerá na data " + proximaData);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
}
