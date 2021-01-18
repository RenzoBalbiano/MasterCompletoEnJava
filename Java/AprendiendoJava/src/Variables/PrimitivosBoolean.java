package Variables;
public class PrimitivosBoolean {
    public static void main(String[] args) {
    
    boolean datoLogico = false;
    boolean datoLogicoConstante = Boolean.TRUE;

    System.out.println(datoLogico);
    System.out.println(datoLogicoConstante);

    double d = 98765.43e-3; // 98.76543
    float f = 1.2345e2f; // 123.45

    datoLogicoConstante = d > f; 
    datoLogico = d < f; 

    boolean esIgual = 3-2 == 1;
    boolean esIgual2 = 4-2 == 1;

    System.out.println(d);
    System.out.println(f);
    System.out.println(datoLogicoConstante);
    System.out.println(datoLogico); // pasa de false a true.
    System.out.println(esIgual);
    System.out.println(esIgual2);

    }
}
