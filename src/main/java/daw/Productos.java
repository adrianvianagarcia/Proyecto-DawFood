package daw;

import java.util.Objects;

public class Productos {

    private TipoProducto tipo;
    private Consumibles consumible;
    private double precio;
    private String descripcion;
    private int id;

    public Productos(TipoProducto tipo, Consumibles consumible, double precio, String descripcion, int id) {
        this.tipo = tipo;
        this.consumible = consumible;
        this.precio = precio;
        this.descripcion = descripcion;
        this.id = id;
    }

    public Productos() {
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
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.consumible);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.descripcion);
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
        sb.append("tipo=").append(tipo);
        sb.append(", consumible=").append(consumible);
        sb.append(", precio=").append(precio);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

}
