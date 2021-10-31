//Cada hilo tiene su variable local
package ejercicio15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//3 hilos con sleep
public class Ejercicio15Main {
    public static void main(String[] args) {
        
        System.out.println("\nHola. Soy hilo principal");


        int tabla;
        for ( tabla = 1 ; tabla < 11 ; tabla++) {
            new Ejercicio15Hilo(tabla).start();
        }
        
        System.out.println("\nHilo principal terminó a las " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())); 
    }
}
