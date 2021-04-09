package arg.rbalbiano.poointerfaces.imprenta;

import arg.rbalbiano.poointerfaces.imprenta.modelo.Curriculo;
import arg.rbalbiano.poointerfaces.imprenta.modelo.Hoja;
import arg.rbalbiano.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    
    public static void main(String[] args) {
        
        Curriculo cv = new Curriculo("John Doe", "Ingeniero en Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java").addExperiencia("Oracle DBA").addExperiencia("spring Framework").addExperiencia("Desarrollador fullstack").addExperiencia("Angular");

        Informe inf = new Informe("Martín Fowler","James","Estudio sobre microservicios");

        imprimir(cv);
        imprimir(inf);


    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
