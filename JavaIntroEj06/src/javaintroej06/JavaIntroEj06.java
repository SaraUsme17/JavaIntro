/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej06;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Implementar un programa que le pida dos números enteros a usuario 
        y determine si ambos o alguno de ellos es mayor a 25.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        //Se valida el valor de los números
        if (num1 >25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25){
            System.out.println("El primer número es mayor a 25");
        } else if (num2>25){
            System.out.println("El segundo número es mayor a 25");
        }else {
            System.out.println("Ningún número es mayor a 25");
        }
    }
    
}
