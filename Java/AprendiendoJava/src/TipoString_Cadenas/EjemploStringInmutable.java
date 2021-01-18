package TipoString_Cadenas;
public class EjemploStringInmutable {
    public static void main(String[] args) {
        
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        curso.concat(profesor); // no altera a curso
        System.out.println(curso);
        String resultado = curso.concat(profesor);
        System.out.println(resultado);
        System.out.println(curso == resultado);//false.

        //curso.transform(c -> { 
        //    return c + " con " + profesor;
        //});

        //lo de arriba es una función lambda.
        //el método de arriba transform, recién aparece en la versión 12 de java.

        resultado.replace("a", "A");
        
        System.out.println(resultado); // no cambia nada.

        String resultado2 = resultado.replace("a", "A");

        System.out.println(resultado2);//ahora si cambia.   
    }
}
