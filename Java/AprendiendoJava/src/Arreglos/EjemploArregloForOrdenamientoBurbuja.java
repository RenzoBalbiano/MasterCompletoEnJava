package Arreglos;

public class EjemploArregloForOrdenamientoBurbuja {

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

        // dos for, el primero va a recorrer cada elemento.
        // El segundo compara cada elemento con cada uno del resto del arreglo. Al final
        // compara todos con todos.

        int contador = 0; // para ver cúantas veces itera.

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                // preguntar si cada elemento del i lo comparamos con el j.
                if (productos[i].compareTo(productos[j]) < 0) { // si es negativa la comparación, osea da menos que 0.
                                                                // Entonces intercambiamos de posición.
                    String auxiliar = productos[i]; // dejamos el valor de i.
                    // asignamos i con el valor que tenía j.
                    // modificamos la posición i de productos con el valor que tiene la posición j.
                    productos[i] = productos[j];
                    // y la posición j dejamos en la posición i. Pero no podemos dejarla ahí, porque
                    // eso ahora vale j, entonces usamos el auxiliar que contiene el valor de i.
                    productos[j] = auxiliar;
                    // es decir inercambiamos las posiciones, las damos vuelta, y eso es el
                    // algoritmo burbuja.
                    // compara todo con todo, no es tan eficiente.
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
