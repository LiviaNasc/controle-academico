import java.util.List;

public class Pessoa {
    
    private String nome;
    private int id;
    private Rdm rdm;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.rdm = new Rdm();
    }

    public String getNome() {
        return nome;
    }

    public Rdm getRdm() {
        return rdm;
    }

    public void setRdm(Rdm rdm) {
        this.rdm = rdm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean adicionarDisciplina(Turma e) {
        return rdm.adicionarDisciplinaRDM(e);
    }

    public List<Turma> mostrarDisciplinasRDM() {
        return rdm.mostrarDisciplinas();
    }


    public String toString(){
        return getNome();
    }
}