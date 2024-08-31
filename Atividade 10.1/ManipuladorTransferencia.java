public class ManipuladorTransferencia extends ManipuladorBase {
    @Override
    public void processar(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.TRANSFERENCIA) {
            if (transacao.getContaOrigem().sacar(transacao.getValor())) {
                transacao.getContaDestino().depositar(transacao.getValor());
                System.out.println("Transferência de " + transacao.getValor() + " processada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else {
            super.processar(transacao);
        }
    }
}
