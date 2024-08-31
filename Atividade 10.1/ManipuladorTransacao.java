public interface ManipuladorTransacao {
    void definirProximoManipulador(ManipuladorTransacao proximoManipulador);
    void processar(Transacao transacao);
}
