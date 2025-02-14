
package pruebajava;

public class conciertos {

    static void add(conciertos concierto1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int id;
    String nombre;
    String artista;
    String fecha;
    String lugar;
    double precioBase;

    public conciertos(int id, String nombre, String artista, String fecha, String lugar, double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "conciertos{" + "id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + ", lugar=" + lugar + ", precioBase=" + precioBase + '}';
    }
    
}
