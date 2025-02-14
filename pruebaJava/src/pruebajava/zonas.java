
package pruebajava;

public class zonas {

    static void add(zonas zona1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int id;
    String nombreZona;
    int capacidad;
    double precioAdicional;

    public zonas(int id, String nombreZona, int capacidad, double precioAdicional) {
        this.id = id;
        this.nombreZona = nombreZona;
        this.capacidad = capacidad;
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "zonas{" + "id=" + id + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", precioAdicional=" + precioAdicional + '}';
    }
}
