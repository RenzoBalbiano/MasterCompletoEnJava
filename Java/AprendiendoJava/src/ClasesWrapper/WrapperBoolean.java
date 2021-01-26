package ClasesWrapper;

public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false.

        Boolean objetoBoolean = Boolean.valueOf(primBoolean); // false.
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;
        Boolean objetoBoolean4 = true;

        System.out.println(primBoolean);
        System.out.println(objetoBoolean);
        System.out.println(objetoBoolean2);

        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean == objetoBoolean2)); // true
        // No se comporta igual que los enteros. Siempre compara por valor.
        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2))); // true

        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean2 == objetoBoolean3)); // true
        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean == objetoBoolean3)); // true

        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean2 == objetoBoolean4)); // false
        System.out.println("Comparamos dos objetos boolean: " + (objetoBoolean == objetoBoolean4)); // false

        boolean primBoolean2 = objetoBoolean2.booleanValue(); // unboxing.
        boolean primBoolean3 = objetoBoolean3; // unboxing forma 2
        System.out.println(primBoolean2); // false
        System.out.println(primBoolean3); // false
    }
}
