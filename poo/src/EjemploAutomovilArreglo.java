import java.util.Arrays;

public class EjemploAutomovilArreglo {

        public static void main(String[] args) {

                Persona conductorSubaru = new Persona("Lucy", "Martínez");

                Automovil subaru = new Automovil("Subaru", "Impreza");

                Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
                Estanque estanqueSubaru = new Estanque();

                Automovil.setColorPatente(Color.AZUL);

                subaru.setMotor(motorSubaru);
                subaru.setEstanque(estanqueSubaru);
                subaru.setConductor(conductorSubaru);

                subaru.setColor(Color.BLANCO);
                subaru.setTipo(TipoAutomovil.HATCHBACK);

                Persona conductorMazda = new Persona("Juan", "Rodríguez");

                Automovil mazda = new Automovil("Mazda", "BT-500", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
                mazda.setEstanque(new Estanque());
                mazda.setTipo(TipoAutomovil.PICKUP);
                mazda.setConductor(conductorMazda);

                Persona conductorNissan = new Persona("María", "González");
                Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL),
                                new Estanque(50));
                nissan.setTipo(TipoAutomovil.PICKUP);
                nissan.setConductor(conductorNissan);

                Persona jose = new Persona("José", "Ramírez");
                Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.BENCINA),
                                new Estanque(50));
                suzuki.setConductor(jose);
                suzuki.setColor(Color.AMARILLO);
                suzuki.setTipo(TipoAutomovil.SUV);

                Persona mario = new Persona("Mario", "Ramírez");
                Automovil audi = new Automovil("Audi", "A3", Color.GRIS, new Motor(1.6, TipoMotor.BENCINA),
                                new Estanque(50));
                audi.setConductor(mario);
                audi.setColor(Color.AMARILLO);
                audi.setTipo(TipoAutomovil.SUV);

                Automovil[] autos = new Automovil[5];

                autos[0] = subaru;
                autos[1] = mazda;
                autos[2] = nissan;
                autos[3] = suzuki;
                autos[4] = audi;

                /*
                 * System.out.println(subaru.detalleDos());
                 * System.out.println(mazda.detalleDos());
                 * System.out.println(nissan.detalleDos());
                 * System.out.println(suzuki.detalleDos());
                 * 
                 * Revisar la clase, porque no funciona el NullPointerException
                 * 
                 */

                Arrays.sort(autos);
                for (int i = 0; i < autos.length; i++) {

                        System.out.println(autos[i]);
                }

                /*
                 * for (Automovil automovil : autos) { System.out.println(automovil);
                 * 
                 * }
                 */

        }
}
