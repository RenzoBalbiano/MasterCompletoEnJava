package FlujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {

        int j = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("i es igual = " + i);
        }

        System.out.println(" ");

        for (; j <= 5; j++) { // también podría ir así.
            System.out.println("j es igual = " + j);
        }
        System.out.println(" ");
        System.out.println("j vale luego del for : " + j);

        j = 0;
        System.out.println(" ");

        for (; j < 5; j++) { // también podría ir así.
            System.out.println("j es igual = " + j);
        }
        System.out.println(" ");
        System.out.println("j vale luego del for : " + j);

        j = 0;
        System.out.println(" ");

        for (; j < 5;) { // también podría ir así.
            System.out.println("j es igual = " + j);
            j++; // podría escribirse así también.
        }
        System.out.println(" ");
        System.out.println("j vale luego del for : " + j);

        j = 0;
        System.out.println(" ");

        for (;;) { // también podría ir así.

            if (j > 5) {
                break;
            }

            System.out.println("j es igual = " + j);
            j++; // podría escribirse así también.
        }
        System.out.println(" ");
        System.out.println("j vale luego del for : " + j);

        j = 0;
        System.out.println(" ");

        for (; j < 10; j++) { // también podría ir así.
            System.out.println("j es igual = " + j);
        }
        System.out.println(" ");
        System.out.println("j vale luego del for : " + j);

        System.out.println(" ");

        for (int o = 10; o >= 0; o--) { // también podría ir así.
            System.out.println("o es igual = " + o);
        }
        System.out.println(" ");

        for (int o = 1, i = 10; o < i; o++, i--) {
            System.out.println("o vale = " + o + " i vale = " + i);
        }

        // imprimr números impares.
        System.out.println(" ");
        System.out.println("Números impares: ");
        System.out.println(" ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i es igual = " + i);
        }

        // imprimr números pares.
        System.out.println(" ");
        System.out.println("Números pares: ");
        System.out.println(" ");
        for (int i = 0; i <= 10; i++) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.println("i es igual = " + i);
        }
    }
}