import java.util.ArrayList;
import java.util.List;

public class Rdm {

    private List<Turma> listaTurmas = new ArrayList<Turma>();

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public boolean adicionarDisciplinaRDM(Turma turma) {

        if (listaTurmas.contains(turma)) {
            return false;
        }
        listaTurmas.add(turma);
        return true;
    }

    public List<Turma> mostrarDisciplinas() {
        if (listaTurmas.isEmpty()) {
            return null;
        }
        return getListaTurmas();
    }

}