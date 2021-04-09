package arg.rbalbiano.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador {

    protected String mensaje = "el campo %s es requerido";

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
        
        return (valor != null && valor.length() > 0);
        //podríamos utilizar que sea distinto a isEmpty(que tenga caracteres) o isBlank (aparte de validar que no se vacío también valida que no sea un espacio en blanco) del String.
    }
    
}
