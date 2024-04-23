package TestProyecto;
import java.time.LocalDate; // Agregar la importación de LocalDate
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class TestProyecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente(
                "Paolo",
                "Avenida Diagonal 456",
                "juan@example.com",
                LocalDate.now(),
                2555987
        );
        Cliente cliente2 = new Cliente(
                "Juan",
                "Avenida Diagonal 456",
                "juan@example.com",
                LocalDate.now(),
                2555987
        );
        /*
        Venta venta1 = new Venta(
                LocalDate.now(), // fechaVenta (fecha actual)
                new ArrayList<>(), // lista de libros vendidos (vacía por ahora)
                // lista de vendedores (vacía por ahora)
                Arrays.asList(cliente1, cliente2) // lista de clientes
        );
/*
       venta1.mostrarCliente();
       System.out.println(venta1.obtenerDireccionCliente2(cliente1));

       System.out.println("Dame el nombre del cliente");
        String nombreCliente = sc.nextLine();
       venta1.buscarClienteYMostrarDireccion(nombreCliente);
       */
    }

}
