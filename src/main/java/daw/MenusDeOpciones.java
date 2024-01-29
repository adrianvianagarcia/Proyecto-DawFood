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

    public static Object selectorDeUsuarios() {//Menú principal (ojo, duevuelve un objeto que se llama igual que la opcion)
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

    public static int selectorDeProducto() {//Menu de selecion de productos
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea ver?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Comida", "Bebida", "Postre", "Carrito", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeProductoAdmin() {/*Menu de seleccion de productos
        del administrador para cuando quiera modificar// crear // borrar un producto*/
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de producto",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Comida", "Bebida", "Postre", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeAtributo() {/*Se utiliza en las funciones del
        administrador. selecciona el atributo que se quiere añadir//modificar*/
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué atributo desea cambiar?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Precio", "Descripcion", "Iva", "Stock", "Volver"}, null);
        return opcion;
    }
    public static int selectorFechasAdmin() {//El admin introduce la fecha por la que filtrar de las ventas
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Selecciones un periodo para consultar las ventas",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Dia concreto", "Hasta un fecha", "Todas las ventas", "Volver"}, null);
        return opcion;
    }
    //COMIDAS
    public static int selectorComidas() {//devuelve un int al que se le hace un switch en el tpv
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea comer?",
                "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hamburguesa", "Pizza", "Kebab", "Volver"}, null);
        return opcion;
    }

    public static int selectorComidasAdmin() {//devuelve un int al que se le hace un switch en el tpv
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector comida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hamburguesa", "Pizza", "Kebab", "Volver"}, null);
        return opcion;
    }

    public static int selectorBebidas() {//devuelve un int al que se le hace un switch en el tpv
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea beber?",
                "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
        return opcion;
    }

    public static int selectorBebidasAdmin() {//devuelve un int al que se le hace un switch en el tpv 
        //en los metodos del admin
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector bebidas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Refrescos", "Cervezas", "Agua", "Volver"}, null);
        return opcion;
    }

    public static int selectorPostres() {//devuelve un int al que se le hace un switch en el tpv
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea tomar de postre?",
                "Selector postre", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Frutas", "Bolleria", "Yogures", "Volver"}, null);
        return opcion;
    }

    public static int selectorPostresAdmin() {//devuelve un int al que se le hace un switch en el tpv 
        //en los metodos del admin
        int opcion;
        opcion = JOptionPane.showOptionDialog(null, "Seleccione el producto",
                "Selector postre", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Frutas", "Bolleria", "Yogures", "Volver"}, null);
        return opcion;
    }

    public static int selectorCarrito() {//devuelve un int al que se le hace un switch en el tpv 
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea ver?",
                "Carrito", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Ver productos en el carrito", "Eliminar producto",
                    "Pagar pedido", "Cancelar pedido", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeOpcionesAdmin() {//devuelve un int al que se le hace un switch en el tpv 
        //en los metodos del admi
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?",
                "Selector opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Cambiar producto", "Nuevo producto", "Borrar producto", "Consultar ventas", "Volver"}, null);
        return opcion;
    }

    public static int selectorDeCantidad() {/*Devuelve un int con el que se hará
        un setter a ProductoCarrito.setCantidad*/
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

    public static ProductoCarrito selectorProducto(int idProducto, Catalogo catalogo) {
        /*Es un metodo que funciona como un conversor de Productos a ProductoCarrito*/
        //variables
        ProductoCarrito producto = new ProductoCarrito();
        int IdProducto = idProducto;
        //busca el porducto y lo guarda en uno de tipo ProductoCarrito
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (catalogo.posElemento(i).getStock() == true && catalogo.posElemento(i).getId() == idProducto) {
                producto.setPrecioBase(catalogo.catalogo.get(i).getPrecioBase());
                producto.setConsumible(catalogo.catalogo.get(i).getConsumible());
                producto.setDescripcion(catalogo.catalogo.get(i).getDescripcion());
                producto.setIva(catalogo.catalogo.get(i).getIva());
            } else {

            }

        }
        return producto;
    }

    public static int solicitarCVV() {/*Metodo que devuelve un int que servirá para usarse 
        de CVV en las trajetas. Se utiliza principalmente en Metodos.pasarelaDePago*/
        //variables
        int Cvv = 0;
        String cvv = " ";
        boolean errorCvv = true;
        do {
            do {
                try {
                    cvv = (JOptionPane.showInputDialog("introduzca su cvv" + "\n" + " (tenga en cuenta que solo son tres digitos)"));
                    Cvv = Integer.parseInt(cvv);
                    errorCvv = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No has introducido valores numéricos" + "(\n)" + "Intentelo de nuevo");
                }
            } while (errorCvv);
        } while (cvv.length() != 3);

        return Cvv;
    }

    public static int solicitarNumTarjeta() {/*Metodo que devuelve un int que servirá para usarse 
        de número de tarjeta en las trajetas. Se utiliza principalmente en Metodos.pasarelaDePago*/
        //variables
        int NumTarjeta = 0;
        String numTarjeta = " ";
        boolean errorNumTarjeta = true;
        do {
            do {
                try {
                    numTarjeta = (JOptionPane.showInputDialog("introduzca su número de la tarjeta"
                            + "\n" + " (tenga en cuenta que solo son los 4 últimos dígitos)"));
                    NumTarjeta = Integer.parseInt(numTarjeta);
                    errorNumTarjeta = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No has introducido valores numéricos" + "(\n)" + "Intentelo de nuevo");
                }
            } while (errorNumTarjeta);
        } while (numTarjeta.length() != 4);

        return NumTarjeta;
    }

    public static LocalDate solicitarFechaCaducidad() {/*Metodo que devuelve un LocalDate que servirá para usarse 
        de fecha de caducidad en las trajetas. Se utiliza principalmente en Metodos.pasarelaDePago*/
        //inicializamos variables para que el programa funcione
        LocalDate reserva = null;
        boolean errorFecha = true;
        int año = -125;//son valores por defectos que NO pueden aplicarse ni como año
        int mes = 50;//Ni como mes
        boolean errorFechaInt = true;
        //entrada de datos
        do {
            do {
                try {
                    año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de su fecha de caducidad"));
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de su fecha de caducidad"));
                    errorFechaInt = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un caracter no númnerico");
                    errorFechaInt = true;
                }
            } while (errorFechaInt);
            //creacion de la fecha
            try {
                reserva = LocalDate.of(año, mes, 1);
                errorFecha = false;
            } catch (DateTimeException dte) {
                JOptionPane.showMessageDialog(null, "No ha introducido una fecha correcta");
                errorFecha = true;
            }

        } while (año < 0 || (mes < 0 || mes > 12));
        return reserva;
    }

    public static void menuBorrarProducto(int eleccion, String listaProductosCatalogo, Catalogo catalogo) {
        /*Es un menu que borrará un objeto de tipo Producto. Se utiliza en las 
        funciones de administrador, dentro del tpv*/
        do {
            try {
                eleccion = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                listaProductosCatalogo));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduzca una opcion valida");
            }
        } while (eleccion <= 0 || eleccion > catalogo.tamañoCatalogo());
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (eleccion == (catalogo.posElemento(i).getId())) {
                catalogo.borrarProductoExistente(i);
                break;
            }
        }
        
    }

    public static void menuAñadirProducto(int opcionMenuTipoProducto, Productos p1, Catalogo catalogo) {
        switch (opcionMenuTipoProducto) {//Menu que CREA un nuevo producto. Utilizado por el admin
            case 0 -> {
                p1.setTipo(TipoProducto.COMIDA);
                int opcionMenuComida = MenusDeOpciones.selectorComidasAdmin();
                switch (opcionMenuComida) {
                    case 0 -> {
                        p1.setConsumible(Consumibles.HAMBURGUESA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 1 -> {
                        p1.setConsumible(Consumibles.PIZZA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 2 -> {
                        p1.setConsumible(Consumibles.KEBAB);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                }
            }
            case 1 -> {
                p1.setTipo(TipoProducto.BEBIDA);
                int opcionMenuBebida = MenusDeOpciones.selectorBebidasAdmin();
                switch (opcionMenuBebida) {
                    case 0 -> {
                        p1.setConsumible(Consumibles.REFRESCO);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 1 -> {
                        p1.setConsumible(Consumibles.CERVEZA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 2 -> {
                        p1.setConsumible(Consumibles.AGUA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                }
            }
            case 2 -> {
                p1.setTipo(TipoProducto.POSTRE);
                int opcionMenuPostre = MenusDeOpciones.selectorPostresAdmin();
                switch (opcionMenuPostre) {
                    case 0 -> {
                        p1.setConsumible(Consumibles.FRUTA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 1 -> {
                        p1.setConsumible(Consumibles.BOLLERIA);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }
                    case 2 -> {
                        p1.setConsumible(Consumibles.YOGURES);
                        pedirDatosProducto(p1, catalogo);
                        catalogo.guardarElemento(p1);
                    }

                }

            }

        }
    }

    public static void cambiarPorducto(String listaProductosCatalogo, int eleccion, Catalogo catalogo) {
        do {//metodo que cambia los datos de los objetos
            try {
                eleccion = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                listaProductosCatalogo));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduzca una opcion valida");
            }
        } while (eleccion <= 0 || eleccion > catalogo.tamañoCatalogo());
        int opcion = 0;
        int i;
        for (i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (eleccion == (catalogo.posElemento(i).getId())) {
                opcion = MenusDeOpciones.selectorDeAtributo();
                break;
            }
        }

        switch (opcion) {
            case 0 -> {
                double precioNuevo = 0;
                boolean repetir;
                do {
                    do {
                        try {
                            precioNuevo = Double.parseDouble(
                                    JOptionPane.showInputDialog(null,
                                            "¿Cual va a ser el nuevo precio?"));
                            repetir = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null,
                                    "Introduzca una opcion valida");
                            repetir = true;
                        }
                    } while (repetir);
                } while (precioNuevo <= 0);
                catalogo.posElemento(i).setPrecioBase(precioNuevo);
            }

            case 1 -> {
                String descripcionNueva = JOptionPane.showInputDialog(null,
                        "¿Cual va a ser la nueva descripcion?");
                catalogo.posElemento(i).setDescripcion(descripcionNueva);
            }

            case 2 -> {
                double ivaNuevo = 0;
                boolean repetir;
                do {
                    try {
                        ivaNuevo = Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                        "¿Cual va a ser el nuevo iva? (Formato 0.)"));
                        repetir = false;
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null,
                                "Introduzca una opcion valida");
                        repetir = true;
                    }
                } while (repetir);
                catalogo.posElemento(i).setIva(ivaNuevo);
                catalogo.posElemento(i).setPrecioBase(catalogo.posElemento(i)
                        .getPrecioBase() + (catalogo.posElemento(i).getPrecioBase() * ivaNuevo));
            }

            case 3 -> {
                int cambiarEstado = 0;

                cambiarEstado = JOptionPane.showOptionDialog(null, "¿cual va a ser el nuevo estado del stock?",
                        "Selector de estado de stock", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Hay stock", "Sin stock", "Volver"}, null);
                switch (cambiarEstado) {
                    case 0 -> {
                        catalogo.posElemento(i).setStock(true);
                        break;
                    }
                    case 1 -> {
                        catalogo.posElemento(i).setStock(false);
                        break;
                    }
                    case 2 -> {
                        break;
                    }
                }

            }
        }

    }

    public static void pedirDatosProducto(Productos p1, Catalogo c1) {/*Metodo
        que pide las datos del producto con el fin de utilizarse en otros metodos,
        como añadir producto o modificar producto*/
        //variable
        double precio = 0;
        boolean repetir;
        do {
            do {
                try {
                    precio = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Introduzca el precio"));
                    repetir = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Introduzca una opcion valida");
                    repetir = true;
                }
            } while (repetir);
        } while (precio <= 0);
        p1.setPrecioBase(precio);

        String descripcion = JOptionPane.showInputDialog(null, "Introduzca la descripcion");
        p1.setDescripcion(descripcion);

        double iva = 0;
        do {
            try {
                iva = Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                                "Introduzca el iva (Formato 0."));
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduzca una opcion valida");
                repetir = true;
            }
        } while (repetir);
        p1.setIva(iva);
        Integer cambiarEstado = JOptionPane.showOptionDialog(null, "Establezca el stock del producto",
                "Selector de estado de stock", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Hay stock", "Sin stock"}, null);
        if (cambiarEstado.equals(0)) {
            p1.setStock(true);
        } else {
            p1.setStock(false);
        }

        p1.setId(c1.tamañoCatalogo() + 1);
    }

    public static LocalDate solicitarFechaVenta() { /*Devuelve una fecha que se 
        utilizará para filtrar la busqueda de ventas hasta una fecha concreta*/
        //inicializamos variables para que el programa funcione
        LocalDate diaConcreto = null;
        boolean errorFecha = true;
        int año = 0;
        int mes = 0;
        int dia = 0;
        boolean errorFechaInt = true;
        //entrada de datos
        do {
            do {
                try {
                    año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año"));
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes"));
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia"));
                    errorFechaInt = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un caracter no númnerico");
                    errorFechaInt = true;
                }
            } while (errorFechaInt);
            //creacion de la fecha
            try {
                diaConcreto = LocalDate.of(año, mes, dia);
                errorFecha = false;
            } catch (DateTimeException dte) {
                JOptionPane.showMessageDialog(null, "No ha introducido una fecha correcta");
                errorFecha = true;
            }

        } while (año < 0 || (mes <= 0 || mes > 12) || (dia <= 0 || dia > 31));
        return diaConcreto;
    }

}

