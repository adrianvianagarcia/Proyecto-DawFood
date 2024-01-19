package daw;

public class Main {

    public static void main(String[] args) {

        //Creamos todos los productos
        Productos hamburguesaSimple = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                3.5, "Hamburguesa simple", 1);

        Productos hamburguesaQueso = new Productos(TipoProducto.COMIDA, Consumibles.HAMBURGUESA,
                4, "Hamburguesa con queso", 2);

        Productos kebabSimple = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Hamburguesa simple", 3);

        Productos tacoFrances = new Productos(TipoProducto.COMIDA, Consumibles.KEBAB,
                4, "Taco frances", 4);

        Productos pizzaMargarita = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                5, "Pizza margarita", 5);
        
        Productos pizzaQueso = new Productos(TipoProducto.COMIDA, Consumibles.PIZZA,
                4, "Pizza de queso", 6);
        
        Productos cocaCola = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                 2, "Coca-Cola", 7);
        
        Productos fantaNaranja = new Productos(TipoProducto.BEBIDA, Consumibles.REFRESCO,
                 2, "Fanta de Naranja", 8);
        
        Productos cervezaMahou = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                 2.5, "Cerveza Mahou", 9);
        
        Productos cervezaHeineken = new Productos(TipoProducto.BEBIDA, Consumibles.CERVEZA,
                 2.5, "Cerveza Heineken", 10);
        
        Productos agua = new Productos(TipoProducto.BEBIDA, Consumibles.AGUA,
                 1.5, "Agua", 11);
        
        Productos tartaQueso = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                 4, "Tarta de Queso", 12);
        
        Productos donut = new Productos(TipoProducto.POSTRE, Consumibles.BOLLERIA,
                 3, "Donut Glasé", 13);
        
        Productos platano = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                 0.5, "Platano", 14);
        
        Productos manzana = new Productos(TipoProducto.POSTRE, Consumibles.FRUTA,
                 0.5, "Manzana", 15);
        
        Productos yogurCoco = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                 1.25, "Yogur de coco", 16);
        
        Productos yogurFresa = new Productos(TipoProducto.POSTRE, Consumibles.YOGURES,
                 1.25, "Yogur de fresa", 17);
        

    }
}
