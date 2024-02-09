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
public class Ejercicio2 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        pantalla.*/
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa tu nombre");
         String nombre = leer.next();
         System.out.println("El nombre ingresado es " + nombre);
      
    }
    
}
