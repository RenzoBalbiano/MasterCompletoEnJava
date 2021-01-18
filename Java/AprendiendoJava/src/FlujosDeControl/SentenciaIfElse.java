package FlujosDeControl;
public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 6.3f;
        float promedio2 = 6.5f;
        float promedio3 = 6.6f;
        
        if(promedio2 >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!");
        }else{
            System.out.println("Necesitas esforzarte un poco más.");
        }

        if(promedio3 >= 6.5){
            System.out.println("Felicitaciones, excelente promedio.!");
        }else
            System.out.println("Necesitas esforzarte un poco más.");
        //como se ve acá arriba se puede quitar la llave. Siempre que sea una linea de código.
        //tanto al if como al else, con una sola línea, pueden ir sin llaves.


        if(promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!");
        }else if(promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        }else if(promedio >= 5.5){
            System.out.println("Buen promedio.");
        }else if(promedio >= 5.0){
            System.out.println("Regular, necesitás un poco más de esfuerzo.");
        }else if(promedio >= 4.0){
            System.out.println("Insuficiente, necesitas estudiar más.");
        }else {
            System.out.println("Reprobado.");
        }

        System.out.println("TU promedio es: " + promedio);       
    }
}