import java.util.Date;

public class EjemploAutomovil {

    public static void main(String[] args) {

        // Principios de encapsulamiento != a ocultación o visibilidad.

        // el 2do de visibilidad o acceso a los datos a los atributos o métodos, si es
        // público, privado,etc.

        // encapsulamiento, es lo hermético de la implementación de cada método. En la
        // clase con el método main invocamos un método, pero la clase main no sabe como
        // está implementado por debajo el método invocado.

        // principio de polimorfismo, mismo compartamiento porque al final es calcular
        // el consumo, misma operación pero implementada de otra forma. Distinta
        // implementación, diferentes formas de hacer lo mismo = POLIMORFISMO.

        Automovil subaru = new Automovil("Subaru", "Impreza");

        /*
         * subaru.fabricante = "Subaru"; subaru.modelo = "Impreza"; subaru.cilidranda =
         * 2.0; subaru.color = "blanco";// modificamos el valor por defecto
         */

        subaru.setCilidranda(2.0);
        subaru.setColor(Color.BLANCO);
        /*
         * subaru.setFabricante("Subaru"); subaru.setModelo("Impreza");
         */

        Automovil mazda = new Automovil("Mazda", "BT-500", Color.ROJO, 3.0);

        /*
         * mazda.setCilidranda(3.0); mazda.setColor("rojo");
         */
        /*
         * mazda.setFabricante("Mazda"); mazda.setModelo("BT-500");
         */

        /*
         * mazda.fabricante = "Mazda"; mazda.modelo = "BT-500"; mazda.cilidranda = 3.0;
         * mazda.color = "rojo";// modificamos el valor por defecto
         */

        /*
         * System.out.println("mazda : " + mazda.fabricante);
         * System.out.println("mazda : " + mazda.modelo);
         */

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("son iguales: " + (nissan == nissan2)); // false
        System.out.println("son iguales con el equals sobreescrito: " + (nissan.equals(nissan2))); // da true, antes
                                                                                                   // daba false.
        System.out.println(auto.equals(nissan)); // da error null pointer exception, porque fabricante y modelo son
                                                 // null, un objeto sin referencia del tipo null no puede invocar
                                                 // métodos, porque no tiene valor, instancias ni referencias. Hay que
                                                 // modificar el equals capturando la excepción. Una vez arreglado si da
                                                 // false.
        // si comparamos con otro objeto de otro tipo. Son tipos incompatibles. Lo mismo
        // pasaría con un String.
        // utilizando instance of:
        System.out.println(auto.equals(fecha));

        System.out.println(nissan);// acá se usa toString. Lo que hace por detrás es convertir el hashcode a
                                   // hexadecimal como texto. No es necesario convocar el método.
                                   // Automovil@6f75e721 Tiene un id único el hashcode. Es lo mismo que hacer esto:
        System.out.println(nissan.toString()); //Podemos sobrescribirlo.

        System.out.println("mazda color : " + mazda.getColor());
        System.out.println("mazda cilindrada: " + mazda.getCilidranda());

        System.out.println(subaru.detalleDos());
        System.out.println(mazda.detalleDos());
        System.out.println(nissan.detalleDos());

        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.acelerar(3500));
        System.out.println(subaru.frenar());
        System.out.println(mazda.frenar());

        System.out.println(" Modularizando");
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println(mazda.acelerarFrenar(3500));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.75f)); // 300 kilometros y se gastó
                                                                                          // 75%
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(400, 0.70f));

        System.out.println("Con sobrecarga: ");
        // método encapsulado.
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(400, 70));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(400, 70));
    }

}
