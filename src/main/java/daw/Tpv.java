package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
                3.5, "Hamburguesa simple", 1, 0.1, 0);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2, 0.1, 0);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Kebab simple", 3, 0.1, 0);

        Productos tacoFrances = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Taco frances", 4, 0.1, 0);

        Productos pizzaMargarita = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                5, "Pizza margarita", 5, 0.1, 0);

        Productos pizzaQueso = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                4, "Pizza de queso", 6, 0.1, 0);

        Productos cocaCola = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Coca-Cola", 7, 0.21, 0);

        Productos fantaNaranja = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Fanta de Naranja", 8, 0.21, 0);

        Productos cervezaMahou = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Mahou", 9, 0.21, 0);

        Productos cervezaHeineken = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Heineken", 10, 0.21, 0);

        Productos agua = new Productos(TipoProducto.BEBIDA, Consumibles.AGUA,
                1.5, "Agua", 11, 0.1, 0);

        Productos tartaQueso = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                4, "Tarta de Queso", 12, 0.1, 0);

        Productos donut = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                3, "Donut Glasé", 13, 0.1, 0);

        Productos platano = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Platano", 14, 0.1, 0);

        Productos manzana = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Manzana", 15, 0.1, 0);

        Productos yogurCoco = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de coco", 16, 0.1, 0);

        Productos yogurFresa = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de fresa", 17, 0.1, 0);

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
        Cesta cesta = new Cesta();
        Object user;
        do {
            user = MenusDeOpciones.selectorDeUsuarios();
            if (user.equals("Cliente")) {
                int opcionMenu;
                do {
                    opcionMenu = MenusDeOpciones.selectorDeProducto();
                    switch (opcionMenu) {
                        case 0 -> {//comida
                            //hamburguesas
                            int productoElegido = MenusDeOpciones.selectorComidas();
                           switch(productoElegido){
                               case 0 -> {//hamburguesas
                                   String menuHamburguesa=mostrarProductosPorCategoria(Consumibles.HAMBURGUESA, catalogo);
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
                            }
                        }

                        case 2 -> {//postres
                            int productoElegido = MenusDeOpciones.selectorComidas();
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
                            int opcionCarrito=MenusDeOpciones.selectorCarrito();
                            switch(opcionCarrito){
                                case 0 ->{
                                    
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

                        }

                        case 1 -> {//cambiarProducto

                        }
                        case 2 -> {//cambiarProducto

                        }
                        case 3 -> {//cambiarProducto

                        }
                        case 4 -> {//cambiarProducto
                            break;
                        }

                    }
                } while (opcionMenu != 4);
            } else {
                apagarTVP();
            }
        } while (user != "Apagar TPV");

    }

    public void apagarTVP() throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Se apagará el TPV");
    }

    public String mostrarProductosPorCategoria(Consumibles c1, Catalogo catalogo) {
        String aux = "";
        for (int i = 0; i < catalogo.tamañoCatalgo(); i++) {
            if (catalogo.posElemento(i).getConsumible().equals(c1)) {
                 aux +=(catalogo.posElemento(i)+("\n"));
            }
        }
        return aux;
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
