package arg.rbalbiano.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import arg.rbalbiano.pooclasesabstractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;//en vez de String usamos la lista de tipo "Opcion", la clase que creamos.

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
        //siempre inicializar el arreglo.
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //getter de opciones, si queremos iterarlas fuera, lo necesitaríamos.

    public SelectForm addOpciones(Opcion opcion){
        this.opciones.add(opcion);
        return this;
        //esto a diferencia del void nos permite de forma encadenada ir llamando una y otra vez el método cuando necesitemos.
    }

    @Override
    public String dibujarHtml() {
        //todos tienen un name y valor porque extienden clase padre.
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
            .append(this.nombre)
            .append("'>");
       
        for(Opcion opcion: this.opciones){
            sb.append("\n<option value= '")
                .append(opcion.getValor())
                .append("'");

            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }

            sb.append(">")
                .append(opcion.getNombre())
                .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }

}
