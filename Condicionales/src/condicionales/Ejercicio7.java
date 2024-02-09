/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio7 {
    
    public static void main(String[] args){
        
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
    investigar la función equals() en Java.*/
    
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    String fraseOriginal = "eureka";
    
    if(frase.equals(fraseOriginal)){
        System.out.println("Correcto");
    
    }else{
        System.out.println("Incorrecto");
    }
    
    }
   
}
