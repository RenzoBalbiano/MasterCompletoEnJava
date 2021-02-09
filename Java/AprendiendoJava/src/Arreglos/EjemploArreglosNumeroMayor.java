package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

    public static void main(String[] args) {
        
        int[] a = new int[5];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresar 5 enteros/números: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }   

        int max = 0; // esta variable va a guardar el índice del número mayor.
        //mediante el índice ya sabemos cuál es, lo podemos acceder en el arreglo.
        for (int i = 1; i < a.length;i++){
            max = (a[max] > a[i])? max : i; //operador ternario.
        }
        System.out.println("máximo número = " + a[max]);
    }
}

