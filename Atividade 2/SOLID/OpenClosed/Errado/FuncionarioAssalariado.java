package SOLID.OpenClosed.Errado;

public class FuncionarioAssalariado extends Funcionario{

    public FuncionarioAssalariado(String nome, int idade, int codAcesso, double salario) {
        super(nome, idade, codAcesso, salario);
    }
    
    public double receberPagamento(){
        return 2000;
    }
}
