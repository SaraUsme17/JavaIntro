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
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el número 2");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2; 
        System.out.println("El resultado de la suma es " + suma);
    }
    
}
