package Matrices;

public class EjemploMatrices {

    public static void main(String[] args) {
        
        int[][] numeros = new int[2][4]; //dos filas, 4 columnas.

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("números de filas: " + numeros.length);
        System.out.println("números de columnas: " + numeros[0].length); 

        System.out.println("primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("último elemento de la matriz: " + numeros[numeros.length -1] [numeros[1].length -1]);

        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];

        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("número: " + num1);
        System.out.println("número: " + num2);
        System.out.println("número: " + num3);
        System.out.println("número: " + num4);
        System.out.println("número: " + num5);
        System.out.println("número: " + num6);
        System.out.println("número: " + num7);
        System.out.println("número: " + num8);
    }
    
}
