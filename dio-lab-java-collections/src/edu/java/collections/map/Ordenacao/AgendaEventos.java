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

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();
  }
}
