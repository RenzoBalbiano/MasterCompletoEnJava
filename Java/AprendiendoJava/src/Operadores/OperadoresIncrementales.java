package Operadores;

public class OperadoresIncrementales {

    public static void main(String[] args) {

        int i = 1;

        int j = ++i; // pre incremento. // i = i + 1. j = 2.

        System.out.println("i = " + i + " j = " + j); // i = 2 j = 2

        // Post incremento.
        i = 2;
        System.out.println("valor inicial de i = " + i); //
        j = i++;
        System.out.println("i = " + i + " j = " + j); // i = 3 j = 2

        // Pre decremento.
        i = 3;
        j = --i;
        System.out.println("i = " + i + " j = " + j); // i = 2 j = 2

        // Post decremento.
        i = 4;
        j = i--;
        System.out.println("i = " + i + " j = " + j); // i = 3 j = 4

        System.out.println("++j = " + (++j) + " j++ = " + (j++)); // ++j = 5 j++ = 5 Pero el valor final de j es 6.
        System.out.println(j); // 6 .
    }
}
