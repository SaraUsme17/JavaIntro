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
public class Ejercicio4 {
    
    public static void main(String[] args){
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados celsius que desea convertir");
        int celsius = leer.nextInt();
        
        int farenheit = 32 + (9*celsius/5);
        System.out.println(celsius + " grados celsius son equivalentes a " + farenheit + " grados farenheit");
    
    
    
    }
}
