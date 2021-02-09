package Arreglos;

import java.util.Scanner;

public class EjemploArregloEliminarElemento {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();

        }
        System.out.println();

        System.out.println("Ingrese una posición (0-9) a eliminar: ");

        int posicion = s.nextInt();

        for (int i = posicion; i < a.length - 1; i++) {

            a[i] = a[i + 1];
        }
        System.out.println("El arreglo final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " = " + a[i]);
        }

        int[] b = new int[a.length - 1];

        //método para crear un nuevo arreglo con una posición menos.
        System.arraycopy(a, 0, b, 0, b.length);

        //podría ser también:
        //a = b;

        System.out.println("El arreglo b modificado del a: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Índice " + i + " = " + b[i]);
        }

    }

}
