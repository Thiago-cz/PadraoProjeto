package SOLID.SingleResponsibility.Certo;

public class CalcularSalario {

    static double calcularSalarioBruto(Funcionario funcionario) {
        return funcionario.getSalarioBase() + funcionario.getHorasExtras();
    }

    static double calcularSalarioLiquido(Funcionario funcionario) {
        return calcularSalarioBruto(funcionario)
                - CalcularImpostos.calcularImpostos(funcionario, calcularSalarioBruto(funcionario));
    }

}
