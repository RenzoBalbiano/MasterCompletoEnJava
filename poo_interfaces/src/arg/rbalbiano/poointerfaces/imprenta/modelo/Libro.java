package arg.rbalbiano.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    //private List<Hoja> paginas; cambiamos a imprimible que es el más genérico.
    
    // reemplazamos todo lo que antes tenía Hoja por Imprimible.

    private List<Imprimible> paginas; 
    private Persona autor;
    private String titulo;
    private Genero genero; // podría ser un enum, con los distintos tipos posibles de constantes.

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        

        //no olvidarse de crear la instancia del ArrayList. Sino va a lanzar un null pointer exception.

        this.paginas = new ArrayList<>();

    }

    public Libro addPagina(Imprimible hoja){
        this.paginas.add(hoja);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Título: ");
        sb.append(this.titulo).append("\n")
            .append("Autor: ").append(this.autor).append("\n")
            .append("Género: ").append(this.genero).append("\n");

        for(Imprimible pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }

        return sb.toString();
    }

}
