package ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio2Hilo extends Thread{
 
    public Ejercicio2Hilo() {
        String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("Nuevo hilo( " + fecha + ")");

    }

    @Override
    public void run() {
        
        System.out.println("Soy el hilo " + getName());

        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            System.out.println(getName() + " trabajando ( " + hora + ")");
        }
        
    }


}
