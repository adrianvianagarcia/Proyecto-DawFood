
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

    public void estabelecerNumPedido(ArrayList<Ticket> tickets){
    Random r=new Random();
    int numPedido=0;
    for(int i=0;i<tickets.size();i++){
      do{
          numPedido = r.nextInt(100,1000);
          tickets.get(i).setNumeroPedido(numPedido);
      }while(tickets.get(i).getNumeroPedido()!=numPedido);
     
    }
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
        sb.append("Su ticket: ").append("\n");
        sb.append("Id del ticket: ").append(id).append("\n");
        sb.append("Pedido: ").append(numeroPedido).append("\n");
        sb.append("Total a pagar: ").append(precioTotal).append("€").append("\n");
        sb.append("Fecha del pedido: ").append(fechaPedido).append("\n");
        sb.append(Metodos.mostrarProductoCarrito(listaProductosComprados));
        return sb.toString();
    }




    
    
}
