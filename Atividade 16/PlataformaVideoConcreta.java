import java.util.ArrayList;
import java.util.List;

class PlataformaVideoConcreta implements IPlataformaVideo {
    private List<IUsuario> usuarios;

    public PlataformaVideoConcreta() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void registrarUsuario(IUsuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(IUsuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notificarUsuarios(String genero, String titulo) {
        for (IUsuario usuario : usuarios) {
            if (usuario.getGenerosInteresse().contains(genero)) {
                if (usuario.isReceberNotificacoes()) {
                    usuario.atualizar(genero, titulo);
                }
            }
        }
    }

    public void adicionarNovoConteudo(String genero, String titulo) {
        System.out.println("Novo conteúdo adicionado: " + titulo + " [" + genero + "]");
        notificarUsuarios(genero, titulo);
    }
}