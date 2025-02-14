
package pruebajava;

public class ticket {

    static void add() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void add(ticket ticket1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int id;
    int id_cliente;
    int id_concierto;
    int id_zona;
    double precioFinal;
    String fechaCompra;

    public ticket(int id, int id_cliente, int id_concierto, int id_zona, double precioFinal, String fechaCompra) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_concierto = id_concierto;
        this.id_zona = id_zona;
        this.precioFinal = precioFinal;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", id_zona=" + id_zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
    
    
}
