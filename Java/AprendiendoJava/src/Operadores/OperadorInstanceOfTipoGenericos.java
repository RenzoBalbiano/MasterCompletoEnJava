package Operadores;

public class OperadorInstanceOfTipoGenericos {

    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String ... que tal ";

        Number num = 7; // detrás de escena esto es lo que hace el compilador: Integer.valueOf(7);
        Number num4 = Integer.valueOf(7); // forma correcta de crear una instancia, sin el new.
        Number num5 = Integer.valueOf("7"); // forma correcta de crear una instancia, sin el new.

        Integer num6 = Integer.valueOf(7);// forma correcta de crear una instancia, sin el new.

        Short num2 = 7;
        Number decimal = 45.67;
        Number decimal2 = 45.67f;
        Number decimal3 = Float.valueOf(45.67f); // también igual para el tipo Float por ejemplo, etc.

        Boolean b1 = texto instanceof String;
        boolean b2 = texto instanceof Object;

        System.out.println(num4 + " " + num5 + " " + num6);

        System.out.println("Texto es del tipo String : " + b1); // true
        System.out.println("Texto es del tipo String : " + b2); // true

        b2 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer : " + b2); // false.

        b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer : " + b2); // true.

        b2 = num instanceof Number;
        System.out.println("num es del tipo Number : " + b2); // true.

        b2 = num instanceof Long;
        System.out.println("num es del tipo Long : " + b2); // false.

        b2 = num instanceof Double;
        System.out.println("num es del tipo Double : " + b2); // false.

        b2 = num2 instanceof Number;
        System.out.println("num2 es del tipo Number : " + b2); // también da true. Short e Integer heredan de la clase
                                                               // Number.

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object : " + b2); // true.

        b2 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number : " + b2); // true.

        b2 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double : " + b2); // true.

        b2 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float : " + b2); // true.

        b2 = decimal2 instanceof Float;
        System.out.println("decimal2 es del tipo Float : " + b2); // true.

        b2 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer : " + b2); // false.

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean : " + b1); // true.
    }
}
