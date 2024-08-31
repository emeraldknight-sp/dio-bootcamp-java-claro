public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // Visibilidade de recurso

    // public: O membro (classe, método ou variável) é acessível
    // de qualquer outra classe em qualquer pacote.
    // Isso proporciona o maior nível de acesso.

    // protected: O membro é acessível apenas dentro da mesma classe,
    // classes no mesmo pacote e subclasses (mesmo que estejam em pacotes diferentes).
    // É menos permissivo que public, mas mais acessível que default.

    // default (ou package-private): Se nenhum modificador de acesso é especificado,
    // o membro é acessível apenas dentro do mesmo pacote.
    // Esse é o nível padrão de acesso.

    // private: O membro é acessível apenas dentro da própria classe.
    // É o nível mais restritivo de acesso, garantindo que outras classes
    // não possam acessar diretamente o membro.
}
