/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej07;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
        y permitir que el usuario ingrese un valor entre 1 y 4.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor que necesita");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua ");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina ");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia ");
                break;
            default:
                System.out.println("No existe un sistema definido para el tipo de bomba"); 
        }
        
        
    }
    
}
