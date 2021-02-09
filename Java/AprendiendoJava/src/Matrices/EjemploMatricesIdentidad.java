package Matrices;

public class EjemploMatricesIdentidad {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) { // esto significa que cuando pase eso, estamos en la diagonal de la matriz.
                    matriz[i][j] = 1;
                }

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }

        // Ahora un ejemplo de la última y primera fila estén completadas con un uno. Y
        // también la última y la primera columna.

        int[][] matriz2 = new int[5][5];

        System.out.println(" ");
        System.out.println(" Ahora ejemplo matriz con marco de 1");
        System.out.println(" ");

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2[i].length; j++) {
                if (i == 0 || i == matriz2.length - 1 || j == 0 || j == matriz2.length - 1 || i == j) { // podría ser
                                                                                                        // también como
                                                                                                        // muestra en el
                                                                                                        // video: || j
                                                                                                        // == 0 || j ==
                                                                                                        // matriz2[i].length
                                                                                                        // - 1)

                    matriz2[i][j] = 1;
                }

            }

        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }

}
