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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
        promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
        números serán introducidos por el usuario. Realice dos versiones del programa, una
        usando el bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a evaluar");
        int n = leer.nextInt();
        int contador =0;
        int suma =0;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; /*Integer.MIN_VALUE es una constante en la clase Integer de Java que representa 
        el valor mínimo que se puede almacenar en una variable de tipo int. Es el valor más negativo que se puede 
        representar utilizando el tipo de dato primitivo int.
        La constante Integer.MIN_VALUE tiene un valor de -2,147,483,648. 
        Este valor es el resultado de asignar el bit más significativo de un entero con signo a 1 y los demás bits a 0.*/
        
        do {
            System.out.println("Ingrese el número");
            int num = leer.nextInt();
            contador = contador +1;
            suma = suma + num;
            if(num<min){
              min = num;
            }
            if(num>max){
              max = num;
            }

            
        } while (contador != n);
        
        double promedio = suma/n;
        System.out.println("El promedio de los números es igual a " + promedio );
        System.out.println("El valor máximo de los números ingresados es igual a " + max );
        System.out.println("El valor mínimo de los números ingresados es igual a " + min );
    }
    
    
}
