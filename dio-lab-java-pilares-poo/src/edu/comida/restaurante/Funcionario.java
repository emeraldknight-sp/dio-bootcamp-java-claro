package edu.comida.restaurante;

class Funcionario {
  public void mostrarInformacoes() {
    Cardapio cardapio = new Cardapio();
    cardapio.mostrarCardapio();

    // Acesso ao pratoPrincipal é permitido
    System.out.println("Prato Principal do Funcionário: " + cardapio.pratoPrincipal);

    // Acesso à receitaSecreta não é permitido (private)
    // System.out.println("Receita Secreta: " + cardapio.receitaSecreta); // Erro de
    // compilação

    // Acesso aos ingredientes é permitido (protected)
    System.out.println("Ingredientes para o Funcionário: " + cardapio.ingredientes);
  }
}
