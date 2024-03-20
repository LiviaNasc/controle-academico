import static org.junit.Assert.*;

import org.junit.Test;

public class RdmTest {

    @Test
    public void testAdicionarDisciplinaRDM() {
        Rdm rdm = new Rdm();
        Turma turma = new Turma("Calculo 2", "Terça", "13:00");
        assertTrue(rdm.adicionarDisciplinaRDM(turma));
        assertFalse(rdm.adicionarDisciplinaRDM(turma));
    }

    @Test
    public void testMostrarDisciplinas() {
        Rdm rdm = new Rdm();
        assertNull(rdm.mostrarDisciplinas());
        Turma turma1 = new Turma("Calculo 2", "Terça", "13:00");
        Turma turma2 = new Turma("Algoritmos", "Quinta", "15:00");
        rdm.adicionarDisciplinaRDM(turma1);
        rdm.adicionarDisciplinaRDM(turma2);
        assertEquals(2, rdm.mostrarDisciplinas().size());
    }
}
