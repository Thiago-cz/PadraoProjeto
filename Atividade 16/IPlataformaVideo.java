interface IPlataformaVideo {
    void registrarUsuario(IUsuario usuario);
    void removerUsuario(IUsuario usuario);
    void notificarUsuarios(String genero, String titulo);
}