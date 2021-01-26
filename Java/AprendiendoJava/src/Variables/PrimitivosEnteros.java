package Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;

        System.out.println(numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo en un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo en un byte: " + Byte.MIN_VALUE);

        short numeroShort = 30000;

        System.out.println(numeroShort);
        System.out.println("tipo short corresponde en short a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo en un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo en un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println(numeroInt);
        System.out.println("tipo int corresponde en int a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo en un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo en un int: " + Integer.MIN_VALUE);

        long numeroLong = 92233720368547758L;
        System.out.println(numeroLong);
        System.out.println("tipo long corresponde en long a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo en un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo en un long: " + Long.MIN_VALUE);

        var numeroVar = 2147483647; // siempre va a ser de tipo int.
        var numeroVar2 = 2147483648L; // aclaramos si pasa el límite y se convierte en un Long.
    }
}
