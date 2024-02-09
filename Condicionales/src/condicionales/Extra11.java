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
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
        operador de división. Nota: recordar que las variables de tipo entero truncan los
        números o resultados.*/
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        double num = leer.nextDouble();
        int contador = 0;
        double digitos;
        
        do {
            
            digitos =(int)(num/10); //Para tomar la parte entero del decimal 
            contador ++;
            num = digitos;
            
        } while (digitos !=0);
        
        System.out.println("La cantidad de dígitos que tiene el número ingresado es igual a " + contador);
        
    }
    
}
