package SOLID.OpenClosed.Errado;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, int idade, int codAcesso, double salario) {
        super(nome, idade, codAcesso, salario);
    }

    public double receberPagamento(){
        return 800;
    }
}
