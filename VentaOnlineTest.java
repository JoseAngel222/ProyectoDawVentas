package ProyectoDawVentas;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaOnlineTest {

    @Test
    public void testBuscarClienteYMostrarDireccion_ClienteEncontrado() {
        Cliente cliente = new Cliente("ClientePrueba", "Direccion", "email@test.com", LocalDate.now(), 123456);

        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), cliente);

        ventaOnline.BuscarClienteYMostrarDireccion("ClientePrueba");
    }

    @Test
    public void testBuscarClienteYMostrarDireccion_ClienteNoEncontrado() {

        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), null);

        ventaOnline.BuscarClienteYMostrarDireccion("ClienteInexistente");
    }

    @Test
    public void testSetDireccionEnvioCliente_ClienteEncontrado() {

        Cliente cliente = new Cliente("ClientePrueba", "Direccion", "email@test.com", LocalDate.now(), 123456);


        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), cliente);


        ventaOnline.setDireccionEnvioCliente("NuevaDireccionEnvio");
    }

    @Test
    public void testSetDireccionEnvioCliente_ClienteNoEncontrado() {

        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), null);


        ventaOnline.setDireccionEnvioCliente("NuevaDireccionEnvio");
    }

    @Test
    public void testCalcularCostoDeEnvio_ClienteEnEspaña() {

        Cliente cliente = new Cliente("ClientePrueba", "España", "email@test.com", LocalDate.now(), 123456);


        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), cliente);


        ventaOnline.calcularCostoDeEnvio();
    }

    @Test
    public void testCalcularCostoDeEnvio_ClienteEnItalia() {
        //cliente de prueba con dirección en Italia
        Cliente cliente = new Cliente("ClientePrueba", "Italia", "email@test.com", LocalDate.now(), 123456);


        VentaOnline ventaOnline = new VentaOnline(new Scanner(System.in), LocalDate.now(), new ArrayList<>(), cliente);


        ventaOnline.calcularCostoDeEnvio();
    }


}
