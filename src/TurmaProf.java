import java.util.ArrayList;
import java.util.List;

public class TurmaProf {
    private Professor professor;
    private List<Turma> turmas;

    public TurmaProf(Professor professor) {
        this.professor = professor;
        this.turmas = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}
