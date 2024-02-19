package SOLID.OpenClosed.Errado;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, int idade, int codAcesso, double salario) {
        super(nome, idade, codAcesso, salario);
    }
    

    public double receberPagamento(){
        return 3000;
    }
}
