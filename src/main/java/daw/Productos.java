package daw;

import java.util.Objects;

public class Productos {

    private TipoProducto tipo;
    private Consumibles consumible;
    private double precio;
    private String descripcion;
    private int id;
    private double iva;
    private int cantidad;

    public Productos(TipoProducto tipo, Consumibles consumible, double precio, String descripcion, int id, double iva, int cantidad) {
        this.tipo = tipo;
        this.consumible = consumible;
        this.precio += precio * cantidad;
        this.descripcion = descripcion;
        this.id = id;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    public Productos() {
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public Consumibles getConsumible() {
        return consumible;
    }

    public void setConsumible(Consumibles consumible) {
        this.consumible = consumible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.tipo);
        hash = 23 * hash + Objects.hashCode(this.consumible);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + this.id;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return this.consumible == other.consumible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("precio=").append(precio);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", iva=").append(iva);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

    

}
