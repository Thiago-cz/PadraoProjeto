import java.util.ArrayList;

public class Disciplina implements Matricula {
    private String nome;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
    }

    @Override
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.addDisciplina(this.nome);
        System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!!!");
    }

    @Override
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
        aluno.removeDisciplina(this.nome);
        System.out.println("Aluno " + aluno.getNome() + " removido com sucesso!!!");
    }

    @Override
    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno " + aluno.getNome() + " matriculado na disciplina " + this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
}
