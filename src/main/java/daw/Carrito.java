package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Carrito {

    Map<Integer,Integer> carrito=new TreeMap<>();


    public void guardarElemento(ProductoCarrito p1) {
        carrito.put(p1.getId(),p1.getCantidad());
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < carrito.size(); i++) {
            precioTotal += carrito.get(i).getPrecioTotal();
        }
        return precioTotal;
    }
    
    public void ordenarPorId() {
        Collections.sort(carrito, (l1, l2) -> Integer.compare(l1.getId(),
                l2.getId()));
    }

    
    public void borrarProductoExistente(int id) {
        ordenarPorId();
        carrito.remove(id);
    }
    
    public int tamañoCarrito(){
        return carrito.size();
    }
    
    public ProductoCarrito posElemento(int pos){
        return carrito.get(pos);
    }
    
    public static String mostrarProducto(Carrito c1) {
        String aux = "";
        for (int i = 0; i < c1.tamañoCarrito(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (c1.posElemento(i).getId()+" "+ c1.posElemento(i).getDescripcion()
                    +("\n"));
        }
        return aux;
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
