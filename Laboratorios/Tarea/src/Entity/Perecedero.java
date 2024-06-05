package Entity;

public class Perecedero extends Artimperecedero {
    private String fechaExpiracion;

    public Perecedero(String nombre, double precio, String ubicacion, String fechaExpiracion) {
        super(nombre, precio, ubicacion);
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
}