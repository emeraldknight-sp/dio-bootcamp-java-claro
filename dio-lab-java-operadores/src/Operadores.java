import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {

        // Usos do operador de atribuição
        String nome = "David";
        int idade = 25;
        double peso = 63;
        char sexo = 'M';
        boolean doadorSangue = true;
        Date dataNascimento = new Date();

        // Usos do operador aritmético
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao =  15 / 3;
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
