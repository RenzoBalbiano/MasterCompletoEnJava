package FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num2 = 2;
        char num3 = '1';
        char num4 = 'a';
        char num5 = 'z';

        switch (num2) {// Only convertible int values, strings or enum variables are permitted

            case 0:
                System.out.println("El num es cero.");
                break;
            case 1:
                System.out.println("El num es uno.");
                break;
            case 2:
                System.out.println("El num es dos.");
                break;
            case 3:
                System.out.println("El num es tres.");
                break;
        }
        switch (num3) {// Only convertible int values, strings or enum variables are permitted

            case 0:
                System.out.println("El num es cero.");
                break;
            case 1:
                System.out.println("El num es uno.");
                break;
            case 2:
                System.out.println("El num es dos.");
                break;
            case 3:
                System.out.println("El num es tres.");
                break;
            case '1':
                System.out.println("El num es 1 en formato char.");
                break;
        }
        switch (num4) {// Only convertible int values, strings or enum variables are permitted

            case 0:
                System.out.println("El num es cero.");
                break;
            case 1:
                System.out.println("El num es uno.");
                break;
            case 2:
                System.out.println("El num es dos.");
                break;
            case 'a':
                System.out.println("El num es a en formato char.");
                break;
            case '1':
                System.out.println("El num es uno en formato char.");
                break;
        }
        switch (num5) {// Only convertible int values, strings or enum variables are permitted

            case 0:
                System.out.println("El num es cero.");
                break;
            case 1:
                System.out.println("El num es uno.");
                break;
            case 2:
                System.out.println("El num es dos.");
                break;
            case 'a':
                System.out.println("El num es a en formato char.");
                break;
            case '1':
                System.out.println("El num es uno en formato char.");
                break;
            default:
                System.out.println("Número o caracter desconocido.");
        }

        String nombre = "Juan";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Renzo":
                System.out.println("Hola Renzo, bienvenido!");
                break;
            case "Pepe":
                System.out.println("Hola Pepe, bienvenido!");
                break;
            default:
                System.out.println("Usuario desconocido.");
        }

        // programita.

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un mes entre 1-12: ");
        byte mes = s.nextByte();
        String nombreMes = null;

        // importante no olvidarse del break.

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("Nombre mes introducido: " + nombreMes);
    }
}
