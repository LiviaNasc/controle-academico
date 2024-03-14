import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ControleAcademico controle = new ControleAcademico();

        Professor prof1 = new Professor("João");
        prof1.addDisciplina("Matemática", "Segunda 08:00-10:00");
        prof1.addDisciplina("Física", "Terça 10:00-12:00");
        controle.adicionarProfessor(prof1);

        Disciplina matematica = new Disciplina("Matemática");
        matematica.addAluno("Pedro");
        matematica.addAluno("Maria");
        controle.adicionarDisciplina(matematica);

        Aluno aluno1 = new Aluno("Pedro");
        aluno1.addDisciplina("Matemática", "Segunda 08:00-10:00");
        controle.adicionarAluno(aluno1);

        // Utilização métodos
        Set<String> disciplinasProf = controle.disciplinasDoProfessor(prof1);
        System.out.println("Disciplinas do Professor João: " + disciplinasProf);

        String horarioMatematicaProf = controle.horarioDoProfessor(prof1, "Matemática");
        System.out.println("Horário da disciplina Matemática do Professor João: " + horarioMatematicaProf);

        List<String> alunosMatematica = controle.alunosDaDisciplina(matematica);
        System.out.println("Alunos da disciplina Matemática: " + alunosMatematica);

        Set<String> disciplinasAluno = controle.disciplinasDoAluno(aluno1);
        System.out.printf("Disciplinas do Aluno %s: %s\n", aluno1.getNome(), disciplinasAluno);

        String horarioMatematicaAluno = controle.horarioDoAluno(aluno1, "Matemática");
        System.out.println("Horário da disciplina Matemática do Aluno Pedro: " + horarioMatematicaAluno);

        int numeroAlunosMatematica = controle.numeroDeAlunosNaDisciplina(matematica);
        System.out.println("Número de alunos na disciplina Matemática: " + numeroAlunosMatematica);

        Scanner input = new Scanner(System.in);
        System.out.println("a. Quais disciplinas um professor está ministrando;\n" +
                            "b. Qual o horário de um professor;\n" +
                            "c. Quais os alunos de uma dada disciplina;\n" +
                            "d. Quais as disciplinas de um aluno;\n" +
                            "e. Qual o horário de um aluno;\n" +
                            "f. Qual o número de alunos de uma disciplina.");
        String letra = input.next();
        switch(letra){
            case "a":
                System.out.println("Qual professor? ");
                String professor = input.next();
                break;
        }


    }
}
