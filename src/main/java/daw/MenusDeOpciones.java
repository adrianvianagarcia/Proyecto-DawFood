/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
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
                new Object[]{"Comida", "Bebida", "Postre","Carrito", "Volver"}, null);
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

    public static int selectorBebidas() {//devuelve directamente el id del producto
        int opcion;
            opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                    "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
        return opcion;
    }

    public static Object selectorPostres() {//devuelve directamente el id del producto
        int opcion;
            opcion = JOptionPane.showOptionDialog(null, "¿Qué desea tomar de postre?",
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
                    "Pagar pedido","Cancelar pedido", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeOpcionesAdmin() {
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Cambiar producto", "Nuevo producto", "Borrar producto","Consultar ventas", "Volver"}, null);
        return opcion;
    }
    
}
