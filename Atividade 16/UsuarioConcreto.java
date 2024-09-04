import java.util.List;

class UsuarioConcreto implements IUsuario {
    private String nome;
    private List<String> generosInteresse;
    private boolean receberNotificacoes;

    public UsuarioConcreto(String nome, List<String> generosInteresse, boolean receberNotificacoes) {
        this.nome = nome;
        this.generosInteresse = generosInteresse;
        this.receberNotificacoes = receberNotificacoes;
    }

    @Override
    public void atualizar(String genero, String titulo) {
        System.out.println("Olá, " + nome + "! Um novo título do gênero " + genero + " foi adicionado: " + titulo);
    }

    @Override
    public List<String> getGenerosInteresse() {
        return generosInteresse;
    }

    @Override
    public boolean isReceberNotificacoes(){
        return this.receberNotificacoes;
    }

    public void receberNotificacoes(boolean receberNotificacoes){
        this.receberNotificacoes = receberNotificacoes;
    }
}