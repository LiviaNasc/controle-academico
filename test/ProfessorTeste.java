
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class ProfessorTeste {
    static ControleAcademico ca;

    @Before
    public void setUp() {

        ca = new ControleAcademico();

        ca.cadastrarTurma("Metodos Avançados de Programação", "Segunda", "9:00");
        ca.cadastrarTurma("Banco de Dados", "Segunda", "7:00");
        ca.cadastrarTurma("Redes", "Terça", "11:00");
        ca.cadastrarTurma("APS", "Quarta", "7:00");
        ca.cadastrarTurma("Calculo 3", "Sexta", "7:00");
        ca.cadastrarTurma("Calculo 1", "Sexta", "15:00");


        ca.cadastrarProfessores("Sabrina", 123);
        ca.cadastrarProfessores("Fabio", 456);
        ca.cadastrarProfessores("Janderson", 789);
        ca.cadastrarProfessores("Luciana", 1011);
        ca.cadastrarProfessores("Maxuel", 1314);

        ca.definirProfessorNaDisciplina("Sabrina", "Banco de Dados");
        ca.definirProfessorNaDisciplina("Sabrina", "Metodos Avançados de Programação");
        ca.definirProfessorNaDisciplina("Fabio", "Redes");
        ca.definirProfessorNaDisciplina("Sabrina", "APS");
        ca.definirProfessorNaDisciplina("Maxuel", "Calculo 3");
    }

    @Test
    public void testeAlunoAddDisciplina(){

        assertTrue(ca.definirProfessorNaDisciplina("Sabrina", "Calculo 1"));
        assertFalse(ca.definirProfessorNaDisciplina("Sabrina", "Calculo 1"));
        assertFalse(ca.cadastrarAlunosNaDisciplina("Sabrina", "Banco de Dados"));

    }
    @Test
    public void testNumDisciplinas(){
        assertEquals(3, ca.getProfessor("Sabrina").getRdm().getListaTurmas().size());
        assertTrue(ca.definirProfessorNaDisciplina("Sabrina", "Calculo 1"));
        assertEquals(4, ca.getProfessor("Sabrina").getRdm().getListaTurmas().size());
    }

    @Test
    public void testAlunoDados(){

        Professor professorTeste = new Professor("Fabio", 456);
        assertEquals(professorTeste.getNome(), ca.getProfessor("Fabio").getNome());
        assertEquals(professorTeste.getId(), ca.getProfessor("Fabio").getId());
        assertEquals(professorTeste.getRdm().getClass(), ca.getProfessor("Fabio").getRdm().getClass());
    }

    @Test
    public void testeProfessoresDiferentes(){
        assertNotEquals(ca.getProfessor("Fabio"), ca.getProfessor("Sabrina"));
    }

    @Test
    public void professorListaVazia(){
        assertNull(ca.getProfessor("Luciana").getRdm().mostrarDisciplinas());
    }

}