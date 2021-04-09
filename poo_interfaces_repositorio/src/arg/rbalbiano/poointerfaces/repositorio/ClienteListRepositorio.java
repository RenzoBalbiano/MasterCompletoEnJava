package arg.rbalbiano.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;

import arg.rbalbiano.poointerfaces.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        // Cliente c = this.porId(id);
        // this.dataSource.remove(c);
        this.dataSource.remove(this.porId(id));

    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {

        return dataSource.subList(desde, hasta);
    }

    /*
     * @Override public List<Cliente> listar(String campo, Direccion dir) {
     * 
     * 
     * //problemas de este método original, duplica código y altera la lista
     * original:
     * 
     * 
     * dataSource.sort(new Comparator<Cliente>() {
     * 
     * @Override public int compare(Cliente a, Cliente b) {
     * 
     * 
     * // simplificando código:
     * 
     * dataSource.sort((a, b) -> {
     * 
     * int resultado = 0;
     * 
     * if (dir == Direccion.ASC) { switch (campo) { case "id": resultado =
     * a.getId().compareTo(b.getId()); case "nombre": resultado =
     * a.getNombre().compareTo(b.getNombre()); case "apellido": resultado =
     * a.getApellido().compareTo(b.getApellido()); }
     * 
     * } else if (dir == Direccion.DECSC) {
     * 
     * switch (campo) { case "id": resultado = b.getId().compareTo(a.getId()); case
     * "nombre": resultado = b.getNombre().compareTo(a.getNombre()); case
     * "apellido": resultado = b.getApellido().compareTo(a.getApellido()); }
     * 
     * }
     * 
     * return resultado; }
     * 
     * ); return dataSource; }
     */

    /*
     * @Override public List<Cliente> listar(String campo, Direccion dir) {
     * 
     * List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
     * 
     * listaOrdenada.sort(new Comparator<Cliente>() {
     * 
     * @Override public int compare(Cliente a, Cliente b) {
     * 
     * int resultado = 0;
     * 
     * if (dir == Direccion.ASC) { resultado = this.ordenar(a, b);
     * 
     * } else if (dir == Direccion.DECSC) {
     * 
     * resultado = this.ordenar(b, a);
     * 
     * }
     * 
     * return resultado; }
     * 
     * private int ordenar(Cliente a, Cliente b) { int resultado = 0; switch (campo)
     * { case "id": resultado = a.getId().compareTo(b.getId()); case "nombre":
     * resultado = a.getNombre().compareTo(b.getNombre()); case "apellido":
     * resultado = a.getApellido().compareTo(b.getApellido()); } return resultado;
     * 
     * }
     * 
     * });
     * 
     */

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {

            int resultado = 0;

            if (dir == Direccion.ASC) {
                //resultado = this.ordenar(campo, a, b);
                resultado = OrdenableRepositorio.ordenar(campo, a, b);

            } else if (dir == Direccion.DECSC) {

                //resultado = this.ordenar(campo, b, a);
                resultado = OrdenableRepositorio.ordenar(campo, b, a);

            }

            return resultado;
        });
        return listaOrdenada;
    }

    //private int ordenar(String campo, Cliente a, Cliente b) {
    /*     public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
        case "id":
            resultado = a.getId().compareTo(b.getId());
        case "nombre":
            resultado = a.getNombre().compareTo(b.getNombre());
        case "apellido":
            resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;

    } */
}
