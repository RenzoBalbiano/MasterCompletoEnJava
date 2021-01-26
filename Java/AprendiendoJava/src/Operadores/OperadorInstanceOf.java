package Operadores;

public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String ... que tal ";

        Integer num = 7;
        Short num2 = 7;
        Double decimal = 45.67;

        Boolean b1 = texto instanceof String;
        boolean b2 = texto instanceof Object;

        System.out.println("Texto es del tipo String : " + b1); // true
        System.out.println("Texto es del tipo String : " + b2); // true

        b2 = num instanceof Integer;
        System.out.println(b2); // true.

        b2 = num instanceof Number;
        System.out.println(b2); // true.

        b2 = num2 instanceof Number;
        System.out.println(b2); // también da true. Short e Integer heredan de la clase Number.

        b2 = num instanceof Object;
        System.out.println(b2); // true.

        b2 = decimal instanceof Number;
        System.out.println(b2); // true.

        b1 = b1 instanceof Boolean;
        System.out.println(b2); // true.
    }
}
