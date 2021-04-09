package arg.rbalbiano.poointerfaces.imprenta;

import static arg.rbalbiano.poointerfaces.imprenta.modelo.Genero.*;

import arg.rbalbiano.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero en Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java").addExperiencia("Oracle DBA").addExperiencia("spring Framework")
                .addExperiencia("Desarrollador fullstack").addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Stephen ","King"), "Celular", TERROR);

        libro.addPagina(new Pagina("\nCapítulo Uno \n" + "El hombre llamó a la puerta... \n"))
                .addPagina(new Pagina("Capítulo Dos \n" + "De repente se escuchó un sonido inquietante... \n"));

        Informe inf = new Informe(new Persona("Martín","Fowler"),
            new Persona("James","Gosling"),"Estudio sobre microservicios");

            
        /* imprimir(cv);
        imprimir(inf);
        System.out.println(" ");
        imprimir(libro); */

        //esto es usando el método estático: También so podría importar como hicimos con el ENUM:
        Imprimible.imprimir(cv);
        Imprimible.imprimir(inf);
        System.out.println(" ");
        Imprimible.imprimir(libro);

        System.out.println(Imprimible.TEXTO_DEFECTO);


        //implementando una clase anónima: RECORDÁ QUE NO SE PUEDE REUTILIZAR, SOLO SI LO VAMOS A UTILIZAR UNA SOLA VEZ.
        Imprimible objImp = new Imprimible(){

            @Override
            public String imprimir() {
                
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima.";
            }
            
        };
        Imprimible.imprimir(objImp);


        //Forma dos de clase anónima:
        Imprimible.imprimir(new Imprimible(){
            //imprimiendo esto va a imprimir el texto por defecto.
        });

        //Forma tres de clase anónima: 
        Imprimible.imprimir(new Imprimible(){
            @Override
            public String imprimir() {
                
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima.";
            }
            
        });


    }

    // modificamos el método:
    // public static void imprimir(Hoja imprimible){
    /* public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    } */
}
