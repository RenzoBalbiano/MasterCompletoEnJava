package arg.rbalbiano.poointerfaces.repositorio;

import java.util.List;

import arg.rbalbiano.poointerfaces.modelo.Cliente;

public interface PaginableRepositorio {
    
    //para limitar la cantidad de registros que traemos. El limit y el offset

    List<Cliente> listar(int desde, int hasta);
    
}
