public class Professor{
    private String nome;
    private String id;
    private Rdm rdm;

    public Professor(String nome, String id) {
        this.nome = nome;
        this.id = id;
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

    public Rdm getRdm() {
        return rdm;
    }

    public void setRdm(Rdm rdm) {
        this.rdm = rdm;
    }

    @Override
    public String toString() {
        return "Professor: " + this.nome;
    }
}