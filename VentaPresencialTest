package TestProyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaPresencialTest {

    @Test
    public void testMostrarNombreVendedor() {

        Vendedor vendedor = new Vendedor("Juan", "Perez", "Calle sudak", "123456789", "juan@outlook.com");

        VentaPresencial ventaPresencial = new VentaPresencial(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), null, vendedor);

        ventaPresencial.mostrarNombreVendedor();
    }

    @Test
    public void testSetVendedor() {
        Vendedor vendedor = new Vendedor("Pedro", "Perez", "Calle Rivera", "123456789", "Juanito@gmail.com");

        VentaPresencial ventaPresencial = new VentaPresencial(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), null, null);

        ventaPresencial.setVendedor(vendedor);
    }

    @Test
    public void testGenerarFactura() {

        Cliente cliente = new Cliente("Juanito", "Av Francisco fajardo", "ola@gmail.com", LocalDate.now(), 123456);

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new LibroElectronico("Libro1", "Autor1", "Genero1", 20.0, "PDF"));
        libros.add(new LibroFisico("Libro2", "Autor2", "Genero2", 30.0, "Biblioteca"));

        Vendedor vendedor = new Vendedor("Jose", "Perez", "Av democracia", "123456789", "ose@gmail.com");

        VentaPresencial ventaPresencial = new VentaPresencial(new Scanner(System.in), LocalDate.now(), libros, cliente, vendedor);

        ventaPresencial.GenerarFactura(ventaPresencial);
    }
}
