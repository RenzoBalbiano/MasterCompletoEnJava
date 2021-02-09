package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2b {

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        int elemento, posicion, ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingrese un nuevo valor para insertar en el arreglo:");
        elemento = s.nextInt();

        System.out.println("Ingrese la posición (0 - 9) en la cual desea insertar en el arreglo:");
        posicion = s.nextInt();

        ultimo = a[a.length - 1];

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        /*
         * b[posicion] = elemento;
         * 
         * b[b.length - 1] = ultimo;
         * 
         * System.out.println("El arreglo final: "); for (int i = 0; i < b.length; i++)
         * { System.out.println("Índice " + i + " = " + b[i]); }
         */

        a = b;
        a[posicion] = elemento;

        a[a.length - 1] = ultimo;

        System.out.println("El arreglo final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " = " + a[i]);
        }
    }
}
