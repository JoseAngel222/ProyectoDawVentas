package TestProyecto;
import Proyecto.Cliente;
import Proyecto.Libros;
import Proyecto.Vendedor;
import Proyecto.Venta;

import java.time.LocalDate;
import java.util.List;

public class VentaOnline extends Venta {
    public VentaOnline(LocalDate fechaVenta, List<Libros> librosVendidos, List<Vendedor> vendedores, List<Cliente> clientes) {
        super(fechaVenta, librosVendidos, vendedores, clientes);
    }

    public void buscarClienteYMostrarDireccion(String nombreCliente) {
        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                encontrado = true;
                System.out.println("Dirección del cliente " + nombreCliente + ": " + cliente.getDireccion());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado");
        }
    }

    public void setDireccionEnvioCliente(String nombreCliente, String nuevaDireccionEnvio) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                cliente.setDireccion(nuevaDireccionEnvio);
                System.out.println("Dirección de envío del cliente " + nombreCliente + " actualizada correctamente.");
                return; // Salir del método después de actualizar la dirección de envío
            }
        }
        System.out.println("Cliente no encontrado");
    }

    public void calcularCostoDeEnvio() {
        //Este metodo calculará el costo de envio dependiendo del pais del cliente que tengamos en esta venta
        double costoEnvio;

        for (Cliente cliente : clientes) {
            String direccionCliente = cliente.getDireccion().toLowerCase();

            if (direccionCliente.contains("españa")) {
                costoEnvio = 5.0;
            } else if (direccionCliente.contains("italia") || direccionCliente.contains("alemania") ||
                    direccionCliente.contains("francia") || direccionCliente.contains("portugal")) {
                costoEnvio = 10.0;
            } else {
                costoEnvio = 15.0;
            }

            System.out.println("El costo de envío para " + cliente.getNombre() + " es: " + costoEnvio + "€");
        }
    }





}
