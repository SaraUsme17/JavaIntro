/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);
        
        
    }
    
    public static void EsMultiplo(int num1, int num2){
        if(num1 % num2 == 0){
            System.out.println("El primer número es múltiplo del segundo");
    
        }else{
            System.out.println("El primer número NO es múltiplo del segundo");
        
        }
    
    }
}
