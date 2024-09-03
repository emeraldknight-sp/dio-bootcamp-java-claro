package edu.comida.restaurante;

class Cozinha {
  Cardapio cardapio = new Cardapio();

  void acessarCardapio() {
    // Acesso ao pratoPrincipal é permitido
    System.out.println("Prato Principal da Cozinha: " + cardapio.pratoPrincipal);

    // Acesso à receitaSecreta não é permitido (private)
    // System.out.println("Receita Secreta: " + cardapio.receitaSecreta); // Erro de
    // compilação

    // Acesso aos ingredientes é permitido (protected)
    System.out.println("Ingredientes da Cozinha: " + cardapio.ingredientes);
  }
}
