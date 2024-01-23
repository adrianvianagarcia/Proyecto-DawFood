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
        if (contraseñaUser == contraseña) {
            errorContra = false;
        }
        return errorContra;
    }

    public void encenderTPV() throws InterruptedException {
        //Creamos todos los productos
        Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                3.5, "Hamburguesa simple", 1, 0.1);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2, 0.1);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Kebab simple", 3, 0.1);

        Productos tacoFrances = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Taco frances", 4, 0.1);

        Productos pizzaMargarita = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                5, "Pizza margarita", 5, 0.1);

        Productos pizzaQueso = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                4, "Pizza de queso", 6, 0.1);

        Productos cocaCola = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Coca-Cola", 7, 0.21);

        Productos fantaNaranja = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                2, "Fanta de Naranja", 8, 0.21);

        Productos cervezaMahou = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Mahou", 9, 0.21);

        Productos cervezaHeineken = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                2.5, "Cerveza Heineken", 10, 0.21);

        Productos agua = new Productos(TipoProducto.BEBIDA, Consumibles.AGUA,
                1.5, "Agua", 11, 0.1);

        Productos tartaQueso = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                4, "Tarta de Queso", 12, 0.1);

        Productos donut = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                3, "Donut Glasé", 13, 0.1);

        Productos platano = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Platano", 14, 0.1);

        Productos manzana = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                0.5, "Manzana", 15, 0.1);

        Productos yogurCoco = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de coco", 16, 0.1);

        Productos yogurFresa = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                1.25, "Yogur de fresa", 17, 0.1);
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
                            Object productoElegido = MenusDeOpciones.selectorComidas();
                            if (productoElegido.equals("Hamburguesa simple")) {
                                cesta.guardarElemento(hamburguesaSimple);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Hamburguesa queso")) {
                                cesta.guardarElemento(hamburguesaQueso);
                                System.out.println(cesta);
                                //kebabs 
                            } else if (productoElegido.equals("Kebab simple")) {
                                cesta.guardarElemento(kebabSimple);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Taco frances")) {
                                cesta.guardarElemento(tacoFrances);
                                System.out.println(cesta);
                                //Pizzas
                            } else if (productoElegido.equals("Pizza Margarita")) {
                                cesta.guardarElemento(pizzaMargarita);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Pizza de queso")) {
                                cesta.guardarElemento(pizzaQueso);
                                System.out.println(cesta);
                            }
                        }

                        case 1 -> {//bebidas
                            Object productoElegido = MenusDeOpciones.selectorBebidas();
                            if (productoElegido.equals("Coca-Cola")) {
                                cesta.guardarElemento(cocaCola);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Fanta de Naranja")) {
                                cesta.guardarElemento(fantaNaranja);
                                System.out.println(cesta);
                                //cervezas
                            } else if (productoElegido.equals("Cerveza Mahou")) {
                                cesta.guardarElemento(cervezaMahou);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Cerveza Heineken")) {
                                cesta.guardarElemento(cervezaHeineken);
                                System.out.println(cesta);
                                //agua
                            } else if (productoElegido.equals("Agua")) {
                                cesta.guardarElemento(agua);
                                System.out.println(agua.getPrecio());
                            }
                        }

                        case 2 -> {//postres
                            Object productoElegido = MenusDeOpciones.selectorPostres();
                            if (productoElegido.equals("Platano")) {
                                cesta.guardarElemento(platano);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Manzana")) {
                                cesta.guardarElemento(manzana);
                                System.out.println(cesta);
                                //bolleria
                            } else if (productoElegido.equals("Tarta de Queso")) {
                                cesta.guardarElemento(tartaQueso);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Donut Glasé")) {
                                cesta.guardarElemento(donut);
                                System.out.println(cesta);
                                //yogur
                            } else if (productoElegido.equals("Yogur de coco")) {
                                cesta.guardarElemento(yogurCoco);
                                System.out.println(cesta);
                            } else if (productoElegido.equals("Yogur de fresa")) {
                                cesta.guardarElemento(yogurFresa);
                                System.out.println(cesta);
                            }
                        }
                        case 3 -> {//carrito
                            
                        }
                        case 4 -> {
                            break;
                        }
                    }
                } while (opcionMenu != 4);
            } else if (user.equals("Administrador")) {
                String contraseña = generarContraseña();
                System.out.println(contraseña);
                 String contraseñaUser;
                do {
                    contraseñaUser = JOptionPane.showInputDialog(null,
                            "Introduce la contraseña del TPV: ");
                } while (verifContraseña(contraseñaUser, contraseña)==true);
            } else {
                apagarTVP();
            }
        } while (user != "Apagar TPV");

    }

    public void apagarTVP() throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Se apagará el TPV");
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
