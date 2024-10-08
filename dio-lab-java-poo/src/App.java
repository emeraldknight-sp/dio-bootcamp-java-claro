public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // VISIBILIDADE DE RECURSO

    // public: O membro (classe, método ou variável) é acessível
    // de qualquer outra classe em qualquer pacote.
    // Isso proporciona o maior nível de acesso.

    // protected: O membro é acessível apenas dentro da mesma classe,
    // classes no mesmo pacote e subclasses (mesmo que estejam em pacotes
    // diferentes).
    // É menos permissivo que public, mas mais acessível que default.

    // default (ou package-private): Se nenhum modificador de acesso é especificado,
    // o membro é acessível apenas dentro do mesmo pacote.
    // Esse é o nível padrão de acesso.

    // private: O membro é acessível apenas dentro da própria classe.
    // É o nível mais restritivo de acesso, garantindo que outras classes
    // não possam acessar diretamente o membro.

    // CONSTRUTORES

    // Um construtor é definido dentro da classe
    // com o mesmo nome da classe e sem tipo de retorno.

    int valor;

    // Construtor
    public App(int valor) {
        this.valor = valor;
    }

    // Construtor Padrão: Se você não definir nenhum construtor, o Java fornece um
    // construtor padrão sem parâmetros que simplesmente cria o objeto sem
    // inicializar variáveis.
    
    // Sem Construtor Definido: Se você não definir um construtor, o Java cria um
    // construtor padrão automaticamente. No entanto, se você definir um construtor
    // personalizado, o construtor padrão não estará mais disponível, e você terá
    // que definir um construtor sem parâmetros se precisar de um.

    // UML (Unified Modeling Language) é uma linguagem gráfica padrão usada para criar
    // diagramas que descrevem e visualizam sistemas de software.
    // Ela facilita a comunicação entre desenvolvedores e outras partes interessadas.

    // Linguagem visual: Utiliza diagramas para representar diferentes aspectos do sistema.
    // Padrão: Oferece uma maneira uniforme de descrever sistemas complexos.

    // Como usar UML:
    // Escolha diagramas adequados: Use diagramas como Casos de Uso, Classes, Sequência e
    // Atividades conforme suas necessidades.
    // Defina o escopo: Comece com uma visão geral e adicione detalhes conforme o projeto avança.
    // Mantenha a simplicidade: Crie diagramas claros e compreensíveis.
    // Atualize regularmente: Ajuste os diagramas conforme o projeto evolui.
}
