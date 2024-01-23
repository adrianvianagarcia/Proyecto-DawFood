
package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    
    int id;
    int numeroPedido;
    double precioTotal;
    LocalDateTime fechaPedido;
    Catalogo c1;

    public Ticket(int id, int numeroPedido, double precioTotal, LocalDateTime fechaPedido, Catalogo c1) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
    }
    
    
    
}
