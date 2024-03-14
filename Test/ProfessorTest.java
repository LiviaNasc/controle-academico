import static org.junit.Assert.*;
import org.junit.*;

public class ProfessorTest {

    @Test
    public void adicionarDisciplina(){
        Professor professor = new Professor("Leandro");
        professor.addDisciplina("Futebol", "Segunda 08:00-10:00");

        assertEquals("Segunda 08:00-10:00", professor.getHorario("Futebol"));
        assertTrue(professor.getDisciplinas().contains("Futebol"));
    }

    @Test
    public void testConsultarDisciplinas() {
        Professor professor = new Professor("Leandro");
        professor.addDisciplina("Futebol", "Segunda 08:00-10:00");
        professor.addDisciplina("Música", "Terça 10:00-12:00");

        assertTrue(professor.getDisciplinas().contains("Futebol"));
        assertTrue(professor.getDisciplinas().contains("Música"));
    }
}
