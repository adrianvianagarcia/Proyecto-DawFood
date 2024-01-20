package daw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class TarjetasDeCredito {

    private int numTarjeta;
    private LocalDate fechaCaducidad;
    private int cvv;
    private String titular;
    private double saldo;

    public TarjetasDeCredito(int numTarjeta, LocalDate fechaCaducidad, int cvv, String titular, double saldo) {
        this.numTarjeta = numTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getCvv() {
        return cvv;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*Verificar tarjeta funcionará cuando el usuario haya creado su tarjeta (Lo haremos
    con un constructor vacio haciendo setters). para verificar se hará tarjetaCliente.*/
    public boolean verificarTarjeta(ArrayList<TarjetasDeCredito> tarjetas, int numTarjeta) {
        boolean tarjetaValida = false;
        
        for (int i = 0; i < tarjetas.size(); i++) {
            if (tarjetas.get(i).getNumTarjeta() == numTarjeta) {
                tarjetaValida = true;
            }
        }
        return tarjetaValida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numTarjeta;
        hash = 97 * hash + Objects.hashCode(this.fechaCaducidad);
        hash = 97 * hash + this.cvv;
        hash = 97 * hash + Objects.hashCode(this.titular);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
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
        final TarjetasDeCredito other = (TarjetasDeCredito) obj;
        if (this.numTarjeta != other.numTarjeta) {
            return false;
        }
        if (this.cvv != other.cvv) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return Objects.equals(this.fechaCaducidad, other.fechaCaducidad);
    }

}
