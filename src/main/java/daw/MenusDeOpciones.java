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
    
    public static Object selectorDeUsuarios(){
            Object opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione un usuario o apague el tpv",
                    "Selector de usuarios",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    new Object[]{"Cliente", "Administrador","Apagar TPV"},
                    null);
        return opcion;
}
    public static int selectorDeProducto(){
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea ver?",
                 "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Comida", "Bebida", "Postre", "Volver"}, null);
        return opcion;
        }
    public int selectorComidas(){
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea comer?",
                "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hamburguesa", "Kebab", "Pizza", "Volver"}, null);
        return opcion;
    }
    
    public int selectorHamburguesas(ArrayList cesta){
        int idProducto;
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione una Hamburguesa",
                "Hamburguesas",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Hamburguesa simple", "Hamburguesa queso",},
                null);
        if (seleccion.equals(1)) {
            Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                    3.5, "Hamburguesa simple", 1, 0.1);
            cesta.add(hamburguesaSimple);
        } else {
            JOptionPane.showMessageDialog(null, "Su eleccion es" + seleccion);
        }
        return 0;
    }
    
        public int selectorBebidas(){
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                "Selector bebida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refresco", "Cerveza", "Agua", "Volver"}, null);
        return opcion;
    }
}
