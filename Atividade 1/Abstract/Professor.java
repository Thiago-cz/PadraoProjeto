package Abstract;

public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, int idade, String cpf, char sexo, String titulacao) {
        super(nome, idade, cpf, sexo);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
