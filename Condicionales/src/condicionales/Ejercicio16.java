/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
        al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido*/
        
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*99+1);
            
        }
        System.out.println(Arrays.toString(vector));
        
        System.out.println("Ingrese el número que desea buscar");
        int num = leer.nextInt();
        
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if(vector[i] == num){
                System.out.println("El número se encuentra en la posición " + i + " del vector");
                contador ++;
            }
        }
        
        if(contador>1){
            System.out.println("El número se encuentra repetido");
        
        }else{
            System.out.println("El número ingresado no se encuentra en el vector");
        
        }
    }
    
}
