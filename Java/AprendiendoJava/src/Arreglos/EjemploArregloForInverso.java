package Arreglos;

import java.util.Arrays;

public class EjemploArregloForInverso {

    public static void main(String[] args) {

        // String productos[] = new String [7]; //también pueden ir así los corchetes.

        String productos[] = { "Kingston Pendrive 64 GB", "Samsung Galaxy ", "Disco Duro SSD Samsung", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; // buena práctica hacer así.

        // for(int i = 0; i <= total - 1 ; i++){
        for (int i = 0; i < total; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }
        /*
         * productos[0] = "Kingston Pendrive 64 GB"; productos[1] = "Samsung Galaxy ";
         * productos[2] = "Disco Duro SSD Samsung"; productos[3] = "Asus Notebook";
         * productos[4] = "Macbook Air"; productos[5] = "Chromecast 4ta generación";
         * productos[6] = "Bicicleta Oxford";
         */

        System.out.println(" ");
        System.out.println("Usando For ");
        System.out.println(" ");
        Arrays.sort(productos);

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }

        System.out.println(" ");
        System.out.println("DOS FORMAS DE REALIZAR UN FOR A LA INVERSA:  ");
        System.out.println("FORMA UNO:");
        System.out.println(" ");

        // DOS FORMAS DE REALIZAR UN FOR A LA INVERSA:
        // FORMA UNO:

        for (int i = 0; i < total - 1; i++) {

            System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println(" ");
        System.out.println("FORMA dos:");
        System.out.println(" ");

        // partir del índice 6.

        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }
    }
}
