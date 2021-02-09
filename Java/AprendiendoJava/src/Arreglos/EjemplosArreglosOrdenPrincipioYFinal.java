package Arreglos;

public class EjemplosArreglosOrdenPrincipioYFinal {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // de esta manera vamos llenando el arreglo.
        }
        //forma uno:

        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.println("numeros = " + numeros[i]);
            System.out.println("numeros = " + numeros[numeros.length - 1 - i]);
        }
        System.out.println(" ");
        
        //forma dos:
        
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.println("numeros = " + numeros[i]);
            System.out.println("numeros = " + numeros[numeros.length - 1 - i]);
        }

        //forma tres:
        
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
/*             resultado:
            1 10
            2 9
            3 8
            4 7
            5 6 */   
        }
        System.out.println(" ");

        int aux = 0; 
        for (int i = 0; i < numeros.length - i; i++) {
            //en cada iteración guardamos dos números.
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
            
        }
        for(int i = 0; i < a.length;i++){
            System.out.println("i = " + i + " " + a[i]);
        }
    }
}
