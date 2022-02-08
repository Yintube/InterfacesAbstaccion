/**
 * Representa Interface del tipo de nave Tripulada. Define que hace el objeto.
 * Cada tipo de nave tiene interfaz para que puedan tener métodos diferentes, uno de otro.
 * Se debe colocar la letra "I" al prinicpio del nombre de la interfaz como buena práctica de programación.
 * @author Yineth Vargas Guerrero.
 */
public interface IManned {
    /**
     * Métodos en infinitivo con acceso publico para implementarlos en otras clases.
     */   
    public void toRepair(); //Reparar  
    public void doMaintenance(); //Realizar Mantenimiento(do tambien es una palbra reservada)  
    public void toInvestigate(); //Investigar

}
