package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.UUID;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Tpv {

    private final UUID numeroDeSerie;
    private String localizacion;
    private final LocalDateTime fechaActual;
    private final String contraseña;

    public Tpv(String localizacion) {
        this.numeroDeSerie = UUID.randomUUID();
        this.localizacion = localizacion;
        this.fechaActual = LocalDateTime.now();
        this.contraseña = generarContraseña();
    }

    public String generarContraseña() {

        Random r = new Random();

        char minuscula = (char) r.nextInt(97, 123);
        char mayuscula = (char) r.nextInt(65, 91);
        char numero = (char) r.nextInt(48, 58);
        String caracterEspecial = RandomStringUtils.random(1, '#', '$',
                '%', '&', '(', ')', '*', '+', '-', '.',
                ':', ';', '<', '=', '>', '@');

        String caracter5y6 = RandomStringUtils.randomNumeric(2);

        String caracter1 = Character.toString(minuscula);
        String caracter2 = Character.toString(mayuscula);
        String caracter3 = Character.toString(numero);

        String contraseña = caracter1 + caracter2 + caracter3 + caracterEspecial
                + caracter5y6;

        return contraseña;
    }

    public boolean verifContraseña(String contraseñaUser, String contraseña) {
        boolean errorContra = true;
        if (contraseñaUser.equalsIgnoreCase(contraseña)) {
            errorContra = false;
        }
        return errorContra;
    }

    public void encenderTPV() throws InterruptedException {
        //Creamos todos los productos
        Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                3.5, "Hamburguesa simple", 1, 0.1, 0, 0);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2, 0.1, 0, 0);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Kebab simple", 3, 0.1, 0, 0);

        Productos tacoFrances = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Taco frances", 4, 0.1, 0, 0);

        Productos pizzaMargarita = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                5, "Pizza margarita", 5, 0.1, 0, 0);

        Productos pizzaQueso = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                4, "Pizza de queso", 6, 0.1, 0, 0);

        Productos cocaCola = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Coca-Cola", 7, 0.21, 0, 0);

        Productos fantaNaranja = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Fanta de Naranja", 8, 0.21, 0, 0);

        Productos cervezaMahou = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Mahou", 9, 0.21, 0, 0);

        Productos cervezaHeineken = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Heineken", 10, 0.21, 0, 0);

        Productos agua = new Productos(TipoProducto.BEBIDA, Consumibles.AGUA,
                1.5, "Agua", 11, 0.1, 0, 0);

        Productos tartaQueso = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                4, "Tarta de Queso", 12, 0.1, 0, 0);

        Productos donut = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                3, "Donut Glasé", 13, 0.1, 0, 0);

        Productos platano = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Platano", 14, 0.1, 0, 0);

        Productos manzana = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Manzana", 15, 0.1, 0, 0);

        Productos yogurCoco = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de coco", 16, 0.1, 0, 0);

        Productos yogurFresa = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de fresa", 17, 0.1, 0, 0);

        /*Creo un arrayList de mis objectos*/
        Catalogo catalogo = new Catalogo();
        //comida
        catalogo.guardarElemento(hamburguesaQueso);
        catalogo.guardarElemento(hamburguesaSimple);
        catalogo.guardarElemento(kebabSimple);
        catalogo.guardarElemento(tacoFrances);
        catalogo.guardarElemento(pizzaMargarita);
        catalogo.guardarElemento(pizzaQueso);
        //bebida
        catalogo.guardarElemento(agua);
        catalogo.guardarElemento(fantaNaranja);
        catalogo.guardarElemento(cocaCola);
        catalogo.guardarElemento(cervezaHeineken);
        catalogo.guardarElemento(cervezaMahou);
        //postre
        catalogo.guardarElemento(tartaQueso);
        catalogo.guardarElemento(donut);
        catalogo.guardarElemento(platano);
        catalogo.guardarElemento(manzana);
        catalogo.guardarElemento(yogurCoco);
        catalogo.guardarElemento(yogurFresa);
        catalogo.ordenarPorId();
        Cesta cesta = new Cesta();
        Object user;
        /*intento de gestion de error*/
            boolean errorUser=true;
             do{
                try{
                   user = MenusDeOpciones.selectorDeUsuarios(); 
                }catch(NullPointerException npe){
                    int opcion = JOptionPane.showOptionDialog(null, "Parece"
                            + " que no ha seleccionado ninguna opción, ¿desea salir?", "¿Que desea?",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{"Salir", "Volver al menú principal"}, null);
                    if (opcion == 0) {
                        user = "Apagar TPV";
                        errorUser=false;
                        break;
                    } else {
                        user = "?";
                        errorUser=false;
                        break;
                    }
            }

            if (user.equals("Cliente")) {
                int opcionMenu;
                do {
                    opcionMenu = MenusDeOpciones.selectorDeProducto();
                    switch (opcionMenu) {
                        case 0 -> {//comida
                            //hamburguesas
                            Integer productoElegido = MenusDeOpciones.selectorComidas();
                            if (productoElegido.equals(null)) {
                                productoElegido = 3;
                            }
                            switch (productoElegido) {
                                case 0 -> {//hamburguesas
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.HAMBURGUESA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 1 -> {//Pizzas
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.PIZZA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 2 -> {//kebabs
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.KEBAB, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 3 -> {//volver
                                    break;
                                }
                            }
                        }

                        case 1 -> {//bebida
                            int productoElegido = MenusDeOpciones.selectorBebidas();
                            switch (productoElegido) {
                                case 0 -> {//refrescos
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.REFRESCO, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 1 -> {//Cervezas
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.CERVEZA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 2 -> {//Agua
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.AGUA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 3 -> {//volver
                                    break;
                                }
                                default ->{
                                    break;
                                }
                            }
                        }

                        case 2 -> {//postres
                            int productoElegido = MenusDeOpciones.selectorPostres();
                            switch (productoElegido) {
                                case 0 -> {//frutas
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.FRUTA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 1 -> {//bolleria
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.BOLLERIA, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 2 -> {//yogures
                                    String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.YOGURES, catalogo);
                                    JOptionPane.showInputDialog(menuHamburguesa);
                                }
                                case 3 -> {//volver
                                    break;
                                }
                            }
                        }
                        case 3 -> {//carrito
                            Integer opcionCarrito = MenusDeOpciones.selectorCarrito();
                            if (opcionCarrito.equals(null)) {
                                opcionCarrito = 4;
                            }
                            switch (opcionCarrito) {
                                case 0 -> {

                                }
                                case 1 -> {

                                }
                                case 2 -> {

                                }
                                case 3 -> {

                                }
                                case 4 -> {
                                    break;
                                }
                            }
                        }
                        case 4 -> {
                            break;
                        }
                    }
                } while (opcionMenu != 4);
            } else if (user.equals("Administrador")) {
                String contraseña = generarContraseña();
                System.out.println("La contraseña del TPV es: " + contraseña);
                String contraseñaUser;
                do {
                    contraseñaUser = JOptionPane.showInputDialog(null,
                            "Introduce la contraseña del TPV: ");
                } while (verifContraseña(contraseñaUser, contraseña) == true);
                int opcionMenu;
                do {
                    opcionMenu = MenusDeOpciones.selectorDeOpcionesAdmin();
                    switch (opcionMenu) {
                        case 0 -> {//cambiarProducto
                            String listaProductosCatalogo = Catalogo.mostrarProducto(catalogo);
                            int eleccion = Integer.parseInt(
                                    JOptionPane.showInputDialog(null,
                                            listaProductosCatalogo));
                            int i;
                            for (i = 0; i < catalogo.tamañoCatalogo(); i++) {
                                if (eleccion == (catalogo.posElemento(i).getId())) {
                                    MenusDeOpciones.selectorDeAtributo();
                                    break;
                                }
                            }

                            System.out.println(catalogo.posElemento(i));
                            int precioNuevo = Integer.parseInt(
                                    JOptionPane.showInputDialog(null,
                                            "¿Cual va a ser el nuevo precio?"));
                            catalogo.posElemento(i).setPrecioBase(precioNuevo);
                            System.out.println(catalogo.posElemento(i));

                        }


                        case 1 -> {//nuevoProducto
                            Productos p1 = new Productos();
                            int opcionMenuTipoProducto = MenusDeOpciones.selectorDeProductoAdmin();
                            switch (opcionMenuTipoProducto) {
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
                                        case 1 ->{
                                            p1.setConsumible(Consumibles.BOLLERIA);
                                            pedirDatosProducto(p1, catalogo);
                                            catalogo.guardarElemento(p1);
                                        }
                                        case 2 ->{
                                            p1.setConsumible(Consumibles.YOGURES);
                                            pedirDatosProducto(p1, catalogo);
                                            catalogo.guardarElemento(p1);
                                        }
                                    }
                                }
                            }
                        }

                        case 2 -> {//borrarProducto
                            String listaProductosCatalogo = Catalogo.mostrarProducto(catalogo);
                            int eleccion = Integer.parseInt(
                                    JOptionPane.showInputDialog(null,
                                            listaProductosCatalogo));
                            int i;
                            for (i = 0; i < catalogo.tamañoCatalogo(); i++) {
                                if (eleccion == (catalogo.posElemento(i).getId())) {
                                    break;
                                }
                            }

                            catalogo.borrarProductoExistente(i);

                        }

                        case 3 -> {//consultarVeentas

                        }
                        case 4 -> {//volver
                            break;
                        }

                    }
                } while (opcionMenu != 4);
            }else{
                apagarTVP();
            }
        } while (user != "Apagar TPV");

    }

    public void apagarTVP() throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Se apagará el TPV");
    }

    public String mostrarProductosPorCategoria(Consumibles c1, Catalogo catalogo) {
        String aux = "";
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (catalogo.posElemento(i).getConsumible().equals(c1)) {
                aux += (catalogo.posElemento(i) + ("\n"));
            }
        }
        return aux;
    }

    public void pedirDatosProducto(Productos p1, Catalogo c1) {
        int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el precio"));
        p1.setPrecioBase(precio);

        String descripcion = JOptionPane.showInputDialog(null, "Introduzca la descripcion");
        p1.setDescripcion(descripcion);

        double iva = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el iva"));
        p1.setIva(iva);

        p1.setCantidad(0);

        p1.setId(c1.tamañoCatalogo() + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tpv{");
        sb.append("numeroDeSerie=").append(numeroDeSerie);
        sb.append(", localizacion=").append(localizacion);
        sb.append(", fechaActual=").append(fechaActual);
        sb.append(", contraseña=").append(contraseña);
        sb.append('}');
        return sb.toString();
    }

}
