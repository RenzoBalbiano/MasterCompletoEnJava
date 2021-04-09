package arg.rbalbiano.poointerfaces.repositorio;

import java.util.List;

import arg.rbalbiano.poointerfaces.modelo.*;

public interface CrudRepositorio {
    //esta interfaz la podemos implementar con base de datos, api rest, arrayList, arreglos, donde queramos almacenar a los clientes, incluso un archivo plano, un xml, en cualquier fuente o datasource.

    List<Cliente> listar();

    //método get para obtener los clientes por id o el detalle.
    Cliente porId(Integer id);

    //el crear.
    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);

    
    
}
