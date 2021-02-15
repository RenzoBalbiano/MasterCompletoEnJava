
public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilidranda(2.0);

        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-500", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);

        System.out.println("mazda color : " + mazda.getColor());
        System.out.println("mazda cilindrada: " + mazda.getCilidranda());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subarú: " + tipo.getNombre() + "\ndescripción: " + tipo.getDescripcion()
                + "\nnúmero de puertas: " + tipo.getNumeroPuerta()

        );

        tipo = mazda.getTipo();

        switch (tipo) {

            case CONVERTIBLE: // desde jdk sería con flecha en vez de dos puntos y sacando la sentencia break.
                System.out.println("El automovil es deportivo y descapotable de dos puertas.");
                break;
            case COUPE:
                System.out.println("Es un automóvil pequeño de dos puertas y tipicamente deportivo.");
                break;
            case FURGON:
                System.out.println("El automovil es deportivo y descapotable de dos puertas.");
                break;
            case HATCHBACK:
                System.out.println("Es un automóvil mediano compacto, aspecto deportivo.");
                break;
            case PICKUP:
                System.out.println("Es un automóvil de doble cabina o camioneta.");
                break;
            case SEDAN:
                System.out.println("Es un automóvil mediano.");
                break;
            case STATION_WAGON:
                System.out.println("Es un automóvil más grande, con maleta grande.");
                break;

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " -> " + ta.name() + ", " + ta.getNombre() + ", " + ta.getDescripcion() + ", "
                    + ta.getNumeroPuerta() + " ");
            System.out.println(" ");
        }

    }

}
