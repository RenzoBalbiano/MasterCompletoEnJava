package arg.rbalbiano.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import arg.rbalbiano.pooclasesabstractas.form.validador.LargoValidador;
import arg.rbalbiano.pooclasesabstractas.form.validador.Validador;
import arg.rbalbiano.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;
  
    public ElementoForm() {
        //hay que inicializar las listas en el constructor. List es la interfaz pero la implementación concreta es ArrayList.
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();//llama al de arriba. Para inicializar los arrayList
        this.nombre = nombre;
    }



    //hacemos siempre esto como hacía el Edu, para encadenar los métodos.
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }
    public List<String> getErrores() {
        return errores;
    }


    

    public void setValor(String valor) {
        this.valor = valor;
    } 

    public boolean esValido(){
        //sin argumento porque va a validar con los validadores que hayamos agregado en el addValidador.

        for(Validador v: validadores){
            if(!v.esValido(this.valor)){ //validamos el valor del campo, que no sea blanco, que sea número etc. 
                //este if es para poder pasar el campo en el Validador de Largo. ESTO SE PUEDE HACER MUCHO MÁS SIMPLE CON INTERFACES.
                //if(v instanceof LargoValidador){
                    //comentamos lo de arriba ya que con una interface queda: El código queda más desacoplado.
                if(v instanceof MensajeFormateable){
                    //this.errores.add(((LargoValidador)v).
                    this.errores.add(((MensajeFormateable)v).getMensajeFormateado(nombre));
                    
                }else{
                this.errores.add(String.format(v.getMensaje(), nombre));//cada validador tiene su propio mensaje.
            }
            }
        }
        return this.errores.isEmpty();//si la lista está vacía no hubo ningún error la retorna vacía, por lo tanto true. Si tiene algo retorna false, entonces va a ser inválido. también podría ser: this.errores.size() == 0; que sería igual a true también.
    }

    abstract public String dibujarHtml();//no lleva llave.

    /* public String getNombre() {
        return nombre;
    } */


}
