package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int i = 3; 
        byte j = 3; 
        byte j2 = 7; 
        float k = 127e-7f; 
        double l = 2.1413e3; 
        boolean m = false; 

        boolean b1 = i == j2 && k > l; //false falla en la 1era condición.
        System.out.println(b1);
        boolean b2 = i == j && k > l; //false falla en la 2da condición.
        System.out.println(b2);
        boolean b3 = i == j && k < l; //true 
        System.out.println(b3);
        boolean b4 = i == j && k < l && m == true; // false.
        System.out.println(b4);
        boolean b5 = i == j && k < l && m == false; // false.
        System.out.println(b5);


        boolean b6 = i == j || k > l; //true , primera verdad ya alcanza. 
        System.out.println(b6);
        boolean b7 = i == j2 || k > l; //false , ambas.
        System.out.println(b7);
        boolean b8 = i == j2 || k < l; //true, afirmativa la segunda. 
        System.out.println(b8);

        
        boolean b9 = i == j2 && k > l || m == false; // true
        System.out.println(b9);
        boolean b11 = (i == j2 && k > l) || m == false; // true, es lo mismo que arriba.
        System.out.println(b11);
        boolean b10 = i == j2 && (k > l || m == false); // false
        System.out.println(b10);
        boolean b12 = (i == j2 && k > l) || m == true; // false
        System.out.println(b12);
        boolean b13 = (i == j && k < l) || m == true; // true
        System.out.println(b13);
        boolean b14 = i == j && (k < l || m == true); // true
        System.out.println(b14);

        //precedencia de operadores, si bien dijimos siempre de izquierda a derecha PERO SIEMPRE prioridad el and antes que el or.

        boolean b15 = i == j || k < l && m == true; //acá primero compara desde la k hacia la derecha.
        System.out.println(b15); // true. boolean b15 = i == j || (k < l && m == true);
        boolean b16 = (i == j || k < l) && m == true;
        System.out.println(b16);//en cambio acá si da false.
        //por lo tanto como vimos en b15, el and tiene prioridad explícita. Se resuelve primero, sino hay paréntesis.

        boolean b17 = true || true && false; // esto es lo mismo que b15.
        System.out.println(b17);
        boolean b18 = (true || true) && false; // esto es lo mismo que b16-
        System.out.println(b18);

        boolean b19 = true || false && false || false; // ((true || false) && false) || false; // debería ir así usando la lógica PERO NO.
        System.out.println(b19); // (true || (false && false)) || false; MÁS BIEN VA ASÍ. DA TRUE.

        boolean b20 = ((true || false) && false) || false;
        System.out.println(b20); //esto si da false, pero usamos paréntesis.

    } 
}
