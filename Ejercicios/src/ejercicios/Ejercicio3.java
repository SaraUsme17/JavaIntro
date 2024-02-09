/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
        Java.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();         /*Esto es importante nexLine() para que me muestre toda la frase completa 
        y no sólo la primer palabra*/
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
        
        
        
    
    } 
    
}
