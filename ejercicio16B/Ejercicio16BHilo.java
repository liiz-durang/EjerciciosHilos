package ejercicio16B;


public class Ejercicio16BHilo extends Thread{

    private int tabla;
    public Ejercicio16BHilo(int tabla) {
        this.tabla = tabla;
        setName(String.valueOf(tabla));
    }

    @Override
    public void run() {
        System.out.println("\nSoy el hijo " + getName());
        for (int i = 1; i < 3; i++) {
            new Ejercicio16BHiloNieto(tabla, i).start();
        }
        
        try {
            sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nHilo " + getName() + " terminó"); 
        

        
    }


}
