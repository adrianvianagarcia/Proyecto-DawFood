
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
    ArrayList <Productos> listaProductosComprados;

    public Ticket(int id, int numeroPedido, double precioTotal, LocalDateTime fechaPedido) {
        this.id = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        this.numeroPedido = numeroPedido;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
        this.listaProductosComprados = listaProductosComprados = new ArrayList<>();
    }

    

    
    
    
    
}
