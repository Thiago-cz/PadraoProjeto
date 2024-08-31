public class ManipuladorDeposito extends ManipuladorBase {
    @Override
    public void processar(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.DEPOSITO) {
            if (transacao.getValor() > 0) {
                transacao.getContaOrigem().depositar(transacao.getValor());
                System.out.println("Depósito de " + transacao.getValor() + " processado com sucesso.");
            } else {
                System.out.println("Valor do depósito inválido.");
            }
        } else {
            super.processar(transacao);
        }
    }
}
