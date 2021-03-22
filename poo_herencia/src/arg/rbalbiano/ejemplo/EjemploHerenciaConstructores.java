package arg.rbalbiano.ejemplo;

import arg.rbalbiano.pooherencia.*;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        // Persona alumno = new Alumno(); se puede hacer esto. Pero hay que hacer cast.
        // podríamos hacerlo con Object.
        // antes del protected cuando era private para acceder:

        System.out.println("====== Creando la instancia de la clase Alumno ====");
        Alumno alumno = new Alumno("Renzo", "Balbiano", 27, "Instituto Nacional");
        // alumno.setNombre();
        // con protected:
        // alumno.nombre = "Andrés";

        // alumno.setApellido("Balbiano");
        ((Alumno) alumno).setInstitucion("Instituto Nacional");// casteamos
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alumno@gmail.com");

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional ====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("alumnoInternacional@gmail.com");

        System.out.println("====== Creando la instancia de la clase Profesor ====");
        Profesor profesor = new Profesor("Mabel", "González", "Matemáticas");
        profesor.setNombre("Mabel");
        profesor.setApellido("González");
        profesor.setAsignatura("Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor@gmail.com");

        System.out.println("=======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }
    // Control de tipos:

    // dos alternativas crear una clase con un método estático imprimir, o bien un
    // método estático imprimir en esta misma clase. Hacemos lo segundo para
    // imprimir objetos del tipo persona:

    public static void imprimir(Persona persona) {

        System.out.println("Imprimiendo los datos en común:");

        System.out.println("Nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad "
                + persona.getEdad() + ", email " + persona.getEmail());

        // Control de filtro con instance of:
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemática: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaMatematica());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());

            }
            // ojo porque pusiste un solo paréntesis acá y no te imprimía los datos del
            // profesor.
            System.out.println("======= sobre escritura calcularPromedio:");
            System.out.println(((Alumno) persona).calcularPromedio());
            System.out.println("=======");
            //notar que lo pusimos una sola vez y alumnoInternacional igual lo ejecuta.
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Institución: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("======= sobre escritura saludar:");
        System.out.println(persona.saludar());
        System.out.println("=======");

    }

}
