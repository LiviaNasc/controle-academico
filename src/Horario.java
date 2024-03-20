public class Horario {
    private String dia;
    private String horario;

    public Horario(){

    }
    public Horario(String dia, String horario) {
        this.dia = dia;
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorarioE(String horario) {
        this.horario = horario;
    }

    public String toString() {
        return "Dia: " + dia + " ||Horario: " + horario ;
    }

}