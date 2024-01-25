/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
    
    public static int selectorDeCantidad(){
        int opcion=0;
        boolean errorOpcion=true;
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad"));
                while(opcion<=0){
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("No puede introducir ni valores negativos ni nulos"+("\n")+
                            "Inténtalo de nuevo"));
                }
                errorOpcion=false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Ha seleccionado una opcion no válida"+("\n")+
                        "Inténtalo de nuevo");
            }
        }while(errorOpcion);
        return opcion;
    }
    
    public static Productos selectorProducto(int idProducto,Catalogo catalogo,int cantidad){
        Productos producto=new Productos();
        for(int i=0;i<catalogo.tamañoCatalogo();i++){
            if(catalogo.posElemento(i).getId()==idProducto){
                producto=catalogo.catalogo.get(i);
                producto.setCantidad(cantidad);
            }
        }
        return producto;
    }
    
}
