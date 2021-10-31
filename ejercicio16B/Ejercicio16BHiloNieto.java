package ejercicio16B;

public class Ejercicio16BHiloNieto extends Thread {
    private int numNieto, tabla;


    public Ejercicio16BHiloNieto(int tabla, int numNieto ) {
        this.numNieto = numNieto;
        this.tabla = tabla;
        setName(String.valueOf(tabla) + "-" + String.valueOf(numNieto));
    }

    @Override
    public void run() {

        System.out.println("\nSoy el nieto " + getName());
        int elemento;
        if (numNieto == 1) {
            for (elemento = 1; elemento < 6; elemento++) {
                System.out.println(getName() + " -> " + tabla + "*" + elemento + " = " + (tabla*elemento));
            }
            System.out.println("\n");
        }
        else{
            for (elemento = 6; elemento < 11; elemento++) {
                System.out.println(getName() + " -> " + tabla + "*" + elemento + " = " + (tabla*elemento));
            }
            System.out.println("\n");
        }
       
    }
}
