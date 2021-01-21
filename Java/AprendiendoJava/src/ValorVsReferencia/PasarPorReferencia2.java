package ValorVsReferencia;

class Persona{ //es recomendable hacer esto en un archivo aparte.

    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }

}

public class PasarPorReferencia2 {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Renzo");

        System.out.println("Iniciacmos el método main ");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Antes de invocar al método test.");

        test(persona); 

        System.out.println("Después de invocar al método test.");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificado. ");
        
    }

    public static void test(Persona persona){ //esta variable apunta al mismo objeto en la memoria.
         
        System.out.println("Iniciamos el método test");

        persona.modificarNombre("Pepe");

        System.out.println("Finaliza el método test con los datos cambiados");
    }
}