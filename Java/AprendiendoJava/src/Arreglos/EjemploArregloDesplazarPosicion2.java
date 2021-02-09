package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {

    public static void main(String[] args) {
        // desplazar la posición de un arreglo:
        // que se llene con un nuevo valor en la posición que queramos.

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        int elemento, posicion;

        for (int i = 0; i < a.length -1; i++) {//cambiamos solo llenamos 9 espacios.
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("Ingrese un nuevo valor para insertar en el arreglo:");
        elemento = s.nextInt(); 

        System.out.println("Ingrese la posición (0 - 9) en la cual desea insertar en el arreglo:");
        posicion = s.nextInt(); 

        for (int i = a.length - 2; i >= posicion; i--) { //va a iterar hasta que el i sea mayor o igual que la posició y hasta ahí va a desplazar los elementos.
            a[i + 1] = a[i]; //si ingresaramos posición 9, no llega a iterar y asigna solo el valor. NO se cumple la condición del for.
        }
        a[posicion] = elemento;         

        System.out.println("El arreglo final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " = " + a[i]);
        }
    }
    
}
