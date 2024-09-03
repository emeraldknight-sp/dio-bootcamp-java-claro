package edu.comida.restaurante;

public class Cardapio {
  public String pratoPrincipal;
  private String receitaSecreta;
  protected String ingredientes;

  public Cardapio() {
    pratoPrincipal = "Feijoada";
    receitaSecreta = "Tempero especial";
    ingredientes = "Feijão, carne, arroz";
  }

  public void mostrarCardapio() {
    System.out.println("Prato Principal: " + pratoPrincipal);
    System.out.println("Ingredientes: " + ingredientes);
  }

  private void mostrarReceitaSecreta() {
    System.out.println("Receita Secreta: " + receitaSecreta);
  }
}
