public class ManipuladorSaque extends ManipuladorBase {
    @Override
    public void processar(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.SAQUE) {
            if (transacao.getContaOrigem().sacar(transacao.getValor())) {
                System.out.println("Saque de " + transacao.getValor() + " processado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            super.processar(transacao);
        }
    }
}
