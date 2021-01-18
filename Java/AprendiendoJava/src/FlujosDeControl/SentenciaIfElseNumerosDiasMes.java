package FlujosDeControl;
import java.util.Scanner;

public class SentenciaIfElseNumerosDiasMes {

    public static void main(String[] args) {

        //programa para conocer si un año es bisiesto o no.
        //También para saber cúantos días tiene un mes.
        
        Scanner s = new Scanner(System.in);
        int numeroDias = 0;

        System.out.println(" ");
        System.out.println("Introduzca un mes en formato numérico (1-12) para conocer la cantidad de días que contiene: ");
        int mes = s.nextInt();

        System.out.println(" ");
        System.out.println("Introduzca ahora un año (YYYY): ");
        int anio = s.nextInt();

        boolean bisiesto = false;

        if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) { // no es divisible por 100.
            bisiesto = true;
        }

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        }else if(mes == 2 && bisiesto == true){
            numeroDias = 29;
            }else {
                numeroDias = 28;
            }

        System.out.println(" ");
        System.out.println("El mes " + mes + " del año " + anio + " tiene esta cantidad de días: " + numeroDias);    
        if(bisiesto){
        System.out.println("El año introducido es bisiesto.");
    }else{
        System.out.println("El año no es bisiesto.");
    }
}
}
