import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AlunoTeste {
    static ControleAcademico ca;

    @Before
    public void setUp() {

        ca = new ControleAcademico();

        ca.cadastrarTurma("Metodos Avançados de Programação", "Segunda", "9:00");
        ca.cadastrarTurma("Banco de Dados", "Segunda", "7:00");
        ca.cadastrarTurma("APS", "Quarta", "7:00");
        ca.cadastrarTurma("Calculo 3", "Sexta", "7:00");
        ca.cadastrarTurma("Redes", "Terça", "11:00");

        ca.adicionarAlunos("Lívia", 111, "Computação");
        ca.adicionarAlunos("John", 222, "Computação");
        ca.adicionarAlunos("Madu", 333, "Computação");
        ca.adicionarAlunos("Fulano", 444, "Química");
        ca.adicionarAlunos("Pedro", 555, "Matemática");
        ca.adicionarAlunos("Henrique", 666, "Física");
        ca.adicionarAlunos("João", 777, "Filosofia");

        ca.cadastrarAlunosNaDisciplina("Lívia", "Banco de Dados");
        ca.cadastrarAlunosNaDisciplina("Lívia", "Metodos Avançados de Programação");
        ca.cadastrarAlunosNaDisciplina("Lívia", "APS");
        ca.cadastrarAlunosNaDisciplina("Lívia", "Calculo 3");
        ca.cadastrarAlunosNaDisciplina("John", "Banco de Dados");
        ca.cadastrarAlunosNaDisciplina("John", "APS");
        ca.cadastrarAlunosNaDisciplina("John", "Calculo 3");
        ca.cadastrarAlunosNaDisciplina("Madu", "Redes");
        ca.cadastrarAlunosNaDisciplina("Madu", "Metodos Avançados de Programação");
        ca.cadastrarAlunosNaDisciplina("Fulano", "Calculo 3");
        ca.cadastrarAlunosNaDisciplina("Pedro", "Calculo 3");
        ca.cadastrarAlunosNaDisciplina("Henrique", "Calculo 3");

    }

    @Test
    public void testeAlunoAddDisciplina(){

        assertTrue(ca.cadastrarAlunosNaDisciplina("Lívia", "Redes"));
        assertFalse(ca.cadastrarAlunosNaDisciplina("Lívia", "Redes"));// false quando tento colocar de novo!
        assertFalse(ca.cadastrarAlunosNaDisciplina("Lívia", "APS")); // false quando tento colocar de novo!

    }
    @Test
    public void testNumDisciplinas(){
        assertEquals(4, ca.getAluno("Lívia").getRdm().getListaTurmas().size());
        assertTrue(ca.cadastrarAlunosNaDisciplina("Lívia", "Redes"));
        assertEquals(5, ca.getAluno("Lívia").getRdm().getListaTurmas().size());
    }

    @Test
    public void testAlunoDados(){

        Aluno alunoTeste = new Aluno("Lívia", 111, "Computação");
        assertEquals(alunoTeste.getCurso(), ca.getAluno("Lívia").getCurso());
        assertEquals(alunoTeste.getId(), ca.getAluno("Lívia").getId());
        assertEquals(alunoTeste.getNome(), ca.getAluno("Lívia").getNome());
        assertEquals(alunoTeste.getRdm().getClass(), ca.getAluno("Lívia").getRdm().getClass());
    }

    @Test
    public void testDisciplinasIguais(){

        ca.adicionarAlunos("Aluno Teste", 111, "Computação");
        ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Banco de Dados");
        ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Metodos Avançados de Programação");
        ca.cadastrarAlunosNaDisciplina("Aluno Teste", "APS");
        ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Calculo 3");
        assertEquals(ca.getAluno("Aluno Teste").getRdm().getListaTurmas(), ca.getAluno("Lívia").getRdm().getListaTurmas());

    }

    @Test
    public void testeAlunosDiferentes(){
        assertNotEquals(ca.getAluno("Pedro"), ca.getAluno("Lívia"));
    }

    @Test
    public void alunosListaVazia(){
        assertNull(ca.getAluno("João").getRdm().mostrarDisciplinas());
    }

    @Test
    public void contaisAll(){
        assertFalse(ca.getAluno("Lívia").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
        ca.cadastrarAlunosNaDisciplina("Lívia", "Redes");
        assertTrue(ca.getAluno("Lívia").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
    }

}
