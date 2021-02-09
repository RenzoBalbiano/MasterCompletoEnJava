package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {

    public static void main(String[] args) {
        // desplazar la posición de un arreglo:
        // que en un arreglo de 10, el valor 10 pase del índice 9 al 0 y así con los
        // anteriores valores.

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        int ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        // hay que recorrer a la inversa el arreglo:

        // primero respaldar la última posición:
        ultimo = a[a.length - 1]; // lo tenemos respaldado empezamos a cambiar de posiciones de arriba hacia
                                  // abajo.

        for (int i = a.length - 2; i >= 0; i--) {// el i tiene que partir del penúltimo valor. índice ocho contiene el
                                                 // valor 9
            a[i + 1] = a[i]; // esta posición se la pasamos al último elemento del arreglo.
        }
        a[0] = ultimo;

        System.out.println("El arreglo final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " = " + a[i]);
        }
    }

}
