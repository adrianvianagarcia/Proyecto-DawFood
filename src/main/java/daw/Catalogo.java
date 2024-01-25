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
    
    public int tamañoCatalogo(){
        return catalogo.size();
    }
    
    public Productos posElemento(int pos){
        return catalogo.get(pos);
    }
    
    public Consumibles obtenerClase(int pos){
        return catalogo.get(pos).getConsumible();
    }
    
    public static String mostrarProducto(Catalogo c1) {
        String aux = "";
        for (int i = 0; i < c1.tamañoCatalogo(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (c1.posElemento(i).getId()+" "+ c1.posElemento(i).getDescripcion()
                    +("\n"));
        }
        return aux;
    }

}
