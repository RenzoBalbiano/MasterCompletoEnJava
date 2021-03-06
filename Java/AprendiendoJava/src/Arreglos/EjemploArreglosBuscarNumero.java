package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nIngrese un número a buscar: ");
        int num = s.nextInt();
        int i = 0;

        //lo podemos hacer con un while:

        /* while (i < a.length && a[i] != num) {
            i++;
        }
        if (i == a.length) {
            System.out.println("Número no encontrado.");
        } else if (a[i] == num) {
            System.out.println("Número encontrado en la posición " + i);
        } */

        //lo podemos hacer con un for:

        
        for (;i < a.length && a[i] != num; i++) {}
        if (i == a.length) {
            System.out.println("Número no encontrado.");
        } else if (a[i] == num) {
            System.out.println("Número encontrado en la posición " + i);
        }
    }
}
