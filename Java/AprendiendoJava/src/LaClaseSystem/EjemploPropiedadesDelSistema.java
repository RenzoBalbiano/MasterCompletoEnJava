package LaClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesDelSistema {

    public static void main(String[] args) {

        String username = System.getProperty("user.name"); // Usuario
        System.out.println(username);

        String home = System.getProperty("user.home"); // C:\Users\Usuario
        System.out.println(home);

        String workspace = System.getProperty("user.dir"); // D:\MasterCompletoEnJava\Java
        System.out.println(workspace);

        String java = System.getProperty("java.version"); // D:\MasterCompletoEnJava\Java
        System.out.println(java);

        String lineSeparator = System.getProperty("line.separator"); //
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator: " + lineSeparator + "Una línea nueva");
        System.out.println("lineSeparator: " + lineSeparator2 + "Una línea nueva");

        System.out.println(" ");
        System.out.println("==============================================");
        System.out.println(" ");
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
