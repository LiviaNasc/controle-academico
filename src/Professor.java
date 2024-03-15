public class Professor extends EntidadeAcademica {


    public Professor(String nome, int id) {
        super(nome, id);
    }

    @Override
    public String toString() {
        return "Professor: " + getNome();
    }
}