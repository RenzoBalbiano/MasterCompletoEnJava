package Arreglos;

import java.util.Scanner;

public class EjemploArregloBuscarString {

    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese una palabra: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIngrese palabra a buscar: ");
        String palabra = s.next();
        int i = 0;

        // lo podemos hacer con un for:

        for (; i < a.length && !a[i].equalsIgnoreCase(palabra); i++) {
        }
        if (i == a.length) {
            System.out.println("palabra no encontrada.");
        } else if (a[i].toLowerCase().compareTo(palabra.toLowerCase()) == 0) { // otra alternativa usar comparteTo. En la línea 24 debería ser distinto a 0. Para replicar esa línea ahí
            System.out.println("palabra encontrada en la posición " + i);
        }
    }

}
