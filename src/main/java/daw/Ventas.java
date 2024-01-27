/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Óscar
 */
public class Ventas {
    
    ArrayList<Ticket> ventas =new ArrayList();

    public Ventas() {
    }
    

    public int tamañoVentas() {
        return ventas.size();
    }

    public Ticket posElemento(int pos) {
        return ventas.get(pos);
    }

    public static String mostrarProducto(Ventas c1) {
        String aux = "";
        for (int i = 0; i < c1.tamañoVentas(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (c1.posElemento(i).getId() + " " + c1.posElemento(i)
                    + ("\n"));
        }
        return aux;
    }
    
}
