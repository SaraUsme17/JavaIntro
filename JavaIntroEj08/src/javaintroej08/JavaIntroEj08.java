/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej08;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota");
        int nota = leer.nextInt();
        
        if (nota >0 && nota<=10){
            System.out.println("La nota ingresada está entre 0 y 10");
        }
        
        while (nota <0 || nota>10){
            System.out.println("Nota invalida,ingresela de nuevo");
            nota = leer.nextInt();
        }
    }
    
}
