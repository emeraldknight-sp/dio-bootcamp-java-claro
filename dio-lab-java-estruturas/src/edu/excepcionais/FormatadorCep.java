package edu.excepcionais;

public class FormatadorCep {
  public static void main(String[] args) {
    String cepFormatado;
    try {
      cepFormatado = formatarCep("64500600");
      System.out.println(cepFormatado);
    } catch (CepInvalidoExcecao e) {
      System.out.println("O cep não corresponde com as regras de negócio.");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoExcecao {
    if (cep.length() != 8) {
      throw new CepInvalidoExcecao();
    }

    return "64.500-600";
  }
}
