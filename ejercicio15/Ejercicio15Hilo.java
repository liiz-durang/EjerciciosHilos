package ejercicio15;


public class Ejercicio15Hilo extends Thread{

    private int tabla;
    public Ejercicio15Hilo(int tabla) {
        this.tabla = tabla;
        setName(String.valueOf(tabla));
    }

    @Override
    public void run() {
        System.out.println("\nSoy el hijo " + getName());
        for (int i = 1; i < 3; i++) {
            new Ejercicio15HiloNieto(tabla, i).start();
        }
        
        try {
            sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nHilo " + getName() + " terminó"); 
        

        
    }


}
