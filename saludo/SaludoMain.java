package saludo;

public class SaludoMain {
    public static void main(String[] args) {

        //Crea una nueva instancia del hilo.
        SaludoHilo hiloSaludo = new SaludoHilo();
        //Inicia la ejecución del hijo. A partir de esta linea se estan corriendo en paralelo. 
        hiloSaludo.start();
        System.out.println("Hola. Soy main");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main termino");
    }
}
