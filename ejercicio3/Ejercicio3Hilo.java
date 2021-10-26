package ejercicio3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio3Hilo extends Thread{
 
    public Ejercicio3Hilo() {
        String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("Nuevo hilo( " + fecha + ")");

    }

    @Override
    public void run() {
        
        System.out.println("Soy el hilo " + getName());

        for (int i = 0; i < 3; i++) {
            
            String hora =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            System.out.println(getName() + " trabajando ( " + hora + ")");

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        
    }


}
