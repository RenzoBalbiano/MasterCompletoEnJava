package TipoString_Cadenas;
public class EjemploStringConcatenacion {
    
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5; 

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);
        
        String detalle2 = curso.concat(profesor);
        String detalle3 = curso.concat(" con ".concat(profesor));
        String detalle4 = curso.concat(" con ").concat(profesor);
        System.out.println(detalle2);
        System.out.println(detalle3);
        System.out.println(detalle4);
    }
}
