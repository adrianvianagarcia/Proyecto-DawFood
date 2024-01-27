/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Óscar
 */
public class MenusDeOpciones {

    public static Object selectorDeUsuarios() {
        Object opcion = JOptionPane.showInputDialog(
                null,
                "Seleccione un usuario o apague el tpv",
                "Selector de usuarios",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Cliente", "Administrador", "Apagar TPV"},
                null);
        return opcion;
    }

    public static int selectorDeProducto() {
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea ver?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Comida", "Bebida", "Postre", "Carrito", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeProductoAdmin() {
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de producto",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Comida", "Bebida", "Postre", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeAtributo() {
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué atributo desea cambiar?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Precio", "Descripcion", "Iva", "Volver"}, null);
        return opcion;
    }

    //COMIDAS
    public static int selectorComidas() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea comer?",
                "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hamburguesa", "Pizza", "Kebab", "Volver"}, null);
        return opcion;
    }

    public static int selectorComidasAdmin() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hamburguesa", "Pizza", "Kebab", "Volver"}, null);
        return opcion;
    }

    public static int selectorBebidas() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
        return opcion;
    }

    public static int selectorBebidasAdmin() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
        return opcion;
    }

    public static int selectorPostres() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea tomar de postre?",
                "Selector postre", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Frutas", "Bolleria", "Yogures", "Volver"}, null);
        return opcion;
    }

    public static int selectorPostresAdmin() {//devuelve directamente el id del producto
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector postre", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Frutas", "Bolleria", "Yogures", "Volver"}, null);
        return opcion;
    }

    public static int selectorCarrito() {
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea ver?",
                "Carrito", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Ver productos en el carrito", "Eliminar producto",
                    "Pagar pedido", "Cancelar pedido", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeOpcionesAdmin() {
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Cambiar producto", "Nuevo producto", "Borrar producto", "Consultar ventas", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeCantidad() {
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                "Introduce una cantidad"));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduzca una opcion valida");
            }
        } while (opcion <= 0);
        return opcion;
    }

    public static ProductoCarrito selectorProducto(int idProducto, Catalogo catalogo, int cantidad) {
        ProductoCarrito producto = new ProductoCarrito();
        //busca el porducto y lo guarda en uno de tipo ProductoCarrito
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (catalogo.posElemento(i).getId() == idProducto) {
                producto.setPrecioBase(catalogo.catalogo.get(i).getPrecioBase());
                producto.setConsumible(catalogo.catalogo.get(i).getConsumible());
                producto.setDescripcion(catalogo.catalogo.get(i).getDescripcion());
                producto.setIva(catalogo.catalogo.get(i).getIva());
                producto.setCantidad(cantidad);
                producto.setPrecioTotal(cantidad * producto.getPrecioBase());
            }

        }
        return producto;
    }
    
    public static int solicitarCVV(){
        int Cvv=0; 
        String cvv=" ";
         boolean errorCvv=true;
        do{
            do{
                try{
                    cvv = (JOptionPane.showInputDialog("introduzca su cvv" + "\n" + " (tenga en cuenta que solo son tres digitos)"));
                    Cvv=Integer.parseInt(cvv);
                    errorCvv=false;
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"No has introducido valores numéricos"+"(\n)"+"Intentelo de nuevo");
                }
            }while(errorCvv);
        }while(cvv.length()!=3);
        
        return Cvv;
    }
    
    public static int solicitarNumTarjeta() {
        int NumTarjeta = 0;
        String numTarjeta = " ";
        boolean errorNumTarjeta = true;
        do {
            do {
                try {
                    numTarjeta = (JOptionPane.showInputDialog("introduzca su número de la tarjeta" + 
                            "\n" + " (tenga en cuenta que solo son los 4 últimos dígitos)"));
                    NumTarjeta = Integer.parseInt(numTarjeta);
                    errorNumTarjeta = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No has introducido valores numéricos" + "(\n)" + "Intentelo de nuevo");
                }
            } while (errorNumTarjeta);
        } while (numTarjeta.length() != 4);

        return NumTarjeta;
    }
    
    public static LocalDate solicitarFechaCaducidad() {
        //inicializamos variables para que el programa funcione
        LocalDate reserva = null;
        boolean errorFecha = true;
        int año = -125;
        int mes = 50;
        boolean errorFechaInt=true;
        //entrada de datos
        do{
            do{
                try {
                    año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de su fecha de caducidad"));
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de su fecha de caducidad"));
                    errorFechaInt=false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un caracter no númnerico");
                    errorFechaInt=true;
                }
            }while(errorFechaInt);
        //creacion de la fecha
                try {
                    reserva = LocalDate.of(año,mes,1);
                    errorFecha = false;
                } catch (DateTimeException dte) {
                    JOptionPane.showMessageDialog(null,"No ha introducido una fecha correcta");
                    errorFecha=true;
                }

        } while (año<0||(mes<0||mes>12));
        return reserva;
    }

}
