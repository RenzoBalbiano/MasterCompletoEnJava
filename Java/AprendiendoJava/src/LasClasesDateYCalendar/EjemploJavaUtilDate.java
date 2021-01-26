package LasClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println(fecha);

        // para formatear esta fecha:

        SimpleDateFormat df1 = new SimpleDateFormat("dd MM, yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("dd MMMM, yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat df4 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df5 = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat df6 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        SimpleDateFormat df7 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        SimpleDateFormat df8 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat df9 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        SimpleDateFormat df10 = new SimpleDateFormat("'fecha:' yyyy.MM.dd G 'hora' HH:mm:ss z");
        SimpleDateFormat df11 = new SimpleDateFormat("EEEE, dd 'de' MMMM, 'de' yyyy");

        String fechaStr = df1.format(fecha);
        String fechaStr2 = df2.format(fecha);
        String fechaStr3 = df3.format(fecha);
        String fechaStr4 = df4.format(fecha);
        String fechaStr5 = df5.format(fecha);
        String fechaStr6 = df6.format(fecha);
        String fechaStr7 = df7.format(fecha);
        String fechaStr8 = df8.format(fecha);
        String fechaStr9 = df9.format(fecha);
        String fechaStr10 = df10.format(fecha);
        String fechaStr11 = df11.format(fecha);

        System.out.println(fechaStr);
        System.out.println(fechaStr2);
        System.out.println(fechaStr3);
        System.out.println(fechaStr4);
        System.out.println(fechaStr5);
        System.out.println(fechaStr6);
        System.out.println(fechaStr7);
        System.out.println(fechaStr8);
        System.out.println(fechaStr9);
        System.out.println(fechaStr10);
        System.out.println(fechaStr11);

        // Ejemplo con la clase Unix. En milisegundos.
        long j = 0;

        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        System.out.println(j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime(); // Returns the number of milliseconds since January 1,
                                                               // 1970, 00:00:00 GMT represented by this Date object
        System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);
    }
}