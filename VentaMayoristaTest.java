package ProyectoDawVentas;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaMayoristaTest {

    @Test
    public void testDescuentoDeClienteMayorista() {

        List<Libro> libros = new ArrayList<>();
        libros.add(new LibroElectronico("Libro1", "Autor1", "Genero1", 20.0, "PDF"));
        libros.add(new LibroFisico("Libro2", "Autor2", "Genero2", 30.0, "Biblioteca"));

        double precioTotalSinDescuento = libros.stream().mapToDouble(Libro::getPrecio).sum();

        Cliente cliente = new Cliente("ClientePrueba", "Direccion", "email@test.com", LocalDate.now(), 123456);

        VentaMayorista ventaMayorista = new VentaMayorista(new Scanner(System.in), LocalDate.now(), libros, cliente);


        double descuentoAplicado = ventaMayorista.obtenerDescuentoMayorista();


        double precioConDescuento = precioTotalSinDescuento - descuentoAplicado;
        assertEquals(50.0, precioConDescuento, 0.01);
    }

}
