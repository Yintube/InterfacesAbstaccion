/**
 * Representa la clase Vikingo. Extiende de la clase abstracta Spaceship, hereda atibutos y métodos.
 * Implementa métodos de la interfaz No Tripulada(Unmanned) o tipo de nave.
 * @author Yineth Vargas Guerrero.
 */
public class Vikingo extends SpaceShip implements IUnmanned{
    /**
     * Constructor vacio.Crea una instancia de la clase.
     */
    public Vikingo() {
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Propulsión de la nave.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void propelShip() {
        System.out.println("Vikingo comienza propulsión.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Despegar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void takeOff() {
        System.out.println("Vikingo listo para despegue.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado Aterrizar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toLand() {
        System.out.println("Vikingo iniciando aterrizaje.");
    }
    /**
     * Método heredado de la clase abstracta SpaceShip. Llamado en Órbitar.
     * Con la propiedad sobre escritura.
     */
    @Override
    protected void toOrbit() {
        System.out.println("Vikingo entrando en órbita.");
    }
    /**
     * Método implementado de la Interfaz Unmanned(IUnmanned).Métodos exclusivos del tipo de nave.
     * Llamado Abastecer. Con la propiedad sobreescritura.
     */
    @Override
    public void toSupply() {
        System.out.println("Vikingo está abasteciendo.");
    }
    /**
     * Método implementado de la Interfaz Unmanned(IUnmanned).Métodos exclusivos del tipo de nave.
     * Llamado Limpiar. Con la propiedad sobreescritura.
     */
    @Override
    public void toClean() {
        System.out.println("Vikingo inicia limpieza.");
    }
    /**
     * Método implementado de la Interfaz Unmanned(IUnmanned).Métodos exclusivos del tipo de nave.
     * Llamado Establecer Elevación. Con la propiedad sobreescritura.
     */
    @Override
    public void setElevation() {
        System.out.println("Vikingo estableciendo elevación.");
    }
    /**
     * Método implementado de la Interfaz Unmanned(IUnmanned).Métodos exclusivos del tipo de nave.
     * Llamado Tomar Foto. Con la propiedad sobreescritura.
     */
    @Override
    public void takePhoto() {
        System.out.println("Vikingo inicia fotografías.");
    }
    
}
