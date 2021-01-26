package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

    public static void main(String[] args) {
        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número : ");
        int num1 = s.nextInt();
        System.out.println("Ingrese un segundo número : ");
        int num2 = s.nextInt();
        System.out.println("Ingrese un tercer número : ");
        int num3 = s.nextInt();
        System.out.println("Ingrese un cuarto número : ");
        int num4 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("Número 1 : " + num1);
        System.out.println("Número 2 : " + num2);
        System.out.println("Número 3 : " + num3);
        System.out.println("Número 3 : " + num4);
        System.out.println("Número mayor : " + max);
    }
}
