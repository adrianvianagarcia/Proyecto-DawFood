/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author oscar
 */
public class ProductoCarrito {
    
    private TipoProducto tipo;
    private Consumibles consumible;
    private double precioBase;
    private double precioTotal;
    private String descripcion;
    private double iva;
    private int cantidad;

    public ProductoCarrito(TipoProducto tipo, Consumibles consumible, double precioBase, double precioTotal, String descripcion, double iva, int cantidad) {
        this.tipo = tipo;
        this.consumible = consumible;
        this.precioBase = precioBase;
        this.precioTotal = precioTotal;
        this.descripcion = descripcion;
        this.iva = iva;
        this.cantidad = cantidad;
    }
    
    public ProductoCarrito() {
        this.tipo = TipoProducto.COMIDA;
        this.consumible = Consumibles.HAMBURGUESA;
        this.precioBase = 0.0;
        this.precioTotal = 0.0;
        this.descripcion = "";
        this.iva = 0.0;
        this.cantidad = 0;
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoCarrito{");
        sb.append("tipo=").append(tipo);
        sb.append(", consumible=").append(consumible);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", iva=").append(iva);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.tipo);
        hash = 11 * hash + Objects.hashCode(this.consumible);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precioBase) ^ (Double.doubleToLongBits(this.precioBase) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precioTotal) ^ (Double.doubleToLongBits(this.precioTotal) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.descripcion);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 11 * hash + this.cantidad;
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
        final ProductoCarrito other = (ProductoCarrito) obj;
        if (Double.doubleToLongBits(this.precioBase) != Double.doubleToLongBits(other.precioBase)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioTotal) != Double.doubleToLongBits(other.precioTotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
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
    
    

   
}
