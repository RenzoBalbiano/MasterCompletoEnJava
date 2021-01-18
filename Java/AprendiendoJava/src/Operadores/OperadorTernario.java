package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        //variable = condicion ? si es verdadero : si es falso;

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println(variable); //retorna si es verdadero.

        String variable2 = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println(variable2); //retorna si es falso.

        String estado = "";  
        double promedio = 6.2; 
        double promedio2 = 5.2; 
        double paraAprobar = 5.49; 

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println(estado); //Aprobado
        estado = promedio2 >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println(estado);//Rechazado.

        //mucho más corto lo de arriba.
        //lo de arriba es lo mismo que: 
        if(promedio >= paraAprobar && promedio2 >= paraAprobar){
            estado = "Aprobado";
        }else{
            estado = "Rechazado";
        }
        System.out.println(" ");
        System.out.println(estado);



        //programita.

        double promedio3 = 0.0; 
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matemática entre 2.0 y 7.0 : ");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0 : ");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 y 7.0 : ");
        historia = s.nextDouble();

        promedio3 = (matematicas + ciencias + historia) / 3; 
        System.out.println(promedio);        

        estado = promedio3 >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println(estado);        
    }
}

