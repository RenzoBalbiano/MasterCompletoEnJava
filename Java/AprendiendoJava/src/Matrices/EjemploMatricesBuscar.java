package Matrices;

public class EjemploMatricesBuscar {

    public static void main(String[] args) {

        int[][] matrizDeEnteros = {

                { 35, 90, 3, 1970 }, { 15, 2020, 10, 5 }, { 677, 127, 32767, 1999 } };

        int elementoBuscar = 32767;
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {

            for (j = 0; j < matrizDeEnteros[i].length; j++) {

                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;// si usamos este break solo salimos del primer for, por ende conviene usar
                                 // etiquetas.
                }
            }
        }

        if (encontrado == true) {
            System.out.println("Valor encontrado " + elementoBuscar + " en las coordenadas " + i + ","+ j );
        } else {
            System.out.println("El valor ingresado no se encuentra dentro de la matriz.");
        }
    }
}
