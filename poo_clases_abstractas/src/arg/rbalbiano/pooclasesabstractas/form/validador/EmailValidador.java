package arg.rbalbiano.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el campo %s tiene un formato de correo electrónico inválido.";
    //forma más típica y exacta de validar mail: expresiones regulares.
    //pero vamos a ver una más resumida por ahora.

    //definimos atributo constante con nuestro patrón de expresión regular. Este caracter en exp reg significa que va a validar este string desde el comienzo de la linea, el signo peso todo lo contrario, son caracteres anclas estos.
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;     
        
    }

    @Override
    public String getMensaje() {
        
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        
        return valor.matches(EMAIL_REGEX);
    }
    
}
