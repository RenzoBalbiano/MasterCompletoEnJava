package Arreglos;

public class MetodoBurbujaOptimizado {

    public static void main(String[] args) {

        String productos[] = { "Kingston Pendrive 64 GB", "Samsung Galaxy ", "Disco Duro SSD Samsung", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };

        int total = productos.length; // buena práctica hacer así.

        // dos for, el primero va a recorrer cada elemento.
        // En vez de comparar el i con el j, comparamos el j con el j

        int contador = 0; // para ver cúantas veces itera.

        // for (int i = 0; i < total; i++) { En realidad hay que dejar como la línea
        // de abajo, más eficaz. No es necesario iterar el último elemento, sino que con
        // cinco vueltas, ya está.
        for (int i = 0; i < total - 1; i++) {

            // for (int j = 0; j < total - 1; j++) { En realidad hay que dejar como la línea
            // de abajo, más eficaz.
            for (int j = 0; j < total - 1 - i; j++) { // Con esto optimiza, no es necesario ir ordenando las últimas
                                                      // posiciones del arreglo, ya que lo están.
                //

                if (productos[j + 1].compareTo(productos[j]) < 0) { // Comparamos los dos primeros elementos, o los dos
                                                                    // siguientes elementos del segundo for, y lo vamos
                                                                    // ordenando.
                                                                    // Lo iteramos tantas veces como cantidad de
                                                                    // elementos tenga el arreglo.
                                                                    // Y luego un segundo for en donde va comparando
                                                                    // pares de elementos.

                    String auxiliar = productos[j]; // dejamos el valor de i.
                    //
                    productos[j] = productos[j + 1];
                    //
                    productos[j + 1] = auxiliar;
                    //
                }
                contador++;
            }
        }
        System.out.println(" ");
        System.out.println("veces que itera el algoritmo: " + contador);
        System.out.println(" ");
        System.out.println("Usando for para iterar un arreglo: ");
        System.out.println(" ");

        for (int i = 0; i <= total - 1; i++) {

            System.out.println("para índice " + i + " : " + productos[i]);
        }
    }
}
