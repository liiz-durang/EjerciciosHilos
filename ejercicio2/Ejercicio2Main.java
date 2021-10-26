//Metodo sleep

package ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio2Main {
    public static void main(String[] args) {
        
        Ejercicio2Hilo hilo = new Ejercicio2Hilo();
        //Inicia la ejecución del hijo. A partir de esta linea se estan corriendo en paralelo. 
        hilo.start();
        System.out.println("Hola. Soy hilo principal");
        

        String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Hilo principal terminó a las " + hora);
        

    }
}
