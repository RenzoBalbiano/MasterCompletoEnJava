package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*
         * String[] usernames = new String[3]; String[] passwords = new String[3];
         * 
         * usernames[0] = "Renzo"; usernames[1] = "admin"; passwords[0] = "12345";
         * passwords[1] = "6789"; usernames[2] = "Pepe"; passwords[2] = "123";
         */

        /*
         * String username = "Renzo"; String password = "12345"; String username2 =
         * "admin"; String password2 = "6789";
         */
        /*
        */

        // forma más rápida de definir los arreglos.

        String[] usernames = { "Renzo", "admin", "Pepe", };
        String[] passwords = { "12345", "6789", "123", };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario : ");

        // String usuario = scanner.nextLine(); PUEDE IR ASÍ.
        String u = scanner.next();

        System.out.println("Ingrese la contaseña : ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            // usando operadores ternarios queda así:
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;

            /*
             * if( (usernames[i].equals(u) && passwords[i].equals(p))) { esAutenticado =
             * true; break;
             */
        }
        /*
         * else{ System.out.println("Username o contraseña incorrecto ! "); } }
         */

        /*
         * if( (username.equals(u) && password.equals(p)) || (username2.equals(u) &&
         * password2.equals(p) )) { esAutenticado = true; }else{
         * System.out.println("Username o contraseña incorrecto ! "); }
         */

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!")
                : "Username o contraseña incorrecto !\nLo sentimos, requiere autorización. ";
        System.out.println(mensaje);
        /*
         * if (esAutenticado) {
         * System.out.println("Bienvenido usuario ".concat(u).concat("!")); } else {
         * System.out.println("Username o contraseña incorrecto ! ");
         * System.out.println("Lo siento, requiere autorización. "); }
         */
    }
}