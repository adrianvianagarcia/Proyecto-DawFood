package daw;

import java.time.LocalDateTime;
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
    
    public void encenderTPV() throws InterruptedException{
    Object user;
    do{
        user=user=MenusDeOpciones.selectorDeUsuarios();
        if (user.equals("Cliente")) {
           int opcionMenu= MenusDeOpciones.selectorDeProducto();
            switch(opcionMenu){
                case 3->{
                    break;
                }
            }
        } else if (user.equals("Administrador")) {

        } else {
            apagarTVP();
        } 
    }while(user!="Apagar TPV");

}
    public void apagarTVP() throws InterruptedException{
        JOptionPane.showMessageDialog(null,"Se apagará el TPV");
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
