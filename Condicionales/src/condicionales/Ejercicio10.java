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
public class Ejercicio10 {
    
        public static void main(String[] args){
    
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.*/
    
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el límite");
    int limite = leer.nextInt();
    int suma = 0;
        
    while(suma<limite){
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        suma = suma + num;
    
    }
            
    System.out.println("La suma total es " + suma);
    }
}
