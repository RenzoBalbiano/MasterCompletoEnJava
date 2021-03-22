package arg.rbalbiano.pooherencia;

public class Persona {

    protected String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona() {
        System.out.println("Persona: inicializando constructor.");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;

    }

    // podríamos cambiar a protected y los hijos y todos los del package accederían
    // a los atributos del padre. Pero usamos get&setter.
    public String getNombre() {
        return nombre;
    }
    // de esta manera alumno tienen los getters and setters del padre.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola, que tal?";
    }

    @Override
    public String toString() {
        return 
        "Nombre = " + nombre + 
        ", apellido = " + apellido + 
        ", edad = " + edad + 
        ", email = " + email+
        ", saludo = " + this.saludar();
    }

    

}
