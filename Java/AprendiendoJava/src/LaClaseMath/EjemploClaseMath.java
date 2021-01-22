package LaClaseMath;

public class EjemploClaseMath {

    public static void main(String[] args) {
        //calcular el valor absoluto de un número.
        int absoluto = Math.abs(-3);
        System.out.println("absoluto " + absoluto); //3

        absoluto = Math.abs(3);
        System.out.println("absoluto " + absoluto); //3

        //El máximo entre dos números, decimales o cualquier tipo.

        double max = Math.max(3.5,1.2);
        System.out.println(max); //3.5

        double min = Math.min(3.5,1.2);
        System.out.println(min); //1.2

        //redondear el valor máximo de un decimal.
        double techo = Math.ceil(3.5);
        System.out.println(techo); //4.0

        //redondear el valor mínimo de un decimal.
        double piso = Math.floor(3.5);
        System.out.println(piso); //3.0

        //redondear de manera automática. Redondea con valor entero.
        long entero = Math.round(3.5);
        System.out.println(entero); //4

        //redondear de manera automática. Redondea con valor entero.
        long entero2 = Math.round(3.4);
        System.out.println(entero2); //3

        //redondear de manera automática. Redondea con valor entero.
        long pi = Math.round(Math.PI);
        System.out.println(pi); //3

        //2da parte de la clase:

        double exp = Math.exp(1);
        System.out.println(exp); //2.718281828459045

        double exp2 = Math.exp(2);
        System.out.println(exp2); //7.38905609893065 

        double log = Math.log(10);
        System.out.println(log); //2.302585092994046

        double potencia = Math.pow(10, 3); // 10 elevado a la 3.
        System.out.println(potencia); //1000.0

        double raiz = Math.sqrt(5); // raiz cuadrada de 5.
        System.out.println(raiz); //1000.0

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados); //con esta línea redondea a: 90.0
        System.out.println("Convertir de radianes a grados: " +grados); //89.95437383553924

        double radianes = Math.toRadians(90.0);
        //radianes = Math.round(radianes); //
        System.out.println("Convertir de radianes a radianes: " +radianes); //

        //Funciones de trigonometría

        System.out.println("sin(90): " + Math.sin(radianes)); // 1.0
        System.out.println("cos(90): " + Math.cos(radianes)); // 6.123233995736766E-17

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes)); // -1.0

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0.00): " + Math.cos(radianes)); // 1.0
    }   
}