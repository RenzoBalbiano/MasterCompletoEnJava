package ValorVsReferencia;

public class PasarPorValor {

    public static void main(String[] args) {

        int i = 10;

        System.out.println("Iniciacmos el método main con i = " + i);

        test(i); // invocamos el método. /7 se pasó el valor y no la referencia. Por eso se
                 // mantiene en 10.

        System.out.println("Finaliza el método main con i = " + i);// sigue valiendo 10 este i.
        // seguiría dando 10 incluso si modificamos del tipo int a Integer.
        // esto se debe a que ciertas clases de java, entre ellas Integer son
        // inmutables. Lo que retorna es una nueva instancia, en el caso del 35.
        // cualquiera del tipo Number son inmutables.
        // por lo tanto siempre que cambia el valor, retornan una nueva instancia.
        // también la clase String.
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con nuevo valor de i = " + i);
    }
}