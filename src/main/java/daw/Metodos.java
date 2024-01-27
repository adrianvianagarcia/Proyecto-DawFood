/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Óscar
 */
public class Metodos {

    public static String mostrarProducto(ArrayList<Productos> lista) {
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (lista.get(i).getDescripcion()
                    + " " + lista.get(i).getPrecioBase() + ("\n"));
        }
        return aux;
    }
    
    public static String mostrarProductoCarrito(ArrayList<ProductoCarrito> lista) {
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (lista.get(i).getDescripcion()
                    + " -- " + lista.get(i).getPrecioBase()+"€ -- "+ lista.get(i).getCantidad() +"uds -- "+lista.get(i).getPrecioTotal()+ "€" +("\n"));
        }
        return aux;
    }

    public static boolean pasarelaDePago(ArrayList<TarjetasDeCredito> baseDatosTarjetas) {
        boolean compraValida = false;
        for (int i = 0; i < baseDatosTarjetas.size(); i++) {
            if (baseDatosTarjetas.get(i).verificarNumeroTarjeta(baseDatosTarjetas, MenusDeOpciones.solicitarNumTarjeta()) == true) {
                if (baseDatosTarjetas.get(i).verificarCVV(baseDatosTarjetas, MenusDeOpciones.solicitarCVV()) == true) {
                    if (baseDatosTarjetas.get(i).verificarFechaCaducidad(baseDatosTarjetas,MenusDeOpciones.solicitarFechaCaducidad())==true) {
                        compraValida=true;
                        break;
                    }
                }
            }
        }
        return compraValida;
    }

}
