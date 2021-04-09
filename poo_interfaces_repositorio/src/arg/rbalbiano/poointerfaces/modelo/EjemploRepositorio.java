package arg.rbalbiano.poointerfaces.modelo;

import java.util.List;

import arg.rbalbiano.poointerfaces.repositorio.ClienteListRepositorio;
import arg.rbalbiano.poointerfaces.repositorio.CrudRepositorio;
import arg.rbalbiano.poointerfaces.repositorio.Direccion;
import arg.rbalbiano.poointerfaces.repositorio.OrdenableRepositorio;
import arg.rbalbiano.poointerfaces.repositorio.PaginableRepositorio;

public class EjemploRepositorio {

    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));
        repo.crear(new Cliente("Renzo", "Balbiano"));
        repo.crear(new Cliente("Franco", "Gómez"));
        repo.crear(new Cliente("Julieta", "Ramírez"));
        repo.crear(new Cliente("Camila", "Alcaraz"));

        List<Cliente> clientes = repo.listar();

        clientes.forEach(System.out::println);
        // imprimimos la lista de clientes

        System.out.println("== página 2 ==");
        // casteamos con pagi
        List<Cliente> paginable = ((PaginableRepositorio) repo).listar(0, 4);

        paginable.forEach(System.out::println);

        System.out.println("Ordenar por nombre ascendente");

        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio) repo).listar("apellido", Direccion.ASC);

        clientesOrdenAsc.forEach(cli -> System.out.println(cli));

        System.out.println("Ordenar por nombre descendente");

        List<Cliente> clientesOrdenAsc2 = ((OrdenableRepositorio) repo).listar("nombre", Direccion.DECSC);

        clientesOrdenAsc2.forEach(cli -> System.out.println(cli));

        System.out.println("Ordenar por nombre descendente");

        List<Cliente> clientesOrdenDesc = ((OrdenableRepositorio) repo).listar("apellido", Direccion.DECSC);

        for (Cliente c : clientesOrdenDesc) {
            System.out.println(c);
        }

        System.out.println("Editar");

        Cliente beaActualizar = new Cliente("Bea", "Mena");

        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        ((OrdenableRepositorio) repo).listar("apellido", Direccion.DECSC).forEach(c -> System.out.println(c));



        System.out.println("Eliminar");

        //repo.eliminar(2);

        repo.listar().forEach(System.out::println);

    }

}
