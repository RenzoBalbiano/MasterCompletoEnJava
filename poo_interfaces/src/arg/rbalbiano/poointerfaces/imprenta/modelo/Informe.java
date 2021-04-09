package arg.rbalbiano.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;

    public Informe(Persona autor, Persona persona, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = (Persona) persona;
    }

    @Override
    public String imprimir() {
        
        return "Informe escrito por: " + autor
            + " Revisado por: " + revisor 
            + "\n" + this.contenido;
    }

}
