package SOLID.SingleResponsibility.Certo;

public class CalcularFerias {
    
    static double calcularFerias(Funcionario funcionario){
        double valorParcialMensal = (funcionario.getSalarioBase()/12);
        double salarioBruto = (funcionario.getMessesTrabalhados() * valorParcialMensal) + CalcularHorasExtras.calcularHorasExtras(funcionario);
        return CalcularImpostos.calcularImpostos(funcionario, salarioBruto);
    }
}
