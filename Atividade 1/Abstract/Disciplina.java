package Abstract;

import java.util.ArrayList;

public class Disciplina extends Matricula{
    
    private String nome;
    private ArrayList<Aluno> alunos;
    private Professor professor;


    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    @Override
    void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.addDisciplina(this.nome);
        System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!!!");
    }

    @Override
    void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
        aluno.removeDisciplina(nome);
        System.out.println("Aluno " + aluno.getNome() + " removido com sucesso!!!");   
    }

    @Override
    void listarAlunos(ArrayList<Aluno> alunos) {
        for(int i = 0; i< alunos.size(); i++){
            System.out.println(i+"º -> "+ alunos.get(i).getNome());
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

    
}
