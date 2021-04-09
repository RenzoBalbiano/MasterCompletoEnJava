package arg.rbalbiano.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //también puede tener atributos que sean constantes:

    public final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto,";
    //PODEMOS UTILIZAR ESTA CONSTANTE AFUERA. Podría sin el final static.

    //String imprimir();

    //no tiene sentido una interface con private.
    //el public es redudante en el método imprimir().

    
    //podríamos tener métodos default no obligatoríos:

    default String imprimir(){
        return TEXTO_DEFECTO;
    }
    // de esta manera las hijas de esta interface no estarían obligadas a implementarla.
    // y si se implementa la interface, el return ese de arriba no se imprime.


    //métodos estáticos:

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
    
}
