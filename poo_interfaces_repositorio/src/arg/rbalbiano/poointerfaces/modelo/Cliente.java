package arg.rbalbiano.poointerfaces.modelo;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;


    public Cliente() {
        this.id = ++ultimoId;//para generar un id automático.
    }


    public Cliente(String nombre, String apellido) {
        this();//asigna el id de arriba.
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public String toString() {
        return "Id = " + id + 
        ", nombre = " + nombre +
        ", apellido = " + apellido;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

//se implementa automáticamente, se utiliza para eliminar en el método remove.

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
