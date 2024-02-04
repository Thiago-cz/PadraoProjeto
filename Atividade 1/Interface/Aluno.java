import java.util.ArrayList;

public class Aluno extends Pessoa {

    private String grauEscolar;
    private ArrayList<String> disciplinas;

    public Aluno(int idade, String nome, String cpf, char sexo, String grauEscolar) {
        super(idade, nome, cpf, sexo);
        this.grauEscolar = grauEscolar;
        this.disciplinas = new ArrayList<String>();
    }

    public String getGrauEscolar() {
        return grauEscolar;
    }

    public void setGrauEscolar(String grauEscolar) {
        this.grauEscolar = grauEscolar;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(String disciplina){
        this.disciplinas.remove(disciplina);
    }

    
    
}