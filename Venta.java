package TestProyecto;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Venta {
    Scanner sc = new Scanner(System.in);
    double descuento;
    int idVenta;
    double Precio;
    LocalDate fechaVenta;
    LocalDate FechaEntrega;
    List<Libro> libroVendidos;
    Cliente cliente;

    public Venta(Scanner sc, LocalDate fechaVenta, List<Libro> libroVendidos, Cliente cliente) {
        this.sc = sc;
        this.fechaVenta = fechaVenta;
        this.libroVendidos = libroVendidos;
        this.cliente = cliente;
    }

    public Venta() {

    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<Libro> getLibroVendidos() {
        return libroVendidos;
    }

    public void setLibroVendidos(List<Libro> libroVendidos) {
        this.libroVendidos = libroVendidos;
    }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public List<Libro> getLibrosVendidos() {
        return libroVendidos;
    }

    public Cliente getCliente() { return cliente;}

    public LocalDate getFechaEntrega() {return FechaEntrega;}

    public void setFechaEntrega(LocalDate fechaEntrega) {FechaEntrega = fechaEntrega;}

    public void mostrarCliente() {
        System.out.println(cliente.toString());
    }
    public void mostrarLibrosVendidos(){
        for (Libro libroVendidos : this.libroVendidos){
            System.out.println(libroVendidos.toString());
        }
    }
    public String obtenerDireccionCliente2(Cliente clientes) {
        if (clientes != null) {
            return clientes.getDireccion(); // Devolver la dirección del cliente proporcionado
        } else {
            return "Cliente no disponible";
        }
    }


    public double calcularTotal() {
        double total = 0;
        for (Libro libro : libroVendidos) {
            total += libro.getPrecio();
        }
        return total;
    }

    public void buscarClienteYMostrarDireccion(String nombreCliente) {
        if (cliente != null && cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
            System.out.println("Dirección del cliente " + nombreCliente + ": " + cliente.getDireccion());
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
    public static void Descuento(Cliente cliente,Venta venta) {
        switch (cliente.getTipoCliente()){
            case 1 ->{
                ClienteRegular.VerificarBonificacionRegular(venta);
            }
            case 2 ->{
                ClienteMayorista.VerificarBonificacionMayorista(venta);
            }
            case 3 ->{
                ClienteVIP.VerificarBonificacionVIP(venta);
            }
        }
    }

    public static void CalcularEnvio(Scanner sc,Venta venta,Cliente cliente){
        System.out.println("Indique la region del envio:"+
                "\n1)Africa"+
                "\n2)America" +
                "\n3)España" +
                "\n4)Europa" +
                "\n5)Oceania" +
                "\n6)Asia");
        switch (sc.nextInt()){
            case 1 ->{
                System.out.println("Envio calculado exitosamente" +
                        "\nCosto de envio: 5 euros");
                venta.setPrecio(venta.getPrecio()+5);
                System.out.println("El nuevo precio de la venta es: " + venta.getPrecio());
                LocalDate FechaEntrega= LocalDate.now().plusDays(3);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                cliente.setTipoCliente(4);
            }
            case 2 ->{
                System.out.println("Envio calculado exitosamente" +
                        "\nCosto de envio: 4 euros");
                venta.setPrecio(venta.getPrecio()+4);
                System.out.println("El nuevo precio de la venta es: " + venta.getPrecio());
                LocalDate FechaEntrega= LocalDate.now().plusDays(4);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                cliente.setTipoCliente(4);
            }
            case 3 ->{
                LocalDate FechaEntrega= LocalDate.now().plusDays(2);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                venta.setPrecio(venta.getPrecio());
            }
            case 4 ->{
                System.out.println("Envio calculado exitosamente" +
                        "\nCosto de envio: 2 euros");
                venta.setPrecio(venta.getPrecio()+2);
                System.out.println("El nuevo precio de la venta es: " + venta.getPrecio());
                LocalDate FechaEntrega= LocalDate.now().plusDays(3);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                cliente.setTipoCliente(4);
            }
            case 5 ->{
                System.out.println("Envio calculado exitosamente" +
                        "\nCosto de envio: 10 euros");
                venta.setPrecio(venta.getPrecio()+10);
                System.out.println("El nuevo precio de la venta es: " + venta.getPrecio());
                LocalDate FechaEntrega= LocalDate.now().plusDays(10);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                cliente.setTipoCliente(4);
            }
            case 6 ->{
                System.out.println("Envio calculado exitosamente" +
                        "\nCosto de envio: 6 euros");
                venta.setPrecio(venta.getPrecio()+6);
                System.out.println("El nuevo precio de la venta es: " + venta.getPrecio());
                LocalDate FechaEntrega= LocalDate.now().plusDays(6);
                venta.setFechaEntrega(FechaEntrega);
                System.out.println("La fecha de entrega esperada es: "+FechaEntrega);
                cliente.setTipoCliente(4);
            }
        }
    }


}
    }


}
