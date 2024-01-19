package daw;

import java.time.LocalDate;
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
}
