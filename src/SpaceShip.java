/**
 * Representa la clase abstracta. Define características de otras clases.
 * Los objetos tendrán estos atributos y métodos en común.
 * @author Yineth Vargas Guerrero.
 */
public abstract class SpaceShip {
    /**
     * Se crean los atributos con protected para que las clases hijas puedan acceder a estos(Genéricos).
     */
    protected String name;
    protected double weight;
    protected double height;
    protected double power;
    protected String fuelType;
    /**
     * Creación de métodos abstractos, con la notación protected para el acceso de las demás clases.
     */
    protected abstract void propelShip();
    protected abstract void takeOff();    
    protected abstract void toLand();    
    protected abstract void toOrbit();
}

