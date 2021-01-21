package FlujosDeControl;

public class SentenciasBuclesEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int maxFrase = frase.length();
        int cantidadDeLetrasT = 0;

        for(int i = 0; i < maxFrase; i++){

            if(frase.charAt(i) != 't'){
                continue;
            }
            cantidadDeLetrasT++;
        }
        System.out.println("Cantidad de letras t del trabalenguas: " + cantidadDeLetrasT);

        System.out.println("==================================================");
        int cantidad = 0;
        char letra = 'g';

        for(int i = 0; i < maxFrase; i++){

            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Cantidad de letras "+ letra+" del trabalenguas: " + cantidad);

        System.out.println("==================================================");
        
        
        cantidad = 0;
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        System.out.println("palabra.length() = " + maxPalabra);//5
        System.out.println("frase.length() = " + maxFrase);//45
        buscar:
        for(int i = 0; i < maxFrase; i++){ //este for recorre la frase completa, caracter por caracter

            int k = i;

            System.out.println("i = " + i);//45
            
            System.out.println("k = " + k);//45

            for(int j = 0; j < maxPalabra; j++) //este for recorre la palabra trigo, caracter por caracter
            
                if(frase.charAt(k++) != palabra.charAt(j)){ // Minuto 7.26 ----- k++ para incrementar el caracter de la frase, sino no avanzaría a la siguiente letra. 
                    continue buscar; // va al siguiente caracter de la frase si no coinciden el caracter de la frase y el de la palabra.
                }
            System.out.println("cantidad vale " + cantidad); 
            cantidad++; // solamente llega a esta línea si llega a recorrer todo el segundo for. Sino mete continue y se reinicia el for padre.
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra ' " + palabra + " '  en la frase");


        //MEJORA EN EL PROGRAMA DE ARRIBA

        
        System.out.println("==================================================");
        
        System.out.println("==================================================");
        
        System.out.println("==================================================");

        cantidad = 0;
        frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo"; // de esta manera busca hasta acá: trigalt , ya que no es necesario que siga buscando el resto.
        maxFrase = frase.length() - maxPalabra; // sino va el <= maxFrase y va <maxFrase; puede ir en esta línea:   maxFrase = frase.length() - maxPalabra + 1;   y es lo mismo.

        buscar:
        for(int i = 0; i <= maxFrase; i++){ //este for recorre la frase completa, caracter por caracter

            int k = i;

            for(int j = 0; j < maxPalabra; j++) //este for recorre la palabra trigo, caracter por caracter
            
                if(frase.charAt(k++) != palabra.charAt(j)){ // Minuto 7.26 ----- k++ para incrementar el caracter de la frase, sino no avanzaría a la siguiente letra. 
                    continue buscar; // va al siguiente caracter de la frase si no coinciden el caracter de la frase y el de la palabra.
                }
            System.out.println("cantidad vale " + cantidad); 
            cantidad++; // solamente llega a esta línea si llega a recorrer todo el segundo for. Sino mete continue y se reinicia el for padre.
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra ' " + palabra + " '  en la frase");


        System.out.println("==================================================");
        
        System.out.println("==================================================");
        
        System.out.println("==================================================");

        // última MEJORA EN EL PROGRAMA DE Arriba.

        cantidad = 0;
        frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo"; // de esta manera busca hasta acá: trigalt , ya que no es necesario que siga buscando el resto.
        maxFrase = frase.length() - maxPalabra; // sino va el <= maxFrase y va <maxFrase; puede ir en esta línea:   maxFrase = frase.length() - maxPalabra + 1;   y es lo mismo.

        buscar:
        for(int i = 0; i <= maxFrase;){ //este for recorre la frase completa, caracter por caracter

            int k = i;

            for(int j = 0; j < maxPalabra; j++) //este for recorre la palabra trigo, caracter por caracter
            
                if(frase.charAt(k++) != palabra.charAt(j)){ // Minuto 7.26 ----- k++ para incrementar el caracter de la frase, sino no avanzaría a la siguiente letra. 
                    i++;
                    continue buscar; // va al siguiente caracter de la frase si no coinciden el caracter de la frase y el de la palabra.
                }
            System.out.println("cantidad vale " + cantidad); 
            cantidad++; // solamente llega a esta línea si llega a recorrer todo el segundo for. Sino mete continue y se reinicia el for padre.
            i = i + maxPalabra; // con esta línea en la frase en vez de seguir con el siguiente caracter salta al siguiente espacio/caracter de la palabra que encontró y sumó en cantidad.
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra ' " + palabra + " '  en la frase");

    }   
}
