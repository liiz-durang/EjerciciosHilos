package ejercicio4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio4Hilo extends Thread{
 
    public Ejercicio4Hilo() {
        String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("\nNuevo hilo( " + fecha + ")");

    }

    @Override
    public void run() {
        
        System.out.println("\nSoy el hilo " + getName() + ", Id = " + getId() + ", prioridad = " + getPriority() + ", state = " + getState() + ", group = " + getThreadGroup());



        
    }


}
