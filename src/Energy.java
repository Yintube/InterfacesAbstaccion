/**
 * Representa la clase Energy. Extiende de la clase abstracta Spaceship, hereda atibutos y métodos.
 * Implementa métodos de la interfaz Lanzadera(IShuttle) o tipo de nave.
 * @author Yineth Vargas Guerrero.
 */
public class Energy extends SpaceShip implements IShuttle {
    /**
     * Constructor vacio.Crea una instancia de la clase.
     */
    public Energy() {
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Propulsión de la nave.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void propelShip() {
        System.out.println("Energy comienza propulsión.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Despegar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void takeOff() {
        System.out.println("Energy listo para despegue.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Aterrizar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toLand() {
        System.out.println("Energy iniciando aterrizaje.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Órbitar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toOrbit() {
        System.out.println("Energy entrando en órbita.");
    }
    /**
     * Método implementado de la Interfaz Lanzadera(IShuttle).Métodos exclusivos del tipo de nave.
     * Llamado Transportar. Con la propiedad sobreescritura.
     */

    @Override
    public void toTransport() {
        System.out.println("Energy transportando carga.");
    }
    /**
     * Método implementado de la Interfaz Lanzadera(IShuttle).Métodos exclusivos del tipo de nave.
     * Llamado Liberar Carga. Con la propiedad sobreescritura.
     */
    @Override
    public void releaseLoad() {
        System.out.println("Energy liberando carga.");
    }
    
}
