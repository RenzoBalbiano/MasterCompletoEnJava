package arg.rbalbiano.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor() {
        System.out.println("Profesor: inicializando constructor.");
    }

    public Profesor(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        // TODO Auto-generated method stub
        return "Buenos días, soy el profesor de "
         + getAsignatura() +  " y mi nombre es "
         + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nasignatura=" + asignatura;
    }

    

    


}
