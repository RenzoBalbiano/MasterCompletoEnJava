package LaClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        String[] colores = { "azul", "amarillo", "rojo", "verde", "celeste", "marrón", };

        double random = Math.random();
        System.out.println("random 1: " + random);

        // tener un número aleatorio entre 0 y 7 exclusive.
        /*
         * random *= 7; System.out.println("random 2: "+random);
         * 
         * random = Math.floor(random); System.out.println("random 3: "+random);
         */

        // programita para seleccionar colores aleatorios.

        System.out.println("colores.lenght: " + colores.length);
        random *= colores.length;
        System.out.println("random 5: " + random);
        random = Math.floor(random);
        System.out.println("random 6: " + random);

        System.out.println("Colores = " + colores[(int) random]); // casteamos.

        // SOBRE LA CLASE RANDOM.
        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println(" ");
        System.out.println(" ");

        Random randomObj = new Random();

        int randomInt = randomObj.nextInt();
        System.out.println("RandomInt versión 1: " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("RandomInt versión 2: " + randomInt);
        System.out.println("Colores = " + colores[(int) randomInt]); // casteamos.

        int randomInt2 = randomObj.nextInt(7); // valor aleatorio entre 0 y 7 exclusive.
        System.out.println(randomInt2);

        int randomInt3 = randomObj.nextInt(7 + 1); // valor aleatorio entre 0 y 7 exclusive.
        System.out.println(randomInt3);

        int randomInt4 = 15 + randomObj.nextInt(25 - 15); // valor aleatorio entre 15 y 24
        System.out.println(randomInt4);

        int randomInt5 = 15 + randomObj.nextInt(25 - 15 + 1); // valor aleatorio entre 15 y 25
        System.out.println(randomInt5);

        long randomLong = randomObj.nextLong();
        System.out.println(randomLong);

    }
}
