public class EjemploAutomovilRelacionesObjetos {

        public static void main(String[] args) {

                Persona conductorSubaru = new Persona("Lucy", "Martínez");

                Automovil subaru = new Automovil("Subaru", "Impreza");

                Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
                Estanque estanqueSubaru = new Estanque();

                // O podría inicializarse así:
                subaru.setMotor(motorSubaru);
                subaru.setEstanque(estanqueSubaru);
                subaru.setConductor(conductorSubaru);

                subaru.setColor(Color.BLANCO);
                subaru.setTipo(TipoAutomovil.HATCHBACK);

                /* subaru.setRuedas(ruedasSub); */

                Rueda[] ruedasSub = new Rueda[5];

                for (int i = 0; i < ruedasSub.length; i++) {

                        subaru.addRueda(new Rueda("Yokohama", 16, 7.5));

                }

                Persona conductorMazda = new Persona("Juan", "Rodríguez");

                Automovil mazda = new Automovil("Mazda", "BT-500", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
                mazda.setEstanque(new Estanque());
                mazda.setTipo(TipoAutomovil.PICKUP);
                mazda.setConductor(conductorMazda);

                /* mazda.setRuedas(ruedasMazda); */
                Rueda[] ruedasMazda = new Rueda[10]; // con la excepción en el método de factorización addRueda().

                for (int i = 0; i < ruedasMazda.length; i++) {

                        mazda.addRueda(new Rueda("Michelín", 18, 10.5));

                }

                Persona conductorNissan = new Persona("María", "González");
                Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL),
                                new Estanque(50));
                nissan.setTipo(TipoAutomovil.PICKUP);
                nissan.setConductor(conductorNissan);

                // otra forma de convocar métodos encadenados para agregar ruedas.

                nissan.addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
                                .addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
                                .addRueda(new Rueda("Pirelli", 20, 11.5));

                /* nissan.setRuedas(ruedasNis); */

                Rueda[] ruedasNiss = { new Rueda("Pirelli", 20, 11.5), new Rueda("Pirelli", 20, 11.5),
                                new Rueda("Pirelli", 20, 11.5), new Rueda("Pirelli", 20, 11.5),
                                new Rueda("Pirelli", 20, 11.5)

                };

                Persona jose = new Persona("José", "Ramírez");
                Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA),
                                new Estanque(50), jose, ruedasNiss);
                nissan2.setColor(Color.AMARILLO);
                nissan2.setTipo(TipoAutomovil.PICKUP);

                /* nissan2.setRuedas(ruedasNiss); */

                Automovil.setColorPatente(Color.AZUL);

                System.out.println(subaru.detalleDos());
                System.out.println(mazda.detalleDos());
                System.out.println(nissan.detalleDos());
                System.out.println(nissan2.detalleDos());

        }

}
