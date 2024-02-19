package SOLID.SingleResponsibility.Certo;

public class CalcularImpostos {
    static double calcularImpostos(Funcionario funcionario, double salarioBruto){
        return salarioBruto * funcionario.getImpostos();
    }
}
