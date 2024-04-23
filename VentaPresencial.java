package TestProyecto;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class VentaPresencial extends Venta{

    List<Vendedor> vendedores;

    public VentaPresencial(Scanner sc, LocalDate fechaVenta, List<Libro> libroVendidos, List<Cliente> clientes, List<Vendedor> vendedores) {
        super(sc, fechaVenta, libroVendidos, clientes);
        this.vendedores = vendedores;
    }

    public void mostrarVendedor() {
        for (Vendedor vendedor: vendedores){
            System.out.println("El nombre del vendedor es " + vendedor.getNombre());
        }
    }
    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
        System.out.println("El vendedor ha sido introducido con exito");
    }

    public void GenerarFactura(Venta venta){

        System.out.println("======= Factura =======");
        System.out.println("Fecha de venta: " + getFechaVenta());
        System.out.println("Nombre del cliente: " + getClientes().get(0).getNombre());
        System.out.println("Nombre del vendedor: " + vendedores.get(0).getNombre());
        System.out.println("Libros vendidos con su precio:");
        for (Libro libro : getLibrosVendidos()) {
            System.out.println("- " + libro.getTitulo() + " | Precio: $" + libro.getPrecio());
        }
        System.out.println("Total a pagar: $" + calcularTotal()) - DescuentoDeClienteMayorista(venta);
        System.out.println("=======================");
    }

}
