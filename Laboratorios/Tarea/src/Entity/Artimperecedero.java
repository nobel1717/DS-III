package Entity;

public class Artimperecedero {
    protected String nombre;
    protected double precio;
    protected String ubicacion;

    public Artimperecedero(String nombre, double precio, String ubicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
