package Operadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + k / 3;
        // arriba hace esto . divide y luego realiza la suma.
        double promedio2 = i + j + (k / 3);
        double promedio3 = i + j + (k / 3d);
        double promedio4 = (i + j + k) / 3d;
        System.out.println(promedio); // da 28, debería dar 14.
        System.out.println(promedio2); // da 28, ahora si bien.
        System.out.println(promedio3); // da 28.666666666666668, ahora si bien.
        System.out.println(promedio4); // ahí si se calcula bien el promedio.

        // Clase 48. Minuto 5.37 Muestra tabla de operadores y su precedencia.

        promedio = i + j + k / 3d * 10; // primero divide, ese resultado multiplica por 10 y luego suma a i y j.
        System.out.println(promedio); // resultado 82.
        promedio = i + j + k / (3d * 10); // alteramos, acá primero multiplica. Tiene prioridad el paréntesis.
        System.out.println(promedio); // resultado 22.666666666666668
        promedio = (i + j + k) / (3d * 10); //
        System.out.println(promedio); // resultado 1.4
        promedio = (i + j + k) / 3d * 10; // acá lo último que hace es multiplicar.
        System.out.println(promedio); // resultado 140.0

        // pre y post incremento.

        promedio = ++i + j-- + k / 3d * 10; // (15+ 8) + (20/3 = 6.66 * 10 = 66.6)
        System.out.println(promedio); // resultado (15+ 8) + 66.6 = 89.66666666666667
        System.out.println("valor de i pre incremento :" + i);
        System.out.println("valor de j post incremento :" + j);

        promedio = i++ + --j + k / 3d * 10; // (13 + 8) + (20/3 = 6.66 * 10 = 66.6)
        System.out.println(promedio); // resultado (13+ 8) + 66.6 = 87.66666666666667
        System.out.println("valor de i pre incremento :" + i);
        System.out.println("valor de j post incremento :" + j);

    }
}