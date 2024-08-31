public class ProcessadorTransacao {
    private ManipuladorTransacao primeiroManipulador;

    public ProcessadorTransacao() {
        // Configuração da cadeia de responsabilidade
        ManipuladorDeposito manipuladorDeposito = new ManipuladorDeposito();
        ManipuladorSaque manipuladorSaque = new ManipuladorSaque();
        ManipuladorTransferencia manipuladorTransferencia = new ManipuladorTransferencia();

        manipuladorDeposito.definirProximoManipulador(manipuladorSaque);
        manipuladorSaque.definirProximoManipulador(manipuladorTransferencia);

        primeiroManipulador = manipuladorDeposito;
    }

    public void processar(Transacao transacao) {
        primeiroManipulador.processar(transacao);
    }

}
