package arg.rbalbiano.pooherencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;


    public Alumno(){
        // super(); si se omite igual siempre va a llamar al constructor del padre. 
        System.out.println("Alumno: inicializando constructor.");
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
        
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
        
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        this(nombre,apellido,edad);//puede ir con super o this.
        this.institucion = institucion;
        
    }

    public Alumno(String nombre, String apellido, int edad, 
                    String institucion, double notaMatematica,
                    double notaCastellano, double notaHistoria){
        this(nombre,apellido,edad,institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
        
    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + "Soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("calcularPromedio: " + Alumno.class.getCanonicalName());//para saber que clase se ejecuta.
        return (notaCastellano + notaHistoria + notaMatematica) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\ninstitucion=" + institucion + 
        ", notaCastellano=" + notaCastellano + 
        ", notaHistoria=" + notaHistoria + 
        ", notaMatematica=" + notaMatematica+
        ", promedio= " + this.calcularPromedio();
        //si es alumno internacional va a invocar el calcularPromedio de esa clase.
    }
}
