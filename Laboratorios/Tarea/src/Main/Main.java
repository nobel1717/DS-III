package Main;
import java.util.List;
import java.util.Scanner;

import Entity.Almacen;
import Entity.Artimperecedero;
import Entity.Perecedero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar artículo perecedero");
            System.out.println("2. Agregar artículo imperecedero");
            System.out.println("3. Listar artículos perecederos");
            System.out.println("4. Listar artículos imperecedero");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del artículo:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el precio del artículo:");
                double precio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese la ubicación del artículo:");
                String ubicacion = scanner.nextLine();
                System.out.println("Ingrese la fecha de expiración del artículo:");
                String fechaExpiracion = scanner.nextLine();

                Perecedero perecedero = new Perecedero(nombre, precio, ubicacion, fechaExpiracion);
                almacen.agregarArticulo(perecedero);
                System.out.println("Artículo perecedero agregado correctamente.");
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del artículo:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el precio del artículo:");
                double precio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese la ubicación del artículo:");
                String ubicacion = scanner.nextLine();

                Artimperecedero imperecedero = new Artimperecedero(nombre, precio, ubicacion);
                almacen.agregarArticulo(imperecedero);
                System.out.println("Artículo imperecedero agregado correctamente.");
            } else if (opcion == 3) {
                List<Artimperecedero> articulosPerecederos = almacen.getArticulosPerecederos();
                System.out.println("Artículos perecederos:");
                for (Artimperecedero artimperecedero : articulosPerecederos) {
                    Perecedero perecedero = (Perecedero) artimperecedero;
                    System.out.println("Nombre: " + perecedero.getNombre());
                    System.out.println("Precio: " + perecedero.getPrecio());
                    System.out.println("Ubicación: " + perecedero.getUbicacion());
                    System.out.println("Fecha de expiración: " + perecedero.getFechaExpiracion());
                    System.out.println("-----------");
                }
            } else if (opcion == 4) {
                List<Artimperecedero> imperecederos = almacen.getArticulosImperecederos();
                System.out.println("Artículos imperecederos:");
                for (Artimperecedero artimperecedero : imperecederos) {
                    System.out.println("Nombre: " + artimperecedero.getNombre());
                    System.out.println("Precio: " + artimperecedero.getPrecio());
                    System.out.println("Ubicación: " + artimperecedero.getUbicacion());
                    System.out.println("-----------");
                }
            } else if (opcion == 5) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}