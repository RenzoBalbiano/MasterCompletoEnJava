package ClasesWrapper;

public class AutoboxingInteger {

    public static void main(String[] args) {

        Integer[] enteros = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, // tenemos de forma automática
                // autoboxing, conviertiendo primitivos en la literal,
                // en tipos de referencia.
                10, 11, 12, 13, 14, 15 }; // no es necesario el Integer.valueOf()

        int suma = 0;

        // Unboxing: Convertir de un objeto Integer a un primitivo:

        // un boxing. Forma 1

        for (Integer i : enteros) {
            if (i.intValue() % 2 == 0) { // suma todos los nros pares.
                suma += i.intValue();
            } // retornamos el valor en primitivo. Forma explícita.
        }
        System.out.println(suma);

        System.out.println("=======");
        System.out.println("Lo de arriba sería similar a lo siguiente: ");

        // un boxing. Forma 2

        suma = 0;
        System.out.println("Hacer de forma automática el unboxing: ");
        for (Integer i : enteros) {
            if (i % 2 == 0) { // suma todos los nros pares.
                suma += i; // de forma implícita.
            } // retornamos el valor en primitivo.
        }
        System.out.println(suma);

        // Otro ejemplo de unboxing:

        Integer numero1 = Integer.valueOf(5);
        int numero2 = 5;

        System.out.println(numero1 == numero2);// Da True porque Java hace
        // el unboxing de manera automática, pasando ambos números a ser int en la
        // comparación.
    }
}
