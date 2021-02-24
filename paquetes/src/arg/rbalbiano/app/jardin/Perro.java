package arg.rbalbiano.app.jardin;

import arg.rbalbiano.app.hogar.Persona;

//la clase podría ser default, solo usarse en el paquete jardín. //la idea es que el perro esté en el jardín y no pueda entrar a la casa. Y el dueño deba ir al jardín para jugar con él. Restringir que perro pueda entrar a la casa. Gato solamente está dentro de la casa. 
public class Perro {

    //protected similitud con default se pueden acceder dentro del mismo paquete. Pero en sí implica que puede acceder solo si hereda de esta clase. Cualquier clase hija de perro podría acceder a atributos protegidos de la clase Perro, además de las clases del mismo paquete.
    protected String nombre;
    
    String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();

    }
    
}
