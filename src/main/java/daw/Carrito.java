package daw;

import java.util.ArrayList;

public class Carrito {

    
    ArrayList<ProductoCarrito> carrito = new ArrayList<>();

    public void guardarElemento(ProductoCarrito p1) {
        carrito.add(p1);
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < carrito.size(); i++) {
            precioTotal = +carrito.get(i).getPrecioBase();
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cesta{");
        sb.append("cesta=").append(carrito);
        sb.append('}');
        return sb.toString();
    }

}
