package SOLID.SingleResponsibility.Certo;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private double salarioBase;
    private int diasTrabalhados;
    private int messesTrabalhados;
    private double horasMensal;
    private double salarioHora;
    private double horasFalta;
    private double horasExtras;
    private double impostos;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public int getMessesTrabalhados() {
        return messesTrabalhados;
    }
    public void setMessesTrabalhados(int messesTrabalhados) {
        this.messesTrabalhados = messesTrabalhados;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    public double getHorasFalta() {
        return horasFalta;
    }
    public void setHorasFalta(double horasFalta) {
        this.horasFalta = horasFalta;
    }
    public double getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    public double getImpostos() {
        return impostos;
    }
    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }
    public double getHorasMensal() {
        return horasMensal;
    }
    public void setHorasMensal(double horasMensal) {
        this.horasMensal = horasMensal;
    }

    
}
