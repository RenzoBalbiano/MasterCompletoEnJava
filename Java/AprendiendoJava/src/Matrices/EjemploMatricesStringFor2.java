package Matrices;

public class EjemploMatricesStringFor2 {

    public static void main(String[] args) {

        // String[][] nombres = new String[3][];
        String[][] nombres = { { " Juan", "Juana " }, { "Julieta ", "Carlos " }, { "Mariano ", "Daniela " } };

        System.out.println("Iterando con for each: ");
        for (String[] fila : nombres) {

            for (String nombre : fila) {

                System.out.print(nombre + "\t  ");
            }
            System.out.println(" ");
        }
    }

}
