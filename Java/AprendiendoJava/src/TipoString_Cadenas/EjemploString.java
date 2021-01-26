package TipoString_Cadenas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java"); // otra forma de hacer lo mismo.
        String curso3 = new String("Programacion java"); // otra forma de hacer lo mismo.
        String curso4 = new String("programación java"); // otra forma de hacer lo mismo.
        String curso5 = "Programación Java";

        boolean esIgual = curso == curso2;
        System.out.println(esIgual);// false

        boolean esIgual2;
        boolean esIgual3;
        boolean esIgual4;
        boolean esIgual6;
        esIgual2 = curso.equals(curso2);// true
        esIgual3 = curso.equals(curso3);// false
        esIgual4 = curso.equals(curso4);// false
        esIgual6 = curso == curso5; // true
        boolean esIgual5 = curso.equalsIgnoreCase(curso4);// true
        System.out.println(esIgual2);
        System.out.println(esIgual3);
        System.out.println(esIgual4);
        System.out.println(esIgual5);
        System.out.println(esIgual6);
    }
}