package daw;

import java.util.ArrayList;
import java.util.Collections;

public class Catalogo {

    ArrayList<Productos> catalogo = new ArrayList<>();

    public void ordenarPorId() {
        Collections.sort(catalogo, (l1, l2) -> Integer.compare(l1.getId(),
                l2.getId()));
    }

    public void borrarProductoExistente(int id) {
        ordenarPorId();
        catalogo.remove(id);
    }
    
    public void guardarElemento(Productos p1) {
        catalogo.add(p1);
    }

}
