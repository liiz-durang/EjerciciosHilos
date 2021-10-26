package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio1Hilo extends Thread{

    
    public Ejercicio1Hilo() {
        String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("Nuevo hilo( " + fecha + ")");

    }

    @Override
    public void run() {
        
        System.out.println("Soy el hilo " + getName());

        String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Termino " + getName() + " a las " + hora);
    }

    
}
