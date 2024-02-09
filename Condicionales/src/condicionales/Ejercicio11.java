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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:*/
        
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el primer número");
    int num1 = leer.nextInt();
    System.out.println("Ingrese el segundo número");
    int num2 = leer.nextInt();
    String sino = "N";
    
 
    
    do {
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        System.out.println("Ingrese una opción");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma de los 2 números es igual a " + suma);
                break;
            case 2:
                int resta = num2- num1;
                System.out.println("La resta de los 2 números es igual a " + resta);
                break;
            case 3:
                int multiplicar = num1 * num2;
                System.out.println("La multiplicación de los 2 números es igual a " + multiplicar);
                break;
            case 4:
                float division = num1/num2;
                System.out.println("La división de los 2 números es igual a " + division);
                break;
            case 5: 
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                sino = leer.next();
                if(sino.equals("S")){
                    sino = "S";
                }else if(sino.equals("N")){
                    sino ="N";
                
                }else{
                    System.out.println("Opción inválida");
                    sino = "N";
                
                }
                break;
                
            default:
                System.out.println("Opción ingresada inválida");
        
        }
           
    } while (sino.equals("N"));
        
    }
    
    
}
