public class Pessoa {
    private int idade;
    private String nome;
    private String cpf;
    private char sexo;

    public Pessoa(int idade, String nome, String cpf, char sexo) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
}
