import java.util.List;

public class AlunoTurma {
    private Aluno aluno;
    private Turma turma;
    private List<Horario> horarios;

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void adicionarHorario(Horario horario) {
        horarios.add(horario);
    }

}
