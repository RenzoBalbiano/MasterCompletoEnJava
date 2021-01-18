package TipoString_Cadenas;

public class EjemplosStringMetodosArreglos {
    
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";

        System.out.println(trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;

        System.out.println(trabalenguas.length());
        System.out.println(largo);

        for(int i = 0; i < largo;i++){
            System.out.print(arreglo[i]); //la palabra horizontal.
            //System.out.println(arreglo[i]); //vertical.
        }
        
        System.out.println("\n");

        System.out.println(trabalenguas.split("a"));//hay que incluirlo en una variable.

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        System.out.println("\n");
        System.out.println(arreglo2);
        System.out.println("\n");

        for(int i = 0; i < l; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.js";

        System.out.println("\n");

        String[] archivoArr = archivo.split("\\."); // puede ir así: "[.]" Es un carácter especial de Expresiones regulares el punto. Por eso debe ir así.
        int longitud = archivoArr.length;
        System.out.println("longitud del String Array" + longitud);

        for(int i = 0; i < longitud; i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("Obtener la extensión del archivo " + archivoArr[longitud-1]);
    }
}
