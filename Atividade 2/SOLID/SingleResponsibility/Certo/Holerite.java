package SOLID.SingleResponsibility.Certo;


public class Holerite {
    static String montarHolerite(Funcionario funcionario){
        return STR."Funcionario: \{funcionario.getNome()} \n Salario bruto: \{CalcularSalario.calcularSalarioBruto(funcionario)} \n  Salario liquido: \{CalcularSalario.calcularSalarioLiquido(funcionario)} \n Salario Base: \{funcionario.getSalarioBase()} \n Horas extras: \{funcionario.getHorasExtras()} \n  ";
    }

    static void mostarHolerite(Funcionario funcionario){
        System.out.println(montarHolerite(funcionario));
    }
}
