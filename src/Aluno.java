
public class Aluno{

    private String nome;
    private String id;
    private String curso;
    private Rdm rdm;

    public Aluno(String nome, String id, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.rdm = new Rdm();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Rdm getRdm() {
        return rdm;
    }

    public void setRdm(Rdm rdm) {
        this.rdm = rdm;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + " - Matricula: " + this.id;
    }
}