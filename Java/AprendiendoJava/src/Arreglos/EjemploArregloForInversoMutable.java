package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloForInversoMutable {

    public static void arregloInverso(String[] arreglo) {

        int total = arreglo.length; // este total no cambia, lo mantenemos estático.
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i]; // obtener el primer elemento.
            String inverso = arreglo[total - 1 - i]; // obtener el último elemento.
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String productos[] = { "Kingston Pendrive 64 GB", "Samsung Galaxy ", "Disco Duro SSD Samsung", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; // buena práctica hacer así.

        Arrays.sort(productos);
        System.out.println(" ");
        System.out.println("Usando For ");
        System.out.println(" ");

        /*
         * índice 0 : Asus Notebook para índice 1 : Bicicleta Oxford para índice 2 :
         * Chromecast 4ta generación índice 3 : Disco Duro SSD Samsung índice 4 :
         * Kingston Pendrive 64 GB índice 5 : Macbook Air índice 6 : Samsung Galaxy
         */

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }

        System.out.println(" ");
        System.out.println("Usando For Inverso Mutable");
        System.out.println(" ");
        /*
         * for (int i = 0; i < total / 2; i++) { String actual = productos[i]; //
         * obtener el primer elemento. String inverso = productos[total - 1 - i]; //
         * obtener el último elemento. productos[i] = inverso; productos[total - 1 - i]
         * = actual; }
         * 
         * System.out.println(" "); System.out.println("Primera forma: ");
         * System.out.println(" ");
         * 
         * for (int i = 0; i <= total - 1; i++) {
         * 
         * System.out.println("para índice " + i + " : " + productos[i]); }
         */

        /*
         * System.out.println(" "); System.out.println("Segunda forma: ");
         * System.out.println(" ");
         * 
         * arregloInverso(productos);
         * 
         * for (int i = 0; i <= total - 1; i++) {
         * 
         * System.out.println("para índice " + i + " : " + productos[i]); }
         */

        System.out.println(" ");
        System.out.println("Tercera forma con la Api de Colección de Java: ");
        System.out.println(" ");

        Collections.reverse(Arrays.asList(productos)); // convertimos el arreglo productos a tipo List.

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }
    }
}
