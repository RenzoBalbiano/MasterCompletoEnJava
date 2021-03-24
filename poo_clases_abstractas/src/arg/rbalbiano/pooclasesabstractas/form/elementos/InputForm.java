package arg.rbalbiano.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm {

    // si esta clase hija es abstracta no está obligada a implementar el método del
    // padre.

    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        // Dos formas de enmarcar el texto en comillas.
        return "<input type=\"" + this.tipo
                +  "\" name=\"" + this.nombre
                +  "\" value= '" + this.valor + "'>";
    }

}
