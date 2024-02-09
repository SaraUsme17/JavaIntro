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
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
        este resultado es el residuo, y el número de restas realizadas es el cociente.*/
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        int num2 = leer.nextInt();
        int resta;
        int contador = 0;
        
        do {
            resta = num1-num2;
            num1 = resta;
            contador = contador + 1;
        } while (resta>=num2);
        
        System.out.println("El residuo es igual a " + resta);
        System.out.println("El cociente es igual a " + contador);
        
    }
    
}
