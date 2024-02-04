package Abstract;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private String grauEscolar;
    private ArrayList<String> disciplinas;

    public Aluno(String nome, int idade, String cpf, char sexo, String grauEscolar) {
        super(nome, idade, cpf, sexo);
        this.grauEscolar = grauEscolar;
        this.disciplinas = new ArrayList<String>();
    }

    public String getGrauEscolar() {
        return grauEscolar;
    }

    public void setGrauEscolar(String grauEscolar) {
        this.grauEscolar = grauEscolar;
    }
    
    public void addDisciplina(String disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(String disciplina){
        this.disciplinas.remove(disciplina);
    }
}
