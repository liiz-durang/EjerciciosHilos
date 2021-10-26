//Metodo sleep

package ejercicio4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//3 hilos con sleep
public class Ejercicio4Main {
    public static void main(String[] args) {
        
        System.out.println("\nHola. Soy hilo principal");

        //Creación de 3 hilos


        Ejercicio4Hilo hilo1 = new Ejercicio4Hilo();
        hilo1.start();

        Ejercicio4Hilo hilo2 = new Ejercicio4Hilo();
        hilo2.start();

        Ejercicio4Hilo hilo3 = new Ejercicio4Hilo();
        hilo3.start();

        
        System.out.println("\nMain: Hilos activos = " + Thread.activeCount());
        String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("\nHilo principal terminó a las " + hora);
        

    }
}
