package Operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int i = 5 , j = 4 , suma = i + j; 

        System.out.println(suma);

        int resta = i - j;

        System.out.println(resta);

        int multi = i * j; 

        System.out.println(multi);

        int div = i / j;
        float div2 = (float) i / j; //hay que castear. Basta con castear una sola variable.
        double div3 = (double) i / j;

        System.out.println(div);
        System.out.println(div2);
        System.out.println(div3);

        int resto = i % j;

        System.out.println(resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número : "));

        if( numero % 2 == 0) {
            System.out.println("El número introducido " + numero + " es par");   
        } else{
            System.out.println("El número introducido " + numero + " es inpar");
        }
    }
}
