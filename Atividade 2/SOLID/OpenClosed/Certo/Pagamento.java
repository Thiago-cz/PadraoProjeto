package SOLID.OpenClosed.Certo;

public class Pagamento {
    // Essa é a forma correta. Pois simplismente agora qualque objeto que tiver
    // salario implementado podera receber salario, mas em cada classe o metodo pode
    // ser implementado de forma diferente, garantindo que as regras de negcio
    // funcionem e o codigo fica organizado.

    public void receberPagamento(Salario funcionario) {
        funcionario.receberSalario();
    }
}
