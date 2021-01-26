package LasClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        /*
         * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // la fecha que
         * ingresemos debe tener el patrón // que configuremos acá. try { Date fecha =
         * format.parse("2020-12-25"); System.out.println(fecha);
         * System.out.println(format.format(fecha)); } catch (ParseException e) { //
         * TODO Auto-generated catch block e.printStackTrace(); }
         * 
         */
        Scanner s = new Scanner(System.in);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); //

        System.out.println("Ingrese un fecha con formato 'yyyy-MM-dd': ");
        try {
            Date fecha = format2.parse(s.next());
            System.out.println(fecha);
            System.out.println(format2.format(fecha));

            Date fecha2 = new Date();
            System.out.println("Fecha actual " + fecha2);

            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es después o mayor que la fecha actual.");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es anterior o menor que la fecha actual.");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha del usuario es igual a la fecha actual.");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es después o mayor que la fecha actual.");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es anterior o menor que la fecha actual.");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha del usuario es igual a la fecha actual.");
            }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.err.print("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.out.println(" ");
            System.err.print("El formato debe ser: 'yyyy-MM-dd'");
            // System.exit(1); // opción uno.
            System.out.println(" ");
            main(args);// opción dos, que el programa vuelva a invocar el main.
        }
    }
}
