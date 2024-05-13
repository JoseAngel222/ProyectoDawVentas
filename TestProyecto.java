package TestProyecto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TestProyecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibroAudio libroAudio1 = new LibroAudio("El Principito", "Antoine de Saint-Exupéry", "Infantil", 19.99, 180, "Español", "alta");
        LibroElectronico libroElectronico1 = new LibroElectronico("Cien años de soledad", "Gabriel García Márquez", "Ficción", 14.50, "pdf");
        LibroFisico libroFisico1 = new LibroFisico("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía", 24.99, "Sala 3, Estantería 2, Balda 1");
        LibroInfantil libroInfantil1 = new LibroInfantil("El gato con botas", "Charles Perrault", "Infantil", 9.99, 6, true, 15);


        Cliente cliente1 = new Cliente("Juan Pérez", "Calle Principal 123", "juan@email.com",
                LocalDate.of(2020, 5, 15), 123456789);
        cliente1.setIdCliente(1);

        List<Libro> librosVenta = new ArrayList<>();
        librosVenta.add(libroAudio1);
        librosVenta.add(libroElectronico1);
        librosVenta.add(libroFisico1);
        librosVenta.add(libroInfantil1);
        Venta venta1 = new Venta();
        venta1.setCliente(cliente1);
        venta1.setFechaVenta(LocalDate.of(2024, 5, 7));
        venta1.setLibroVendidos(librosVenta);


        ArrayList<Venta> listaVentas = new ArrayList<>();
        listaVentas.add(venta1);


        HashMap<Integer, Cliente> mapaClientes = new HashMap<>();
        mapaClientes.put(cliente1.getIdCliente(), cliente1);


        HashMap<Venta, Integer> mapaVentas = new HashMap<>();
        mapaVentas.put(venta1, cliente1.getIdCliente());


        int opcion;
        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Ver factura de venta");
            System.out.println("2. Ver ventas guardadas");
            System.out.println("3. Agregar una nueva venta");
            System.out.println("4. Ver libros de venta");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID de la venta: ");
                    int idVenta = scanner.nextInt();
                    Venta ventaSeleccionada = obtenerVentaPorID(listaVentas, idVenta);
                    if (ventaSeleccionada != null) {
                        ventaSeleccionada.mostrarCliente();
                        ventaSeleccionada.mostrarLibrosVendidos();

                    } else {
                        System.out.println("Venta no encontrada.");
                    }
                    break;
                case 2:
                    for (Venta venta : listaVentas) {
                        System.out.println(venta);

                    }
                    break;
                case 3:
                    Venta.GuardarVenta(scanner, listaVentas, mapaClientes, mapaVentas);
                    break;
                case 4:
                    for (Venta venta : listaVentas) {
                        venta.mostrarLibrosVendidos();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    public static Venta obtenerVentaPorID(ArrayList<Venta> listaVentas, int idVenta) {
        for (Venta venta : listaVentas) {
            if (venta.getIdVenta() == idVenta) {
                return venta;
            }
        }
        return null;
    }
}
