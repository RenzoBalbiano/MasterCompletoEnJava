package Operadores;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        
        int i = 3; 
        byte j = 3; 
        byte j2 = 7; 
        float k = 127e-7f; 
        double l = 2.1413e3; 
        boolean m = false; 

        boolean b1 = i == j; //true
        boolean b2 = i == j2; //false
        boolean b3 = 5 == 5; //true
        boolean b4 = 7 == 5; //false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        boolean b5 = !b4;
        System.out.println(b5);//true

        boolean b6 = i != j; //false
        System.out.println(b6);//
        boolean b7 = i != j2; //true
        System.out.println(b7);//

        boolean b8 = m == true; 
        System.out.println(b8);//false

        boolean b9 = m != true; 
        System.out.println(b9);//true

        boolean b10 = i > j2; 
        System.out.println(b10);//false

        boolean b11 = i < j2; 
        System.out.println(b11); // true

        boolean b12 = l >= k; 
        System.out.println(b12); // true

        boolean b13 = l <= k; 
        System.out.println(b13);//false
    }
}

