package Variables;
public class PrimitivosFloat {

    static float varFlotante3; // atributo de clase.
    public static void main(String[] args) {
        float realFloat = 1;
        float realFloat2 = 1.0f; // o puede ser así, para indicar el punto y que no lo confunda con doble.

        // otro ejemplo 

        float realFloat3 = 2120f;// es lo mismo que abajo. 
        float realFloat4 = 2.12e3f; 

        float realFloat5 = 1.5e4f; // esto es igual a 15000
        float realFloat6 = 1.5e-10f; // esto es igual a 0.00000000015f;
        float realFloat7 = 0.00000000015f;;


        System.out.println(realFloat);
        System.out.println(realFloat2);
        System.out.println(realFloat3);
        System.out.println(realFloat4);
        System.out.println(realFloat5);
        System.out.println(realFloat6);
        System.out.println(realFloat7);

        //Sus constantes:

        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo en un float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo en un float: " + Float.MIN_VALUE);

        double realDoble = 3.4028235E39d; //no es necesario colocar la d al final.

        System.out.println(realDoble);

        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo en un double: " + Double.MAX_VALUE);
        System.out.println("valor mínimo en un double: " + Double.MIN_VALUE);

        var varFlotante = 3.1415f;
        var varFlotante2 = 3.1415; //la considera double, por el punto.

        System.out.println(varFlotante + " " + varFlotante2 + " " + varFlotante3);

    }
}
