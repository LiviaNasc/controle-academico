import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HorarioTeste {

    @Test
    public void testGetDiaHora() {
        Horario horario = new Horario("Segunda", "8:00");
        assertEquals("Segunda", horario.getDia());
        assertEquals("8:00", horario.getHorario());
    }

    @Test
    public void testToString() {
        Horario horario = new Horario("Quarta", "14:00");
        assertEquals("Dia: Quarta ||Horario: 14:00", horario.toString());
    }
}
