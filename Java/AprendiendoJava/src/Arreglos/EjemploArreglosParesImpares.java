package Arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;

        a = new int[10];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 números/enteros: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        // creamos arreglos de pares e impares. Una vez que el paso anterior calculamos
        // la longitud que necesitabamos del arreglo.
        pares = new int[totalPares];
        impares = new int[totalImpares];

        // hay que inicializar los arreglos. Variables auxiliares. Ahora hay que llenar
        // los arreglos.

        int j = 0; // para pares
        int k = 0; // para impares.

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }
        System.out.println("Pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print("Índice: " + i + " : " + pares[i] + " ");

        }
        System.out.println("\r\nImpares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print("Índice: " + i + " : " + impares[i] + " ");

        }
    }
}
