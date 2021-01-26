package Operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int i = -5;

        int j = +i; // j = (1)*i => -5

        System.out.println(j); // -5

        int k = -i; // k = (-1)*1 => 5

        System.out.println(k); // 5

        i = 6;
        j = +i;

        System.out.println(j);// 6

        k = -i;

        System.out.println(k); // -6

    }

}
