package ClasesWrapper;

public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1000); //forma explícita.
        Integer num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("son el mismo objeto: " + (num1==num2));//true. Apunta a la misma referencia, objeto.

        num2 = 1000;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("son el mismo objeto: " + (num1==num2));//false. No son el mismo objeto.

        //primitivos a dif. de wrapper, siempre va a comparar por el valor, no por referencia u objeto.
        //para comparar por valor, con el método equals():

        System.out.println("Tienen el mismo valor: " + num1.equals(num2)); //true
        //podemos comparar convirtiendo de forma explícita:
        System.out.println("Tienen el mismo valor: " + (num1.intValue() == num2.intValue())); //true

        boolean condicion = num1 > num2;
        //por debajo se convierten usando autounboxing con estos operadores.
        System.out.println("condición "+condicion);
        //ambos son iguales por lo tanto va a ser false.
        
        
        //excepción en java con números menores a 128:

        System.out.println(" ");
        System.out.println(" Excepción en java con 127 ");
        System.out.println(" ");


        num1 = Integer.valueOf(127); //forma explícita.
        num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("son el mismo objeto: " + (num1==num2));//true. Apunta a la misma referencia, objeto.

        num2 = 127;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("son el mismo objeto: " + (num1==num2));//true. A pesar que no son la misma instancia. Igual compara por valor. Eso hace hasta el 127

        //primitivos a dif. de wrapper, siempre va a comparar por el valor, no por referencia u objeto.
        //para comparar por valor, con el método equals():

        System.out.println("Tienen el mismo valor: " + num1.equals(num2)); //true
        //podemos comparar convirtiendo de forma explícita:
        System.out.println("Tienen el mismo valor: " + (num1.intValue() == num2.intValue())); //true

        boolean condicion2 = num1 > num2;
        System.out.println("condición2 "+condicion2);
        //ambos son iguales por lo tanto va a ser false.
        num2 = 10;

        condicion2 = num1 > num2;
        System.out.println("condición2 "+condicion2); //true.

        //es lo mismo que arriba pero explícito.
        boolean condicion3 = num1.intValue() < num2.intValue();
        System.out.println("condición2 "+condicion3); //false.
    }   
}