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
                                opcion=3;
                                break;
                            }else if(opcionHamburguesa.equals("Hamburguesa queso")){
                                productoElegido=opcionHamburguesa;
                                opcion=3;
                                break;
                            }
                        } while (opcionHamburguesa!=("Volver"));
                        break;
                    }
                    case 1 -> {//pizzas
                        Object opcionPizza;
                        do {
                            opcionPizza = selectorPizzas();
                            if (opcionPizza.equals("Pizza margarita")) {
                                productoElegido = opcionPizza;
                                opcion = 3;
                                break;
                            } else if (opcionPizza.equals("Pizza queso")) {
                                productoElegido = opcionPizza;
                                opcion = 3;
                                break;
                            }
                        } while (opcionPizza != ("Volver"));
                    }
                    case 2 -> {//kebabs
                        Object opcionKebab;
                        do {
                            opcionKebab = selectorKebab();
                            if (opcionKebab.equals("Kebab simple")) {
                                productoElegido = opcionKebab;
                                opcion = 3;
                                break;
                            } else if (opcionKebab.equals("Taco frances")) {
                                productoElegido = opcionKebab;
                                opcion = 3;
                                break;
                            }
                        } while (opcionKebab != ("Volver"));
                    }
                    case 3 -> {//volver
                        break;
                    }
                }
        }while(opcion!=3);

        return productoElegido;
    }
    public static Object selectorBebidas() {//devuelve directamente el id del producto
        int opcion;
        Object productoElegido = "Volver";
        do {
            opcion = JOptionPane.showOptionDialog(null, "¿Qué desea comer?",
                    "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Refresco", "Cervezas", "Agua", "Volver"}, null);
            switch (opcion) {
                case 0 -> {//hamburguesas
                    Object opcionRefresco;
                    do {
                        opcionRefresco = selectorHamburguesas();
                        if (opcionRefresco.equals("Hamburguesa simple")) {
                            productoElegido = opcionRefresco;
                            opcion = 3;
                            break;
                        } else if (opcionRefresco.equals("Hamburguesa queso")) {
                            productoElegido = opcionRefresco;
                            opcion = 3;
                            break;
                        }
                    } while (opcionRefresco != ("Volver"));
                    break;
                }
                case 1 -> {//pizzas
                    Object opcionCerveza;
                    do {
                        opcionCerveza = selectorHamburguesas();
                        if (opcionCerveza.equals("Pizza margarita")) {
                            productoElegido = opcionCerveza;
                            opcion = 3;
                            break;
                        } else if (opcionCerveza.equals("Pizza queso")) {
                            productoElegido = opcionCerveza;
                            opcion = 3;
                            break;
                        }
                    } while (opcionCerveza != ("Volver"));
                }
                case 2 -> {//kebabs
                    Object opcionAgua;
                    do {
                        opcionAgua = selectorHamburguesas();
                        opcion=3;
                    } while (opcionAgua != ("Volver"));
                }
                case 3 -> {//volver
                    break;
                }
            }
        } while (opcion != 3);

        return productoElegido;
    }
public static Object selectorPostres(){//devuelve directamente el id del producto
        int opcion;
        Object productoElegido="Volver";
        do{
            opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                    "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
                switch (opcion) {
                    case 0 -> {//hamburguesas
                        Object opcionRefresco;
                        do {
                            opcionRefresco = selectorHamburguesas();
                            if(opcionRefresco.equals("Hamburguesa simple")){
                                productoElegido=opcionRefresco;
                                opcion=3;
                                break;
                            }else if(opcionRefresco.equals("Hamburguesa queso")){
                                productoElegido=opcionRefresco;
                                opcion=3;
                                break;
                            }
                        } while (opcionRefresco!=("Volver"));
                        break;
                    }
                    case 1 -> {//pizzas
                        Object opcionPizza;
                        do {
                            opcionPizza = selectorPizzas();
                            if (opcionPizza.equals("Pizza margarita")) {
                                productoElegido = opcionPizza;
                                opcion = 3;
                                break;
                            } else if (opcionPizza.equals("Pizza queso")) {
                                productoElegido = opcionPizza;
                                opcion = 3;
                                break;
                            }
                        } while (opcionPizza != ("Volver"));
                    }
                    case 2 -> {//kebabs
                        Object opcionKebab;
                        do {
                            opcionKebab = selectorKebab();
                            if (opcionKebab.equals("Kebab simple")) {
                                productoElegido = opcionKebab;
                                opcion = 3;
                                break;
                            } else if (opcionKebab.equals("Taco frances")) {
                                productoElegido = opcionKebab;
                                opcion = 3;
                                break;
                            }
                        } while (opcionKebab != ("Volver"));
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
    public static Object selectorKebab() {
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione un Kebab",
                "Kebabs",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Kebab simple", "Taco frances", "Volver"},
                null);
        return seleccion;
    }
    public static Object selectorPizzas() {
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione una Pizza",
                "Pizzas",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Pizza Margarita", "Pizza de queso", "Volver"},
                null);
        return seleccion;
    }
        public static Object selectorRefrescos(){
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione un Refresco",
                "Refrescos",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Coca-Cola", "Fanta de Naranja","Volver"},
                null);
        return seleccion;
    }
    public static Object selectorCervezas() {
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione una Cerveza",
                "Cervezas",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Cerveza Mahou", "Cerveza Heineken", "Volver"},
                null);
        return seleccion;
    }
        public static Object selectorAguas(){
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione un Agua",
                "Aguas",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"Agua","Volver"},
                null);
        return seleccion;
    }
}
