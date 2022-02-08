/**
 * Representa la clase Apolo. Extiende de la clase abstracta Spaceship, hereda atibutos y métodos.
 * Implementa métodos de la interfaz Lanzadera(IShuttle) o tipo de nave.
 * @author Yineth Vargas Guerrero.
 */
public class Apolo extends SpaceShip implements IShuttle{ 
    /**
     * Constructor vacio.Crea una instancia de la clase.
     */
    public Apolo() {
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Propulsión de la nave.
     * Con la propiedad sobre escritura. 
     */
    @Override
    protected void propelShip() { 
        System.out.println("Apolo comienza propulsión.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip.Llamado Despegar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void takeOff() {
        System.out.println("Apolo listo para despegar.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip.Llamado Aterrizar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toLand() {
        System.out.println("Apolo iniciando aterrizaje.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado en Órbitar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toOrbit() {
        System.out.println("Apolo entrando en órbita.");
    }
    /**
     * Método implementado de la Interfaz Lanzadera(IShuttle).Métodos exclusivos del tipo de nave.
     * Llamado Transportar. Con la propiedad sobreescritura.
     */
    @Override
    public void toTransport() {
        System.out.println("Apolo transportando carga.");
    }
    /**
     * Método implementado de la Interfaz Lanzadera(IShuttle).Métodos exclusivos del tipo de nave.
     * Llamado Liberar Carga. Con la propiedad sobreescritura.
     */
    @Override
    public void releaseLoad() {
        System.out.println("Apolo liberando carga.");
    }
    
}
