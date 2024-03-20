import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TurmaTeste {
    static ControleAcademico ca;

    @Before
    public void setUp() {
        ca = new ControleAcademico();
        ca.cadastrarTurma("Metodos Avançados de Programação", "Segunda", "9:00");

        ca.adicionarAlunos("Livia", 111, "Computação");
        ca.adicionarAlunos("John", 222, "Computação");
        ca.adicionarAlunos("Madu", 333, "Computação");
    }

    @Test
    public void testGetProfessor() {
        Professor professor = new Professor("Professor Teste", 999);
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        turma.setProfessor(professor);
        assertEquals(professor, turma.getProfessor());
    }

    @Test
    public void testGetDisciplina() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        assertEquals("Metodos Avançados de Programação", turma.getDisciplina().getNome());
    }

    @Test
    public void testGetAlunosDisciplina() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Livia", 111, "Computação"));
        alunos.add(new Aluno("John", 222, "Computação"));
        alunos.add(new Aluno("Madu", 333, "Computação"));
        turma.setAlunosDisciplina(alunos);
        assertEquals(alunos, turma.getAlunosDisciplina());
    }

    @Test
    public void testMostrarAlunos() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Livia", 111, "Computação"));
        alunos.add(new Aluno("John", 222, "Computação"));
        alunos.add(new Aluno("Madu", 333, "Computação"));
        turma.setAlunosDisciplina(alunos);
        assertEquals(alunos, turma.mostrarAlunos());
    }

    @Test
    public void testQuantidadeAlunos() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Livia", 111, "Computação"));
        alunos.add(new Aluno("John", 222, "Computação"));
        alunos.add(new Aluno("Madu", 333, "Computação"));
        turma.setAlunosDisciplina(alunos);
        assertEquals(3, turma.quantidadeAlunos());
    }

    @Test
    public void testAdicionarAlunoNaLista() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        Aluno aluno = new Aluno("Novo Aluno", 999, "Computação");
        assertTrue(turma.adicionarAlunoNaLista(aluno));
        assertTrue(turma.getAlunosDisciplina().contains(aluno));
    }

    @Test
    public void testToString() {
        Turma turma = new Turma("Metodos Avançados de Programação", "Segunda", "9:00");
        assertEquals("Disciplina: Metodos Avançados de Programação", turma.toString());
    }
}
