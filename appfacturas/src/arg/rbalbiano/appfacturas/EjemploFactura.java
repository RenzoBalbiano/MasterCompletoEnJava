package arg.rbalbiano.appfacturas;

import java.util.Scanner;

import arg.rbalbiano.appfacturas.modelo.Cliente;
import arg.rbalbiano.appfacturas.modelo.Factura;
import arg.rbalbiano.appfacturas.modelo.ItemFactura;
import arg.rbalbiano.appfacturas.modelo.Producto;

public class EjemploFactura {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Juan");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        String desc = s.nextLine();
        
        Factura factura = new Factura(desc,cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad; 

        System.out.println(" ");

        //para registrar hasta cinco productos:
        for(int i = 0; i < 5;i++){
            producto = new Producto();
            System.out.print("Ingrese el nombre del producto nº " + producto.getCodigo() + ": ");
            nombre = s.nextLine();//permite registrar un nombre sin espacios en blanco. Solamente recibe el primer parámetro ingresado, sino da error. "mesa trabajo" son dos parámetros. El segundo lo trataría de asignar a la variable precio.
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();
            
            ItemFactura itemFactura = new ItemFactura(cantidad, producto);

            factura.addItemFactura(itemFactura);

            System.out.println(" ");
            //esto es necesario, movemos el cursor a la siguiente línea de la iteración. Sino daría error.
            s.nextLine();
        }

        System.out.println(factura.generarDetalle());
    }
    
}
