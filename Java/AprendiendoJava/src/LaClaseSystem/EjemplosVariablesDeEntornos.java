package LaClaseSystem;

import java.util.Map;

public class EjemplosVariablesDeEntornos {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Variables de ambiente o entorno del sistema: " + varEnv);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Listando variables de entorno del sistema: ");
        System.out.println(" ");

        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        System.out.println(" ");
        System.out.println(" ");

        String username = System.getenv("USERNAME");
        System.out.println(" ");
        System.out.println("Username: " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println(" ");
        System.out.println("Java Home: " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println(" ");
        System.out.println("TempDir : " + tempDir);

        String path = System.getenv("PATH");
        System.out.println(" ");
        System.out.println("path : " + path);

        String path2 = varEnv.get("PATH");
        System.out.println(" ");
        System.out.println("path2 : " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println(" ");
        System.out.println("appEnv : " + appEnv);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println(" ");
        System.out.println("hola : " + hola);

    }

}
