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
    //COMIDAS
    public static Object selectorComidas(){//devuelve directamente el id del producto
        int opcion;
        Object productoElegido="Volver";
        do{
            opcion = JOptionPane.showOptionDialog(null, "¿Qué desea comer?",
                    "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Hamburguesa", "Kebab", "Pizza", "Volver"}, null);
                switch (opcion) {
                    case 0 -> {//hamburguesas
                        Object opcionHamburguesa;
                        do {
                            opcionHamburguesa = selectorHamburguesas();
                            if(opcionHamburguesa.equals("Hamburguesa simple")){
                                productoElegido=opcionHamburguesa;
                                break;
                            }else if(opcionHamburguesa.equals("Hamburguesa queso")){
                                productoElegido=opcionHamburguesa;
                                break;
                            }
                        } while (opcionHamburguesa!=("Volver"));
                        break;
                    }
                    case 1 -> {//pizzas

                    }
                    case 2 -> {//kebabs

                    }
                    case 3 -> {//volver
                        break;
                    }
                }
        }while(opcion!=3);

        return productoElegido;
    }
    
    public static Object selectorHamburguesas(){
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione una Hamburguesa",
                "Hamburguesas",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Hamburguesa simple", "Hamburguesa queso","Volver"},
                null);
        return seleccion;
    }
    
        public static int selectorBebidas(){
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                "Selector bebida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refresco", "Cerveza", "Agua", "Volver"}, null);
        return opcion;
    }
}
