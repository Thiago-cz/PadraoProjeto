package SOLID.SingleResponsibility.Certo;

public class CalcularHorasExtras {
    
    static double calcularHorasExtras(Funcionario funcionario){
        return (funcionario.getHorasExtras() * funcionario.getSalarioHora()) * 1.5;
    }
}
