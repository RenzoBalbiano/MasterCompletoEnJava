package Arreglos;

import java.util.Arrays;

public class EjemplosArreglosFor {

    public static void main(String[] args) {

        String productos[] = new String[7]; // también pueden ir así los corchetes.

        int total = productos.length; // buena práctica hacer así.

        // for(int i = 0; i <= total - 1 ; i++){
        for (int i = 0; i < total; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

        productos[0] = "Kingston Pendrive 64 GB";
        productos[1] = "Samsung Galaxy ";
        productos[2] = "Disco Duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        System.out.println(" ");
        System.out.println("Usando For ");
        System.out.println(" ");
        Arrays.sort(productos);

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }

        System.out.println(" ");
        System.out.println("Usando foreach ");
        System.out.println(" ");

        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println(" ");
        System.out.println("Usando while ");
        System.out.println(" ");

        int i = 0;

        while (i <= total - 1) {
            System.out.println("para índice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println(" ");
        System.out.println("Usando Do - while ");
        System.out.println(" ");

        int j = 0;

        do {
            System.out.println("para índice " + j + " : " + productos[j]);
            j++;
        } while (j < total);

        // llenar un arreglo de números usando un for.

        int[] numeros = new int[10];
        int count = numeros.length;

        for (int k = 0; k < count; k++) {

            numeros[k] = k * 3; // generar la tabla del 3 por ejemplo.

        }

        for (int k = 0; k < count; k++) {

            System.out.println("numeros = " + numeros[k]);

        }
    }
}
