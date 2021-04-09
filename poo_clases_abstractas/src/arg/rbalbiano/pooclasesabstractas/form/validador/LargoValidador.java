package arg.rbalbiano.pooclasesabstractas.form.validador;

import arg.rbalbiano.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable{
/* 
    protected String mensaje = "el campo debe tener como mínimo %d caracteres y máximo d% caracteres";
    podría ir %s de String o similar a any cualquier tipo de dato, d proviene de dígito. 

    //ESAS DOS LÍNEAS DE ARRIBA ME DABAN EL ERROR NO SÉ POR QUÉ.
 */
    protected String mensaje = "el campo %s debe tener como mínimo %d caracteres y máximo %d caracteres";

    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

     @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public String getMensaje() {

        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        
        //this.mensaje = String.format(this.mensaje,this.min, this.max);// esto formatea lo que le pasamos como primer argumento, cambia lo que está en %d

        if(valor == null){
            return true;
        }
        int largo = valor.length();

        return (largo >= min && largo <= max);
    }


    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.mensaje, campo ,this.min, this.max);
    }
} 



//LO DE ARRIBA ES MÍO Y NO FUNCIONABA, USÉ LO DE GUZMAN Y SI FUNCIONÓ. 

