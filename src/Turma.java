import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<AlunoTurma> alunosTurma;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosTurma = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<AlunoTurma> getAlunosTurma() {
        return alunosTurma;
    }

    public void adicionarAlunoTurma(AlunoTurma alunoTurma) {
        alunosTurma.add(alunoTurma);
    }

    // Outros métodos conforme necessário
}
