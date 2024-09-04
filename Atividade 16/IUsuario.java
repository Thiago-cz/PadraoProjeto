import java.util.List;

interface IUsuario {
    void atualizar(String genero, String titulo);
    List<String> getGenerosInteresse();
    boolean isReceberNotificacoes();
}