
package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Ticket {
    
    int id;
    int numeroPedido;
    double precioTotal;
    LocalDateTime fechaPedido;
    ArrayList <Productos> listaProductosComprados;

    public Ticket(int id, int numeroPedido, double precioTotal, LocalDateTime fechaPedido) {
        Random r = new Random();
        this.id = r.nextInt(id, id);
        this.numeroPedido = numeroPedido;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
        this.listaProductosComprados = listaProductosComprados = new ArrayList<>();
    }

    

    
    
    
    
}
