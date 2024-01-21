package daw;

import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Creamos todos los productos
        Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                3.5, "Hamburguesa simple", 1, 0.1);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2, 0.1);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Hamburguesa simple", 3, 0.1);

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
        ArrayList<Productos> productos= new ArrayList<>();
            //comida
            productos.add(hamburguesaQueso);
            productos.add(hamburguesaSimple);
            productos.add(kebabSimple);
            productos.add(tacoFrances);
            productos.add(pizzaMargarita);
            productos.add(pizzaQueso);
            //bebida
            productos.add(agua);
            productos.add(fantaNaranja);
            productos.add(cocaCola);
            productos.add(cervezaHeineken);
            productos.add(cervezaMahou);
            //postre
            productos.add(tartaQueso);
            productos.add(donut);
            productos.add(platano);
            productos.add(manzana);
            productos.add(yogurCoco);
            productos.add(yogurFresa);
        /*Creamos tpv*/
        Tpv tpv =new Tpv("Estepona");
        tpv.encenderTPV();
                
    }
}
