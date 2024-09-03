package edu.comida.restaurante_interno;

import edu.comida.restaurante.Cardapio;

public class Gerente {
  public void verificarCardapio() {
    Cardapio cardapio = new Cardapio();
    cardapio.mostrarCardapio();

    // Acesso ao pratoPrincipal é permitido
    System.out.println("Prato Principal do Gerente: " + cardapio.pratoPrincipal);

    // Acesso à receitaSecreta não é permitido (private)
    // System.out.println("Receita Secreta: " + cardapio.receitaSecreta); // Erro de
    // compilação

    // Acesso aos ingredientes não é permitido, pois está protegido e a classe está
    // em um pacote diferente
    // System.out.println("Ingredientes para o Gerente: " + cardapio.ingredientes);
    // // Erro de compilação
  }
}
