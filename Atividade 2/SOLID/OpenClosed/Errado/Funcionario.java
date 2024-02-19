package SOLID.OpenClosed.Errado;

public class Funcionario {
    private String nome;
    private int idade;
    private int codAcesso;
    private double salario;

    public Funcionario(String nome, int idade, int codAcesso, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.codAcesso = codAcesso;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCodAcesso() {
        return codAcesso;
    }
    public void setCodAcesso(int codAcesso) {
        this.codAcesso = codAcesso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
