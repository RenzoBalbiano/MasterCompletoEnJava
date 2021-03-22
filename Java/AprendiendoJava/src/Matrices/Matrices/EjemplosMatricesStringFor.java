package Matrices;

public class EjemplosMatricesStringFor {

    public static void main(String[] args) {

        // String[][] nombres = new String[3][];
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Juan";
        nombres[0][1] = "Juana";

        nombres[1][0] = "Julieta";
        nombres[1][1] = "Carlos";

        nombres[2][0] = "Mariano";
        nombres[2][1] = "Daniela";

        // de esta manera lo imprimimos en formato de tabla.
        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++) {

            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t  ");
            }
            System.out.println(" ");
        }

        System.out.println("Iterando con for each: ");
        for (String[] fila : nombres) {

            for (String nombre : fila) {

                System.out.print(nombre + "\t  ");
            }
            System.out.println(" ");
        }
    }

}
