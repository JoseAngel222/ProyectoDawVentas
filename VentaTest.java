package ProyectoDawVentas;

import org.junit.jupiter.api.Test;
import TestProyecto.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaTest{

    @Test
    public void testCalcularTotal() {

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new LibroElectronico("Libro1", "Autor1", "Genero1", 20.0, "PDF"));
        libros.add(new LibroFisico("Libro2", "Autor2", "Genero2", 30.0, "Biblioteca"));


        Venta venta = new Venta();
        venta.setLibroVendidos(libros);

        double totalCalculado = venta.calcularTotal();
        assertEquals(50.0, totalCalculado, 0.01); // 20 + 30 = 50
    }

    @Test
    public void testCalcularEnvio() {
        Scanner sc = new Scanner("3\n"); // Simular la selección de "España"

        Venta venta = new Venta();
        Cliente cliente = new Cliente(
                "Juanito Mendoza",
                "Calle Lugareños 22",
                "juan@hotmail.com",
                LocalDate.of(2022, 5, 10),
                123456789
        );

        venta.setCliente(cliente);

        venta.CalcularEnvio(sc, venta, cliente);
        assertEquals(0.0, venta.getPrecio(), 0.01);
        assertEquals(LocalDate.now().plusDays(2), venta.getFechaEntrega());
    }

    @Test
    public void testMostrarCliente() {
        Cliente cliente = new Cliente(
                "Marco Diaz",
                "Calle Principal de Amparo",
                "Marco@hotmail.com",
                LocalDate.of(2022, 5, 10),
                123456789
        );


        Venta venta = new Venta();
        venta.setCliente(cliente);

        venta.mostrarCliente();
    }

    @Test
    public void testMostrarLibrosVendidos() {

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new LibroElectronico("Libro1", "Autor1", "Genero1", 20.0, "PDF"));
        libros.add(new LibroFisico("Libro2", "Autor2", "Genero2", 30.0, "Biblioteca"));


        Venta venta = new Venta();
        venta.setLibroVendidos(libros);

        venta.mostrarLibrosVendidos();
    }

    @Test
    public void testObtenerDireccionCliente2() {

        Cliente cliente = new Cliente(
                "Jose Coral",
                "Avenida de la Libertad",
                "Coral@gmail.com",
                LocalDate.of(2022, 5, 10),
                123456789
        );


        Venta venta = new Venta();

        String direccion = venta.obtenerDireccionCliente2(cliente);
        assertEquals("Avenida de la Libertad", direccion);
    }

}
