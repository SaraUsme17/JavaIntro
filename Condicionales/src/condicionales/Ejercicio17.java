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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*999+1);
            
        }
        System.out.println(Arrays.toString(vector));
        int contador = 0;
        int aux5 =0, aux4=0, aux3=0, aux2=0, aux1=0;
        
        for(int i = 0; i < n; i++) {
            contador = 0;
            int num = vector[i];
            while(num!=0){
                num = num/10;
                contador++;
            
            }
            switch(contador){
                case 5:
                    aux5 ++;
                    break;
                case 4:
                    aux4 ++;
                    break;
                case 3:
                    aux3 ++;
                    break;
                case 2:
                    aux2 ++;
                    break;
                case 1:
                    aux1 ++;  
                    break;
            }   
     
            System.out.println("El vector en la posición " + i + " tiene " + contador + " cifras");
        }
            System.out.println("El vector tiene " + aux1 + " numeros de 1 dígitos");  
            System.out.println("El vector tiene " + aux2 + " numeros de 2 dígitos"); 
            System.out.println("El vector tiene " + aux3 + " numeros de 3 dígitos");
            System.out.println("El vector tiene " + aux4 + " numeros de 4 dígitos");  
            System.out.println("El vector tiene " + aux5 + " numeros de 5 dígitos");  


    }
    
}
