package arg.rbalbiano.poosobrecarga;

public class Calculadora {
    // como no trabaja con atributos, el método sumar podría ser estático.
    // por lo tanto se los llamará con la clase y no con un objeto.

    private Calculadora() { //de esta forma obligamos a que no se cree una instancia de calculadora. Si se crea da error. OTRA FORMA SERÍA DECLARAR A ESTA CLASE ABSTRACTA, YA QUE LA MISMA NO SE PUEDE INSTANCIAR Y TAMBIÉN PODRÍA TENER MÉTODOS ESTÁTICOS.
    
    }

    public static int sumar(int a, int b) {

        return a + b;
    }

    // no podría haber uno repetido así:
    /*
     * public float sumar(int a, int b){
     * 
     * } Tiene que tener distinto tipo de parámetros:
     */
    public static float sumar(float x, float y) {
        return x + y;

    }

    // Varargs: número variable de argumentos:
    public static int sumar(int... argumentos) {
        // int a = argumentos[0];
        int total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    public static float sumar(float a, int... argumentos) {
        // float a = argumentos[0];
        float total = a;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    public static double sumar(double... varargs) {
        // float a = argumentos[0];
        double total = 0.0;
        for (double d : varargs) {
            total += d;
        }
        return total;
    }

    public static float sumar(int i, float j) {
        return i + j;
    }

    public static float sumar(float i, int j) {
        return i + j;
    }

    public static double sumar(double i, double j) {
        return i + j;
    }

    public static int sumar(String i, String j) {
        int resultado;
        try {
            resultado = Integer.parseInt(i) + Integer.parseInt(j);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

}
