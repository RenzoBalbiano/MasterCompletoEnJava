package LasClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();// es una clase abstracta, no permite una instancia concreta.
        // la instancia la maneja la propia clase por debajo con getInstance. Que es un método estático. Se encarga de crear el objeto.
        //crea por debajo una instancia de gregorian calendar.

        Date fecha2 = calendario.getTime();
        System.out.println(" calendario = " + fecha2);

        calendario.set(1993, 9, 02,24,00,00);//pasa al siguiente día. Al 03 de Oct
        Date fecha = calendario.getTime();
        System.out.println(" calendario = " + fecha);


        calendario.set(1993, Calendar.OCTOBER, 02,22,23,34);//Podemos definirlo así como una constante.
        Date fecha3 = calendario.getTime();
        System.out.println(" calendario = " + fecha3);

        //OTRA FORMA IR INVOCANDO UNO POR UNO CON CONSTANTES.

        calendario.set(Calendar.YEAR, 1963);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 13);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha4 = calendario.getTime();
        System.out.println(" calendario = " + fecha4);


        calendario.set(Calendar.YEAR, 1963);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 13);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 236);

        Date fecha5 = calendario.getTime();
        System.out.println(" calendario = " + fecha5);

        SimpleDateFormat df9 = new SimpleDateFormat("yyyy-MM-dd 'T' hh:mm:ss.SSSXXX a"); //con HH adopta formato 24 horas. con hh formato 12 horas.
        String fechaStr11 = df9.format(fecha5);
        System.out.println(fechaStr11);

        Calendar calActual = Calendar.getInstance();
        Date fecha20 = calActual.getTime();

        if(fecha2.after(fecha)){
            System.out.println("Fecha del usuario es después o mayor que la fecha actual.");
        }else if(fecha2.before(fecha)){
            System.out.println("Fecha del usuario es anterior o menor que la fecha actual.");
        }else if(fecha2.equals(fecha)){
            System.out.println("Fecha del usuario es igual a la fecha actual.");
        }

        if(fecha2.compareTo(fecha) > 0 ){
            System.out.println("Fecha del usuario es después o mayor que la fecha actual.");
        }else if(fecha2.compareTo(fecha) < 0 ){
        System.out.println("Fecha del usuario es anterior o menor que la fecha actual.");
        }else if(fecha2.compareTo(fecha) == 0 ){
            System.out.println("Fecha del usuario es igual a la fecha actual.");
        }
    }
}
