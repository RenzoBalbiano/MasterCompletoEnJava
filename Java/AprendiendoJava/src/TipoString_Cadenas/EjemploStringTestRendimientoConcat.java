package TipoString_Cadenas;
public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // es mutable a diferencia del string.

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++){

            //c = c.concat(a).concat(b).concat("\n"); // 2 ms. Luego 0. 5 ms con 1000.

            // c += a + b + "\n"; // 7 ms. es Más rápido el método concat. Luego 0 ms. 0 ms con 1000. Este método termina luego superando al concat a medida que crece el número de iteraciones.

            //sb.append(a).append(b).append("\n"); // 0 luego 2. Con 1000 0 ms. // este es el mejor.
        }

        long fin = System.currentTimeMillis();

        System.out.println("tiempo en milisegundos " + (fin - inicio));
        System.out.println(c);
        System.out.println("sb = " + sb.toString());
    }
}