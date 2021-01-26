package Variables;

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numero decimal" + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;

        System.out.println(numeroBinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; // para convertir al sistema octal se antepone el 0.

        System.out.println(numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x1f4; // para convertir al sistema hexadecimal

        System.out.println(numeroHexadecimal);
    }
}