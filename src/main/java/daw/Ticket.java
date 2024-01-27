
package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Ticket {
    
    int id;
    int numeroPedido = 1;
    double precioTotal;
    LocalDateTime fechaPedido;
    ArrayList <Carrito> listaProductosComprados;

    public Ticket(int id, int numeroPedido, double precioTotal, LocalDateTime fechaPedido) {
        this.id = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        this.numeroPedido = numeroPedido;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
        this.listaProductosComprados = listaProductosComprados = new ArrayList<>();
    }

    public Ticket() {
    }

    public Ticket generadorDeTicket (ProductoCarrito p1){
        this.id = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        this.numeroPedido = numeroPedido;
        this.precioTotal = p1.getPrecioTotal();
        this.fechaPedido = fechaPedido;
        this.listaProductosComprados = listaProductosComprados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public ArrayList<Productos> getListaProductosComprados() {
        return listaProductosComprados;
    }

    public void setListaProductosComprados(ArrayList<Productos> listaProductosComprados) {
        this.listaProductosComprados = listaProductosComprados;
    }
    
    
}
