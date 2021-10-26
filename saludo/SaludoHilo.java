package saludo;

public class SaludoHilo extends Thread{
    public void run(){
        System.out.println("HOLAAAAA. Soy el hilo" + getName());
        System.out.println("Hilo " + getName() + " termine");
    }        
}
