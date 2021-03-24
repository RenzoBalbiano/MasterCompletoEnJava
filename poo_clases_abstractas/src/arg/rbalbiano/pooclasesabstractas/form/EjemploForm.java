package arg.rbalbiano.pooclasesabstractas.form;

import java.util.ArrayList;
import java.util.List;

import arg.rbalbiano.pooclasesabstractas.form.elementos.ElementoForm;
import arg.rbalbiano.pooclasesabstractas.form.elementos.InputForm;
import arg.rbalbiano.pooclasesabstractas.form.elementos.SelectForm;
import arg.rbalbiano.pooclasesabstractas.form.elementos.TextareaForm;
import arg.rbalbiano.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {

    public static void main(String[] args) {

        // clase abstracta no se puede instanciar pero si crear clase anónima. Una clase
        // que se crea al vuelo a partir de una interfaz. Esto es solo para clases
        // abstractas, interfaz. No tiene nombre, un archivo separado, nada.Para
        // utilizar el objeto el. Implementamos el método para nuestro objeto genérico
        // el. No se puede reutilizar, solo acá en el main.
        /*
         * ElementoForm el = new ElementoForm() {
         * 
         * @Override public String dibujarHtml() { // TODO Auto-generated method stub
         * return null; } };
         */

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpciones(java);
        lenguaje.addOpciones(new Opcion("2", "Python"));
        lenguaje.addOpciones(new Opcion("3", "Javascript"));
        lenguaje.addOpciones(new Opcion("4", "Typescript"));
        lenguaje.addOpciones(new Opcion("5", "PHP"));

        username.setValor("john.doe");
        password.setValor("a1b23c");
        email.setValor("algun_correo@gmail.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm e: elementos){

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");

        }
        
    }
}
