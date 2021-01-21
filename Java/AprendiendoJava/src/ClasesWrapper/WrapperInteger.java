package ClasesWrapper;

public class WrapperInteger {

    public static void main(String[] args) {
        
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(32768); // esto se conoce como boxing.
        Integer intObjeto3 = Integer.valueOf(intPrimitivo); // esto se conoce como boxing.
        Integer intObjeto2 = 32768; // esto se conoce como autoboxing. Forma implícita.

        System.out.println(intObjeto);
        System.out.println(intObjeto2);
        System.out.println(intObjeto3);        

        // de la forma de arriba es para convertir en un objeto Integer. NO se utiliza el new.

        int num = intObjeto; //forma automática e implícita.
        int num2 = intObjeto.intValue(); // de forma explícita. 

        System.out.println(num);
        System.out.println(num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        System.out.println(valorTvLcd);

        Short shortObjeto = intObjeto.shortValue(); //acá vamos a tener pérdida de información.
        System.out.println(shortObjeto); //-32768

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println(byteObjeto); //también pérdida de información.

        Long longObjeto = intObjeto.longValue();
        System.out.println(longObjeto);//acá no hay problema.

    }   
}