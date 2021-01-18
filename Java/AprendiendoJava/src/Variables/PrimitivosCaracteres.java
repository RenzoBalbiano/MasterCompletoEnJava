package Variables;
public class PrimitivosCaracteres {
    
    public static void main(String[] args) {
        
        char caracter = 'a';//usamos comillas simples con caractéres. 

        char caracter2 = '9'; //no se puede 10.

        char caracterFormatoUnicode = '\u2021';

        char decimal = 64; // imprime el arroba

        var simbolo = '@'; // funciona igual. Detecta que es de tipo caracter.

        char espacio = ' '; //es igual a '\u0020'
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; // lleva lo que sigue adelante al inicio de todo.

        System.out.println(caracter);
        System.out.println(caracterFormatoUnicode); // imprime la cruz doble.
        System.out.println(decimal);
        System.out.println(caracterFormatoUnicode == decimal);

        System.out.println("tipo Character corresponde en byte a " + nuevaLinea + Character.BYTES);
        System.out.println("tipo Character corresponde en byte a " + retornoCarro + Character.BYTES);
        System.out.println("tipo Character corresponde en bites a" + retroceso + Character.SIZE);
        System.out.println("tipo Character corresponde en bites a" + System.getProperty("line.separator") + Character.SIZE); //hace lo mismo que nuevaLinea o retornoCarro.
        System.out.println("tipo Character corresponde en bites a" + System.lineSeparator() + Character.SIZE); //O puede hacerse así también con atajo.
        System.out.println("valor máximo en un \t Character: " + tabulador + Character.MAX_VALUE);
        System.out.println("valor mínimo en un Character: " + espacio + Character.MIN_VALUE + simbolo);
    }
}
