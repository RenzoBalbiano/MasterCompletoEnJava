package arg.rbalbiano.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;
  
    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();//llama al de arriba. Para inicializar los arrayList
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    } 

    abstract public String dibujarHtml();//no lleva llave.
    
}
