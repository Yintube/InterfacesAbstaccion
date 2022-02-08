/**
 * Representa Interface del tipo de nave Lanzadera. Define que hace el objeto.
 * Cada tipo de nave tiene interfaz para que puedan tener métodos diferentes, uno de otro.
 * Se debe colocar la letra "I" al prinicpio del nombre de la interfaz como buena práctica de programación.
 * @author Yineth Vargas Guerrero.
 */
public interface IShuttle {
    /**
     * Métodos en infinitivo con acceso publico para implementarlos en otras clases. 
     */
    public void toTransport(); //Transportar.
    public void releaseLoad(); //Liberar carga.
    
}
