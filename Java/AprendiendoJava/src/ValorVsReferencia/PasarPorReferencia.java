package ValorVsReferencia;

public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edad = { 10, 11, 12 };

        System.out.println("Iniciacmos el método main ");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("año es igual a = " + edad[i]);
        }

        System.out.println("Antes de invocar al método test.");

        test(edad);

        System.out.println("Después de invocar al método test.");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("año es igual a = " + edad[i]);
        }

        System.out.println("Finaliza el método main con los datos del arreglo modificado. ");

    }

    public static void test(int[] edadArr) { // esta variable apunta al mismo objeto en la memoria.

        System.out.println("Iniciamos el método test");

        for (int i = 0; i < edadArr.length; i++) {
            System.out.println("año es igual a = " + edadArr[i]);
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el método test con los datos cambiados");
    }
}