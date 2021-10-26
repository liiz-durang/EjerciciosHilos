package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio1Main {
    public static void main(String[] args) {
        
        //Crea una nueva instancia del hilo.
        Ejercicio1Hilo hilo = new Ejercicio1Hilo();
        //Inicia la ejecución del hijo. A partir de esta linea se estan corriendo en paralelo. 
        hilo.start();
        System.out.println("Hola. Soy hilo principal");
        

        String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Hilo principal terminó a las " + hora);
        

           
    }   
}
