public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        // cambiamos el valor de atributo estático:
        Automovil.setCapacidadEstanqueEstatico(45);

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);


        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        /*
         * subaru.setColor(Automovil.COLOR_BLANCO); //ejemplo de como usar las
         * constantes para tener más parametrizado el código.
         */

        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-500", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
/*         mazda.setEstanque(new Estanque(50));
 */        mazda.setTipo(TipoAutomovil.PICKUP);

        System.out.println("mazda color : " + mazda.getColor());
        System.out.println("mazda cilindrada: " + mazda.getMotor().getCilindrada());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,new Motor(3.0,TipoMotor.DIESEL), new Estanque(50));

        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5,TipoMotor.BENCINA), new Estanque(50));

        nissan2.setTipo(TipoAutomovil.PICKUP);

        /* Automovil.colorPatente = "Verde"; */ // se puede modificar de forma directa porque es default, si sería
                                                // private solo con set. Todos los obj. pasan a tener el color verde.
        // si una instancia modifica el atributo estático:
        // no es la mejor práctica:
        // Automovil.setColorPatente(Automovil.COLOR_AZUL);
        Automovil.setColorPatente(Color.AZUL);

        /* nissan.colorPatente = "Azul"; */ // deja pero con un warning.
        /* nissan.setColorPatente("Amarillo") */;// Esto si que no deja!
        // acá solo cambia el atributo del objeto:
        nissan2.setColor(Color.AMARILLO); // sin el método getColor() se imprime en mayúscula como la constante.

        System.out.println(subaru.detalleDos());
        System.out.println(mazda.detalleDos());
        System.out.println(nissan.detalleDos());
        System.out.println(nissan2.detalleDos());
        System.out.println("Automovil color patente: " + Automovil.getColorPatente().getColor()); // se imprime en
                                                                                                  // minúscula.

        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));// gastó 60% del
                                                                                                    // estanque en 300
                                                                                                    // kms.
        // dan valores iguales. Igual esto está mal:
        /*
         * System.out.println("Kilometros por litros = " +
         * subaru.calcularConsumoEstatico(300, 60));
         * System.out.println("Kilometros por litros = " +
         * mazda.calcularConsumoEstatico(300, 60));
         */

        // Automovil.VELOCIDAD_MAX_CARRETERA = 200; // esto no se puede hacer, da error.
        // Solamente se puede leer o imprimir:
        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subarú: " + tipoSubaru.getNombre() + "\ndescripción: " + tipoSubaru.getDescripcion()
                + "\nnúmero de puertas: " + tipoSubaru.getNumeroPuerta()

        );

        System.out.println(mazda.calcularConsumo(300, 70));
    }

}
