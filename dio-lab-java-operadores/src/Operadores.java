// import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {

        // Usos do operador de atribuição
        // String nome = "David";
        // int idade = 25;
        // double peso = 63;
        // char sexo = 'M';
        // boolean doadorSangue = true;
        // Date dataNascimento = new Date();

        // Usos do operador aritmético
        // double soma = 10.5 + 15.7;
        // int subtracao = 113 - 25;
        // int multiplicacao = 20 * 7;
        // int divisao =  15 / 3;
        // String nomeCompleto = "LINGUAGEM " + "JAVA";

        String concatenacao = "?";

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

        // Usos do operador unário
        // +, -, ++, --, !, 

        int numero = 5;

        System.out.println(numero);
        System.out.println(-numero);

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        ++numero;
        System.out.println(numero);

        numero += 1;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        --numero;
        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        // Usos do operador ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        // if (a == b) {
        //     resultado = "verdadeiro";
        // } else {
        //     resultado = "falso";
        // }

        System.out.println(resultado);

        // Usos de operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        String nomeUm = "David";
        String nomeDois = "David";

        System.out.println(nomeUm == nomeDois);

        nomeDois = new String("David");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}
