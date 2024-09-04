import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlataformaVideoConcreta plataforma = new PlataformaVideoConcreta();

        // Criação de usuários com seus gêneros de interesse
        IUsuario usuario1 = new UsuarioConcreto("Alice", List.of("ação", "comédia"),true);
        IUsuario usuario2 = new UsuarioConcreto("Bob", List.of("terror"),true);
        IUsuario usuario3 = new UsuarioConcreto("Carol", List.of("comédia", "ficção científica"),false);
        IUsuario usuario4 = new UsuarioConcreto("David", List.of("anime"),false);
        IUsuario usuario5 = new UsuarioConcreto("Eve", List.of("ação", "terror", "ficção científica"),false);

        // Registrar usuários na plataforma
        plataforma.registrarUsuario(usuario1);
        plataforma.registrarUsuario(usuario2);
        plataforma.registrarUsuario(usuario3);
        plataforma.registrarUsuario(usuario4);
        plataforma.registrarUsuario(usuario5);

        // Adicionar novos conteúdos e notificar os usuários
        plataforma.adicionarNovoConteudo("ação", "Filme de Ação 1");
        plataforma.adicionarNovoConteudo("comédia", "Comédia Divertida");
        plataforma.adicionarNovoConteudo("terror", "Filme de Terror Assustador");
        plataforma.adicionarNovoConteudo("anime", "Anime Incrível");
        plataforma.adicionarNovoConteudo("ficção científica", "Ficção Científica Espacial");
    }
}
