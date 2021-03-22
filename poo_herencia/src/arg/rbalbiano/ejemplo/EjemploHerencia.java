package arg.rbalbiano.ejemplo;

import arg.rbalbiano.pooherencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {
        
        //Persona alumno = new Alumno(); se puede hacer esto. Pero hay que hacer cast. podríamos hacerlo con Object.
        //antes del protected cuando era private para acceder:

        System.out.println("====== Creando la instancia de la clase Alumno ====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Renzo");
        //con protected:
        //alumno.nombre = "Andrés";
    
        alumno.setApellido("Balbiano");
        ((Alumno)alumno).setInstitucion("Instituto Nacional");//casteamos
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional ====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("====== Creando la instancia de la clase Profesor ====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Mabel");
        profesor.setApellido("González");
        profesor.setAsignatura("Matemáticas");

        System.out.println(" ");
        System.out.println(alumnoInt.getNombre() +
        " " + alumnoInt.getApellido()+        
        " " + alumnoInt.getInstitucion()+
        " " + alumnoInt.getPais());

        System.out.println(alumno.getNombre() +
        " " + alumno.getApellido()+
        //" " + ((Alumno) alumno).getInstitucion());
        " " + alumno.getInstitucion());

        System.out.println("Profesora " + profesor.getAsignatura()+ ": " + profesor.getNombre() + " " + profesor.getApellido() );

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
    
}
