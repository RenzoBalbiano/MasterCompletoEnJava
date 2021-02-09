package Arreglos;

import java.util.Scanner;

public class EjemploArregloDetectarOrden {

    public static void main(String[] args) {
        // saber si está ordenado en forma ascendente o descendente.
        int[] a = new int[7]; // vamos a compararlos. Se aplica a String o cualquier elemento que implemente
                              // la interfaz comparable.
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 números: ");

        for (int i = 0; i < a.length; i++) {
            // por cada elemento de este arreglo vamos preguntando.
            a[i] = s.nextInt();
        }

        // preguntar si cada elemento, es mayor o menor al siguiente:
        // si es mayor, está en orden descendente.
        // si es <, está ascendente.
        // sino está mezclado.
        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++) { // -1 porque comparamos con el elemento siguiente. No es necesario
                                                 // llegar al último elemento, con el penúltimo está bien. Porque el
                                                 // penúltimo se compara con el último.

            if (a[i] > a[i + 1]) { // significa que es descendente. Como marcamos? con una bandera.
                descendente = true; // que va de mayor a menor.
            }
            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true) {
            System.out.println("Arreglo desordenado.");
        }
        if (ascendente == false && descendente == false) {
            System.out.println("Arreglo = son todos iguales.");
        }
        if (ascendente == true && descendente == false) {
            System.out.println("Arreglo = ascendente.");
        }
        if (ascendente == false && descendente == true) {
            System.out.println("Arreglo = descendente.");
        }
    }
}
