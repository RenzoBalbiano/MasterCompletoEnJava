package arg.rbalbiano.app.jardin;

/* import arg.rbalbiano.app.hogar.Gato;
import arg.rbalbiano.app.hogar.Persona;

en php por ej. paquetes son namespace (nombre de espacio)
*/

import arg.rbalbiano.app.hogar.*;//con esto importa el enum ColorPelo también

/* import static arg.rbalbiano.app.hogar.Persona.saludar;
import static arg.rbalbiano.app.hogar.Persona.GENERO_FEMENINO; */

import static arg.rbalbiano.app.hogar.Persona.*;
import static arg.rbalbiano.app.hogar.ColorPelo.*;
//import static arg.rbalbiano.app.hogar.ColorPelo.CAFE;;

public class EjemploPaquetes {

    public static void main(String[] args) {

        /*
         * arg.rbalbiano.app.hogar.Persona persona = new
         * arg.rbalbiano.app.hogar.Persona();
         */

        Persona persona = new Persona();

        //si el atributo está default no podría utilizarse así:
        //persona.nombre = "Renzo";
        persona.setNombre("Renzo");
        persona.setApellido("Balbiano");
        //persona.setColorPelo(ColorPelo.CAFE);
        persona.setColorPelo(CAFE);

        System.out.println(persona.getNombre() + " " + persona.getApellido());

        //Gato gato = new Gato();

        //si están en el mismo paquete no necesario importar: 
        Perro perro = new Perro();

        //en cambio acá si los atributos son default puedo usarlos igual al estar en mismo paquete.
        perro.nombre = "Zeus";
        perro.raza = "Dogo";

        //ahí interactuan los dos objetos.
        String jugando = perro.jugar(persona);
        
        System.out.println(jugando);

        //String saludo = Persona.saludar();
        //usar el import estático: 
        String saludo = saludar();

        System.out.println(saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoVaron = Persona.GENERO_MASCULINO;

        

    }

}
