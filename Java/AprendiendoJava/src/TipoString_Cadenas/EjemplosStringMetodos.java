package TipoString_Cadenas;

public class EjemplosStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Renzo"; 

        System.out.println(nombre.length());

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        System.out.println(nombre.equals("Renzo"));//true
        System.out.println(nombre.equals("renzo"));//false
        System.out.println(nombre.equalsIgnoreCase("renzo"));//true
        System.out.println(nombre.compareToIgnoreCase("renzo"));//si es 0 son idénticos.
        System.out.println(nombre.compareToIgnoreCase("Andrés"));//si es 0 son idénticos. Da 17.

        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(nombre.length()-1));//obtiene siempre la última letra.

        System.out.println(nombre.substring(1));//enzo
        System.out.println(nombre.substring(1,4));//enz
        System.out.println(nombre.substring(3,5));//zo
        //igual a arriba
        System.out.println(nombre.substring(nombre.length()-2));
        System.out.println(nombre.substring(4,5));//o
        //igual a arriba
        System.out.println(nombre.substring(4));//o
        //igual a arriba
        System.out.println(nombre.substring(nombre.length()-1));//o

        // 2 da parte. 

        String trabalenguas = "trabalenguas";

        System.out.println(trabalenguas.replace("a", "."));

        System.out.println(trabalenguas.indexOf("a"));//arroja 2.
        System.out.println(trabalenguas.lastIndexOf("a"));// arroja 10.
        System.out.println(trabalenguas.indexOf("z"));//retorna -1, porque no está.Por eso para validar podemos decir que el index sea == o mayor a 0.
        System.out.println(trabalenguas.indexOf("lenguas"));//retorna -1, porque no está.Por eso para validar podemos decir que el index sea == o mayor a 0.

        System.out.println(trabalenguas.contains("t"));//true
        System.out.println(trabalenguas.contains("lenguas"));//true
        System.out.println(trabalenguas.contains("z"));//false

        System.out.println(trabalenguas.startsWith("lenguas"));//false.
        System.out.println(trabalenguas.startsWith("traba"));//true.
        System.out.println(trabalenguas.startsWith("t"));//true.
        System.out.println(trabalenguas.startsWith("tr"));//true.

        System.out.println(trabalenguas.endsWith("tr"));//false.
        System.out.println(trabalenguas.endsWith("lenguas"));//true.
        System.out.println(trabalenguas.endsWith("as"));//true.
        System.out.println(trabalenguas.endsWith("s"));//true.
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());//borra espacios en blanco.
    }
}

