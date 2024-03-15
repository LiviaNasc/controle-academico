import java.util.List;

public class Main {
	public static void main(String[] args) {

		// CRIAÇÃO CONTROLE ACADEMICO !

		ControleAcademico ca = new ControleAcademico();

		ca.cadastrarTurma("Metodos Avançados de Programação", "Segunda", "9:00");
		ca.cadastrarTurma("Banco de Dados", "Segunda", "7:00");
		ca.cadastrarTurma("Redes", "Terça", "11:00");
		ca.cadastrarTurma("APS", "Quarta", "7:00");
		ca.cadastrarTurma("Calculo 3", "Sexta", "7:00");

		ca.cadastrarProfessores("Sabrina", 123);
		ca.cadastrarProfessores("Fabio", 456);
		ca.cadastrarProfessores("Janderson", 789);
		ca.cadastrarProfessores("Luciana", 1011);
		ca.cadastrarProfessores("Maxuel", 1314);

		ca.adicionarAlunos("João", 111, "Computação");
		ca.adicionarAlunos("Josenelle", 222, "Computação");
		ca.adicionarAlunos("Gabriel", 333, "Computação");
		ca.adicionarAlunos("Evan", 444, "Química");
		ca.adicionarAlunos("Pedro", 555, "Matemática");
		ca.adicionarAlunos("Henrique", 666, "Física");

		ca.definirProfessorNaDisciplina("Sabrina", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Sabrina", "Metodos Avançados de Programação");
		ca.definirProfessorNaDisciplina("Fabio", "Redes");
		ca.definirProfessorNaDisciplina("Janderson", "APS");
		ca.definirProfessorNaDisciplina("Maxuel", "Calculo 3");

		ca.cadastrarAlunosNaDisciplina("João", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("João", "Metodos Avançados de Programação");
		ca.cadastrarAlunosNaDisciplina("João", "APS");
		ca.cadastrarAlunosNaDisciplina("João", "Calculo 3");
		ca.cadastrarAlunosNaDisciplina("Josenelle", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Josenelle", "APS");
		ca.cadastrarAlunosNaDisciplina("Josenelle", "Calculo 3");
		ca.cadastrarAlunosNaDisciplina("Gabriel", "Redes");
		ca.cadastrarAlunosNaDisciplina("Gabriel", "Metodos Avançados de Programação");
		ca.cadastrarAlunosNaDisciplina("Evan", "Calculo 3");
		ca.cadastrarAlunosNaDisciplina("Pedro", "Calculo 3");
		ca.cadastrarAlunosNaDisciplina("Henrique", "Calculo 3");

		System.out.println(ca.getProfessor("Fabio").toString());
		List<Turma> disciplinasFabio = ca.getProfessor("Fabio").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasFabio) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getProfessor("Sabrina").toString());
		List<Turma> disciplinasSabrina = ca.getProfessor("Sabrina").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasSabrina) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getProfessor("Janderson").toString());
		List<Turma> disciplinasJanderson= ca.getProfessor("Janderson").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasJanderson) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getProfessor("Luciana").toString());
		List<Turma> disciplinasLuciana= ca.getProfessor("Luciana").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasLuciana) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getProfessor("Maxuel").toString());
		List<Turma> disciplinasMaxuel= ca.getProfessor("Maxuel").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasMaxuel) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------------");

		System.out.println(ca.getAluno("João").toString());
		List<Turma> disciplinasJoao = ca.getAluno("João").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasJoao) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getAluno("Josenelle").toString());
		List<Turma> disciplinasJose= ca.getAluno("Josenelle").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasJose) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getAluno("Gabriel").toString());
		List<Turma> disciplinasGabriel= ca.getAluno("Gabriel").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasGabriel) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getAluno("Evan").toString());
		List<Turma> disciplinasEvan= ca.getAluno("Evan").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasEvan) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getAluno("Pedro").toString());
		List<Turma> disciplinasPedro= ca.getAluno("Pedro").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasPedro) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(ca.getAluno("Henrique").toString());
		List<Turma> disciplinasHenrique= ca.getAluno("Henrique").getRdm().mostrarDisciplinas();
		for (Turma disciplina : disciplinasHenrique) {
			String nomeDisciplina = disciplina.getDisciplina().getNome(); 
			Turma turmaEncontrada = ca.buscaTurmaPeloNome(nomeDisciplina); 
			System.out.println(turmaEncontrada.getDisciplina().toString());
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------------");

		System.out.println(ca.buscaTurmaPeloNome("Metodos Avançados de Programação").toString());
		System.out.println("Quantidade de Alunos: "
				+ ca.buscaTurmaPeloNome("Metodos Avançados de Programação").quantidadeAlunos());
		System.out.println(ca.buscaTurmaPeloNome("Metodos Avançados de Programação").mostrarAlunos() + "\n");
		System.out.println(ca.buscaTurmaPeloNome("Banco de Dados").toString());
		System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Banco de Dados").quantidadeAlunos());
		System.out.println(ca.buscaTurmaPeloNome("Banco de Dados").mostrarAlunos() + "\n");
		System.out.println(ca.buscaTurmaPeloNome("Redes").toString());
		System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Redes").quantidadeAlunos());
		System.out.println(ca.buscaTurmaPeloNome("Redes").mostrarAlunos() + "\n");
		System.out.println(ca.buscaTurmaPeloNome("APS").toString());
		System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("APS").quantidadeAlunos());
		System.out.println(ca.buscaTurmaPeloNome("APS").mostrarAlunos() + "\n");
		System.out.println(ca.buscaTurmaPeloNome("Calculo 3").toString());
		System.out.println("Quantidade de Alunos: " + ca.buscaTurmaPeloNome("Calculo 3").quantidadeAlunos());
		System.out.println(ca.buscaTurmaPeloNome("Calculo 3").mostrarAlunos() + "\n");


		}
	}
