package Arreglos;

import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {

        String productos[] = new String[7]; // también pueden ir así los corchetes.

        System.out.println("productos[0] = " + productos[0]);
        // arriba da null por defecto.
        productos[0] = "Kingston Pendrive 64 GB";
        productos[1] = "Samsung Galaxy ";
        productos[2] = "Disco Duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        System.out.println("productos[0] = " + productos[0]);

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("prod7 = " + prod7);

        // ordenar con sort, de forma natural, alfabética.
        // usar la clase Arrays.

        int[] numeros = new int[4];

        numeros[0] = -1;
        numeros[1] = 35;
        numeros[2] = (int) 3L; // casteo, forzar.
        numeros[3] = Integer.valueOf("4");// auto unboxing a int.

        Arrays.sort(numeros); // ordena los números.

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];// acceder al índice 3.

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
