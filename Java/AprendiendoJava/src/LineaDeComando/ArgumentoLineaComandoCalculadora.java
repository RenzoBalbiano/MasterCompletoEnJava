package LineaDeComando;

public class ArgumentoLineaComandoCalculadora {

    public static void main(String[] args) {

        // Compilar:
        // javac ArgumentoLineaComandoCalculadora.java -encoding utf8
        // Ejecutar ejemplo:
        // java ArgumentoLineaComandoCalculadora.java suma 8 8

        if (args.length != 3) {
            System.err.println("Por favor ingresar una operación " + "(suma,resta,multi,divi) y dos números: ");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Cuidado el argumento 2 y 3 deben ser enteros, vuelva a intentar! ");
            System.exit(-1);
        }

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "divi":
                if (b == 0) {
                    System.out.println("No puede realizarse una división por cero.");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }
        System.out.println("Resultado de la '" + operacion + "' es: " + resultado);
    }
}
