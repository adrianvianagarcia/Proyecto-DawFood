package daw;

import java.time.LocalDate;
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
        if (contraseñaUser.equals(
                contraseña)) {
            errorContra = false;
        }
        return errorContra;
    }

    public void encenderTPV() throws InterruptedException {
        final int diaMes = 1;
        // inicializamos las ventas
        Ventas ventas = new Ventas();
        //creamos todas las tarjetas
        TarjetasDeCredito t1 = new TarjetasDeCredito(7785, LocalDate.of(2027, 9, diaMes), 987, "Óscar Morales", 200.00);
        TarjetasDeCredito t2 = new TarjetasDeCredito(0000, LocalDate.of(2027, 12, diaMes), 000, "Adrian Viana", 100.00);
        TarjetasDeCredito t3 = new TarjetasDeCredito(8956, LocalDate.of(2027, 5, diaMes), 899, "Jose antonio acebedo", 59.95);
        TarjetasDeCredito t4 = new TarjetasDeCredito(1234, LocalDate.of(2027, 7, diaMes), 123, "Vico", 100.00);
        TarjetasDeCredito t5 = new TarjetasDeCredito(4567, LocalDate.of(2027, 1, diaMes), 456, "Eva María", 25.00);
        //creamos su BBDD
        baseDatosTarjetas BBDDTarjetas = new baseDatosTarjetas();
        BBDDTarjetas.baseDatosTarjetas.add(t1);
        BBDDTarjetas.baseDatosTarjetas.add(t2);
        BBDDTarjetas.baseDatosTarjetas.add(t3);
        BBDDTarjetas.baseDatosTarjetas.add(t4);
        BBDDTarjetas.baseDatosTarjetas.add(t5);
        //Creamos todos los productos
        Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                3.5, "Hamburguesa simple", 1, 0.1, true);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2, 0.1, true);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Kebab simple", 3, 0.1, true);

        Productos tacoFrances = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Taco frances", 4, 0.1, true);

        Productos pizzaMargarita = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                5, "Pizza margarita", 5, 0.1, true);

        Productos pizzaQueso = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                4, "Pizza de queso", 6, 0.1, true);

        Productos cocaCola = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Coca-Cola", 7, 0.21, true);

        Productos fantaNaranja = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Fanta de Naranja", 8, 0.21, true);

        Productos cervezaMahou = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Mahou", 9, 0.21, true);

        Productos cervezaHeineken = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Heineken", 10, 0.21, true);

        Productos agua = new Productos(TipoProducto.BEBIDA, Consumibles.AGUA,
                1.5, "Agua", 11, 0.1, true);

        Productos tartaQueso = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                4, "Tarta de Queso", 12, 0.1, true);

        Productos donut = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                3, "Donut Glasé", 13, 0.1, true);

        Productos platano = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Platano", 14, 0.1, true);

        Productos manzana = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Manzana", 15, 0.1, true);

        Productos yogurCoco = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de coco", 16, 0.1, true);

        Productos yogurFresa = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de fresa", 17, 0.1, true);

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
        Carrito carrito = new Carrito();
        Object user;
        /*intento de gestion de error*/
        boolean errorUser = true;
        do {

            user = MenusDeOpciones.selectorDeUsuarios();

            if (user != null) {
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
                                        ArrayList<Integer> numValidos=new ArrayList();
                                        numValidos=Metodos.restriccionProducto(catalogo, Consumibles.HAMBURGUESA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.HAMBURGUESA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);

                                    }
                                    case 1 -> {//Pizzas
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.PIZZA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.PIZZA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 2 -> {//kebabs
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.KEBAB);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.KEBAB, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
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
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.REFRESCO);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.REFRESCO, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 1 -> {//Cervezas
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.CERVEZA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.CERVEZA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 2 -> {//Agua
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.AGUA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.AGUA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 3 -> {//volver
                                        break;
                                    }
                                    default -> {
                                        break;
                                    }
                                }
                            }

                            case 2 -> {//postres
                                int productoElegido = MenusDeOpciones.selectorPostres();
                                switch (productoElegido) {
                                    case 0 -> {//frutas
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.FRUTA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.FRUTA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 1 -> {//bolleria
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.BOLLERIA);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.BOLLERIA, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 2 -> {//yogures
                                        ArrayList<Integer> numValidos=new ArrayList();
                                         numValidos=Metodos.restriccionProducto(catalogo, Consumibles.YOGURES);
                                        String menuHamburguesa = mostrarProductosPorCategoria(Consumibles.YOGURES, catalogo);
                                        añadirProducto(menuHamburguesa, catalogo, carrito,numValidos);
                                    }
                                    case 3 -> {//volver
                                        break;
                                    }
                                }
                            }
                            case 3 -> {//carrito
                                Integer opcionCarrito=0;
                                do{
                                    opcionCarrito = MenusDeOpciones.selectorCarrito();
                                    switch (opcionCarrito) {
                                        case 0 -> {//Ver carrito
                                            JOptionPane.showMessageDialog(null, Metodos.mostrarProductoCarrito(carrito.carrito));
                                        }
                                        case 1 -> {//Borrar producto carrito
                                            carrito.ordenarPorId();
                                            String listaProductosCarrito = Carrito.mostrarProducto(carrito);
                                            int eleccion = 0;
                                            do {
                                                try {
                                                    eleccion = Integer.parseInt(
                                                            JOptionPane.showInputDialog(null,
                                                                    listaProductosCarrito));
                                                } catch (NumberFormatException nfe) {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Introduzca una opcion valida");
                                                }
                                            } while (eleccion <= 0 || eleccion > carrito.tamañoCarrito());
                                            int i;
                                            for (i = 0; i < carrito.tamañoCarrito(); i++) {
                                                if (eleccion == (carrito.posElemento(i).getId())) {
                                                    break;
                                                }
                                            }

                                            carrito.borrarProductoExistente(i);
                                        }
                                        case 2 -> {//Pagar el pedido

                                            TarjetasDeCredito tarjetaCliente = Metodos.pasarelaDePago(BBDDTarjetas.baseDatosTarjetas);
                                            double precioTotal = carrito.precioTotal();
                                            if (tarjetaCliente.getSaldo() < precioTotal) {
                                                carrito.carrito.clear();
                                                JOptionPane.showMessageDialog(null, "No tienes fondos suficientes para realizar la compra");
                                                break;
                                            }
                                            tarjetaCliente.setSaldo(tarjetaCliente.getSaldo() - precioTotal);
                                            Ticket ticket = new Ticket();
                                            ticket.generadorDeTicket(ticket, carrito);
                                            ventas.ventas.add(ticket);
                                            ticket.setId(ventas.tamañoVentas());
                                            ticket.estabelecerNumPedido(ventas.ventas);

                                            carrito.carrito.clear();

                                        }
                                        case 3 -> {//Cancelar pedido
                                            carrito.carrito.clear();
                                        }
                                        case 4 -> {//volver

                                            break;
                                        }
                                    }
                                }while(opcionCarrito!=4);
                            }
                            case 4 -> {
                                carrito.carrito.clear();
                                break;
                            }
                                
                        }
                    } while (opcionMenu != 4);

                } else if (user.equals("Administrador")) {
                    carrito.carrito.clear();
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
                                int eleccion = 0;
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
                            case 2 -> {//borrarProducto
                                String listaProductosCatalogo = Catalogo.mostrarProducto(catalogo);
                                int eleccion = 0;
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
                } else {
                    apagarTVP();
                }
            } else {
                Integer opcion = JOptionPane.showOptionDialog(null, "Parece"
                        + " que no ha seleccionado ninguna opción, ¿desea salir?", "¿Que desea?",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Salir", "Volver al menú principal"}, null);
                if (opcion.equals(0)) {
                    user = "Apagar TPV";
                    errorUser = false;
                    break;
                } else {

                    errorUser = false;
                }

            }
        } while (user != "Apagar TPV");

    }

    public void apagarTVP() throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Se apagará el TPV");
    }

    public String mostrarProductosPorCategoria(Consumibles c1, Catalogo catalogo) {
        String aux = "";
        for (int i = 0; i < catalogo.tamañoCatalogo(); i++) {
            if (catalogo.posElemento(i).getConsumible().equals(c1) && catalogo.posElemento(i).getStock() == true) {
                aux += (catalogo.posElemento(i) + ("\n"));
            }
        }
        return aux;
    }

    public void pedirDatosProducto(Productos p1, Catalogo c1) {
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

        p1.setId(c1.tamañoCatalogo() + 1);
    }

    public void añadirProducto(String menu, Catalogo catalogo, Carrito carrito,ArrayList<Integer> numValidos) {
        int producto = 0;
        boolean idInvalida=true;
        ProductoCarrito p1 = null;
            do {
            do {
                try {
                    producto = Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    menu));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Introduzca una opcion valida");
                }
            } while (producto <= 0 || producto > catalogo.tamañoCatalogo());
            for(Integer aux:numValidos){
                if(aux.equals(producto)){
                    idInvalida=false;
                    break;
                }
            }
        } while (idInvalida);
        p1=MenusDeOpciones.selectorProducto(producto, catalogo);
        int cantidad = MenusDeOpciones.selectorDeCantidad();
        p1.setId(carrito.tamañoCarrito());
        p1.setCantidad(cantidad);
        p1.setPrecioTotal(p1.getPrecioBase()*cantidad);
        carrito.carrito.add(p1);
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
