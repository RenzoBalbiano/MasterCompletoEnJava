package LineaDeComando;

public class ArgumentosLineaComandos {

    public static void main(String[] args) {

        // Para compilar el código en terminal:
        // Antes de compilar, guardar el archivo ctrl + s
        // javac ArgumentosLineaComandos.java

        // javac ArgumentosLineaComandos.java -encoding utf8

        // para ejecutar este programa. Desde la consola:
        // en : /d/MasterCompletoEnJava/Java/AprendiendoJava/src/LineaDeComando
        // escribir por ejemplo:
        // java ArgumentosLineaComandos.java Renzo Andres Balbiano
        // arroja esto:
        /*
         * Argumentoos nº 0: Renzo Argumentoos nº 1: Andres Argumentoos nº 2: Balbiano
         * 
         * java ArgumentosLineaComandos.java Renzo Andres "Juan Carlos" Balbiano
         * 
         * Argumentoos nº 0: Renzo Argumentoos nº 1: Andres Argumentoos nº 2: Juan
         * Carlos Argumentoos nº 3: Balbiano
         * 
         */
        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);// cuando ocurre un error es -1.
        }

        for (int j = 0; j < args.length; j++) {
            System.out.println("Argumentoos nº " + j + ": " + args[j]);
        }
    }
}
