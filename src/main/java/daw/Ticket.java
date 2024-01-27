
package daw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Ticket {
    
    int id;
    int numeroPedido = 1;
    double precioTotal;
    LocalDateTime fechaPedido;
    ArrayList <ProductoCarrito> listaProductosComprados;

    public Ticket(int id, int numeroPedido, double precioTotal, LocalDateTime fechaPedido) {
        this.id = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        this.numeroPedido = numeroPedido;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
        this.listaProductosComprados = listaProductosComprados = new ArrayList();
    }

    public Ticket() {
    }

    public Ticket generadorDeTicket (Ticket t1,Carrito carrito){
        t1.setId(Integer.parseInt(RandomStringUtils.randomNumeric(3)));
        t1.setPrecioTotal(carrito.precioTotal());
        t1.setFechaPedido( LocalDateTime.now());
        t1.setListaProductosComprados(carrito.carrito);
        return t1;
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

    public ArrayList<ProductoCarrito> getListaProductosComprados() {
        return listaProductosComprados;
    }

    public void setListaProductosComprados(ArrayList<ProductoCarrito> listaProductosComprados) {
        this.listaProductosComprados = listaProductosComprados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Su ticket: ");
        sb.append("id=").append(id);
        sb.append(", numeroPedido=").append(numeroPedido);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append(", fechaPedido=").append(fechaPedido);
        sb.append(", listaProductosComprados=").append(Metodos.mostrarProductoCarrito(listaProductosComprados));
        sb.append('}');
        return sb.toString();
    }




    
    
}
