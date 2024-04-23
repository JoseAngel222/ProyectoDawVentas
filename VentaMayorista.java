package TestProyecto;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class VentaMayorista extends Venta{

    public VentaMayorista(Scanner sc, LocalDate fechaVenta, List<Libro> libroVendidos, List<Cliente> clientes) {
        super(sc, fechaVenta, libroVendidos, clientes);
    }
    public double obtenerDescuentoMayorista() {
        return Venta.DescuentoDeClienteMayorista(this);
    }


}
