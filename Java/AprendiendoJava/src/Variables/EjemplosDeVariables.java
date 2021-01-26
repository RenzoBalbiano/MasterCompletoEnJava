package Variables;

public class EjemplosDeVariables {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10; // no tiene atributos o métodos es una variable primitiva.

        System.out.println("numero = " + numero);

        Integer numeroClase = 10; // si tiene métodos.

        boolean valor = true;

        if (valor) {
            System.out.println("numero = " + numero);
            numero = 12;
            int numero2 = 14;
        }

        var numeroDebilmenteTipado = "15"; // asigna el tipo de variable automáticamente.

    }
}