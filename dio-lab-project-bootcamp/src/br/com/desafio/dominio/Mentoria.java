package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  LocalDate data;

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Mentoria() {
  }

  @Override
  public String toString() {
    return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }
}
