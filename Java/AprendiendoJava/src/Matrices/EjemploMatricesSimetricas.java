package Matrices;

public class EjemploMatricesSimetricas {

    public static void main(String[] args) {
        boolean simetrica = true;
        int[][] matriz = { { 1, 2, 3, 4 }, // es simétrica, fila 1 por ej. igual a col. 1. fila 2 == a col. 2 etc.
                { 2, 1, 0, 5 }, { 3, 0, 1, 6 }, { 4, 5, 6, 7 } };

        int i, j;
        i = 0;

        while (i < matriz.length && simetrica == true) {

            j = 0;

            while (j < i && simetrica == true) { // para optimizar y que recorra menos código, mientras j sea menor que
                                                 // i.
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        if (simetrica == true) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }

        System.out.println(" ");
        System.out.println("Otra forma utilizando etiquetas: ");

        salir: while (i < matriz.length) {

            j = 0;

            while (j < i) { // para optimizar y que recorra menos código, mientras j sea menor que
                            // i.
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }
        if (simetrica == true) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }

        System.out.println(" ");
        System.out.println("Otra forma utilizando for: ");

        salir: for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < i; j++) { // para optimizar y que recorra menos código, mientras j sea menor que
                // i.
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }
        if (simetrica == true) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}
