package daw;

import java.util.ArrayList;

public class Cesta {

    ArrayList<Productos> cesta = new ArrayList<>();

    public void guardarElemento(Productos p1) {
        cesta.add(p1);
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < cesta.size(); i++) {
            precioTotal = +cesta.get(i).getPrecioBase();
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cesta{");
        sb.append("cesta=").append(cesta);
        sb.append('}');
        return sb.toString();
    }

}
