public abstract class ManipuladorBase implements ManipuladorTransacao {
    protected ManipuladorTransacao proximoManipulador;

    @Override
    public void definirProximoManipulador(ManipuladorTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processar(Transacao transacao) {
        if (proximoManipulador != null) {
            proximoManipulador.processar(transacao);
        } else {
            System.out.println("Nenhum manipulador pôde processar a transação.");
        }
    }
}
