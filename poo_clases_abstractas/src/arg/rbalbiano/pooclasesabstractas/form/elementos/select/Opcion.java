package arg.rbalbiano.pooclasesabstractas.form.elementos.select;

public class Opcion {

    private String valor;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    // Opcion 1:
    
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    /*
    
    Opcion 2: 

    Modificamos para que retorne el this y poder asignar el selected directo cuando creamos el objeto new objeto = objeto.setSelected(true)
    
    */ 

    /* public Opcion setSelected(boolean selected) {
        this.selected = selected;
        return this;

    } */

    /* 

    Opcion 3:
    Otra opción con Opcion y cuando creamos el objeto indicamos setSelected() sin ningún parámetro y lo establece como true por defecto, sobrecargando 
    el método
   
    */

    public Opcion setSelected() {
        this.selected = true;
        return this;

    }


    //los dos métodos relacionados a selected de arriba los produjo con la función de generate getter and setter.

    /* public Opcion setSelected() {
        this.selected = true;
        return this;
    } */

}
