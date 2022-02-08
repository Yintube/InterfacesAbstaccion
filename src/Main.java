/**
 * Representa la clase Main o Principal del paquete por defecto,
 * contribuye con la ejecucion.
 * @author Yineth Vargas Guerrero.
 */
public class Main {
    /**
     * Método Main.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Creación de objetos.
         */
        Apolo apolo = new Apolo();
        Vikingo vikingo = new Vikingo();
        Mercury mercury = new Mercury();
        Energy energy = new Energy();
        /**
         * Se invocan  o llaman algunos métodos para la comprobación del funcionamiento del programa.
         */
        apolo.propelShip();
        apolo.takeOff();
        vikingo.toLand();
        vikingo.toOrbit();
        mercury.toRepair();
        mercury.doMaintenance();
        energy.toTransport();
        energy.releaseLoad();
                
    }
    
}
