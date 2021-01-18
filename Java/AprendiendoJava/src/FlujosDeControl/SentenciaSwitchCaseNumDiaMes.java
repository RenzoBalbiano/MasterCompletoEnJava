package FlujosDeControl;
import java.util.Scanner;

public class SentenciaSwitchCaseNumDiaMes {
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

        switch(mes){ //útil omitir el break, acá si.
            case 1:
                
            case 3:
                
            case 5:
                
            case 7:
                
            case 8:
                
            case 10:
                
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30; 
                break;
            case 2:
                if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) { // no es divisible por 100.
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break; //Importante no comerse el break acá, sino pasa si o si al default.
            default:
                numeroDias = 0;
        }   
        System.out.println("Número de días del mes:" + numeroDias);
    }   
}