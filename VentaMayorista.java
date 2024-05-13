package ProyectoDawVentas;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class VentaMayorista extends Venta{

    public VentaMayorista(Scanner sc, LocalDate fechaVenta, List<Libro> libroVendidos, Cliente cliente) {
        super(sc, fechaVenta, libroVendidos, cliente);
    }
    public double obtenerDescuentoMayorista() {
        return VentaMayorista.DescuentoDeClienteMayorista(this);
    }
    public static double DescuentoDeClienteMayorista(Venta venta){
        double descuento = 0.0; // Inicializar el descuento como 0.0 por defecto

        // Calcular el descuento basado en el precio total de la venta
        double precioTotal = venta.getPrecio();
        if (precioTotal >= 200 && precioTotal < 300) {
            descuento = precioTotal * 0.1; // 10% de descuento si el precio está entre 200 y 300
        } else if (precioTotal >= 300 && precioTotal < 500) {
            descuento = precioTotal * 0.15; // 15% de descuento si el precio está entre 300 y 500
        } else if (precioTotal >= 500 && precioTotal < 800) {
            descuento = precioTotal * 0.2; // 20% de descuento si el precio está entre 500 y 800
        }

        // Aplicar el descuento a la venta
        venta.setDescuento(descuento);
        double precioConDescuento = precioTotal - descuento;
        venta.setPrecio(precioConDescuento);

        System.out.println("Descuento mayorista aplicado exitosamente.");
        return descuento;
    }

}
