package arg.rbalbiano.pooclasesabstractas.form;
import java.util.Arrays;
import java.util.List;
import arg.rbalbiano.pooclasesabstractas.form.elementos.*;
import arg.rbalbiano.pooclasesabstractas.form.elementos.select.Opcion;
import arg.rbalbiano.pooclasesabstractas.form.validador.EmailValidador;
import arg.rbalbiano.pooclasesabstractas.form.validador.LargoValidador;
import arg.rbalbiano.pooclasesabstractas.form.validador.NoNuloValidador;
import arg.rbalbiano.pooclasesabstractas.form.validador.NumeroValidador;
import arg.rbalbiano.pooclasesabstractas.form.validador.RequeridoValidador;

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

         //Interfaces agrupan objetos diferentes bajo un mismo comportamiento, implementan métodos abstractos. Helicopeto y avión ambos vuelan, eso se le conoce como contrato de implementación. Un murcielago también vuela. Son cosas complementamente diferentes, de ahí radica su diferencia con las clases abstractas, que conciben más bien jerarquías y agrupaciones más coherentes.
         //ADEMAS se puede implementar múltiples interfaces a diferencia de la herencia.

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador()); //este validador funciona.
        password.addValidador(new LargoValidador(6,12)); // ESTE VALIDADOR NO FUNCIONA NO SÉ POR QUÉ.

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
            .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java"); //para que selected otra opción creamos el objeto y luego objeto.setSelected(true)
        lenguaje.addOpciones(java)
        .addOpciones(new Opcion("2", "Python"))
        .addOpciones(new Opcion("3", "Javascript"))
        .addOpciones(new Opcion("4", "Typescript").setSelected())
        .addOpciones(new Opcion("5", "PHP"));

        //implementando una clase anonima: implementación al vuelo de una clase abstracta con algún método abstracto. Para el ej. un input form desahabilitado, es decir que no se pueda modificar el texto. No se va a poder reutilizar, algo simple, que usaremos una sola vez. 

        ElementoForm saludar = new ElementoForm("saludo"){

            @Override
            public String dibujarHtml() {
                //aparece un contenido que no se puede cambiar en este html.
                return "<input disabled name='"+this.nombre+"' value=\"" + this.valor + "\">";
            }
            
        };

        saludar.setValor("Hola que tal este campo está deshabilitado!");
        username.setValor("john.doe");
        password.setValor("a1b2C");
        email.setValor("algun_correo@gmail.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia");
        //java.setSelected(true);

        //Otra forma: usando Arrays as List. Queda más simplificado. También podríamos iterar de otra forma, utilizando el api stream de JAVA, lo vamos a ver cuando veamos el api de colección.

        List<ElementoForm> elementos = Arrays.asList(username,
            password,
            email,
            edad,
            experiencia,
            lenguaje,
            saludar);

/* 
        for(ElementoForm e: elementos){

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        } */

        //agregar expresión Lambda: lo que hace es emitir un elemento en cada iteración. Muy similar a la de arriba.
        elementos.forEach(e -> {

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");

        });

        /*  elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(err ->{
                    System.out.println(err);
                });
            }
        }); */

        elementos.forEach(e -> {
            if(!e.esValido()){ 
                //esto de acá abajo se puede implementar en la clase, es lo que hacemos al final. Por eso dejo comentado.

                /* e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": " + err)); */

                //optimizando código: método de referencia o referenciado, con los dos puntos indicamos el alias en una expresión lambda:

                e.getErrores().forEach(System.out::println);
            }
        });


        
    }
}
