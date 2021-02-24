package arg.rbalbiano.app.hogar;

import arg.rbalbiano.app.jardin.Perro;

import static arg.rbalbiano.app.hogar.Persona.*;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro(); //cambiando esta clase a default en vez de public ya no puede entrar en el hogar. No la podemos convocar como en la línea de arriba.

        //no podríamos invocar el método jugar así, porque es default:
        //perro.jugar();

        //no hay que importar persona porque es parte del paquete. Ahora si queremos el estático si.
        //String saludo = Persona.saludar();

        String saludo = saludar();
    }
    
}
