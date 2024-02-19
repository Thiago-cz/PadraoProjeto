package SOLID.OpenClosed.Certo;

public class FuncionarioAssalariado implements Salario {

    private double salario;

    @Override
    public double receberSalario() {
        return this.salario;
    }

}
