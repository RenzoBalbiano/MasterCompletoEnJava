package LaClaseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemplosAsignarPropiedadesDelSistema {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("D:\\MasterCompletoEnJava\\Java\\AprendiendoJava\\src\\LaClaseSystem\\config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p); //con esto actualizamos las propiedades del sistema.
            /*
            System.getProperties().list(System.out); */

            // la línea de arriba es lo mismo que:

            Properties ps = System.getProperties();

            System.out.println(ps.getProperty("mi.propiedad.personalizada")); //por ejemplo para obtener una propiedad en particular de las incorporadas.
            System.out.println(System.getProperty("config.autor.nombre"));

            System.out.println(" ");
            System.out.println(" ");

            ps.list(System.out);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.err.println("No existe el archivo " + e); //Mucho mejor usar el err para manejar errores.
            System.exit(1);//0 Cuando no hubo errores, -1 cuando fue pequeño, 1 cuando hay una falla en el sistema y se sale. Pero continúa el flujo de ejecución.
        }
    }
}