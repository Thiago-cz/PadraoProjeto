package SOLID.OpenClosed.Certo;

public class FuncionarioPJ implements Salario{

    private double salario;
    @Override
    public double receberSalario() {
        return this.salario;   
    }
    
}
