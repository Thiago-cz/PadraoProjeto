public class Main {
    public static void main(String[] args) {
        ProcessadorTransacao processador = new ProcessadorTransacao();

        Conta conta1 = new Conta(500);
        Conta conta2 = new Conta(1000);

        // Processando um depósito
        processador.processar(new Transacao(Transacao.Tipo.DEPOSITO, 200, conta1, null));

        // Processando um saque
        processador.processar(new Transacao(Transacao.Tipo.SAQUE, 100, conta1, null));

        // Processando uma transferência
        processador.processar(new Transacao(Transacao.Tipo.TRANSFERENCIA, 150, conta1, conta2));

        // Tentando processar uma transação inválida
        processador.processar(new Transacao(Transacao.Tipo.TRANSFERENCIA, 1000, conta1, conta2));
    }
}
