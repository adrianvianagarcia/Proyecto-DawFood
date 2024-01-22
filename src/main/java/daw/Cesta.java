package daw;

import java.util.ArrayList;

public class Cesta {

    ArrayList <Productos> cesta = new ArrayList<>();

    public void guardarElemento(Productos p1) {
        cesta.add(p1);
    }
    
    
}
