package TipoString_Cadenas;
public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.jpeg";
        String archivo2 = "alguna_imagen.js";
        String archivo3 = "alguna.imagen.js";
        String archivo4 = "alguna.imagen.js";

        int i = archivo.indexOf(".");
        int j = archivo3.indexOf("."); //en este ejemplo fallaría.
        int g = archivo4.lastIndexOf(".");


        System.out.println(archivo.length());
        
        System.out.println(archivo.substring(14)); //jpeg

        System.out.println(archivo.substring(archivo2.length()-4));//acá ya no sirve. n.jpeg
        System.out.println(archivo2.substring(archivo2.length()-4));//acá ya no sirve. n.js
        
        System.out.println(archivo.substring(i));//para sacar desde el punto en adelante.
        System.out.println(archivo2.substring(i));//para sacar desde el punto en adelante.

        System.out.println(archivo.substring(i+1));//para sacar desde el punto en adelante.
        System.out.println(archivo2.substring(i+1));//para sacar desde el punto en adelante.
        System.out.println(archivo3.substring(j+1));//para sacar desde el punto en adelante.
        System.out.println(archivo4.substring(g+1));//para sacar desde el punto en adelante.
        
    }
}