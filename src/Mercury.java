/**
 * Representa la clase Mercury. Extiende de la clase abstracta Spaceship, hereda atibutos y métodos.
 * Implementa métodos de la interfaz Tripulada(Manned) o tipo de nave.
 * @author Yineth Vargas Guerrero.
 */
public class Mercury extends SpaceShip implements IManned {
    /**
     * Constructor vacio.Crea una instancia de la clase.
     */
    public Mercury() {
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Propulsión de la nave.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void propelShip() {
        System.out.println("Mercury comienza propulsión.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Despegar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void takeOff() {
        System.out.println("Mercury listo para depegue.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Aterrizar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toLand() {
        System.out.println("Mercury iniciando aterrizaje.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Órbitar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toOrbit() {
        System.out.println("Mercury entrando en órbita.");
    }
    /**
     * Método implementado de la Interfaz Manned(IManned).Métodos exclusivos del tipo de nave.
     * Llamado Reparar. Con la propiedad sobreescritura.
     */
    @Override
    public void toRepair() {
        System.out.println("Mercury comienza reparación.");
    }
    /**
     * Método implementado de la Interfaz Manned(IManned).Métodos exclusivos del tipo de nave.
     * Llamado Realizar Mantenimiento. Con la propiedad sobreescritura.
     */
    @Override
    public void doMaintenance() {
        System.out.println("Mercury realizando mantenimiento.");
    }
    /**
     * Método implementado de la Interfaz Manned(IManned).Métodos exclusivos del tipo de nave.
     * Llamado Investigar. Con la propiedad sobreescritura.
     */
    @Override
    public void toInvestigate() {
        System.out.println("Mercury haciendo investigación.");
    }
    
}
