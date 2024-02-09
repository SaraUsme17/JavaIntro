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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
        y la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a evaluar");
        int n = leer.nextInt();
        int contador=0;
        int contadorPar=0;
        int contadorImpar=0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número "+ (i+1));
            int num = leer.nextInt();
            contador ++;
            if(num%2==0){
               contadorPar ++;
            
            }else{
               contadorImpar ++;
            
            }
            
            if(num % 5 == 0){
               break;
 
            }else{
 
            
            
            }
            
            
        }
        System.out.println("La cantidad de números leídos es igual a " + contador);
        System.out.println("La cantidad de números pares es igual a " + contadorPar);
        System.out.println("La cantidad de números impares es igual a " + contadorImpar);
    }
    
}
