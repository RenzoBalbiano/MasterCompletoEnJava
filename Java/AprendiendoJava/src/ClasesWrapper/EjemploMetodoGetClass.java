package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {

    public static void main(String[] args) {

        String texto = "Hola, que tal!";

        Class strClass = texto.getClass(); // descubrir la estructura interna del objeto o la clase.

        System.out.println("strClass " + strClass.getName());
        System.out.println("strClass " + strClass.getSimpleName());
        System.out.println("strClass " + strClass.getPackageName());
        System.out.println("strClass " + strClass);

        for (Method metodo : strClass.getMethods()) {
            System.out.println("Método.getName() = " + metodo.getName());
        }
        // esto va a listar todos los métodos de la clase String.

        Integer num = 34;

        Class intClass = num.getClass();
        Class objectClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass " + intClass);
        System.out.println("intClass " + intClass.getName());
        System.out.println("intClass " + intClass.getSimpleName());
        System.out.println("intClass " + intClass.getPackageName());
        System.out.println("intClass " + intClass.getPackage());
        System.out.println("intClass " + intClass.getSuperclass());
        System.out.println("intClass " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass " + objectClass);

        System.out.println(" ");

        for (Method metodo : objectClass.getMethods()) {
            System.out.println("Método.getName() = " + metodo.getName());
        }
        // esto va a listar todos los métodos de la clase Object.
    }
}
