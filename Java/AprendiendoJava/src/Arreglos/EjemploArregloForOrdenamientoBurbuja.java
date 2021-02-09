package Arreglos;

public class EjemploArregloForOrdenamientoBurbuja {

    public static void sortBurbujaAlfMenorAMayor(Object[] arreglo) {// recibe arreglo de tipo Objetct para poder
                                                                    // utilizarlo después
        // con cualquier clase.

        int total = arreglo.length; // buena práctica hacer así.

        int contador = 0; // para ver cúantas veces itera.

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) { //

                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) { //

                    Object auxiliar = arreglo[j]; //

                    arreglo[j] = arreglo[j + 1]; //

                    arreglo[j + 1] = auxiliar; //
                }
                contador++;
            }
        }
        System.out.println(" ");
        System.out.println("Veces que itera el algoritmo: " + contador);
        System.out.println(" ");
    }

    public static void sortBurbujaMayorAMenor(Object[] arreglo) {// recibe arreglo de tipo Objetct para poder utilizarlo
                                                                 // después
        // con cualquier clase.

        int total = arreglo.length; // buena práctica hacer así.

        int contador = 0; // para ver cúantas veces itera.

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) { //

                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) { //Para que sea de mayor a menor cambiamos el signo.

                    Object auxiliar = arreglo[j]; //

                    arreglo[j] = arreglo[j + 1]; //

                    arreglo[j + 1] = auxiliar; //
                }
                contador++;
            }
        }
        System.out.println(" ");
        System.out.println("Veces que itera el algoritmo: " + contador);
        System.out.println(" ");
    }

    /*
     * public static void arregloInverso(String[] arreglo) {
     * 
     * int total = arreglo.length; // este total no cambia, lo mantenemos estático.
     * int total2 = arreglo.length; for (int i = 0; i < total2; i++) { String actual
     * = arreglo[i]; // obtener el primer elemento. String inverso = arreglo[total -
     * 1 - i]; // obtener el último elemento. arreglo[i] = inverso; arreglo[total -
     * 1 - i] = actual; total2--; } }
     */

    public static void main(String[] args) {

        String productos[] = { "Kingston Pendrive 64 GB", "Samsung Galaxy ", "Disco Duro SSD Samsung", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; // buena práctica hacer así.

        // dos for, el primero va a recorrer cada elemento.
        // El segundo compara cada elemento con cada uno del resto del arreglo. Al final
        // compara todos con todos.

        // int contador = 0; // para ver cúantas veces itera. */

        // for (int i = 0; i < total; i++) {
        // for (int j = 0; j < total; j++) {
        // // preguntar si cada elemento del i lo comparamos con el j.
        // if (productos[i].compareTo(productos[j]) < 0) { // si es negativa la
        // comparación, osea da menos que 0.
        // // Entonces intercambiamos de posición.
        // String auxiliar = productos[i]; // dejamos el valor de i.
        // // asignamos i con el valor que tenía j.
        // // modificamos la posición i de productos con el valor que tiene la posición
        // j.
        // productos[i] = productos[j];
        // // y la posición j dejamos en la posición i. Pero no podemos dejarla ahí,
        // porque
        // // eso ahora vale j, entonces usamos el auxiliar que contiene el valor de i.
        // productos[j] = auxiliar;
        // // es decir inercambiamos las posiciones, las damos vuelta, y eso es el
        // // algoritmo burbuja.
        // // compara todo con todo, no es tan eficiente.
        // }
        // contador++;
        // }
        // }

        sortBurbujaAlfMenorAMayor(productos);

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }

        sortBurbujaMayorAMenor(productos);

        System.out.println(" ");
        // System.out.println("veces que itera el algoritmo: " + contador);
        System.out.println(" ");
        System.out.println("Usando for para iterar un arreglo: ");
        System.out.println(" ");

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }

        System.out.println(" ");
        Integer[] numeros = new Integer[4]; // para solucionar compareTo podríamos pasar estos int a Integer.

        numeros[0] = -1;
        numeros[1] = 35;
        numeros[2] = (int) 3L; // casteo, forzar.
        numeros[3] = Integer.valueOf("4");// auto unboxing a int.

        // Espara recibir una instacia u objeto. No primitivos.
        // podríamos cambiar el arreglo al tipo Integer.
        sortBurbujaAlfMenorAMayor(numeros);
        

        /*
         * for (int i = 0; i < numeros.length; i++) { for (int j = 0; j <
         * numeros.length; j++) { //
         * 
         * if (((Comparable<Integer>) numeros[i]).compareTo(numeros[j]) < 0) { // Usamos
         * la interfaz comparable, // que utiliza la clase Integer y // otras más. // if
         * (((Integer) numeros[i]).compareTo(numeros[j]) < 0) { // No podemos usar //
         * compareTo porque es un // primitivo. Por ende Casteamos. // terminamos
         * haciendo autoboxing. int auxiliar = numeros[i]; //
         * 
         * numeros[i] = numeros[j]; //
         * 
         * numeros[j] = auxiliar; // } contador++; } }
         */

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("índice: " + i + " Números ordenados: " + numeros[i]);
        }
        sortBurbujaMayorAMenor(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("índice: " + i + " Números ordenados: " + numeros[i]);
        }

    }
}
