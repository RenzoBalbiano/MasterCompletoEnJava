package arg.rbalbiano.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items; // como es un arreglo también tenemnos que tener este índice para ir agregando
                                 // los elementos, los índices con el método agregar item factura. Tenemos que
                                 // incrementar el índice donde vamos a guardar este elemento en el arreglo.
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    // autoincrementar el folio:
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date(); // se crea con la fecha actual.
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura itemFactura : this.items) {
            if (!(itemFactura instanceof ItemFactura)) {
                continue;
            }
            total += itemFactura.calcularImporte(); // hay que tener cuidado con el nullPointerExcepction, algunos items
                                                    // pueden estar vacíos en el arreglo que es de hasta 12. Puede ser
                                                    // en el if: itemFactura == null
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
            .append("\nCliente: ")
            .append(this.cliente.getNombre())
            .append("\tNIF: ")
            .append(this.cliente.getNif())
            .append("\nDescripción: ")
            .append(this.descripcion)
            .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha Emisión: ")
            .append(df.format(this.fecha))
            .append("\n")
            .append("\n#\tNombre\t$\tCant.\tTotal\n");

        
        for (ItemFactura itemFactura: this.items) {

            if(itemFactura == null){
                continue;
            }
            //como tenemos los toString imprimimos solo el objeto item.

                sb.append(itemFactura)
                    .append("\n");

            }

        sb.append("\nGran Total: ")
            .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }

    

}
