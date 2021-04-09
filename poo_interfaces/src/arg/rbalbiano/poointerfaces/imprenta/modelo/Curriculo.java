package arg.rbalbiano.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        // siempre inicializar el List.
        this.experiencias = new ArrayList<>();

    }

    public Curriculo addExperiencia(String ex) {

        experiencias.add(ex);
        return this;
        // retornando el this podemos encadenar el método, si hacemos estoc cambiamos el
        // void por el tipo de Clase del objeto que se retorna.

    }

    //reescribe el método de Imprimible así como el de Hoja.

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
            .append("Resumen: ").append(this.contenido)
            .append("\n").append("Profesión: ")
            .append(this.carrera).append("\n")
            .append("Experiencias: \n");

            for(String exp: this.experiencias){
                sb.append("- ").append(exp).append("\n");
            }

        return sb.toString();
    }

}
