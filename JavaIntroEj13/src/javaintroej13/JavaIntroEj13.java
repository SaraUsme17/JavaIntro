/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej13;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
        define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/
        
        String[] Equipo = new String[5];
        
        /*Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/
        
        for (int i = 0; i < 5; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del compañero " + (i+1));
            String nombre = leer.next();  
            Equipo[i] = nombre;
        }
        
        //Mostrando los nombres ingresados en el vector//
        
        for (int i = 0; i < 5; i++) {
            System.out.print(Equipo[i] + " ");
        }
        System.out.println("");
    }
    
}
