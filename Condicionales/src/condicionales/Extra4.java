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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();
        String romano;
        
        switch(num){
        case 1:
            romano = "I";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 2:
            romano = "II";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 3:
            romano = "III";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 4:
            romano = "IV";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 5:
            romano = "V";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 6:
            romano = "VI";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 7:
            romano = "VII";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
        case 8:
            romano = "VIII";
            System.out.println("El número " + num + " en romano es " + romano);
            break;   
        case 9:
            romano = "IX";
            System.out.println("El número " + num + " en romano es " + romano);
            break;    
        case 10:
            romano = "X";
            System.out.println("El número " + num + " en romano es " + romano);
            break;
            
        default:
            System.out.println("Número ingresado inválido");
            break;
}
         
    }
    

    

}
