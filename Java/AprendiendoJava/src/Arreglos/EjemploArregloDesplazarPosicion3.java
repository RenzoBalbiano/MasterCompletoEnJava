package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3 {
    // similar al anterior pero hay que buscar la posición.

    public static void main(String[] args) {

        int[] a = new int[7];

        int numero, posicion; // el numero que vamos a insertar y la posición que tenemos que calcular.

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese un número a insertar dentro del arreglo: ");

        numero = s.nextInt();

        posicion = 0; // no la sabemos la tenemos que calcular.
        // con un while, que ejecute mientras el número sea mayor, si es menor sale y
        // encontramos la posición.

        while (posicion < 6 && numero > a[posicion]) { // que son los elementos que tenemos en el arreglo.
            posicion++;

        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;

        System.out.println("El arreglo final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " = " + a[i]);
        }

    }
}
