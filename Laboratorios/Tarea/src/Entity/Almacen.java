package Entity;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Artimperecedero> inventario;

    public Almacen() {
        inventario = new ArrayList<>();
    }

    public void agregarArticulo(Artimperecedero artimperecedero) {
        inventario.add(artimperecedero);
    }

    public List<Artimperecedero> getArticulosPerecederos() {
        List<Artimperecedero> perecederos = new ArrayList<>();
        for (Artimperecedero artimperecedero : inventario) {
            if (artimperecedero instanceof Perecedero) {
                perecederos.add(artimperecedero);
            }
        }
        return perecederos;
    }

    public List<Artimperecedero> getArticulosImperecederos() {
        List<Artimperecedero> imperecederos = new ArrayList<>();
        for (Artimperecedero artimperecedero : inventario) {
            if (!(artimperecedero instanceof Perecedero)) {
                imperecederos.add(artimperecedero);
            }
        }
        return imperecederos;
    }
}

