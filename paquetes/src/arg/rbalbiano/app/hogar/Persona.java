package arg.rbalbiano.app.hogar;

public class Persona {

    // public String nombre;
    /*
     * public String nombre; public String apellido;
     */

    private String nombre;
    private String apellido;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    private ColorPelo colorPelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota() {
        return "lanza la pelota al perro!";
    }

    // creando un método estático:
    public static String saludar() {
        return "hola que tal!";
    }

}
