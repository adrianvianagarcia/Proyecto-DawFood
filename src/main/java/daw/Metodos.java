/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author Óscar
 */
public class Metodos{
    
    public static String mostrarArrayList(ArrayList<Productos> lista) {
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += ("Posición " + i + " -- " + lista.get(i) + ("\n"));
        }
        return aux;
    }
    
}