import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DisciplinaTeste {

    @Test
    public void testToString() {
        Disciplina disciplina = new Disciplina("Metodos Avançados de Programação", "Segunda", "10:00");
        assertEquals("Disciplina: Metodos Avançados de Programação - Dia: Segunda ||Horario: 10:00", disciplina.toString());
    }

    @Test
    public void testGetNome() {
        Disciplina disciplina = new Disciplina("Banco de Dados", "Quarta", "14:00");
        assertEquals("Banco de Dados", disciplina.getNome());
    }

    @Test
    public void testGetHorario() {
        Disciplina disciplina = new Disciplina("Redes de Computadores", "Sexta", "8:00");
        assertEquals("Sexta", disciplina.getHorario().getDia());
        assertEquals("8:00", disciplina.getHorario().getHorario());
    }
}

