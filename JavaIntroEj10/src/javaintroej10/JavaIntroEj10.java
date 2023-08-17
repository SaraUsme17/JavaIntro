/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        e imprima el número ingresado seguido de tantos asteriscos como indique su valor.*/
        
        Scanner leer = new Scanner(System.in);
        int bandera = 0;
        
        do{
            System.out.println("");
            System.out.println("Ingrese un número entre 1 y 20");
            int num = leer.nextInt();
            if(num <1 || num>20){
                System.out.println("Número ingresado invalido");
                break;
            }  
            System.out.print(num + " ");
            for (int i = 1; i <= num; i++) {
                System.out.print("x");
                    
            }
            
            bandera = bandera +1; 
        } while(bandera<4);
        
    }
    
}

       
