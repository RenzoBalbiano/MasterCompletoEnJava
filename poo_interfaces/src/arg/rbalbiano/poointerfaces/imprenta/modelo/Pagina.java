package arg.rbalbiano.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        return this.contenido;
    }
}
