package edu.java.collections.map.Ordenacao;

import java.time.LocalDate;
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
    for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
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

    agendaEventos.adicionarEvento(null, null, null);

    agendaEventos.exibirAgenda();
  }
}
