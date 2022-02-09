/**
 * Representa el Paquete Crear Nave.
 * @author Yineth Vargas Guerrero.
 */
package CreatedShip;
/**
 * Importación de Librería Scanner para capturar datos de teclado al usuario.
 */
import java.util.Scanner;
/**
 * Representa clase Main, donde se creará una nueva nave.
 */
public class Main {
    /**
     * Permite la ejecución.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Declaración de variable, tipo entero.
         */
        int opc;      
        /**
         * Creación de objeto tipo escaner.
         */           
        Scanner scn = new Scanner(System.in);
        /**
         * Ciclo do-While, para hacer iterativo el menú.
         */
        do{
            /**
             * Este es el menú principal, donde el usuario tiene opciones para crear una nave espacial nueva,
             * seleccionando características principales de una nave espacial.
             */
            System.out.println("*.- MENU.-*\n");
            System.out.println("INGRESE OPCIÓN PARA CREAR NAVE:\n");
            System.out.println("1.- AQUÍ PODRAS SELECCIONAR EL NOMBRE DE TU NAVE ESPACIAL.");         
            System.out.println("2.- AQUÍ PODRAS ESTABLECER EL PESO DE TU NAVE.");        
            System.out.println("3.- CUANTOS TRIPULANTES TE ACOMPAÑARÁN EN ESTA AVENTURA?");        
            System.out.println("4.- SELECCIONA EL TIPO DE COMBUSTIBLE QUE VAS A UTILIZAR");
            System.out.println("5.- SALIR.\n");
            /**
             * Dato que se le pide al usuario, por medio del teclado y se asigana a la variable.
             */
            opc = scn.nextInt();
            /**
             * Sentencia o condicional múltiple switch-case, para las diferentes opciones del menú.
             * Cuando se ejecuta, evalua el dato, pasando por cada caso.
             */       
            switch(opc){
                /**
                 * En éste caso debe elegir el nombre de la nave.
                 */
                case 1:
                    System.out.println("*.-SELECCIONA UN NOMBRE.-*");
                    System.out.println("1.- APOLO.");         
                    System.out.println("2.- VIKINGO.");        
                    System.out.println("3.- MERCURY.");        
                    System.out.println("4.- ENERGY\n");                                       
                    System.out.println("*.-LA NAVE YA TIENE UN NOMBRE!.-* \n");
                    System.out.println("INGRESE OPCIÓN: \n");                    
                    break;
                /**
                 * En éste caso debe elegir el peso de la nave.
                 */                
                case 2:
                    System.out.println("*.-SELECCIONA EL PESO DE TU NAVE.-*");
                    System.out.println("1.- 2500 TONELADAS.");         
                    System.out.println("2.- 3500 TONELADAS.");        
                    System.out.println("3.- 4000 TONELADAS.");        
                    System.out.println("4.- 5000 TONELADAS\n"); 
                    System.out.println("*.- EL PESO ES IMPORTANTE PARA EL EMPUJE -.*\n");
                    System.out.println("INGRESE OPCION\n");
                    break;
                /**
                 * En éste caso debe elegir el número de acompañantes que tendra el usuario en la nave.
                 */                    
                case 3:
                    System.out.println("*.-SELECCIONA EL NÚMERO DE ACOMPAÑANTES.-*");
                    System.out.println("1.- DOS.");         
                    System.out.println("2.- TRES.");        
                    System.out.println("3.- CUATRO.");        
                    System.out.println("4.- CINCO\n");
                    System.out.println("*.- RECUERDA NO INCLUIR A TU SUEGRA. -.*\n");
                    System.out.println("INGRESE OPCION\n");                    
                    break;
                /**
                 * En éste caso debe elegir el tipo de combustible de la nave.
                 */                    
                case 4:
                    System.out.println("*.-AHORA ALGO MUY IMPORTANTE, EL COMBUSTIBLE.-*");
                    System.out.println("1.- QUIMICO SOLIDO.");         
                    System.out.println("2.- PROPELENTE LIQUIDO.");        
                    System.out.println("3.- LUZ SOLAR (FOTOVOLTAICA).");        
                    System.out.println("*.- NO QUERRAS DETENERTE LUEGO DE SALIR DEL ESPACIO! -.*\n");
                    System.out.println("INGRESE OPCION\n");                    
                    break;
                /**
                 * En éste caso, si el usuario desea salir del menú o programa selecciona la opción 5.
                 */                    
                default:
                    System.out.println("-.*ADIOS AMIGO.....-.*");                    
                }                                                                           
        /**
         * Fin del ciclo do-while
         */
        }while (opc <= 4); 
   
    }
    
}
