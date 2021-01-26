package Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");

        // String numeroStr = entrada.nextLine();

        int numeroDecimal = 0;

        try {
            numeroDecimal = entrada.nextInt(); // Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("¡Error! Debe ingresar un número entero: ");

            main(args);
            System.exit(0);
        }

        System.out.println("Número decimal " + numeroDecimal);

        String resultadoBinario = "Número binario del decimal " + numeroDecimal + " = "
                + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += "\n" + resultadoHex;
        entrada.close();
        System.out.println(mensaje);
    }
}
