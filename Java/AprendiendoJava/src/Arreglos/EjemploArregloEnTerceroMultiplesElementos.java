package Arreglos;

public class EjemploArregloEnTerceroMultiplesElementos {
    public static void main(String[] args) {

        int[] a, b, c;

        //para este ejercicio debe ser múltiplo del tamaño máximo del arreglo (c)

      /*   a = new int[10];
        b = new int[10];
        c = new int[20]; */

        //por ej. si quiero agregar 3 elementos, tendría que ser múltiplo de 3 por ej:

        a = new int[9];
        b = new int[9];
        c = new int[18];

        //por ej. si quiero agregar más elementos, tendría que ser múltiplo de 3 o divisible por 3 por ej:

        a = new int[12];
        b = new int[12];
        c = new int[24];
    

        for (int i = 0; i < a.length; i++) {

            a[i] = i + 1;

        }

        for (int i = 0; i < b.length; i++) {

            b[i] = (i + 1) * 5; // 0 + 1 , 1 por 5 = 5

        }

        /* int aux = 0;
        for (int i = 0; i < 10; i += 2) { // agrega dos elementos de cada arreglo, de a y b. Se va incrementando de dos
                                          // en dos en cada iteración.
            // en vez de iterar 10 veces, solo hará 5 pero agregará 4 elementos en cada
            // iteración.
            // por cada uno vamos a tener un for.
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i + j];// llena dos elementos de a en c y sale.
            }
            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i+j];
            }
        } */

        int aux = 0;
        for (int i = 0; i < b.length; i += 3) { // cambiamos a 3
            for (int j = 0; j < 3; j++) { // cambiamos a 3
                c[aux++] = a[i + j];// llena dos elementos de a en c y sale.
            }
            for (int j = 0; j < 3; j++) { // cambiamos a 3
                c[aux++] = b[i+j];
            }
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
