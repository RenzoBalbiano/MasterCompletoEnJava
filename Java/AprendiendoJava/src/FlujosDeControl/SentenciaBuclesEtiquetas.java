package FlujosDeControl;

public class SentenciaBuclesEtiquetas {

    public static void main(String[] args) {

        bucle1: // ejemplo de etiqueta, debe ir pegado al for.
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue bucle1;
                }

                System.out.println("i es igual a " + i + " , j = " + j);
            }
        }

        System.out.println(" ");

        bucle1: // ejemplo de etiqueta, debe ir pegado al for.
        for (int i = 0; i < 5; i++) {

            System.out.println(" ");
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue bucle1;
                }

                System.out.print(" [ i = " + i + " , j = " + j + " ] , ");
            }
        }

        System.out.println("\n ---------------------- ");

        etiqueta: // ejemplo de etiqueta, debe ir pegado al for.
        for (int i = 0; i < 5; i++) {

            System.out.println(" ");
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break etiqueta;
                }

                System.out.print(" [ i = " + i + " , j = " + j + " ] , ");
            }
        }

        System.out.println("\n ---------------------- ");
        // es lo mismo que lo de arriba pero con while.
        etiqueta: // ejemplo de etiqueta, debe ir pegado al for.
        for (int i = 0; i < 5; i++) {

            System.out.println(" ");
            int j = 0;
            while (j < 5) {

                if (i == 2) {
                    break etiqueta;
                }

                System.out.print(" [ i = " + i + " , j = " + j + " ] , ");
                j++;
            }
        }

        System.out.println("\n=============================================== ");
        // recorrer cúantos días y horas a la semana trabaja una persona.

        bucle: for (int i = 1; i <= 7; i++) {

            int j = 1;
            while (j <= 8) {

                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + " : descanso de fin de semana.");
                    continue bucle;
                }

                System.out.println("Día " + i + " trabajando a las " + j + " horas.");
                j++;
            }
        }
    }
}
