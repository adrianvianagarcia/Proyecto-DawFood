/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author oscar
 */
public class TarjetasDeCredito {
   Random r=new Random();
   final int numTarjeta;
   final LocalDate fechaCaducidad;
   final int cvv;
   final String titular;
   double saldo;

    public TarjetasDeCredito(LocalDate fechaCaducidad, String titular, double saldo) {
        this.numTarjeta = r.nextInt(100, 1000);
        this.fechaCaducidad =fechaCaducidad;
        this.cvv =  r.nextInt(100, 1000);
        this.titular = titular;
        this.saldo = saldo;
    }
   
    public TarjetasDeCredito generarXTarjeta(int numACrear){
        for(int i=0;i<numACrear;i++){
            String refTrajeta=JOptionPane.showInputDialog("");
        }
    }
}
