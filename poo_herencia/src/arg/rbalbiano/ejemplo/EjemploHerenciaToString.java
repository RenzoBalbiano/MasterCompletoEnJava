package arg.rbalbiano.ejemplo;

import arg.rbalbiano.pooherencia.*;

public class EjemploHerenciaToString {

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

        System.out.println("=====================================");
        System.out.println(persona);
        //quedó mucho más simplificado.

    }

    
}
