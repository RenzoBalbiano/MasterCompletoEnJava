package Variables;
import javax.swing.JOptionPane;

public class SistemasNumericosEntradaDatos {
    
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero : ");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }
        
        System.out.println("numero decimal" + numeroDecimal);

        String resultadoBinario = "numero binario del decimal " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        

        String resultadoOctal = "\n numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);


        String resultadoHex = " numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal); 
        System.out.println(resultadoHex);


        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += "\n " + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
