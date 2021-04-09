package arg.rbalbiano.poointerfaces.repositorio;

import java.util.List;

import arg.rbalbiano.poointerfaces.modelo.Cliente;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

    //si ponemos default acá, cuando lo llamamos en la otra ClaseClienteRepositorio no es necesario el OrdenableRepositorio.ordenar(). Puede ir el ordenar solamente. En default sería una de las mejores formas de utilizar de las tantas vistas en clase. O como solamente lo utilizamos en esa clase ponerlo como un método estático de esa clase.

    static int ordenar(String campo, Cliente a, Cliente b) {
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

    }
    
}
