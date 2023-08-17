/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej05;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Define una variable de tipo boolean, double y char. 
        Guarda información en ellas a través del Scanner. */
        boolean respuesta;
        double decimal;
        
        //Ingresamos la información por teclado//
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el valor de la variable booleana");
        respuesta = leer.nextBoolean();
        
        System.out.println("Ingrese el valor de la variable tipo string");
        String nombre = leer.next();
        
        System.out.println("Ingresa el valor de la variable de tipo double");
        decimal = leer.nextDouble();
        

    }
    
}
