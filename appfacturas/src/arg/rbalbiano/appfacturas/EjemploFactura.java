package arg.rbalbiano.appfacturas;

import java.util.Scanner;

import arg.rbalbiano.appfacturas.modelo.*;

public class EjemploFactura {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Juan");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        
        Factura factura = new Factura(s.nextLine(),cliente);

        Producto producto;

        System.out.println(" ");

        //para registrar hasta cinco productos:
        //bajamos a dos para modo depuración.
        for(int i = 0; i < 2;i++){
            producto = new Producto();
            System.out.print("Ingrese el nombre del producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println(" ");
            //esto es necesario, movemos el cursor a la siguiente línea de la iteración. Sino daría error.
            s.nextLine();
        }

        //luego de los cambios podemos elegir imprimir solamente el objeto y ya está por el encadenamiento de toString.
        System.out.println(factura);
    }
    
}
