package Variables;

public class ConversionDeTipos {

    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println(numeroInt);
  
        String realStr = "98765.43";
        String realStr2 = "98765.43e-3";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println(numeroDouble);
        double numeroDouble2 = Double.parseDouble(realStr2);
        System.out.println(numeroDouble2);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println(logicoBoolean);

        //también podemos usar el var. 

        var numeroStr3 = "100";
        var numeroInt3 = Integer.parseInt(numeroStr3);
        System.out.println(numeroInt3);

        // Hacemos lo inverso ahora, tomamos valores y lo convertimos al tipo string. 

        int otroNumeroInt = 1000000;

        System.out.println(otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println(otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 4000000);
        System.out.println(otroNumeroStr);

        double otroRealDouble = 1.23456;
        double otroRealDouble2 = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        String otroRealStr2 = Double.toString(otroRealDouble2);
        System.out.println(otroRealStr);
        System.out.println(otroRealStr2);
        String otroRealStr3 = String.valueOf(1.23456f);
        String otroRealStr4 = String.valueOf(1.23456e2f);
        System.out.println(otroRealStr3);
        System.out.println(otroRealStr4);


        // Por último vemos conversiones entre tipos primitivos.

        int i = 10000; // se puede hacer casteo y forzar la conversión aún con perdida de datos.
        int r = 42768;

        short t = (short)r; // acá hay pérdida de información.
        short s = (short)i; //casteo ejemplo.
        System.out.println(s);
        System.out.println(t);
        long l = i; //acá no hay problema.
        System.out.println(l);

        char c = (char)i;
        System.out.println(c);
        float f = (float)i;
        System.out.println(f);
    }   
}   