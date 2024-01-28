/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public static ArrayList<Integer> restriccionProducto(Catalogo catalogo,Consumibles consumible){
        ArrayList<Integer> numValidos=new ArrayList<>();
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if ((catalogo.posElemento(i).getConsumible()==consumible)&&catalogo.posElemento(i).getStock()==true) {
                numValidos.add(i+1);
            }
        }
        return numValidos;
    }

    public static String mostrarProductoCarrito(ArrayList<ProductoCarrito> lista) {
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            aux += (lista.get(i).getDescripcion()
                    + " -- " + lista.get(i).getPrecioBase() + "€ -- " + lista.get(i).getCantidad() + "uds -- " + lista.get(i).getPrecioTotal() + "€" + ("\n"));
        }
        return aux;
    }

    public static String mostrarTicketFecha(ArrayList<Ticket> lista, LocalDate fecha) {
        LocalDateTime Fecha;
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
            Fecha=LocalDateTime.of(fecha, 
                    LocalTime.of(lista.get(i).fechaPedido.getHour(), 
                    lista.get(i).fechaPedido.getMinute(), 
                    lista.get(i).fechaPedido.getSecond(), 
                    lista.get(i).fechaPedido.getNano()));
            if(lista.get(i).getFechaPedido().equals(Fecha)){
                aux += (lista.get(i).toString() + ("\n"));
            }
        }
        return aux;
    }
    public static String mostrarAllTickets(ArrayList<Ticket> lista) {
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {/*Actualiza mi String y le añade
            todas las palabras en cada iteracion*/
                aux += (lista.get(i).toString() +("\n"));
        }
        return aux;
    }
    
    public static TarjetasDeCredito pasarelaDePago(ArrayList<TarjetasDeCredito> baseDatosTarjetas) {
        boolean compraValida = false;
        TarjetasDeCredito tarjeta = null;

        do {
            do {
                tarjeta = TarjetasDeCredito.verificarNumeroTarjeta(baseDatosTarjetas,
                        MenusDeOpciones.solicitarNumTarjeta());
                if (tarjeta == null) {
                    JOptionPane.showMessageDialog(null, "No se ha "
                            + "podido encontrar la tarjeta de credito, intentelo de nuevo");
                }

            } while (tarjeta == null);
            int cvv = MenusDeOpciones.solicitarCVV();

            if (cvv == tarjeta.getCvv()) {
                LocalDate fechaCaducidad = MenusDeOpciones.solicitarFechaCaducidad();

                if (fechaCaducidad.equals(tarjeta.getFechaCaducidad())) {
                    compraValida = true;
                }
            }
        } while (compraValida == false);

        return tarjeta;
    }

}
