public class Professor extends Pessoa{
    private String titulacao;

    public Professor(int idade, String nome, String cpf, char sexo, String titulacao) {
        super(idade, nome, cpf, sexo);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    
    
}
