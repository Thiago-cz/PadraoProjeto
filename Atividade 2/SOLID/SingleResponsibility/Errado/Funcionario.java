package SOLID.SingleResponsibility.Errado;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private double salarioBase;
    private int diasTrabalhados;
    private int messesTrabalhados;
    private double salarioHora;
    private double horasFalta;
    private double horasExtras;
    private double impostos;

    public Funcionario(int id, String nome, int idade, String cpf, double salarioBase, int diasTrabalhados,
            int messesTrabalhados, double salarioHora, double horasFalta, double horasExtras, double impostos) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.diasTrabalhados = diasTrabalhados;
        this.messesTrabalhados = messesTrabalhados;
        this.salarioHora = salarioHora;
        this.horasFalta = horasFalta;
        this.horasExtras = horasExtras;
        this.impostos = impostos;
    }

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

    public double getSalario() {
        return salarioBase;
    }

    public void setSalario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double gethorasFalta() {
        return horasFalta;
    }

    public void sethorasFalta(int horasFalta) {
        this.horasFalta = horasFalta;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    // Calculo do salario bruto pegando o salario base somando com horas extras e
    // descontando o valor referente a faltas
    public double calcularSalarioBruto() {
        return salarioBase + calcularHorasExtras(horasExtras) - descontarhorasFalta(horasFalta);
    }

    // Calculo do salario liquido utilizando a formula do salario bruto - valor
    // descontado de impostos
    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularImpostos(calcularSalarioBruto());
    }

    // Formar holerite pegando informações do funcionario
    public String montarHoleritie() {
        return STR."Funcionario: \{nome} \n Salario bruto: \{calcularSalarioBruto()} \n  Salario liquido: \{calcularSalarioLiquido()} \n Salario Base: \{salarioBase} \n Horas extras: \{horasExtras} \n  ";
    }

    // Imprime o holerite formado na tela
    public void mostrarHoleriete() {
        System.out.println(montarHoleritie());
    }

    // Calculo de ferias pegando os meses trabalhados e multiplicando pelo valor
    // parcial do salario divido por 12 (referente a 1 ano trabalhado) e soma de
    // horas extras.
    // Após salario bruto das ferias, é adicionado 1/3 sobre as ferias e descontado
    // impostos sobre o total das férias.
    public double calcularFerias() {
        double salarioBruto = (messesTrabalhados * (salarioBase / 12)) + calcularHorasExtras(horasExtras);
        salarioBruto = salarioBruto * 1.3;// 1/3 adicional das férias
        return salarioBruto - calcularImpostos(salarioBruto);
    }

    public void registrarFalta() {
        this.horasFalta++;
    }

    public double calcularImpostos(double salarioBruto) {
        return salarioBruto * impostos;
    }

    public double calcularHorasExtras(double horasExtras) {
        return (salarioHora * horasExtras) * 1.5;
    }

    public double descontarhorasFalta(double horasFalta) {
        return horasFalta * salarioHora;
    }

}
