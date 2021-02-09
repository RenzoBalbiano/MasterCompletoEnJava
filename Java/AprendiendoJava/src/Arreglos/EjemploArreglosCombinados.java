package Arreglos;

public class EjemploArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;

        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {

            a[i] = i + 1;

        }

        for (int i = 0; i < b.length; i++) {

            b[i] = (i + 1) * 5; // 0 + 1 , 1 por 5 = 5

        }

        int aux = 0;
        for (int i = 0; i < 10; i++) { // solamente iterar hasta 10. Podría ser a o b.lenght
            // primero recorremos los elementos de a y b y en cada iteración vamos a agregar
            // dos
            // por lo tanto en 10 iteraciones vamos a tener 20.

            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c = " + c[i]);

        }

        System.out.println(" ");

        for (int i = 0; i < c.length; i++) {

            System.out.println(i + " : " + c[i]);
        }
    }
}
