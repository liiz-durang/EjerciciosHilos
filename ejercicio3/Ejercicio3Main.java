//Metodo sleep

package ejercicio3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//3 hilos con sleep
public class Ejercicio3Main {
    public static void main(String[] args) {
        
        System.out.println("Hola. Soy hilo principal");

        //Creación de 3 hilos


        Ejercicio3Hilo hilo1 = new Ejercicio3Hilo();
        hilo1.start();

        Ejercicio3Hilo hilo2 = new Ejercicio3Hilo();
        hilo2.start();

        Ejercicio3Hilo hilo3 = new Ejercicio3Hilo();
        hilo3.start();

        String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Hilo principal terminó a las " + hora);
        

    }
}
