package FlujosDeControl;

public class SentenciaWhile {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println(" ");
        i = 0;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println(" ");
        i = 0;
        boolean prueba = true;

        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i es igual a " + i);
            i++;
        }

        System.out.println(" ");
        i = 0;
        prueba = false;
        while (prueba) {
            System.out.println("Esto nunca se va a ejecutar.");
        }

        // DO - WHILE.

        do {
            System.out.println("Al menos se va a ejecutar una sola vez.");
        } while (prueba);

        System.out.println(" ");
        i = 0;
        prueba = true;

        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i es igual a " + i);
            i++;
        } while (prueba);
    }
}