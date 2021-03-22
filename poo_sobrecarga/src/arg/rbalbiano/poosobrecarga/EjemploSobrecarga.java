package arg.rbalbiano.poosobrecarga;

import static arg.rbalbiano.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        /*
         * Calculadora cal = new Calculadora();
         * 
         * System.out.println("Sumar int: " + cal.sumar(10, 5));
         
        System.out.println("Sumar float: " + Calculadora.sumar(10.0f, 5f));
        */
        System.out.println("Sumar float-int: " + sumar(10.0F, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0f));
        System.out.println("Sumar double: " + sumar(10d, 5.0));
        System.out.println("Sumar String: " + sumar("10", "5"));
        System.out.println("Sumar tres int: " + sumar(10, 5, 3));
        System.out.println("Sumar 4 int: " + sumar(10, 5, 3, 4, 5));// da error pero funciona igual.

        System.out.println("Sumar float + n int: " + sumar(10.5f, 5, 3, 4, 5, 10));// da error pero funciona
                                                                                               // igual.

        System.out.println("Sumar 6 doubles: " + sumar(10.5, 5.4, 3.6, 4.7, 5.8, 10.9));// da error pero
                                                                                                    // funciona igual.

        System.out.println("sumar long: " + sumar(10L, 5L));// usa o convierte a float. Un long se puede
                                                                        // almacenar dentro de un float, sino buscaría
                                                                        // el double.

        System.out.println("sumar int: " + sumar(10, '@'));// en unicode corresponde a 64.El caracter es un
                                                                       // entero, una representación de un decimal.
        System.out.println("sumar float-int: " + sumar(10F, '@'));
    }

}
